package com.radeb.radebstore.service;

import com.radeb.radebstore.customer.CustomerClient;
import com.radeb.radebstore.dto.OrderRequest;
import com.radeb.radebstore.dto.PurchaseRequest;
import com.radeb.radebstore.exception.BusinessException;
import com.radeb.radebstore.orderline.OrderLineRequest;
import com.radeb.radebstore.orderline.OrderLineService;
import com.radeb.radebstore.product.ProductClient;
import com.radeb.radebstore.repository.OrderRepository;
import com.radeb.radebstore.utils.OrderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository repository;
    private final CustomerClient customerClient;
    private final ProductClient productClient;
    private final OrderMapper mapper;
    private final OrderLineService orderLineService;
    public Integer createOrder(OrderRequest request) {
        var customer = this.customerClient.findCustomerById(request.customerId())
                .orElseThrow(() -> new BusinessException("Cannot create customer:: No customer exists with the provided ID"));

        this.productClient.purchaseProducts(request.products());

        var order = this.repository.save(mapper.toOrder(request));
        // Persist order lines
        for (PurchaseRequest purchaseRequest: request.products()) {
            orderLineService.saveOrderLine(
                    new OrderLineRequest(
                            null,
                            order.getId(),
                            purchaseRequest.productId(),
                            purchaseRequest.quantity()
                    )

            );

        }
        // Start payment process
        // Send the order confirmation --> notification ms (kafka)

        return null;
    }
}

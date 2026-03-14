package com.radeb.radebstore.service;

import com.radeb.radebstore.dto.ProductPurchaseRequest;
import com.radeb.radebstore.dto.ProductPurchaseResponse;
import com.radeb.radebstore.dto.ProductRequest;
import com.radeb.radebstore.dto.ProductResponse;
import com.radeb.radebstore.repository.ProductRepository;
import com.radeb.radebstore.utils.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;
    private final ProductMapper mapper;
    public Integer createProduct(ProductRequest request) {
        var product = mapper.toProduct(request);
        return null;
    }

    public ProductResponse findById(Integer productId) {

        return null;
    }
    public List<ProductPurchaseResponse> purchaseProducts(List<ProductPurchaseRequest> request) {
        return null;
    }

    public List<ProductResponse> findAll() {
        return null;
    }
}

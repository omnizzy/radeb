package com.radeb.radebstore.dto;

import java.util.Map;

public record ErrorResponse(
        Map<String, String> errors
) {
}

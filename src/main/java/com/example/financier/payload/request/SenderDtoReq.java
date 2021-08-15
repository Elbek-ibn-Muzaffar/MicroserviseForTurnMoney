package com.example.financier.payload.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SenderDtoReq {
    private BigDecimal amount;
}

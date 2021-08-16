package com.example.financier.payload.response;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
public class SenderDto {
    private BigDecimal amount;
    private Timestamp date;
}

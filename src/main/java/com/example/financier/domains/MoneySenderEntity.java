package com.example.financier.domains;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;
import java.util.Date;

@Entity
@Data
public class MoneySenderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private BigDecimal amount;

//    @CreationTimestamp
    @Temporal(TemporalType.DATE)
    private Date date= new Date(System.currentTimeMillis());

}

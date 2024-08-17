package com.vone.mq.entity;

import lombok.Data;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class PayQrcode {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String payUrl;
    private double price;
    private int type;
}

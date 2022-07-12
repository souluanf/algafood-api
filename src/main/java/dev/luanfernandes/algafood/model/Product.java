package dev.luanfernandes.algafood.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class Product {
    private String name;
    private BigDecimal price;
}
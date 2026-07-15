package com.example.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MediTrackDto {

    private Long id;
    private String name;
    private String code;
    private String category;
    private String company;
    private Integer stockQuantity;
    private BigDecimal price;
    private LocalDate expirationDate;
    private String description;
    private String status;
}
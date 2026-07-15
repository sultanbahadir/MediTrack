package com.example.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

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

    public MediTrackDto() {
    }

    public MediTrackDto(Long id, String name, String code, String category,
                        String company, Integer stockQuantity,
                        BigDecimal price, LocalDate expirationDate,
                        String description, String status) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.category = category;
        this.company = company;
        this.stockQuantity = stockQuantity;
        this.price = price;
        this.expirationDate = expirationDate;
        this.description = description;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
package com.example.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "meditrack")
@Getter
@Setter

public class MediTrackEntities {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "code")
	private String code;

	@Column(name = "category")
	private String category;

	@Column(name = "company")
	private String company;

	@Column(name = "stock_quantity")
	private Integer stockQuantity;

	@Column(name = "price")
	private BigDecimal price;

	@Column(name = "expiration_date")
	private LocalDate expirationDate;

	@Column(name = "description", length = 1000)
	private String description;

	@Column(name = "status", nullable = false)
	private String status;

}

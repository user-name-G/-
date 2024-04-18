package ru.CRUD_for_shop.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@Entity
@Table(name = "products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	@Column(unique = true)
	private String article;
	private String description;
	private String category;
	private double price;
	private int quantity;
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastQuantityChange;
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
}

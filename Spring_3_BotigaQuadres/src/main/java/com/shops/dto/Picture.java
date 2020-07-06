package com.shops.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="pictures")
public class Picture {

	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Id
	private Long id;

	@Column(name="name")
	private String name;
	
	@Column(name="author")
	private String author;
	
	@Column(name="price")
	private BigDecimal price;
	
	@Temporal(TemporalType.TIMESTAMP) //Fecha y Hora
	private Date date;
	
	@ManyToOne
	@JoinColumn(name="shop_id")
	private Shop shop;
	
	public Picture() {
		
	}

	public Picture(Long id, String name, String author, BigDecimal price, Timestamp date, Shop shop) {

		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
		this.date = date;
		this.shop = shop;
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}
	
	
	
}

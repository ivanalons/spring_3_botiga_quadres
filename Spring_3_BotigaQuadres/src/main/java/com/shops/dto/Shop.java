package com.shops.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="shops")
public class Shop {
	
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Id 
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="pictures_capacity")
	private int picturesCapacity;
	
	@OneToMany
	@JoinColumn( name = "shop_id")
	private List<Picture> pictures;
	
	public Shop(){
		
	}

	public Shop(Long id, String name, int picturesCapacity, List<Picture> pictures) {
		this.id = id;
		this.name = name;
		this.picturesCapacity = picturesCapacity;
		this.pictures = pictures;
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

	public int getPicturesCapacity() {
		return picturesCapacity;
	}

	public void setPicturesCapacity(int picturesCapacity) {
		this.picturesCapacity = picturesCapacity;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Picture")
	public List<Picture> getPictures() {
		return pictures;
	}

	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}
	
	@Override
	public String toString() {
		return "Shop [ name="+this.name+", capacity="+this.picturesCapacity+" ]";
	}
	
	
}

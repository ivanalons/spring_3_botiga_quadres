package com.shops.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shops.dto.Shop;

public interface IShopDAO extends JpaRepository<Shop,Long>{

}

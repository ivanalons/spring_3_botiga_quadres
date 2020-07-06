package com.shops.service;

import java.util.List;

import com.shops.dto.Shop;

public interface IShopService {

	public Shop createShop(Shop shop);
	
	public List<Shop> listAllShops();
	
}

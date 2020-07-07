package com.shops.service;

import java.util.List;

import com.shops.dto.Shop;

public interface IShopService {

	//Crear una nova botiga
	public Shop createShop(Shop shop);
	
	//Retorna una llista de totes les botigues
	public List<Shop> listAllShops();
	
}

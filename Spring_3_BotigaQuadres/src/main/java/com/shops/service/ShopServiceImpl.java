package com.shops.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shops.dao.IShopDAO;
import com.shops.dto.Shop;

@Service
public class ShopServiceImpl implements IShopService{

	@Autowired
	IShopDAO iShopDAO;
	
	@Override
	public Shop createShop(Shop shop) {

		return iShopDAO.save(shop);
		
	}

	@Override
	public List<Shop> listAllShops() {

		return iShopDAO.findAll();
		
	}

}

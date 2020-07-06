package com.shops.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shops.dto.Shop;
import com.shops.service.ShopServiceImpl;

@RestController
@RequestMapping("/")
public class ShopController {

	@Autowired
	ShopServiceImpl shopServiceImpl;
	
	@PostMapping("/shops")
	public Shop createShop(@RequestBody Shop shop) {
		System.out.println(shop.toString());
		return shopServiceImpl.createShop(shop);
	}
	
	@GetMapping("/shops")
	public List<Shop> listAllShops(){
		return shopServiceImpl.listAllShops();
	}
}

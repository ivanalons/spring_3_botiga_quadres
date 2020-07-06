package com.shops.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shops.dao.IPictureDAO;
import com.shops.dao.IShopDAO;
import com.shops.dto.Picture;
import com.shops.dto.Shop;

@Service
public class PictureServiceImpl implements IPictureService{

	@Autowired
	IShopDAO iShopDAO;
	@Autowired
	IPictureDAO iPictureDAO;

	
	@Override
	public Picture addPicture(Long shopId, Picture picture) {

		Shop shop = iShopDAO.findById(shopId).get();
		
		picture.setShop(shop);
		
		return iPictureDAO.save(picture);
	}

	@Override
	public List<Picture> listPicturesByShop(Long shopId) {
		
		Shop shop = iShopDAO.findById(shopId).get();
		
		List<Picture> pictureList = shop.getPictures();
		
		return pictureList;
		
	}

	@Override
	public void deleteAllPicturesByShop(Long shopId) {

		Shop shop = iShopDAO.findById(shopId).get();
		
		for (Picture picture : shop.getPictures()) {
			
			iPictureDAO.deleteById(picture.getId());
			
		}
		
	}

}

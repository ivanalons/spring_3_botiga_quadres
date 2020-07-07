package com.shops.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shops.dao.IPictureDAO;
import com.shops.dao.IShopDAO;
import com.shops.dto.Picture;
import com.shops.dto.Shop;

@Service
public class PictureServiceImpl implements IPictureService{

	//Obtenim tots els DAO que necessitarem per a operar sobre la BBDD
	
	@Autowired
	IShopDAO iShopDAO;
	@Autowired
	IPictureDAO iPictureDAO;

	
	@Override
	public Picture addPicture(Long shopId, Picture picture) {

		//Obtenim la botiga amb identificador "shopId" a la qual afegir el quadre
		Shop shop = iShopDAO.findById(shopId).get(); 
		
		int capacity = shop.getPicturesCapacity();
		int numPictures = shop.getPictures().size();
		
		//Si s'ha superat la capacitat màxima de la botiga no afegir mes quadres
		if(numPictures==capacity) {
			return null; 
		}
		
		if (picture.getDate()==null) { //Si no s'indica la hora es guarda l'hora actual	
			picture.setDate(new Date());
		}
		
		picture.setShop(shop); //Afegir el nou quadre a la botiga 
		
		return iPictureDAO.save(picture); //Guardar el quadre
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

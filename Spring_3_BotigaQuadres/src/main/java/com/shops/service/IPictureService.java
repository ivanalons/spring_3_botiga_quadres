package com.shops.service;

import java.util.List;

import com.shops.dto.Picture;

public interface IPictureService {

	//crea un nou quadre i l'afegeix a la botiga amb identificador "shopId" passat per parametre
	public Picture addPicture(Long shopId, Picture picture);
	
	//retorna una llista de tots els quadres de la botiga amb identificador "shopId" passat per parametre
	public List<Picture> listPicturesByShop(Long shopId);
	
	//elimina tots els quadres de la botiga amb identificador "shopId" passat per parametre
	public void deleteAllPicturesByShop(Long shopId);
}

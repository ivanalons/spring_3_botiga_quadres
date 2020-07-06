package com.shops.service;

import java.util.List;

import com.shops.dto.Picture;

public interface IPictureService {

	public Picture addPicture(Long shopId, Picture picture);
	
	public List<Picture> listPicturesByShop(Long shopId);
	
	public void deleteAllPicturesByShop(Long shopId);
}

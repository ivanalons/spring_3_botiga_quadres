package com.shops.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shops.dto.Picture;
import com.shops.service.PictureServiceImpl;

@RestController
@RequestMapping("/")
public class PictureController {

	@Autowired
	PictureServiceImpl pictureServiceImpl;
	
	@PostMapping("/shops/{id}/pictures")
	public Picture addPicture(@RequestBody Picture picture, @PathVariable(name="id") Long shopId) {

		return pictureServiceImpl.addPicture(shopId,picture);
		
	}
	
	@GetMapping("/shops/{id}/pictures")
	public List<Picture> listAllPictures(@PathVariable(name="id") Long shopId) {

		return pictureServiceImpl.listPicturesByShop(shopId);
		
	}
	
}

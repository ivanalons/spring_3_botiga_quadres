package com.shops.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shops.dto.Picture;

public interface IPictureDAO extends JpaRepository<Picture,Long>{

}

package com.huchen.service;

import com.huchen.entity.Hotel;

import java.util.List;

public interface IHotalService {
   int  addHotal(Hotel hotel);
   List<Hotel> getHotelList();
   Hotel getById(Hotel hotel);
}

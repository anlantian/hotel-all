package com.huchen.service;

import com.huchen.entity.Hotel;
import com.huchen.mapper.HotelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HotalServiceImpl  implements  IHotalService{
    @Autowired
    HotelMapper hotelMapper;

    @Override
    public int addHotal(Hotel hotel) {
        return hotelMapper.insert(hotel);
    }

    @Override
    public List<Hotel> getHotelList() {
        return hotelMapper.selectList(null);
    }

    @Override
    public Hotel getById(Hotel hotel) {
        return hotelMapper.selectById(hotel);
    }
}

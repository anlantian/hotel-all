package com.huchen.controller;

import com.huchen.entity.Hotel;
import com.huchen.service.IHotalService;
import com.mysql.cj.protocol.x.ReusableInputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HotelController {
    @Autowired
    IHotalService iHotalService;
    @RequestMapping("/addHotel")
    @ResponseBody
    int  addHotal(Hotel hotel){
        return  iHotalService.addHotal(hotel);
    }
    @RequestMapping("/hotelList")
    @ResponseBody
    List<Hotel> getHotelList(){
        return iHotalService.getHotelList();
    };
    @RequestMapping("/getHotelById")
    @ResponseBody
    Hotel getById(Hotel hotel){
        return iHotalService.getById(hotel);
    };
}

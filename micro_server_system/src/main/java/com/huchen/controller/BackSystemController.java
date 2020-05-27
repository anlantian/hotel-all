package com.huchen.controller;

import com.huchen.entity.City;
import com.huchen.entity.Hotel;
import com.huchen.feign.HotalFeign;
import com.huchen.feign.Myfeign;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/back")
public class BackSystemController {
    @Autowired
    Myfeign myfeign;
    @RequestMapping("/getAddPage")
    public String getPage(){
        return "cityadd";
    }
    @RequestMapping("/getHotelPage")
    public String getHotelPage(){
        return "hoteladd";
    }
@RequestMapping("/addCity")
@ResponseBody
    public int  addCity( City city){
    System.out.println(city.getCityName());
return myfeign.insert(city);
}
@RequestMapping("/updateCity")
@ResponseBody
public int updateCity(Integer cid,Integer number){
   return myfeign.updateHoteLNumber(cid,number);
}

    @RequestMapping("/list")
    @ResponseBody
    public List<City> queryCityList(){

    return  myfeign.queryCityList();
    }


    @Autowired
    HotalFeign hotalFeign;


    @RequestMapping("/addHotel")
    @ResponseBody
    int  addHotal(Hotel hotel){
        return hotalFeign.addHotal(hotel);
    };
    @RequestMapping("/hotelList")
    @ResponseBody
    List<Hotel> getHotelList(){
        return  hotalFeign.getHotelList();
    };
    @RequestMapping("/getHotelById")
    @ResponseBody
    Hotel getById(Hotel hotel){
        return  hotalFeign.getById(hotel);
    };
}

package com.huchen.feign;

import com.huchen.entity.Hotel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@FeignClient("hotel")
public interface HotalFeign {
    @RequestMapping("/addHotel")
    @ResponseBody
    int  addHotal(Hotel hotel);
    @RequestMapping("/hotelList")
    @ResponseBody
    List<Hotel> getHotelList();
    @RequestMapping("/getHotelById")
    @ResponseBody
    Hotel getById(Hotel hotel);
}

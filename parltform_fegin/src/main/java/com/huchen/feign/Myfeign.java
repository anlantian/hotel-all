package com.huchen.feign;

import com.huchen.entity.City;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("micro-city")
public interface Myfeign {
    @RequestMapping("/city/list")
    public List<City> queryCityList();
    @RequestMapping("/city/update")
    @ResponseBody
    public int  updateHoteLNumber(@RequestParam Integer cid,@RequestParam Integer number);
    @RequestMapping("/city/insert")
    @ResponseBody
    public int insert(@RequestBody City city);
}

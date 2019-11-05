package com.example.dubboconsumer.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.team.dubbo.entity.District;
import com.team.dubbo.service.DistrictService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DistrictController {

    @Reference(interfaceClass = DistrictService.class,check = false)
    private DistrictService districtService;

    @RequestMapping("/showDistrict")
    public String showDistrict(Model model){
        List<District> all = districtService.getAll();
        model.addAttribute("list",all);
        return "index";
    }
}

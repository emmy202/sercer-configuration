package com.aos.registrationapp.controller;


import com.aos.registrationapp.domain.District;
import com.aos.registrationapp.service.DistrictService;
import com.aos.registrationapp.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class DistrictController {
    @Autowired
    private DistrictService distServvice;
    @Autowired
    private ProvinceService provinceService;
    @GetMapping("/district/new")
    public String showNewForm(Model model){
        List provinceList =  provinceService.listAllProvince();
        model.addAttribute("district",new District());
        model.addAttribute("titlePage","Manage District");
        model.addAttribute("provinceList", provinceList);
        return "district_form";
    }

    @PostMapping("/district/save")
    public String saveProvince(District district, RedirectAttributes ra){
        distServvice.save(district);
        ra.addFlashAttribute("message","District has been successfully");
        return "redirect:/";
    }

}

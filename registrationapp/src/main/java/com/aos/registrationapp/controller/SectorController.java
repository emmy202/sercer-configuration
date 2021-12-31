package com.aos.registrationapp.controller;


import com.aos.registrationapp.domain.Sector;
import com.aos.registrationapp.service.DistrictService;
import com.aos.registrationapp.service.SectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class SectorController {
    @Autowired
    private SectorService sectorService;
    @Autowired
    private DistrictService districtService;

    @GetMapping("/sector/new")
    public String showNewForm(Model model) {
        List districtList = districtService.listAllDistrict();
        model.addAttribute("sector", new Sector());
        model.addAttribute("titlePage", "Manage Sector");
        model.addAttribute("districtList", districtList);
        return "sector_form";
    }

    @PostMapping("/sector/save")
    public String saveProvince(Sector sector, RedirectAttributes ra) {
        sectorService.save(sector);
        ra.addFlashAttribute("message", "Sector has been successfully");
        return "redirect:/";
    }

}


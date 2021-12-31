package com.aos.registrationapp.controller;


import com.aos.registrationapp.domain.Applicant;
import com.aos.registrationapp.service.ApplicantService;
import com.aos.registrationapp.service.DistrictService;
import com.aos.registrationapp.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Collections;
import java.util.List;

@Controller
public class ApplicantController {
    @Autowired
    ApplicantService service;
    @Autowired
    ProvinceService provinceService;
    @Autowired
    DistrictService districtService;
    @GetMapping("/applicants")
    public String applicantsList(Model model){
        List appList =  service.listAll();
        model.addAttribute("appList", appList);
        return "/applicants";
    }
    @PostMapping("/applicant/save")
public String saveApplicant(Applicant applicant, RedirectAttributes ra){
     service.save(applicant);
     ra.addFlashAttribute("message","Application has been successfully");
  return "redirect:/applicants";
}

@GetMapping("applicant/new")
public String showNewForm(String accNo ,Model model){
        List provinceList = provinceService.listAllProvince();
        List districtList = districtService.findByProvinceId(accNo);
        //List districtList = Collections.singletonList(districtService.findDistById(provId));
        model.addAttribute("applicant",new Applicant());
        model.addAttribute("titlePage","Manage Applicants") ;
        model.addAttribute("provinceList", provinceList);
        model.addAttribute("districtList",districtList);
        return "applicant_form";


           }

}


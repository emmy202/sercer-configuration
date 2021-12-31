package com.aos.registrationapp.controller;



import com.aos.registrationapp.domain.Province;
import com.aos.registrationapp.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class ProvinceController {
  @Autowired
    private ProvinceService proServise;

  @GetMapping("/province/new")
      public String showNewForm(Model model){
        model.addAttribute("province",new Province());
        model.addAttribute("titlePage","Manage Location");
        return "location_form";
      }

    @PostMapping("/province/save")
    public String saveProvince(Province province, RedirectAttributes ra){
        proServise.save(province);
        ra.addFlashAttribute("message","province has been successfully");
        return "redirect:/";
    }
  }








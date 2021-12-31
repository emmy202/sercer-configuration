package com.aos.registrationapp.controller;


import com.aos.registrationapp.domain.User;
import com.aos.registrationapp.service.UserService;
import com.aos.registrationapp.userNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService service;

    @GetMapping("/users")
    public String studentList (Model model){

        List usersList = service.listAll();
        model.addAttribute("usersList", usersList);
        return "users";
    }

    @GetMapping("/users/new")
    public  String showNewForm(Model model){
    model.addAttribute("user", new User());
    model.addAttribute("titlePage","Add new User");
    return  "user_form";
    }
    @PostMapping("/users/save")
    public String saveUser(User user, RedirectAttributes ra){
        service.save(user);
        ra.addFlashAttribute("message","User has been saved successfully");
        return "redirect:/users";
    }
    @GetMapping("/users/edit/{id}")
    public String showEditForm(@PathVariable("id")Integer id, Model  model, RedirectAttributes ra) {
        try {
            User user = service.get(id);
           model.addAttribute("user",user);
           model.addAttribute("titlePage","Edit user:(ID: " + id + ")");
           return  "user_form";
        }catch (userNotFoundException e){
            ra.addFlashAttribute("message", e.getMessage());
            return "redirect:/users";
        }
    }

    @GetMapping("/users/delete/{id}")
    public String deleteUser(@PathVariable("id")Integer id, RedirectAttributes ra) {
        try {
           service.deleteById(id);
           ra.addFlashAttribute("message","User with id" +id+"has been deleted successfully");

        }catch (userNotFoundException e){
            ra.addFlashAttribute("message",e.getMessage());


        }
        return "redirect:/users";
    }
}

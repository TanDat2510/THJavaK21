/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ltd.controllers;

import com.ltd.service.CategoryService;
import com.ltd.service.ProductService;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author admin
 */
@Controller
@ControllerAdvice

public class HomeControllers {
    @Autowired
    private CategoryService cateService;
    @Autowired
    private ProductService prodService;
    @ModelAttribute
    public void commonAttributes(Model model){
        model.addAttribute("cates", this.cateService.getCates());
    }
    
    @RequestMapping("/")
    @Transactional
    public String index(Model model){
       
        
        model.addAttribute("products", this.prodService.getProducts(null));

        return "home";
    }
}

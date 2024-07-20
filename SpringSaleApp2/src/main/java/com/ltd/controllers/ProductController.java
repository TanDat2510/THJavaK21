/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ltd.controllers;

import com.ltd.pojo.Product;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author admin
 */
@Controller
public class ProductController {
    @GetMapping("/products")
    public String ProducView(Model model){
        model.addAttribute("product", new Product());
        return "products";
    }
    
    @PostMapping("/products")
    public String create(Model model, @ModelAttribute(value="product")@Valid Product p,BindingResult rs){
        if(rs.hasErrors())
            return "products";
        
        return "redirect:/";
    
    }
}

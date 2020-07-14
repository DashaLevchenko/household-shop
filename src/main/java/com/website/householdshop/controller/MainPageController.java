package com.website.householdshop.controller;

import com.website.householdshop.models.Categories;
import com.website.householdshop.models.Products;
import com.website.householdshop.repo.CategoriesRepository;
import com.website.householdshop.repo.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {

    @Autowired
    private CategoriesRepository categoriesRepository;
    @Autowired
    private ProductsRepository productsRepository;

    private Iterable<Categories> categories = categoriesRepository.findAll();
    private Iterable<Products> products = productsRepository.findAll();


    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("categories", categories);
        model.addAttribute("products", products);

        return "index";
    }
}
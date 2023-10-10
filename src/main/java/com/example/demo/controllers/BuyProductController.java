package com.example.demo.controllers;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.service.PartService;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BuyProductController {
    @Autowired
    private ApplicationContext context;
    @GetMapping("/buyProduct")
    public String decreaseProduct(@RequestParam("productID") int theId) {
        ProductService productService = context.getBean(ProductServiceImpl.class);
        Product product1=productService.findById(theId);
        if (product1.getInv() > 0){
            product1.setInv(product1.getInv() - 1);
            productService.save(product1);
        } else{
            return "ProductDeleteError";
        }
    return "ConfirmPurchase";
    }
}

package com.example.demo.controllers;

import com.example.demo.domain.Product;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class BuyNowController {
    @Autowired
    private ApplicationContext context;
    private Product product;

    @GetMapping("/purchasemessage")
    public String purchaseMessage(@RequestParam("productID") int theId) {
        ProductService repo = context.getBean(ProductServiceImpl.class);
        Product theProduct = repo.findById(theId);

        if(theProduct.getId()!=0) {
            if(theProduct.getInv() == 0) {
                return "outofstock";
            }
            theProduct.setInv(theProduct.getInv()-1);
        }
        repo.save(theProduct);
        return "purchaseconfirmation";
    }
}

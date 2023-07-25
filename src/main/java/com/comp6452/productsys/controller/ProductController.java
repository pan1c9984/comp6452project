package com.comp6452.productsys.controller;

import com.comp6452.productsys.entity.Product;
import com.comp6452.productsys.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @author Weizhe Pan
 * @date 2023/7/25
 */
@RestController
@RequestMapping("/productsys")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/getProductById")
    public List<Product> getProductById(@RequestParam (value = "productId")Integer productId){
        return productService.getProductById(productId);
    }

    @PostMapping("/addProduct")
    public boolean tryAddProduct(@RequestParam(value = "name") String name,
                              @RequestParam(value = "farm_location") String farmLocation,
                              @RequestParam(value = "planting_method") String plantingMethod,
                              @RequestParam(value = "harvest_date") Date harvestDate){
        return productService.addProduct(name,farmLocation,plantingMethod,harvestDate);
    }
}

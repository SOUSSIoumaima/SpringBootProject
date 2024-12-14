package com.horizon.ecommerceproject.controller;

import com.horizon.ecommerceproject.entity.Product;
import com.horizon.ecommerceproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Service
@CrossOrigin
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping("/add")
    public String add(@RequestBody Product product){
        productService.saveProduct(product);
        return "New product is added";
    }
    @GetMapping("/getAll")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        productService.deleteProduct(id);
        return "delete success";
    }


}

package com.inheritance.controller;

import com.inheritance.entity.Book;
import com.inheritance.entity.Myproduct;
import com.inheritance.entity.Pen;
import com.inheritance.entity.Pet;
import com.inheritance.service.MyProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("myproduct/")
public class MyProductController {

    @Autowired
    private MyProductService productService;

    @PostMapping("addtoBook")
    public Book addToBook(@RequestBody Book book){
        return productService.addBook(book);
    }

    @PostMapping("addtoPen")
    public Pen addToPen(@RequestBody Pen pen){
        return productService.addPen(pen);
    }

    @GetMapping("/allProducts")
    public List<Myproduct> getproData()
    {

        return productService.fetchAll();
    }

     @DeleteMapping("{proid}")
     public String deleteProductsById(@PathVariable("proid") Long productId)
    {
        productService.deleteProductsById(productId);
        return "Deleted Successfully";
    }
}

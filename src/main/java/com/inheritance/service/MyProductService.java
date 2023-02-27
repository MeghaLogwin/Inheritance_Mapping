package com.inheritance.service;

import com.inheritance.entity.Book;
import com.inheritance.entity.Myproduct;
import com.inheritance.entity.Pen;
import com.inheritance.entity.Pet;
import com.inheritance.repository.BookRepo;
import com.inheritance.repository.MyProductRepo;
import com.inheritance.repository.PenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyProductService {

    @Autowired
    private MyProductRepo myProductRepo;

    @Autowired
    private BookRepo bookRepo;

    @Autowired
    private PenRepo penRepo;

    public Book addBook(Book book){

        return bookRepo.save(book);
    }

    public Pen addPen(Pen pen){

        return penRepo.save(pen);
    }

    public List<Myproduct> fetchAll() {

        return myProductRepo.findAll();
    }

    public void deleteProductsById(Long productId)
    {

        myProductRepo.deleteById(productId);
    }
}

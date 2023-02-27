package com.inheritance.controller;

import com.inheritance.entity.MyEmployee;
import com.inheritance.entity.Pet;
import com.inheritance.service.MyEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyEmployeeController {

    @Autowired
    private MyEmployeeService service;

    @PostMapping("/create")
    public MyEmployee create(@RequestBody MyEmployee myEmployee){
        return service.create(myEmployee);
    }

    @GetMapping("/get")
    public List<MyEmployee> getData()
    {

        return service.getAllPersonWithCompany();
    }

    @PutMapping("{personid}")
    public MyEmployee update(@RequestBody MyEmployee myEmployee, @PathVariable("personid") Long personId)
    {
        return service.updatePerson(myEmployee,personId);
    }

    @DeleteMapping("/{id}")
    public String deleteMyEmployeeById(@PathVariable("id") Long personId)
    {
        service.deleteMyEmployeeById(personId);
        return "Deleted Successfully";
    }
}

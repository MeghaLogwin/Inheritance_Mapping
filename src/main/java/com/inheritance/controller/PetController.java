package com.inheritance.controller;

import com.inheritance.entity.Brand;
import com.inheritance.entity.Pet;
import com.inheritance.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("animal/")
public class PetController {

    @Autowired
    private PetService service;

    @PostMapping("addPet")
    public Pet addPet(@RequestBody Pet pet){

        return service.addPet(pet);
    }

    @GetMapping("getAllAnimals")
    public List<Pet> getAllAnimals(){
        return service.getAllAnimals();
    }

    @PutMapping("{petid}")
    public Pet update(@RequestBody Pet pet, @PathVariable("petid") Long animalId)
    {
        return service.updateAnimal(pet,animalId);
    }

    @DeleteMapping("{petid}")

    public String deleteAnimalsById(@PathVariable("petid") Long animalId)
    {
        service.deleteAnimalsById(animalId);
        return "Deleted Successfully";
    }


}

package com.inheritance.service;

import com.inheritance.entity.Brand;
import com.inheritance.entity.Pet;
import com.inheritance.repository.PetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    @Autowired
    private PetRepo petRepo;

    public Pet addPet(Pet pet){
        return petRepo.save(pet);
    }

    public List<Pet> getAllAnimals(){
        return petRepo.findAll();
    }

    public Pet updateAnimal(Pet pet, Long animalId) {

        Pet existingPet = petRepo.findById(animalId).get();
        existingPet.setName(pet.getName());
        existingPet.setSpecies(pet.getSpecies());
        return petRepo.save(existingPet);
    }

    public void deleteAnimalsById(Long animalId)
    {

        petRepo.deleteById(animalId);
    }
}

package com.inheritance.service;

import com.inheritance.entity.Brand;
import com.inheritance.entity.Vehicle;
import com.inheritance.repository.BrandRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    @Autowired
    private BrandRepo brandRepo;

    public Brand saveBrand(Brand brand){


        return brandRepo.save(brand);
    }

    public List<Brand> getAllVehicles(){

        return brandRepo.findAll();
    }

    /*public void update(Brand brands,long vehicleId) {
        brandRepo.save(brands);
    }*/

    public void deleteVehiclesById(Long vehicleId)
    {

        brandRepo.deleteById(vehicleId);
    }
    public Brand updateBrand(Brand brand, long vehicleId) {
        Brand existingBrand = brandRepo.findById(vehicleId).get();
        existingBrand.setManufacturer(brand.getManufacturer());
        existingBrand.setName(brand.getName());
        existingBrand.setSeatingCapacity(brand.getSeatingCapacity());
        return brandRepo.save(existingBrand);
    }
}

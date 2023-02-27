package com.inheritance.controller;

import com.inheritance.entity.Brand;
import com.inheritance.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("vehicle/")
public class VehicleController {

    @Autowired
    private VehicleService service;

    @PostMapping("saveBrands")
    public Brand saveBrand(@RequestBody Brand brand){

        return service.saveBrand(brand);
    }

    @GetMapping("getAllVehicles")
    public List<Brand> getAllVehicles(){

        return service.getAllVehicles();
    }

    @PutMapping("{vehicleid}")
    public Brand update(@RequestBody Brand brand, @PathVariable("vehicleid") Long vehicleId)
    {
        return service.updateBrand(brand,vehicleId);
    }

    @DeleteMapping("{brandid}")

    public String deleteVehiclesById(@PathVariable("brandid") Long vehicleId)
    {
        service.deleteVehiclesById(vehicleId);
        return "Deleted Successfully";
    }


}





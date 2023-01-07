package com.example.rentACar.webApi.controllers;


import com.example.rentACar.business.abstracts.BrandService;
import com.example.rentACar.business.requests.CreateBrandRequest;
import com.example.rentACar.business.responses.GetAllBrandsResponse;
import com.example.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {
    private final BrandService brandService;
    @Autowired
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }
    @GetMapping("/getall")
    public List<GetAllBrandsResponse>getAll(){
        return brandService.getAll();
    }
    @PostMapping("/add")
    public void add(@RequestBody() CreateBrandRequest createBrandRequest){
        brandService.add(createBrandRequest);
    }
}

package com.example.rentACar.business.abstracts;

import com.example.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BrandService {
    List<Brand> getAll();
}

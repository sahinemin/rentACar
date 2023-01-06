package com.example.rentACar.dataAccess.concretes;

import com.example.rentACar.dataAccess.abstracts.BrandRepository;
import com.example.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InMemoryBrandRepository implements BrandRepository {
    List<Brand> brands;
    @Override
    public List<Brand> getAll() {
        brands= new ArrayList<>();
        brands.add(new Brand(1,"Audi"));
        brands.add(new Brand(2,"BMW"));
        brands.add(new Brand(3,"Mercedes"));
        brands.add(new Brand(3,"Fiat"));
        return brands;
    }
}

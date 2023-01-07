package com.example.rentACar.business.concretes;

import com.example.rentACar.business.abstracts.BrandService;
import com.example.rentACar.business.requests.CreateBrandRequest;
import com.example.rentACar.business.responses.GetAllBrandsResponse;
import com.example.rentACar.dataAccess.abstracts.BrandRepository;
import com.example.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class BrandManager implements BrandService {

    private final BrandRepository brandRepository;
    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<GetAllBrandsResponse> getAll() {
        List<Brand> brands=brandRepository.findAll();
        List<GetAllBrandsResponse> brandsResponse= new ArrayList<>();
        //iş kuralları
        for (Brand brand: brands) {
            brandsResponse.add(new GetAllBrandsResponse(brand.getId(), brand.getName()));
        }
       return brandsResponse;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        Brand brand = new Brand();
        brand.setName(createBrandRequest.getName());
        brandRepository.save(brand);
    }
}

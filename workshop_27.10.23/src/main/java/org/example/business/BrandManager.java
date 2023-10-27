package org.example.business;

import org.example.core.Logger;
import org.example.dataAccess.BrandRepository;
import org.example.dataAccess.MemoryBrandRepository;
import org.example.entities.Brand;

import java.util.List;

public class BrandManager implements BrandService{
    public Logger[] loggers;
    public BrandRepository brandRepository;
    public  BrandManager(MemoryBrandRepository memoryBrandRepository, Logger[] loggers){
        this.loggers=loggers;
    }

    @Override
    public List<Brand> brands() {
        return this.brandRepository.getall();
    }

    @Override
    public void add(Brand brand) throws Exception {
        this.brandRepository.getall();
        List<Brand> brands = this.brandRepository.getall();

        for (int i = 0; i < brands.size(); i++) {
            if (brands.get(i).getId() == brand.getId()) {
                throw new Exception("Ürün id'leri aynı olamaz.");
            }
        }
        this.brandRepository.add(brand);
        }
    public BrandManager(BrandRepository brandRepository) {

        this.brandRepository=brandRepository;
    }
    @Override
    public void delete(int id) {
        this.brandRepository.delete(id);
    }

}

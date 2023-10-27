package org.example.dataAccess;

import org.example.entities.Brand;

import java.util.List;

public interface BrandRepository {
    void add(Brand brand);
    List<Brand> getall();
    void delete(int id);

}

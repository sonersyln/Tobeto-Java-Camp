package org.example.business;
import org.example.entities.Brand;
import java.util.List;

public interface BrandService {
    List<Brand> brands();
    void add(Brand brand) throws Exception;
    void delete(int id);
}

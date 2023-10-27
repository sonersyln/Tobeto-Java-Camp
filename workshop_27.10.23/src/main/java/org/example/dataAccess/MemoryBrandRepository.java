package org.example.dataAccess;
import org.example.entities.Brand;
import java.util.ArrayList;
import java.util.List;

public class MemoryBrandRepository implements BrandRepository{
    List<Brand> brands;
    @Override
    public void add(Brand brand) {
        brands.add(brand);
    }
    @Override
    public List<Brand> getall() {
        return brands;
    }

    //Add işlemi
    public MemoryBrandRepository() {
        brands = new ArrayList<>();
        brands.add(new Brand(1,"BMW","3 Series"));
        brands.add(new Brand(2,"Audi","A4"));
        brands.add(new Brand(3,"Volkswagen","Golf"));
        brands.add(new Brand(4,"Mercedes","C Series"));
    }

    //Delete işlemi
    public void delete(int id) {
        int indexToRemove = -1;
        for (int i = 0; i < brands.size(); i++) {
            if (brands.get(i).getId() == id) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            brands.remove(indexToRemove);
            System.out.println("ID " + id + " silindi!");
        } else {
            System.out.println("ID " + id + " bulunamadı!");
        }
    }


}

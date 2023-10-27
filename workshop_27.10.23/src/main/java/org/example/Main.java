package org.example;

import org.example.business.BrandManager;
import org.example.business.BrandService;
import org.example.core.DatabaseLogger;
import org.example.core.FileLogger;
import org.example.core.Logger;
import org.example.core.MailLogger;
import org.example.dataAccess.MemoryBrandRepository;
import org.example.entities.Brand;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BrandService brandService = new BrandManager(new MemoryBrandRepository());

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        //Marka ekleme
        Brand brand = new Brand(5, "Honda", "Civic");
        Brand brand1 = new Brand(6, "Hyundai", "Elentra");
        Brand brand2 = new Brand(7, "Volvo", "XC60");
        Brand brand4 = new Brand(8, "Fiat", "500");

        brandService.add(brand);
        brandService.add(brand1);
        brandService.add(brand2);
        brandService.add(brand4);

        List<Brand> brands = brandService.brands();



        //Log yazdırma.
        for (Logger logger : loggers) {
            for (Brand brands3 : brands) {
                logger.log("Marka: " + brands3.getName() + "  Model: " + brands3.getModel() + "  Id: " + brands3.getId());
            }
        }


        //Marka silme.
        brandService.delete(10);
        brandService.delete(5);


        //Markaları yazdırma.
        for (Brand brands3 : brands) {
            System.out.println("Marka: " + brands3.getName() + "  Model: " + brands3.getModel() + "  Id: " + brands3.getId());
        }

    }
}
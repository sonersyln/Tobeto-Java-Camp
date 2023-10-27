package org.example;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image1.jpg");


        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(5);
        product2.setUnitPrice(4500);
        product2.setUnitsInStock(5);
        product2.setImageUrl("image2.jpg");


        Product product3 = new Product();
        product3.setName("Kitchen Kahve Makinesi");
        product3.setDiscount(9);
        product3.setUnitPrice(5500);
        product3.setUnitsInStock(2);
        product3.setImageUrl("image3.jpg");

        Product[] products = {product1,product2,product3};

        System.out.println("<ul>");
        for (Product product: products) {
            System.out.println("<li>" + product.getName()+ "</li>");
        }
        System.out.println("</ul>");


        // Bireysel Müşteri
        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05348352222");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Soner");
        individualCustomer.setLastName("Şeylan");

        //Kurumsal Müşteri
        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("05343342232");
        corporateCustomer.setTaxNumber("1111111111");
        corporateCustomer.setCustomerNumber("54321");

        Customer[] customers = {individualCustomer,corporateCustomer};


    }
}
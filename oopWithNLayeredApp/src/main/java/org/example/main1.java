package org.example;

public class main1 {

    //create a product
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("iPhone 11");
        product.setPrice(10000);
        product.setStock(100);
        product.setWeight(100);
        System.out.println(product);
    }
}

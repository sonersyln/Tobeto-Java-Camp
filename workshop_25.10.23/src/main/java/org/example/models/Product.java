package org.example.models;

public class Product {
    private String name;
    private double unitPrice;
    private double discount;
    private int unitInStock;
    private int productId;

    public Product(){

    }

    public Product(String name, double unitPrice, double discount, int unitInStock, int productId) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.discount = discount;
        this.unitInStock = unitInStock;
        this.productId = productId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }



    public void info(){
        System.out.println("Ürün Adı: "+this.getName()+" "+" "+"- İndirim: "+this.getDiscount()+" "+" "+"- Stok Adedi: "+this.getUnitInStock()+" "+" "+
                "- Fiyat: "+this.getUnitPrice()+" "+" "+"- Ürün ID: "+this.getProductId());
    }
}


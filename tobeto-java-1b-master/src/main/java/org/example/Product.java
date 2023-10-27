package org.example;

// public,private
// protected

// Her class, default olarak boş bir constructor ile başlar.
public class Product
{
    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // encapsulation
    // private => class dışında hiç kimse kullanamaz
    private String name;
    private double price;

    // getter - setter
    // okuma - yazma public fonksiyon

    // sadece getter varsa => read-only


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // erişim_belirteci dönüş_tipi method_ismi() {}
    public void discount(double discount)
    {
        price = price - discount;
    }
    // method overloading => aynı isimde farklı imzada n kadar methoda sahip olmak
}

package org.example.models;
//sipariş id, user id, hangi ürünler var ürün id
public class Order {
    private int orderID;
    private int userId;
    private String country;
    private int productId;
    public Order(){

    }

    public Order(int orderID, int userId, String country, int productId) {
        this.orderID = orderID;
        this.userId = userId;
        this.country = country;
        this.productId = productId;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }




    public void info(){
        System.out.println("Ülke: "+this.getCountry()+" "+" "+"- Sipariş ID: "+this.getOrderID()+" "+" "+"- Ürün ID: "
                +this.getProductId()+" "+" "+"- Kullanıcı ID: "+this.getUserId());
    }
}

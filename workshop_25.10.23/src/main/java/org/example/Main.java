package org.example;

import org.example.models.Category;
import org.example.models.Order;
import org.example.models.Product;
import org.example.models.User;

public class Main {
    public static void  main(String[] args){
       //kategori
        System.out.println("Kategori Bilgileri:");

        Category elektronik = new Category("Elektronik",1);
        elektronik.info();

        System.out.println("-------------------------------------------------------------------------");

        //ürün
        System.out.println("Ürün Bilgileri:");

        Product product1 =new Product("Sinbo Sco-5043 Çok Fonksiyonlu Pişirici SCO-5043",459.95,50,5,1);
        Product product2 =new Product("Roidmi X30 Pro Şarjlı Kablosuz Dikey Süpürge x30pro",12820,100,12,2);
        Product product3 =new Product("Arzum Olivya Seramik Tabanlı Ütü Ar684 AR684/SIYAH",795,35,3,3);
        Product product4 =new Product("AWOX Tulipso Ince Bıçaklı Çubuk Blender Sarı",270,50,51,4);

        product1.info();
        product2.info();
        product3.info();
        product4.info();

        System.out.println("-------------------------------------------------------------------------");

        //kullanıcı
        System.out.println("Kullanıcı Bilgileri:");

        User user1 = new User("Soner","Şeylan","test@gmail.com",1,"Türkiye","İstanbul");
        User user2 = new User("Ahmet","Kartal","test1@gmail.com",2,"Türkiye","Ankara");

        user1.info();
        user2.info();

        System.out.println("-------------------------------------------------------------------------");

        //Sipariş
        System.out.println("Sipariş Bilgileri:");

        Order order1 = new Order(1,2,"Türkiye",3);
        Order order2 = new Order(2,1,"Türkiye",4);
        Order order3 = new Order(3,1,"Türkiye",1);

        order1.info();
        order2.info();
        order3.info();

        System.out.println("-------------------------------------------------------------------------");

    }

}
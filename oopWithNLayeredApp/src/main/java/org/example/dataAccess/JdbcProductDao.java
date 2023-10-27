package org.example.dataAccess;


import org.example.entities.Product;

//Dao => Data Access Object
public class JdbcProductDao implements ProductDao{
    public void add(Product product) {
        //sadece db erişim kodları buraya yazılır. SQL
        System.out.println("JDBC ile veritabanına eklendi");
    }
}


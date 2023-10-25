package org.example.models;
//isim soyisim,eposta, id,ülke, şehir
public class User {
    private String name;
    private String lastName;
    private String mail;
    private int userId;
    private String country;
    private String city;

    public User(){

    }

    public User(String name, String lastName, String mail, int userId, String country, String city) {
        this.name = name;
        this.lastName = lastName;
        this.mail = mail;
        this.userId = userId;
        this.country = country;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void info(){
        System.out.println("İsim: "+this.getName()+" "+" "+"- Soyisim: "+this.getLastName()+" "+" "+"- Ülke: "+this.getCountry()
                + " "+" "+"- Şehir: "+this.getCity()+" "+" "+"- Mail: "+this.getMail()+" "+" "+"- Kullanıcı ID: "+this.getUserId());
    }


}

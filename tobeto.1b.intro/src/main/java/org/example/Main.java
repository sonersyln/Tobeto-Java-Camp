package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main
{ /* Main classının scope başlangıcı */
    public static int staticNumber = 0;
    public static void main(String[] args)
    { /* Main metotunun scope başlangıcı */
        System.out.println(staticNumber);
        // Programlama
        // Elimizdeki ham verinin yönetilerek yazılım ürününe çevilirmesi.

        // Programming Concepts

        // Variables - Değişkenler

        // type-safe
        String text = "Merhaba, Tobeto";
        Integer number = 10;
        int number2 = 15;
        // RAM'de tutuluyolar.
        System.out.println(text);
        System.out.println(number);
        System.out.println(number2);

        List<Integer> numbers =  new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);
        // Scope => Kapsam,Alan

        if(1==2)
        {
            System.out.println(staticNumber); // main.class
            System.out.println(numbers); // main method
            String text2 = "Merhaba"; // if scope
            if(2==2){
                String text3 = "Merhaba 3";
            }
        }
        // main.class
        // main.method
        else
        {
            System.out.println("Koşul yanlış");
        }

        // Şart Blokları

        // içerisine kabul ettiği koşul ile bu koşulun sağlanıp sağlanamama durumuna göre
        // bir kod çalıştıran yapılar..

        // == != > < >= <=
        int number3=4;
        int number4=6;
        if(number3 > number4) // boolean => true,false
        {
            System.out.println("Number 3 daha büyük");
        }
        else if(number3 > 5){
            System.out.println("Number 3 5'ten büyük");
        }
        // **************************************** //
        if(number3==number4)
        {
            System.out.println("Number eşit");
        }
        else
        {
            System.out.println("Number 3 daha küçük");
        }

        // ** => Her if bloğundan sadece bir scope çalıştırılır

        if(number3 > 10){
            // BLA BLA..
        }


        char state = 'A';

        switch(state){ // state isimli değişkeni switch et
            case 'A': // değer A olduğunda
                System.out.println("A durumu");
                break;
            case 'B': // B olduğunda
                System.out.println("B durumu");
                break;
            case 'C': // C olduğunda
                System.out.println("C durumu");
                break;
            default:
                System.out.println("Bilinmeyen durumlar");
                break;
        }

    } /* Main metotunun scope bitişi */
} /* Main classının scope bitiş */
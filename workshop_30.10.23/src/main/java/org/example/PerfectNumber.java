package org.example;

public class PerfectNumber {
    public static void main(String[] args) {
        int count = 0; // Bulunan mükemmel sayıların sayısı
        long number = 2; // Formülde kullanılan sayının başlangıç değeri

        System.out.println(" 10 Perfect Number :");

        while (count < 10) {
            long perfect = ((1L << number) - 1) * (1L << (number - 1));

            if (isPerfect(perfect)) {
                System.out.println(perfect);
                count++;
            }
            number++;
        }
    }

    // Bir sayının mükemmel olup olmadığını kontrol eden fonksiyon
    public static boolean isPerfect(long n) {
        long sum = 1; // 1 her zaman bölen olarak kullanılır
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }
        return sum == n;
    }
}


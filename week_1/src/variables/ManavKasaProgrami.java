package variables;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        //meyvelerin birim fiyatlarını belirliyoruz.
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5;
        
        Scanner kiloGir = new Scanner(System.in);
        //kullanıcıdan meyvelerin kilo bilgilerini alıyoruz.
        System.out.print("Armut Kaç kilo ? : ");
        double armutKg = kiloGir.nextDouble();
        System.out.print("Elma Kaç kilo ? : ");
        double elmaKg = kiloGir.nextDouble();
        System.out.print("Domates Kaç kilo ? : ");
        double domatesKg = kiloGir.nextDouble();
        System.out.print("Muz Kaç kilo ? : ");
        double muzKg = kiloGir.nextDouble();
        System.out.print("Patlıcan Kaç kilo ? : ");
        double patlicanKg = kiloGir.nextDouble();
        // toplam tutarı hesaplıyoruz ve yazdırıyoruz.
        double toplamTutar = (armut * armutKg + elma * elmaKg +domates*domatesKg + muz*muzKg +patlican*patlicanKg);
        System.out.println("Toplam tutar :" +toplamTutar);
    }
}

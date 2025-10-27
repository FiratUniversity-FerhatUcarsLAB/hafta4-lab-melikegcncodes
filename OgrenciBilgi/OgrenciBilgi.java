/*
 * Ad Soyad: Melike Gücin
 * Ogrenci No: 240541081
 * Tarih: 27.10.2025
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 *
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diger java dosyalarinin basinda da bu ornek formattaki gibi kisa bilgi giriniz.
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner objesini input ismiyle olusturduk.

        // Degiskenlerimiz
        String ad, soyad;
        int ogrenciNo, yas;
        double gpa;

        // Kullanicidan bilgileri alin
        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.println();

        // Ad
        System.out.print("Adinizi girin: ");
        ad = input.nextLine(); // İsim aldiriyoruz.

        // Soyad
        System.out.print("Soyadinizi girin: ");
        soyad = input.nextLine(); // Soyisim aldırıyoruz.

        // Ogrenci No
        System.out.print("Ogrenci numaraniz: ");
        ogrenciNo = input.nextInt(); // Ogrenci numarasi aldiriyoruz.

        // Yas
        System.out.print("Yasiniz: ");
        yas = input.nextInt(); // Yas aldiriyoruz.

        // GPA
        System.out.print("GPA (0.00-4.00): ");
        gpa = input.nextDouble(); // Not ortalamasi aldiriyoruz.

        // Bilgileri ekrana yazdirin
        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");

        // Cozumumuzun ciktisi
        System.out.println("Ad Soyad: " + ad + " " + soyad);
        System.out.println("Ogrenci No: " + ogrenciNo);
        System.out.println("Yas: " + yas);
        System.out.printf("GPA: %.2f", gpa); // %.2f kullanmamızın sebebi virgülden sonra 2 haneyi göstermesini istememizdir.

        // Ogrenci basari durumu belirleme
        if (gpa >= 2.5) {
            System.out.println("\nDurum: Basarili Ogrenci");
        } else {
            System.out.println("\nDurum: Basarisiz Ogrenci");
        }

        // Scanner'i kapatin (önemli pratik)
        input.close();
    }
}

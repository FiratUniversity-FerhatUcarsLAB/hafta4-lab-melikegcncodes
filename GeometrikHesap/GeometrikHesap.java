/*
 * Ad Soyad: Melike Gücin
 * Ogrenci No: 240541081
 * Tarih: 27.10.2025
 * Aciklama: Gorev 2 - Geometrik Hesaplayici
 *
 * Bu program kullanicidan daire yaricapini alir ve
 * daire ile kureye ait hesaplamalari yapip ekrana duzenli sekilde yazdirir.
 */

import java.util.Scanner;

public class GeometrikHesap {
    public static void main(String[] args) {
        // Sabit tanimlama
        final double PI = 3.14159;

        // Scanner nesnesi
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan yaricap al
        System.out.println("=== GEOMETRIK HESAPLAYICI ===");
        System.out.print("Dairenin yaricapini girin (cm): ");
        double r = input.nextDouble();

        // Hesaplamalar
        double daireAlani = PI * Math.pow(r, 2); // Alan hesaplamasi
        double daireCevresi = 2 * PI * r; // Cevre hesaplamasi
        double daireCapi = 2 * r; // Cap hesaplamasi
        double kureHacmi = (4.0 / 3.0) * PI * Math.pow(r, 3); // Hacim hesaplamasi
        double kureYuzeyAlani = 4 * PI * Math.pow(r, 2); // YuzeyAlani hesaplamasi

        // Sonuclari yazdir
        System.out.println("SONUCLAR:");
        System.out.println("----------");
        System.out.printf("Daire Alani       : %.2f cm^2%n", daireAlani); // %.2f kullanmamizin sebebi virgülden sonra 2 hane gösterilmesini istememizdir.
        System.out.printf("Daire Cevresi     : %.2f cm%n", daireCevresi); // %.2f kullanmamizin sebebi virgülden sonra 2 hane gösterilmesini istememizdir.
        System.out.printf("Daire Capi        : %.2f cm%n", daireCapi); // %.2f kullanmamizin sebebi virgülden sonra 2 hane gösterilmesini istememizdir.
        System.out.printf("Kure Hacmi        : %.2f cm^3%n", kureHacmi); // %.2f kullanmamizin sebebi virgülden sonra 2 hane gösterilmesini istememizdir.
        System.out.printf("Kure Yuzey Alani  : %.2f cm^2%n", kureYuzeyAlani); // %.2f kullanmamizin sebebi virgülden sonra 2 hane gösterilmesini istememizdir.

        // Scanneri kapat
        input.close();
    }
}

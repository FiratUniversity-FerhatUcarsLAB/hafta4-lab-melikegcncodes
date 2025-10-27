/*
 * Ad Soyad: Melike Gücin
 * Ogrenci No: 240541081
 * Tarih: 27.10.2025
 * Aciklama: Gorev 3 - Maas Hesaplama Sistemi
 *
 * Bu program calisan bilgilerini alir, maas bordrosu olusturur.
 * Notlar:
 * - Oranlar ondalik degerlerle tanimlanmistir (ornegin %14 -> 0.14).
 * - Tum para degerleri 2 ondalik basamakla yazdirilir.
 * - Yuzde degerleri 1 ondalik basamakla yazdirilir.
 * - Scanner ile sayi/Metin karisimi kullanirken nextLine() tuzagina dikkat edilir.
 */

import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {
        // Sabitler
        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;

        // Scanner Nesnesi
        Scanner input = new Scanner(System.in);

        // === Girdi Alma ===
        System.out.print("Calisan ad soyad: ");
        String adSoyad = input.nextLine();  // once metni almak, nextLine tuzagini azaltir

        System.out.print("Aylik brut maas (TL): ");
        double brutMaas = input.nextDouble(); // Aylik brut maas aldiriyoruz.

        System.out.print("Mesai saati sayisi: ");
        int mesaiSaat = input.nextInt();

        // === Hesaplamalar ===
        // Mesai ucreti = (brut / 160) * mesaiSaat * 1.5
        double saatlikUcret = brutMaas / 160.0;
        double mesaiUcreti = saatlikUcret * mesaiSaat * 1.5;

        double toplamGelir = brutMaas + mesaiUcreti;

        double sgkKesinti = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;

        double toplamKesinti = sgkKesinti + gelirVergisi + damgaVergisi;
        double netMaas = toplamGelir - toplamKesinti;

        // === Cikti ===
        System.out.println("====================================");
        System.out.println("MAAS BORDROSU");
        System.out.println("====================================");
        System.out.printf("Calisan: %s%n", adSoyad); // %s ile string ile alinan veriyi yazdiriyoruz.

        System.out.println("GELIRLER:");
        System.out.printf("Brut Maas : %.2f TL%n", brutMaas); // %.2f ile virgulden sonra 2 hane yazdiriyoruz.
        System.out.printf("Mesai Ucreti (%d saat) : %.2f TL%n", mesaiSaat, mesaiUcreti); // %d ile int ile aldigimiz saat sayisini yazdiriyoruz.
        System.out.println("------------------------");
        System.out.printf("TOPLAM GELIR : %.2f TL%n", toplamGelir); // %.2f ile virgulden sonra 2 hane yazdiriyoruz.

        System.out.println("KESINTILER:");
        System.out.printf("SGK Kesintisi (%.1f%%) : %.2f TL%n", SGK_ORANI * 100, sgkKesinti); // %.2f ile virgulden sonra 2 hane yazdiriyoruz.
        System.out.printf("Gelir Vergisi (%.1f%%) : %.2f TL%n", GELIR_VERGISI_ORANI * 100, gelirVergisi); // %.1f ile virgulden sonra 1 hane yazdiriyoruz.
        System.out.printf("Damga Vergisi (%.1f%%) : %.2f TL%n", DAMGA_VERGISI_ORANI * 100, damgaVergisi); // %.1f ile virgulden sonra 1 hane yazdiriyoruz.
        System.out.println("------------------------");
        System.out.printf("TOPLAM KESINTI : %.2f TL%n", toplamKesinti); // %.2f ile virgulden sonra 2 hane yazdiriyoruz.
        System.out.printf("NET MAAS : %.2f TL%n", netMaas); // %.2f ile virgulden sonra 2 hane yazdiriyoruz.
        System.out.println("====================================");

        input.close(); // Scanner'i kapattik.
    }
}

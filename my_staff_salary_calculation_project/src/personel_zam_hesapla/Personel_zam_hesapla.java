/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personel_zam_hesapla;

import java.util.Scanner;

/**
 *
 * @author Alperen
 */
public class Personel_zam_hesapla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        Personel personel = new Personel();
        String isim, soyisim;
        double maas;
        int cocukSayisi;
        while (true) {
            System.out.print("Adınızı giriniz: ");
            isim = klavye.next();
            System.out.print("Soyadınızı giriniz: ");
            soyisim = klavye.next();
            System.out.print("Maaşınızı giriniz: ");
            maas = klavye.nextInt();
            System.out.print("Çocuk sayısını giriniz: ");
            cocukSayisi = klavye.nextInt();
            System.out.print("Kaç yıl sonra maaşınızın hesaplanmasını istersiniz: ");
            int yil = klavye.nextInt();

            personel.personel_ad = isim;
            personel.personel_soyad = soyisim;
            personel.maas = maas;
            personel.cocuk_sayisi = cocukSayisi;

            personel.zam_hesapla();

            for (int i = 0; i < yil; i++) {
                personel.yil_hesapla();
            }
            System.out.println(yil + " yıl sonraki Maaşınız: " + personel.maas);

            System.out.println("Devam etmek için 1, çıkmak için 2'yi tuşlayın");
            if (klavye.nextInt() == 2) {
                break;
            }
        }
    }

}

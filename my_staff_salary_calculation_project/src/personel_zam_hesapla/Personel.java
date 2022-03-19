/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personel_zam_hesapla;

/**
 *
 * @author Alperen
 */
class Personel {

    static String personel_ad;
    static String personel_soyad;
    static double maas;
    static int cocuk_sayisi;

    public void zam_hesapla() {
        double yuzde = 0.0;
        if (maas < 1000) {
            yuzde = (3.0 / 100.0);
        } else if (maas > 1000 && maas < 2500) {
            yuzde = (4.0 / 100.0);
        } else{
            yuzde = (5.0 / 100.0);
        }
        double cocuk_parasi = cocuk_sayisi * 42;
        double zam = (maas * yuzde) + cocuk_parasi;
        System.out.println(personel_ad + " " + personel_soyad + " Eski maaşı: " + maas + " Yeni maaşı: " + (maas + zam) + " Zam: " + zam);
    }

    public void yil_hesapla() {
        double yuzde = 0.0;
        if (maas < 1000) {
            yuzde = (3.0 / 100.0);
        } else if (maas > 1000 && maas < 2500) {
            yuzde = (4.0 / 100.0);
        } else{
            yuzde = (5.0 / 100.0);
        }
        double cocuk_parasi = cocuk_sayisi * 42;
        double zam = (maas * yuzde) + cocuk_parasi;
        maas = maas + zam;
    }
}

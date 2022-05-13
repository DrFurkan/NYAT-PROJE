package paket;

import java.util.Scanner;

public class Program {
    public static void SoruSor(){
        System.out.println("Başka işlem yapmak ister misiniz? e/h");
        Scanner sc = new Scanner(System.in);
        char cevap = sc.next().charAt(0);

    }

    public static void main(String[] args) throws InterruptedException {
        Arayuz a = new Arayuz();
        String kullaniciAdi;

        String sifre;
        System.out.println("Lütfen kullanıcı adı ve şifrenizi giriniz:");

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        NoticeObservable noticeObservable = new NoticeObservable();
        Kullanici k = new Kullanici();

        k.setObservable(noticeObservable);
        noticeObservable.addObserver(k);

        System.out.println("Kullanıcı Adı:");
        kullaniciAdi = sc.next();
        System.out.println("Şifre:");
        sifre = sc1.next();

        k.kullaniciAdi = kullaniciAdi;
        k.sifre = sifre;

   k=   a.Login(kullaniciAdi, sifre);


        char cevap = 'e';

        while (cevap == 'e'){




            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz...");
            System.out.println("1:Sıcaklığı görüntüle");
            System.out.println("2:Soğutucuyu Aç");
            System.out.println("3:Soğutucuyu Kapat");
            System.out.println("4:cihaz bilgilerimi görüntüle");

            int secim = sc1.nextInt();


            if(secim == 1){
                a.SicaklıkGetir();
                SoruSor();
                if(cevap == 'h'){
                    break;
                }
            }
            if(secim == 2){
                a.sogutucuAc();
                noticeObservable.notifyObserver();
                SoruSor();
            }
            if(secim == 3){
                a.sogutucuKapat();
                SoruSor();
            }
            if(secim==4){
                Cihaz c=    a.CihazGoruntule(k.cihazId);
                System.out.println("marka::"+c.marka);
                System.out.println("renk::"+c.renk);
                System.out.println("model::"+c.model);
                SoruSor();
            }
        }





    }

}

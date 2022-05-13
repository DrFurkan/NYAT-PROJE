package paket;

public class Arayuz

{
    Kullanici k=new Kullanici();
IDataBase database=new PostgreSqlDriver();

IEyleyici eyleyici=new Eyleyici();
ISicaklikAlgilayici sicaklikAlgilayici=new SicaklikAlgilayici();

public Kullanici Login (String kullanici, String sifre) throws InterruptedException {



    return   database.Login(kullanici,sifre);
}
public int SicaklıkGetir() throws InterruptedException {
    System.out.println("Cihazla bağlantı kuruluyor...");
    Thread.sleep(1500);
    System.out.println("Bağlantı kuruldu sıcaklık bilgisi bekleniyor...");
    Thread.sleep(1500);
System.out.println("Şuanki sıcaklık: "+sicaklikAlgilayici.sicaklikOku()+"  derece");
return sicaklikAlgilayici.sicaklikOku();


}
public Cihaz CihazGoruntule(int id) throws InterruptedException {
    System.out.println("Cihaz bilgileri alınıyor...");
    Thread.sleep(1500);
    return database.cihazSorgula(id);

}
public int sogutucuKapat() throws InterruptedException {

    System.out.println("cihazla bağlantı kuruluyor...");
    Thread.sleep(1500);

     return eyleyici.SogutucuKapat();

}
    public int sogutucuAc() throws InterruptedException {

        System.out.println("cihazla bağlantı kuruluyor...");
        Thread.sleep(1500);

        return eyleyici.SogutucuAc();
    }
}


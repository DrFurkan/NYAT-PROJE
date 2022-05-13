package paket;

public interface IDataBase {


    public Kullanici Login(String kullaniciAdi, String sifre)throws InterruptedException;
    public Cihaz cihazSorgula(int id);
}

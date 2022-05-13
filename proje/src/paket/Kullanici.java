package paket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Kullanici implements IObserver {

    private IObservable observable;

    String kullaniciAdi;
    String sifre;
    int cihazId;


    void KullaniciDogrula(String kullaniciAdi, String sifre) {

        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Nyat",
                    "postgres", "furkan99");
            if (conn != null)
                System.out.println("Veritabanına bağlandÄ±!");
            else
                System.out.println("BağlantÄ± girisimi basarisiz!");

            String sql = "SELECT *  FROM \"Kullanici\" WHERE \"KullaniciAdi\"='" + kullaniciAdi + "' and \"Sifre\"='" + sifre + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);


            conn.close();
            String kAdi;
            String ksifre;

            if (!rs.next()) {
                System.out.println("Giriş başarısız...");

            } else {
                System.out.println("Giriş başarılı...");
            }

            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void setObservable(IObservable observable) {
        this.observable = observable;
    }

    public void removeObserver() {
        observable.removeObserver(this);

    }

    @Override
    public void notify(String message) {
        System.out.println(message);
    }
}

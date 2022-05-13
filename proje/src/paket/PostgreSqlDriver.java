package paket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostgreSqlDriver implements IDataBase {
    @Override
    public Kullanici Login(String kullaniciAdi, String sifre) {

        Kullanici k = null;
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Nyat",
                    "postgres", "furkan99");
            if (conn != null)
                System.out.println("Veritabanına bağlandı!");
            else
                System.out.println("Bağlantı başarısız!");

            String sql = "SELECT *  FROM \"Kullanici\" WHERE \"KullaniciAdi\"='" + kullaniciAdi + "' and \"Sifre\"='" + sifre + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);


            conn.close();
            String kAdi;
            String ksifre;

            if (!rs.next()) {
                System.out.println("Giriş başarısız...");

            } else {
                k = new Kullanici();
                k.sifre = sifre;
                k.kullaniciAdi = kullaniciAdi;
                k.cihazId = rs.getInt("CihazId");
                System.out.println("Giriş başarılı...");

            }

            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return k;

    }

    @Override
    public Cihaz cihazSorgula(int id) {


        Cihaz c = null;
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Nyat",
                    "postgres", "furkan99");
            if (conn != null)
                System.out.println("Veritabanına bağlanıldı...");
            else
                System.out.println("Bağlantı başarısız!");

            String sql = "SELECT *  FROM \"Cihaz\" WHERE \"id\"='" + id + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);


            conn.close();
            String kAdi;
            String ksifre;
            c = new Cihaz.Builder().build();
            while (rs.next()) {

                c.renk = rs.getString("Renk");
                c.model = rs.getString("Model");
                c.marka = rs.getString("Marka");

            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return c;
    }

}



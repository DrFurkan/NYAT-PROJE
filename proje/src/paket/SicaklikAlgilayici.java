package paket;

import java.util.Random;

public class SicaklikAlgilayici implements ISicaklikAlgilayici{
    @Override
    public int sicaklikOku() {
        Random rnd=new Random();

        int sicaklik=rnd.nextInt(35);
        return sicaklik;
    }
}

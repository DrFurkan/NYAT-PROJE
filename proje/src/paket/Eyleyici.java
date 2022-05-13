package paket;



public class Eyleyici implements IEyleyici{
    @Override
    public int SogutucuAc() throws InterruptedException {
        System.out.println("Sogutucu açılıyor...");

        Thread.sleep(1500);


        return 1;
    }

    @Override
    public int SogutucuKapat() throws InterruptedException {
        Thread.sleep(1500);
        System.out.println("Sogutucu kapatılıyor...");
        Thread.sleep(1500);
        System.out.println("Sogutucu kapatıldı...");

        return 0;

    }
}

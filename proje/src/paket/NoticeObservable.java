package paket;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class NoticeObservable implements IObservable {

    private List<IObserver> observerList = new ArrayList<>();
    private String message = "SOĞUTUCU AÇILDI";

    @Override
    public void addObserver(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (IObserver observer : observerList) {
            observer.notify(message);
        }
    }

}
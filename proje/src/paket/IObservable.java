package paket;

public interface IObservable {

    void addObserver(IObserver observer);

    void removeObserver(IObserver observer);

    void notifyObserver();

    public interface Observable {
        void addObserver(IObserver observer);
        void removeObserver(IObserver observer);
        void notifyObserver();
    }
}

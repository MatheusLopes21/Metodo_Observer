public interface Estoque {
    void registrarObserver(Observer observer);
    void removerObserver(Observer observer);
    void notificarObservers();
}

import java.util.ArrayList;
import java.util.List;

public class EstoqueProduto implements Estoque {
    private List<Observer> observers = new ArrayList<>();
    private String nomeProduto;
    private boolean emEstoque;

    public EstoqueProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
        this.emEstoque = false;
    }

    public void reabastecer() {
        this.emEstoque = true;
        notificarObservers();
    }

    public void registrarObserver(Observer observer) {
        observers.add(observer);
    }

    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notificarObservers() {
        for (Observer observer : observers) {
            observer.update(nomeProduto + " voltou ao estoque.");
        }
    }

    public boolean isEmEstoque() {
        return emEstoque;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }
}

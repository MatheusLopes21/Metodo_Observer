public class DepartamentoCompras implements Observer {

    public void update(String mensagem) {
        System.out.println("Compras: " + mensagem);
        
    }
}

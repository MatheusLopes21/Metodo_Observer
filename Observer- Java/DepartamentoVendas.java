public class DepartamentoVendas implements Observer {
    @Override
    public void update(String mensagem) {
        System.out.println("Vendas: " + mensagem);
    }
}

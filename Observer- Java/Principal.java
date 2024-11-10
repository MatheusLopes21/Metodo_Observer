public class Principal {
    public static void main(String[] args) {
       
        EstoqueProduto produto = new EstoqueProduto("Produto A");

        
        DepartamentoVendas vendas = new DepartamentoVendas();
        DepartamentoMarketing marketing = new DepartamentoMarketing();
        DepartamentoCompras compras = new DepartamentoCompras();

        
        produto.registrarObserver(vendas);
        produto.registrarObserver(marketing);
        produto.registrarObserver(compras);

       
        System.out.println("Reabastecendo o produto...");
        produto.reabastecer();

       
}

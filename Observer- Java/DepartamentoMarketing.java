public class DepartamentoMarketing implements Observer {
    
    public void update(String mensagem) {
        System.out.println("Marketing: " + mensagem);
    }
}

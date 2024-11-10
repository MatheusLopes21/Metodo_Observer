/* Pratica 6 Observer Method
    Dupla: Igor Carvalho Braz -- RA: 42021158
            Matheus Magalhães Alves Lopes -- RA: 4231922738*/


public class DepartamentoMarketing implements Observer {
    
    public void update(String mensagem) {
        System.out.println("Marketing: " + mensagem);
    }
}

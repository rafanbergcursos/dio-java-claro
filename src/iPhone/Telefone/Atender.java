package iPhone.Telefone;

public class Atender implements Telefone.atender {

    @Override
    public void atenderLigacao() {
        String contato = "José";
        System.out.println("Atendendo ligação de: " + contato);   
    }
   
}

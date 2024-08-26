package iPhone.Telefone;

public class Atender implements Telefone.atender {

    @Override
    public void atenderLigacao() {
        String contato = Agenda.agendaContatos();
        System.out.println("Atendendo ligação de: " + contato);   
    }
   
}

package iPhone.Apps;

import iPhone.Telefone.Telefone;
import iPhone.iPod.iPod;

public class TelaDeApps
        implements Telefone.ligar, Telefone.atender, Telefone.correioDeVoz, iPod.Pausar, iPod.Tocar, iPod.SelecionarMusica {

    @Override
    public void ligando() {
    }

    @Override
    public void iniciarCorreioDeVoz() {
    }

    @Override
    public void atenderLigacao() {
    }

    @Override
    public void pause() {
    }

    @Override
    public void tocar() {
    }

    @Override
    public void selecionarMusica() {
    }

}

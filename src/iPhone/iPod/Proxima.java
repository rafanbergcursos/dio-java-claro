package iPhone.iPod;

public class Proxima implements iPod.SelecionarMusica {
    
    @Override
    public void selecionarMusica() {
        String musica = ListaMusicas.musicaAleatoria();
        System.out.println("Próxima música: " + musica);
    }
};

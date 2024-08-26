package iPhone.iPod;

public class Proxima implements iPod.Proxima {
    
    @Override
    public void proxima() {
        String musica = ListaMusicas.musicaAleatoria();
        System.out.println("Próxima música: " + musica);
    }
};

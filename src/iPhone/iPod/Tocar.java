package iPhone.iPod;

public class Tocar implements iPod.Tocar {
    @Override
    public void tocar() {
        String musica = ListaMusicas.musicaAleatoria();
        System.out.println("Tocando música: " + musica);
    }
}
package iPhone.iPod;
import java.util.Random;

public class Play implements iPod.Play {
    public static String musicaAleatoria(String[] musica) {
        Random random = new Random();
        int indiceAleatorio = random.nextInt(musica.length);
        return musica[indiceAleatorio];
    }
    
    String[] musicas = {
        "Tempo Perdido - Legião Urbana",
        "O Mundo é Bão, Sebastião - Racionais MC's",
        "Malandragem - Cássia Eller",
        "Anna Júlia - Los Hermanos",
        "Eduardo e Mônica - Legião Urbana",
        "Tropicália - Caetano Veloso",
        "Lanterna dos Afogados - Os Paralamas do Sucesso",
        "Vou Deixar - Skank",
        "Incertezas - O Rappa",
        "Garota Nacional - Skank"
    };
    @Override
    public void play() {
       System.out.println("Tocando música: " + musicaAleatoria(musicas));
    }
}
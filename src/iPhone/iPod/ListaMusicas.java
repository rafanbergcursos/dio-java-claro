package iPhone.iPod;

import java.util.Random;

public final class ListaMusicas {
    private static final String[] musicas = {
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
    public static String musicaAleatoria() {
        Random random = new Random();
        int indiceAleatorio = random.nextInt(musicas.length);
        return musicas[indiceAleatorio];
    }
};
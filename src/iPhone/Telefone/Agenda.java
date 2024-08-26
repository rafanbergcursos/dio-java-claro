package iPhone.Telefone;

import java.util.Random;

public final class Agenda {
    private static final String[] agenda = {
            "João Silva, (11) 98765-4321",
            "Maria Oliveira, (21) 97654-3210",
            "Pedro Santos, (31) 96543-2109",
            "Ana Costa, (41) 95432-1098",
            "Carlos Almeida, (51) 94321-0987",
            "Fernanda Lima, (61) 93210-9876",
            "Roberto Souza, (71) 92109-8765",
            "Juliana Ferreira, (81) 91098-7654",
            "Lucas Martins, (91) 90987-6543",
            "Tatiane Campos, (31) 89876-5432"
    };

    public static String agendaContatos() {
        Random random = new Random();
        int contatoAleatorio = random.nextInt(agenda.length);
        return agenda[contatoAleatorio];
    }
};
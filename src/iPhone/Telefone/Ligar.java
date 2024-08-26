package iPhone.Telefone;

import java.util.Locale;
import java.util.Scanner;

public class Ligar implements Telefone.ligar {

    @Override
    public void ligando() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o numero de telefone que quer ligar:");
        int numeroTelefone = scanner.nextInt();
        System.out.println("Chamando o numero:" + numeroTelefone);
        scanner.close();
    }

}

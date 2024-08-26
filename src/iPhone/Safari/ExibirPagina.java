package iPhone.Safari;

import java.util.Locale;
import java.util.Scanner;

public class ExibirPagina implements Safari.ExibirPagina {
    
    @Override
    public void exibirPagina() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Pesquise ou Digite a URL");
        String pequisaOuUrl = scanner.next();
        System.out.println("Abrindo o site:" + pequisaOuUrl);
        scanner.close();
    }

}

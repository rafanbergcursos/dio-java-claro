package ContaBanco;
    
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String clientName = "Mario Andrade";
        String bankAgency = "067-8";
        int bankAccountNumber = 1021;
        double bankBalance = 237.9;

        System.out.println("Digite o numero da sua agencia: ");
        String bankAgencyLogin = scanner.next();
        System.out.println("Digite o numero da sua conta: ");
        int bankAccountNumberLogin = scanner.nextInt();


        if(bankAgencyLogin != bankAgency && bankAccountNumberLogin != bankAccountNumber) {
            System.out.println("Não foi possivel localizar numero da conta e/ou agencia bancaria. Tente novamente");
        }
        else {
            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo é de: R$%s e já está disponível para saque",
                    clientName, bankAgency, bankAccountNumber, bankBalance);
        }
    }
}


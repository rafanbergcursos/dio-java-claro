package BancoDigital;

public class Main {

    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);
        poupanca.imprimirExtrato();
        cc.depositar(100);
        cc.imprimirExtrato();
        cc.transferir(100, cc);
        cc.imprimirExtrato();
    }

}

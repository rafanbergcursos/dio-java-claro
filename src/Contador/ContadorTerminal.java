package Contador;

import java.util.Scanner;
public class ContadorTerminal {
        public static void main(String[] args) {
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();
            
            try {
                contar(parametroUm, parametroDois);
            }catch (ParametrosInvalidosException exception) {
                exception.printStackTrace();
            }
            terminal.close();
            
        }
        static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
            if(parametroDois < parametroUm) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro");
                throw new ParametrosInvalidosException();
            }
        
            int contagem = parametroDois - parametroUm;
            for (contagem = parametroUm; contagem <= parametroDois; contagem++) {
                System.out.println(contagem);
            }
        }
    };

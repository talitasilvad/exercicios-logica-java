/*8.  Crie um programa que exiba um menu repetitivo com as opções:
      1 - Dizer "Olá"
      2 - Dizer "Tchau"
      3 - Encerrar
      O menu deve continuar aparecendo até que o usuário escolha a opção 3.*/
package com.mycompany.cursounidade01;

import java.util.Scanner;

public class Ex08MenuRepetitivo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("---Menu---");
            System.out.println("1-Dizer 'Ola'");
            System.out.println("2-Dizer 'Tchau'");
            System.out.println("3-Encerrar");
            System.out.print("Escolha uma opcao: ");
            opcao = teclado.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Ola");                    
                    break;
                case 2:
                    System.out.println("Tchau");                    
                    break;
                case 3:
                    System.out.println("encerrando...");                    
                    break;    
                default:
                    System.out.println("Opcao invalida, tente novamente!");
                    break;
            }
        } while (opcao != 3);
    }
}

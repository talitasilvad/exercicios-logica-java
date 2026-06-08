/*3. Implemente um programa que exiba um menu com 3 opções:
     1 - Somar dois números
     2 - Subtrair dois números
     3 - Sair
     O programa deve usar switch para executar a operação escolhida.*/
package com.mycompany.cursounidade01;

import java.util.Scanner;

public class Ex03SwitchMenu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual opcao voce deseja?");
        System.out.println("1-Somar dois numeros");
        System.out.println("2-Subtrair dois numeros");
        System.out.println("3-Sair");
        System.out.print("Digite a opcao: ");
        int opcaoEscolhida=teclado.nextInt();
        int num1, num2;
        switch (opcaoEscolhida) {
            case 1:
                System.out.println("Digite o primeiro numero: ");
                 num1=teclado.nextInt();
                 System.out.println("Digite o segundo numero: ");
                 num2=teclado.nextInt();
                 
                 double somar = num1+num2;
                 System.out.println(num1+" + "+num2+" = "+somar);
                break;
            case 2:
                System.out.println("Digite o primeiro numero: ");
                 num1=teclado.nextInt();
                 System.out.println("Digite o segundo numero: ");
                 num2=teclado.nextInt();
                 
                 double subtrair = num1-num2;
                 System.out.println(num1+" - "+num2+" = "+subtrair);
                break;
            case 3:
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Opcao invalida! Digite um numero entre 1 e 3");
                break;
        }
    }
}

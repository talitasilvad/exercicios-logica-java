/*7. Crie um programa que leia um número inteiro não-negativo e calcule seu fatorial 
utilizando o laço for.
Exemplo: Entrada = 5 Saída = 120*/
package com.mycompany.cursounidade01;

import java.util.Scanner;

public class Ex07Fatorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma numero inteiro: ");
        int numero = teclado.nextInt();
        
        if(numero >= 0){
            int fatorial = 1;
            for (int i = numero; i > 1; i--) {
                fatorial = fatorial * i;
            }
            
            System.out.println("O fatorial de !"+numero+" = "+fatorial);
        } else{
            System.out.println("Diite apenas numeros positivos ou zero");
        }
    }
}

/*4. Crie um programa que leia um número inteiro do usuário e imprima a tabuada 
desse número (de 1 a 10), usando um laço for.*/
package com.mycompany.cursounidade01;

import java.util.Scanner;

public class Ex04Tabuada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um numero inteiro para comecar a Tabuada: ");
        int numero = teclado.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            int conta = numero * i;
            System.out.println(numero + " x " +i+ " = " +conta);
            
        }
    }
}

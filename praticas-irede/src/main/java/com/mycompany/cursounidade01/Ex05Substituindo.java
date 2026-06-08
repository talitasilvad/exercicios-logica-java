/*5. Faça um programa que leia uma string e substitua todas as ocorrências da letra "e" 
por "*".*/
package com.mycompany.cursounidade01;

import java.util.Scanner;

public class Ex05Substituindo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreva uma palavra que contem a letre 'e': ");
        String palavra = teclado.nextLine().replaceAll("e", "*").replaceAll("E", "*");
        
        System.out.println("Substituindo: "+palavra);
        
    }
}

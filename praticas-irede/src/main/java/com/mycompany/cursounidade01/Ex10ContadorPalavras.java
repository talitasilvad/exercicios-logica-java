/*10. Escreva um programa que leia uma frase e conte quantas palavras ela possui 
(considere as palavras separadas por espaços).*/
package com.mycompany.cursounidade01;

import java.util.Scanner;

public class Ex10ContadorPalavras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = teclado.nextLine();
        
        String[] fraseJunta = frase.split(" ");
        int quantidadePalavras = fraseJunta.length;
        
        System.out.println("A qunatidado de palavras que tem na frase '"+frase+"': "+quantidadePalavras);
    }
}

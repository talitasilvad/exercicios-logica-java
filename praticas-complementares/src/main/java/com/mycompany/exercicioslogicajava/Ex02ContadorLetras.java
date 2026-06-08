package com.mycompany.exercicioslogicajava;

import java.util.Scanner;

public class Ex02ContadorLetras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int totalLetras = 0;
        
        System.out.print("Digite uma palavra qualquer: ");
        String palavra = teclado.nextLine();
        
        System.out.print("Digite a letra que deseja encontrar: ");
        char letraDigitada = teclado.nextLine().charAt(0);
        
        for (int i = 0; i < palavra.length(); i++) {
            char letraAtual = palavra.charAt(i);
            
            if(letraAtual == letraDigitada) {
               totalLetras++;
            }            
            
        }
        
        System.out.println("A letra '"+letraDigitada+"' apareceu "+totalLetras+" vezes na palavra: "+palavra);
    }
}

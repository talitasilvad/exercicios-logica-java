/*9. Faça um programa que leia o nome completo de uma pessoa e mostre o primeiro 
nome e o último nome separadamente*/
package com.mycompany.cursounidade01;

import java.util.Scanner;

public class Ex09SeparadorNomes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = teclado.nextLine();
        
        String[] nomeRepartido = nomeCompleto.split(" ");
        String primeiroNome = nomeRepartido[0];
        String ultimoNome = nomeRepartido[nomeRepartido.length- 1];
        
        System.out.println("Primeiro Nome: "+primeiroNome);
        System.out.println("Ultimo Nome: "+ultimoNome);
    }
 
}

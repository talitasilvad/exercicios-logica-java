/*1. Escreva um programa Java que use os operadores lógicos para verificar se um 
número está entre 10 e 20 (inclusive). Use int numero = 15;.*/
package com.mycompany.cursounidade01;

public class Ex01OperadoresLogicos {
    public static void main(String[] args) {
        int numero = 15;
        
        if(numero>=10 && numero<=20){
            System.out.println("O numero: "+numero+" esta entre 10 e 20");
        } else{
            System.out.println("O numero: "+numero+" nao esta entre 10 e 20");
        }
        
    }
}

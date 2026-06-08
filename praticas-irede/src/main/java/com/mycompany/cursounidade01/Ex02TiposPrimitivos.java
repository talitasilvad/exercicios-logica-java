/*2. Escreva um programa que mostre na tela os tipos de dados primitivos em Java 
com seus valores atribuídos.*/
package com.mycompany.cursounidade01;

public class Ex02TiposPrimitivos {
    public static void main(String[] args) {
        byte tipoByte = 127;
        short tipoShort = 32000;
        int tipoInt = 342834628;
        long tipoLong = 99999999999L;
        
        float tipoFloat = 3.14f;
        double tipoDouble = 12.5555;
        
        char tipoChar = 'T';
        
        boolean tipoBool = true;
        
        System.out.println("Tipos primitivos em Java");
        System.out.println("Byte: "+tipoByte);
        System.out.println("Short: "+tipoShort);
        System.out.println("Int: "+tipoInt);
        System.out.println("Long: "+tipoLong);
        System.out.println("Float: "+tipoFloat);
        System.out.println("Double: "+tipoDouble);
        System.out.println("Char: "+tipoChar);
        System.out.println("Boolean: "+tipoBool);
    }
}

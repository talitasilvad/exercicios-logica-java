package com.mycompany.exercicioslogicajava;

import java.util.Scanner;

public class Ex01PadronizadorEmail {
    
    public static void main(String[] args) {        
        String[] email = new String[3];
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i < email.length; i++) {           
            System.out.println("Digite o email: ");
            email[i] = teclado.nextLine();                                          
           
        }
        
        for (int i = 0; i < email.length; i++) {                        
            String normalizandoEmail = email[i].trim().toLowerCase().replaceAll(" ", "");    
            System.out.println("Email Limpo: "+normalizandoEmail);
            
        }
  
    }
}

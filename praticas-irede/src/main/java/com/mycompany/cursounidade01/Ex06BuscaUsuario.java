/*6. Crie um array com os seguintes nomes: "Maria", "João", "Carlos", "Ana", "Beatriz". Em 
seguida, peça um nome ao usuário e diga se ele está ou não no array.*/
package com.mycompany.cursounidade01;

import java.util.Scanner;

public class Ex06BuscaUsuario {
    public static void main(String[] args) {
        String[] nomes={"Maria", "João", "Carlos", "Ana", "Beatriz"};
        boolean encontrado = false;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite uma nome pra buscar: ");
        String nomeBusca = teclado.nextLine().trim();
        
        for(String nome:nomes){
            if(nomeBusca.equalsIgnoreCase(nome)){
                System.out.println("Usuario encontrado: "+nome);
                encontrado = true;
                break;
            }
        }
        
        if(!encontrado){
            System.out.println("O nome '"+nomeBusca+"' Nao esta no array");
        }
    }   
    
}

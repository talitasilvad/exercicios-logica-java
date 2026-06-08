package com.mycompany.exercicioslogicajava;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex4SistemaBusca {
    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList<>();
        boolean encontrado = false;
        Scanner teclado = new Scanner(System.in);
         
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o "+(i+1)+" nome para cadastrar");
            listaNomes.add(teclado.nextLine().trim().toLowerCase().replaceAll(" ", ""));
           
            
        }
        System.out.println("Alunos cadastrados com sucesso: "+listaNomes);
        System.out.println("Digite o nome que deseja encontrar: ");
        String nomeBusca = teclado.nextLine();
        
        for (int i = 0; i < listaNomes.size(); i++) {
            String nomeAtual = listaNomes.get(i);
            
            if(nomeAtual.equals(nomeBusca)){
                encontrado = true;
                break;
                    
            }
            
        }
        
        if(encontrado == true){
            System.out.println("Usuario enconotrado.");
        } else{
            System.out.println("Usuario nao cadastrado.");
        }
        
    }
    
}

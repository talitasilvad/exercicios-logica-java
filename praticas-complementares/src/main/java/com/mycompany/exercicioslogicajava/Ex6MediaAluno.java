package com.mycompany.exercicioslogicajava;

public class Ex6MediaAluno {
    public static void main(String[] args) {
        double[][] notas={
            {7.0, 4.7},
            {9.0, 7.0},
            {8.5, 10.0}
            
        };
        
        double mediaAluno = 0;
        for (int i = 0; i < notas.length; i++) {
            double somaTotal = 0;
            for (int j = 0; j < notas[i].length; j++) {
                somaTotal += notas[i][j];              
            }
            
            mediaAluno = somaTotal / 2; 
            if(mediaAluno >= 7.0){
                System.out.println("Aluno "+(i+1)+" aprovado com media: "+mediaAluno);
            } else{
                System.out.println("Aluno "+(i+1)+" em recuperacao com media "+mediaAluno);
            }
            
        }
        
    }
}

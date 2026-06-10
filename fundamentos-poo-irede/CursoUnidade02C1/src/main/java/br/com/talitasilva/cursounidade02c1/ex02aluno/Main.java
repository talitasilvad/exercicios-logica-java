/*Implementações no exercício 2: 
1. Interatividade com Scanner, correção de Buffer.
2. Cadastro dinâmico com loop for.
3. Armazenamento utilizando ArrayList.
4. Exibição da lista com for-each*/
package br.com.talitasilva.cursounidade02c1.ex02aluno;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.setOut(new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        
        Scanner teclado = new Scanner(System.in);
        
        ArrayList<Aluno> listaDeAlunos = new ArrayList<>();
        System.out.println("Quantos alunos você deseja cadastrar: ");
        int quantidade = teclado.nextInt();
        teclado.nextLine();
        
        System.out.println("----Cadastro dos Alunos----");
        for (int i = 0; i < quantidade; i++) {
            Aluno aluno = new Aluno();
            System.out.print("Digite o nome do aluno: ");       
            aluno.setNome(teclado.nextLine());

            System.out.print("Digite a nota do aluno: ");
            aluno.setNota(teclado.nextFloat());
            teclado.nextLine();

            listaDeAlunos.add(aluno);
                   
        }
        
        System.out.println("---Alunos no Sistema---");
        for(Aluno a : listaDeAlunos){
            System.out.println("Nome: "+a.getNome()+"| Nota: "+a.getNota());
        }
    }
}

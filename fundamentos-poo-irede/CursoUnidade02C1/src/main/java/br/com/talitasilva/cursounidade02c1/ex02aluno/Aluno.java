/*2. Crie uma classe Aluno com atributos privados nome e nota. Implemente métodos get 
e set para ambos. No método setNota, adicione uma verificação para garantir que o 
valor da nota esteja entre 0 e 10. Caso esteja fora desse intervalo, não permita a 
alteração.*/
package br.com.talitasilva.cursounidade02c1.ex02aluno;

public class Aluno {
    private String nome;
    private float nota;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public float getNota(){
        return nota;
    }
    
    public void setNota(float nota){
        if(nota >= 0 && nota <= 10){
            this.nota = nota;
        } else{
            System.out.println("\nError: insira uma nota entre 0 e 10");
        }
    }
}

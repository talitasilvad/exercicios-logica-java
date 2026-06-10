/*1. Crie uma classe ContaBancaria com os atributos privados numero, titular e saldo. 
Implemente getters e setters, garantindo que o saldo não possa ser alterado 
diretamente (não crie setSaldo). Em vez disso, crie os métodos depositar() e sacar() para 
modificar o saldo.*/
package br.com.talitasilva.cursounidade02c1.ex01contabancaria;

public class ContaBancaria {
    private String titular;
    private int numero;
    private double saldo = 0;
    
    public String getTitular(){
        return titular;
    }
    
    public void setTitular(String titular){
        this.titular = titular;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void depositar(double valor){
        if(valor >= 0){
            System.out.println("Seu saldo atual: "+saldo);
            System.out.println("Valor a ser depositado: "+valor);
            saldo += valor;
            System.out.println("Seu saldo foi atualizado para: "+saldo);
        }
    }
    
    public void sacar(double valor){
        if(valor <= saldo){
            System.out.println("Você está sacando: "+valor);
            saldo -= valor;
            System.out.println("Seu saldo foi atualizado para: "+saldo);
        } else{
            System.out.println("Você está sacando: "+valor);
            System.out.println("Error: Saldo insuficiante: "+saldo);
        }
    }
}

package br.com.talitasilva.cursounidade02c1.ex01contabancaria;

public class Main {
    public static void main(String[] args) {
        System.setOut(new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        ContaBancaria minhaConta = new ContaBancaria();
        
        minhaConta.setTitular("Talita Silva");
        minhaConta.setNumero(15551);
        
        System.out.println("---Craindo a conta de "+minhaConta.getTitular()+"---");
        
        minhaConta.depositar(500.00);
        System.out.println("---------------------");
        
        minhaConta.sacar(200.00);
        System.out.println("---------------------");
        
        minhaConta.sacar(500.00);
    }
}

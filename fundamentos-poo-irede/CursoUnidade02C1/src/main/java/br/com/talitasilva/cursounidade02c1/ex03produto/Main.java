package br.com.talitasilva.cursounidade02c1.ex03produto;

public class Main {
    public static void main(String[] args) {
        System.setOut(new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        
        Produto p1 = new Produto("Celular", 4300.00, 12);
        System.out.println("Produto: "+p1.getNome()+"| Preco: "+p1.getPreco()+"| Estoque: "+p1.getQtdEstoque());
    }
}

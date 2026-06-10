/*3. Crie uma classe Produto com atributos nome, preco e quantidadeEstoque. Garanta 
que apenas métodos setters possam alterar os valores de preco e quantidadeEstoque. 
Em seguida, instancie um produto e altere seus valores utilizando os setters.*/
package br.com.talitasilva.cursounidade02c1.ex03produto;

public class Produto {
    private String nome;
    private double preco;
    private int qtdEstoque;
    
    public Produto(){
        
    }
    
    public Produto(String nome, double preco, int qtdEstoque){
        this.nome = nome;
        setPreco(preco);
        setQtdEstoque(qtdEstoque);
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getPreco(){
        return preco;
    }    
    
    public void setPreco(double preco){
        if(preco >= 0){
            this.preco = preco;
        } else{
            System.out.println("Error: o preço nõa pode ser negativo.");
        }
    }
    
    public int getQtdEstoque(){
        return qtdEstoque;
    }
    
    public void setQtdEstoque(int qtdEstoque){
        if(qtdEstoque >= 0){
            this.qtdEstoque = qtdEstoque;
        } else{
            System.out.println("Error: o estoque não pode ser negativo");
        }
    }
}

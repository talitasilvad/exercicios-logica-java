package com.mycompany.exercicioslogicajava;

import java.util.ArrayList;

public class Ex03CarrinhoCompras {
    public static void main(String[] args) {
        ArrayList<String> produtos = new ArrayList<>();
        produtos.add("Mouse");
        produtos.add("Teclado");
        produtos.add("Monitor");
        produtos.add("Fones");
        
        for(String produto:produtos){
            System.out.println("Produto adicionado: "+produto);
        }
        System.out.println("Quantidade total de itens comprados: "+produtos.size());
    }
}

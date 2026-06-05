package com.mycompany.exercicioslogicajava;

public class Ex5BatalhaNaval {
    public static void main(String[] args) {
        char[][] mapa = new char [3][3];
        
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                mapa[i][j] = '~';
                
            }
        }
        
        mapa[2][1] = 'N';
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                System.out.print(mapa[i][j] + "\t");
                
            }
            System.out.println();
        }
    }
}

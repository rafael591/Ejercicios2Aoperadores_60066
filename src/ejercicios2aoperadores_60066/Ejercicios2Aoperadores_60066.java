/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios2aoperadores_60066;

/**
 *
 * @author Rafael Moreno
 */
public class Ejercicios2Aoperadores_60066 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* elabore un programa que declare una matriz cuadrada de 3x3 y calcule su determinante
        el determinante es la resta del producto de las 2 diagonales, la principal derecha y la secundaria
        imprimir el determinante*/
        int matriz[][] = new int [3][3];
        
        matriz [0][0] = 5;
        matriz [0][1] = 80;
        matriz [0][2] = 14;
        
        matriz [1][0] = 41;
        matriz [1][1] = 48;
        matriz [1][2] = 51;
        
        matriz [2][0] = 83;
        matriz [2][1] = 74;
        matriz [2][2] = 52;
        
        int determinante = (matriz[0][0] * matriz [1][1] * matriz [2][2]) - (matriz[0][2] * matriz [1][1] * matriz [2][0]);
        
        System.out.println("El determinante es = " + determinante);
    }
    
}

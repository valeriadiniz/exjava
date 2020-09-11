/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *14. Chico tem 1,50m e cresce 2 centímetros por ano, enquanto Juca tem 1,10m e cresce 3 centímetros por ano. 
 * Construir um algoritmo que calcule e imprima quantos anos serão necessários para que Juca seja maior que Chico
 * @author valer
 */
public class Ex14 {
        public static void main(String args[]){
        
    double chico = 1.50;
    double juca = 1.10;
    int anos = 0;
    
    do{
        chico = 0.02;
        juca = 0.03;
        anos = anos+1;
    }
    while(juca <= chico);
    
    System.out.println("Sao necessarios " +anos+" anos para Juca ficar maior que Chico");
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *15. Entrar com um número inteiro positivo e exibir o fatorial deste número, lembrando que 0! = 1. Exemplo: 5! = 5x4x3x2x1 = 120
 * @author valer
 */

import javax.swing.JOptionPane;
public class Ex15 {
        public static void main(String args[]){
    int n;
    int fatorial;
    
     
    n=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
    
    for(fatorial=1 ; n>1; n=n-1)
    fatorial=fatorial * n;
    
     System.out.println("O fatorial do numero e" +fatorial);
    
}  
    
}

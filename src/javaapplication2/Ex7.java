/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *7. Escrever um programa para ler um número inteiro e informar se ele é divisível por 5.
 * @author valer
 */

import javax.swing.JOptionPane;
public class Ex7 {
        public static void main(String args[]){
        int numero;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
      
        
        if ((numero%5)==0){
            
        JOptionPane.showMessageDialog(null,"O numero e divisivel por 5");
     
        }
        else {
        
        JOptionPane.showMessageDialog(null,"O numero nao e divisivel por 5");
     
        }
    
    }
}

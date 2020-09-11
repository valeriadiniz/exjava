/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *5. Faça um algoritmo para ler dois números inteiros e informar se estes são iguais ou diferentes.
 * @author valer
 */

import javax.swing.JOptionPane;
public class Ex5 {
            public static void main(String args[]){
        int n1;
        int n2;
        
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
        
        if (n1 == n2){
            
        JOptionPane.showMessageDialog(null,"Os numeros sao iguais");
     
        }
        else {
        
        JOptionPane.showMessageDialog(null,"Os numeros sao diferentes");
     
        }
    
    }
}
    


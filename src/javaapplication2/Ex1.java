/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *1. Fazer um algoritmo que leia um número inteiro e escreva o seu antecessor e o seu sucessor.
 * @author valer
 */


import javax.swing.JOptionPane;
public class Ex1 {
    
    public static void main(String args[]){
        int numero;
        numero=Integer.parseInt(JOptionPane.showInputDialog("Entre com um numero"));
        JOptionPane.showMessageDialog(null, "Antecessor\n" + (numero-1) + "\n" + "Sucessor\n"+ (numero+1));
        
    }
    
}

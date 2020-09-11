/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *12. Ler 2 valores, calcular e escrever a soma dos inteiros existentes entre os 2 valores
 * lidos (incluindo os valores lidos na soma). Considere que o segundo valor lido 
 * será sempre maior que o primeiro valor lido.
 * @author valer
 */

import javax.swing.JOptionPane;
public class Ex12 {
        public static void main(String args[]){
        int n1 , n2 , cont ,soma=0;
        
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro numero"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo numero,sendo maior que o primeiro"));
    
        if(n2>n1){
            
            for(cont=n1 ; cont<=n2; cont++){
            soma =soma+(cont);
             }
            
            System.out.println("A soma destes 2 numeros e todos que estao no intervalo entre eles e :"+soma);
        }
        else{
            System.out.println("O segundo numero deve ser maior que o primeiro");
            
        }
    
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *9. Elabore um algoritmo que dada a idade de um nadador classifica-o em uma das seguintes categorias:

infantil A = 5 - 7 anos

infantil B = 8-10 anos

juvenil A = 11-13 anos

juvenil B = 14-17 anos

adulto = maiores de 18 anos
 * @author valer
 */

import javax.swing.JOptionPane;
public class Ex9 {
     public static void main(String args[]){
      int numero;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do nadador"));
      
        
        if ((numero >= 5) && (numero <=7) ){
            
        JOptionPane.showMessageDialog(null,"O nadador pertence a categoria infantil A");
     
        }
        else if ((numero>=8) && (numero<=10)){
        
        JOptionPane.showMessageDialog(null,"O nadador pertence a categoria infantil B");
     
        }
        else if ((numero>=11) && (numero<=13)){
        
        JOptionPane.showMessageDialog(null,"O nadador pertence a categoria juvenil A");
     
        }
        else if ((numero>=14) && (numero<=17)){
        
        JOptionPane.showMessageDialog(null,"O nadador pertence a categoria juvenil B");
     
        }
        else if(numero>=18){
        
        JOptionPane.showMessageDialog(null,"O nadador pertence a categoria adulto");
     
        }
    
    }
}

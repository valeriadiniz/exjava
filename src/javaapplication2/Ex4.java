/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *4. Faça um algoritmo que receba o ano de nascimento de uma pessoa e o ano atual, 
 * calcule e mostre: a) a idade atual dessa pessoa. b) quantos anos ela terá em 2038.
 * @author valer
 */

import javax.swing.JOptionPane;
public class Ex4 {
        public static void main(String args[]){
        int anoatual;
        int anodenascimento;
        int idade;
        int idade2038;
        
        anoatual=Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual"));
        anodenascimento=Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de seu nascimento"));
        
      
        
        idade= anoatual-anodenascimento;
        idade2038=2038- anodenascimento;
            
        JOptionPane.showMessageDialog(null,"A sua idade e "+(idade)+  "anos" ); 
     
        JOptionPane.showMessageDialog(null,"Em 2038 voce tera"+(idade2038)+  "anos");
        
       
    
    }
}

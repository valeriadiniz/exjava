/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *8. Faça um programa que o usuário informe o salário recebido e o total gasto. 
 * Deverá ser exibido na tela “Gastos dentro do orçamento” 
 * caso o valor gasto não ultrapasse o valor do salário e “Orçamento estourado” 
 * se o valor gasto ultrapassar o valor do salário.
 * @author valer
 */

import javax.swing.JOptionPane;
public class Ex8 {
        public static void main(String args[]){
        double salario ;
        double totalgasto;
        
        salario=Double.parseDouble(JOptionPane.showInputDialog("Informe o salario"));
        totalgasto=Double.parseDouble(JOptionPane.showInputDialog("Informe o total do orcamento"));
      
        
        if (totalgasto>salario){
            
        JOptionPane.showMessageDialog(null,"Orcamento estourado");
     
        }
        else {
        
        JOptionPane.showMessageDialog(null,"Gastos dentro do orcamento");
     
        }
    
    }
}

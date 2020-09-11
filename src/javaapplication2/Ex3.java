/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *3. Faça um algoritmo que receba o salário-base de um funcionário, calcule e mostre o salário a receber, 
 * sabendo-se que esse funcionário tem gratificação de 5% sobre o salário-base e paga imposto de 7% sobre o total.
 * @author valer
 */

import javax.swing.JOptionPane;
public class Ex3 {
        public static void main(String args[]){
        double salariobase;
        double total;
        double salarioareceber;
        salariobase=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salario base"));
         
         
        total=salariobase +(salariobase*0.05);
     
        salarioareceber=total-(total*0.07);
        
        JOptionPane.showMessageDialog(null,"Salario a receber" + (salarioareceber));
        
    }
}

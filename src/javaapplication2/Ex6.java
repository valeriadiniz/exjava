/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *6. Uma loja fornece 10% de desconto para funcionários e 5% de desconto para clientes vips. 
 * Faça um programa que calcule o valor total a ser pago por uma pessoa. O programa deverá ler
 * o valor total da compra efetuada e um código que identifique se o comprador é um cliente comum (1), funcionário (2) ou vip (3).
 * @author valer
 */

import javax.swing.JOptionPane;
public class Ex6 {
        public static void main(String args[]){
        int cod;
        double vlcompra;
        
        vlcompra=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da compra"));
        cod=Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do comprador:\n1-Cliente\n2-Funcionario\n3-VIP"));
        
        if(cod==1){
            JOptionPane.showMessageDialog(null,"Cod.Cliente 1 SEM DESCONTO \n O valor da compra e R$"+ vlcompra);
            
        }
        
        if(cod==2){
            JOptionPane.showMessageDialog(null,"Cod.Cliente 2 DESCONTO DE 10% \n O valor da compra e R$"+ (vlcompra-(vlcompra*0.1)));
        }
        
        if(cod==3){
            JOptionPane.showMessageDialog(null,"Cod.Cliente 3 DESCONTO DE 5% \n O valor da compra e R$"+ (vlcompra-(vlcompra*0.05)));
            
        }
    
  
    }
    
}

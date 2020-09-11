/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *2. Ler uma medida em polegadas e imprimir a equivalente em centímetros, sabendo que 2.54 cm equivale a 1 polegada.
 * @author valer
 */

import javax.swing.JOptionPane;
public class Ex2 {
        public static void main(String args[]){
        double  polegadas;
        double centimetros;
        polegadas=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em polegadas"));
         
         
        centimetros= polegadas * 2.54;
        
        JOptionPane.showMessageDialog(null,(centimetros)+"centimetros");
}
}
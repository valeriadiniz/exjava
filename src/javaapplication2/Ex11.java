/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *11. Faça um algoritmo que conte de 1 a 100 e a cada múltiplo de 10 emita uma mensagem: “Múltiplo de 10”.
 * @author valer
 */
public class Ex11 {
        public static void main (String args[]){

      
    for(int cont =1 ; cont < 101; cont++) {
         System.out.println(cont);
         
         if(cont%10==0){
         System.out.println("multiplo de 10");
             
         }
     }
    
   }  
}

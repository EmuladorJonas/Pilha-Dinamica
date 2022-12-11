/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pilhad;
import javax.swing.JOptionPane;

/**
 *
 * @author JONAS
 */
public class PilhaD {

    public static void main(String[] args) {
         Pilha pilha = new Pilha();
         
         
        if(pilha.vefExp()) {
            JOptionPane.showMessageDialog(null, "EXPRESSÃO CORRETA!!! ");
        }else {
            JOptionPane.showMessageDialog(null, "EXPRESSÃO INCORRETA!!! ");
            
        }
    }
}

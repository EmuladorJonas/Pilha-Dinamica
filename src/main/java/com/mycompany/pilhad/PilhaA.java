/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilhad;

/**
 *
 * @author JONAS
 */
public class PilhaA {
    CelulaA topo = null;

    void push(String expressao) {
        CelulaA nova = new CelulaA(expressao, topo);
        this.topo = nova;
    }


    int sizePilha() {
        CelulaA p;
        int cont = 0;
        p = topo;
        while(p!=null) {
            p = p.getAnterior();
            cont++;
        }
        return cont;
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilhad;

/**
 *
 * @author JONAS
 */
public class CelulaA {
    String expressao;
    CelulaA anterior;
    
    CelulaA(){}

    public CelulaA(String expressao, CelulaA anterior) {
        this.expressao  = expressao;
        this.anterior = anterior;
    }

    public String getExpressao() {
        return this.expressao;
    }

    void setExpressao(String expressao) {
        this.expressao = expressao;
    }
    
    public CelulaA getAnterior() {
        return this.anterior;
    }

    void setAnterior(CelulaA anterior) {
        this.anterior = anterior;
    }
}

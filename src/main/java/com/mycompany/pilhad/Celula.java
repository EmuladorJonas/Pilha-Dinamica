/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilhad;

/**
 *
 * @author JONAS
 */
public class Celula {
    String exp;
    Celula anterior;
    
    Celula(){}

    public Celula(String exp, Celula anterior)
    {
        this.exp  = exp;
        this.anterior = anterior;
    }

    public String getExpressao()
    {
        return this.exp;
    }

    void setExp(String expressao)
    {
        this.exp = expressao;
    }
    
    public Celula getAnterior()
    {
        return this.anterior;
    }

    void setAnterior(Celula anterior)
    {
        this.anterior = anterior;
    }
}

package com.wadyjorge.avaliacao_01;

// @author Wady Jorge Souza Beliche
public class NumException extends Exception {
    
    public void impMsg() {
        System.out.println("ERRO: Não pode haver Número Negativo para conta!");
    }
}
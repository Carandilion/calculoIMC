/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mtafrias.imcapp;

/**
 *
 * @author mtafrias
 */
public class ImcNegativoException extends Exception {

    public ImcNegativoException() {
        
    }

    @Override
    public String getMessage() {
        return "IMC negativo não é permitido";
    }
    
    
    
}

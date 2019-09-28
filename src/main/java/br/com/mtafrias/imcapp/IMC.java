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
public class IMC {

    public static double calcularIMC(String peso, String altura) throws Exception {
        double imc;
        double height;
        double weight;
        try {
            height = Double.parseDouble(altura);
            weight = Double.parseDouble(peso);
        } catch (NumberFormatException ex) {
            throw new NumberFormatException("Valores não são válidos!");
        }
        try {
            imc = weight / (Math.pow(height, 2));
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Erro ao dividir! Altura é 0!");
        }
        if (imc == 0) {
            throw new Exception("Valores 0 não são permitidos!");
        }
        if (imc < 0) {
            throw new ImcNegativoException();

        }
        return imc;
    }

    static String getClassificao(double resultado) {
        if (resultado < 16) {
            return "Magreza grave.";
        } else if (resultado >= 16 && resultado < 17) {
            return "Magreza moderada";
        } else if (resultado >= 17 && resultado < 18.5) {
            return "Magreza leve.";
        } else if (resultado >= 18.25 && resultado < 25) {
            return "Saudável.";
        } else if (resultado >= 25 && resultado < 30) {
            return "Sobrepeso.";
        } else if (resultado >= 30 && resultado < 35) {
            return "Obesidade Grau I.";
        } else if (resultado >= 35 && resultado < 40) {
            return "Obesidade Grau II (severa)";
        } else if (resultado >= 40) {
            return "Obesidade Grau III (mórbida).";
        } else {
            return "?????";
        }
    }
}

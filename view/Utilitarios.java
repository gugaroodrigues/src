/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Alunos
 */
public class Utilitarios {

    public static String ObterPadraoAmericano(String dataBr) {
        
        dataBr = dataBr.replace("/", "");
        return dataBr.substring(4, dataBr.length()) + "-"
                + dataBr.substring(2, 4) + "-"
                + dataBr.substring(0, 2);
    }

    public static String obterPadraoBr(String dataUS) {
        String[] posicoes = dataUS.split("-");

        return posicoes[2] + posicoes[1] + posicoes[0];
    }

}

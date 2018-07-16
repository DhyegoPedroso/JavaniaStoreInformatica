package br.com.dhyStoreInfirmatica.controller;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author Dhyego Pedroso
 */
public class UtilFornecedor {

    public int[] ordenarVetor(int[] indices) {
        //multiplica todos os indices do vetor por -1;
        for (int i = 0; i < indices.length; i++) {
            indices[i] = -indices[i];
        }
        //ordena o vetor de forma ascendente;
        Arrays.sort(indices);

        //multiplica novamente todos os indices por -1
        for (int i = 0; i < indices.length; i++) {
            indices[i] = -indices[i];
        }
        return indices;
    }

    public Date pegarDataAtual() {
        Date data = new Date();
        return data;
    }

    public SimpleDateFormat dataFormatada() {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        return formatador;
    }

}

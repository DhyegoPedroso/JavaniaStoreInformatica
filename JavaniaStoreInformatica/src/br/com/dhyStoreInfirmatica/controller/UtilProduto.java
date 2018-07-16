package br.com.dhyStoreInfirmatica.controller;

import java.util.Arrays;

/**
 *
 * @author Dhyego Pedroso
 */
public class UtilProduto {

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

}

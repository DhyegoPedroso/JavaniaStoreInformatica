package br.com.dhyStoreInfirmatica.controller;

import Dao.FabricaConexao;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import javax.persistence.EntityManager;

/**
 *
 * @author Dhyego Pedroso
 */
public class UtilCliente {

    FabricaConexao fc = new FabricaConexao();
    EntityManager em = fc.abreConexao("JavaniaStoreInformaticaPU");

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

    public void salvarCliente() {

    }

    public Date pegarDataAtual() {
        Date data = new Date();
        return data;
    }

    public SimpleDateFormat data() {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        return formatador;
    }

    
}

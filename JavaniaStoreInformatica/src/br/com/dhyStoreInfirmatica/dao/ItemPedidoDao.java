package br.com.dhyStoreInfirmatica.dao;

import br.com.dhyStoreInfirmatica.bean.ItemPedido;
import java.util.List;

/**
 *
 * @author Dhyego Pedroso
 */
public interface ItemPedidoDao extends Dao.BaseDao {

    public List<ItemPedido> pesquisarPorId(int id);

    public Integer relatorioTotalVendas();

//    public Double relatorioProdutosPorVendas();
//
//    public Double relatorioValorTotalVendas();
//
//    public Integer relatorioTotalProdutosVendidos();
//
//    public Double relatorioValorMedioVendas();

}

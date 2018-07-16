package br.com.dhyStoreInfirmatica.dao;

import br.com.dhyStoreInfirmatica.bean.Pedido;
import java.util.List;

/**
 *
 * @author Dhyego Pedroso
 */
public interface PedidoDao extends Dao.BaseDao{
    
    public List<Pedido> allPedido();

    public List<Pedido> pesquisarNumeroDoPedido(int numero);
    
}

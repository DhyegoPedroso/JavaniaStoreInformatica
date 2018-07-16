package br.com.dhyStoreInfirmatica.dao;

import br.com.dhyStoreInfirmatica.bean.Pedido;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Dhyego Pedroso
 */
public class PedidoDaoImpl extends Dao.BaseDaoAbsImpl implements PedidoDao {

    public PedidoDaoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public List<Pedido> allPedido() {
        TypedQuery<Pedido> query = em.createQuery("SELECT p From Pedido p", Pedido.class);
        List<Pedido> pedidos = query.getResultList();
        return pedidos;
    }

    @Override
    public List<Pedido> pesquisarNumeroDoPedido(int numero) {
        TypedQuery<Pedido> query = em.createQuery("SELECT p From Pedido p WHERE p.idPedido = :numero", Pedido.class);
        query.setParameter("numero", numero);
        List<Pedido> pedidos = query.getResultList();
        return pedidos;
    }
}

package br.com.dhyStoreInfirmatica.dao;

import br.com.dhyStoreInfirmatica.bean.ItemPedido;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Dhyego Pedroso
 */
public class ItemPedidoDaoImpl extends Dao.BaseDaoAbsImpl implements ItemPedidoDao {

    public ItemPedidoDaoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public List<ItemPedido> pesquisarPorId(int id) {
        TypedQuery<ItemPedido> query = em.createQuery("SELECT i FROM ItemPedido i WHERE i.pedido.idPedido =  :id", ItemPedido.class);
        query.setParameter("id", id);
        List<ItemPedido> itens = query.getResultList();
        return itens;
    }

    @Override
    public Integer relatorioTotalVendas() {
        TypedQuery<Integer> query = this.em.createQuery("SELECT count(distinct i.idItemPedido) FROM ItemPedido i", Integer.class);
        int quantidade = query.getSingleResult();
        return quantidade;
    }

//    @Override
//    public Double relatorioProdutosPorVendas() {
//        TypedQuery<Double> query = this.em.createQuery("SELECT count(i.produto.idProduto) / count(distinct i.pedido.idPedido) FROM ItemPedido i", Double.class);
//        double quantidade = query.getSingleResult();
//        return quantidade;
//    }
//
//    @Override
//    public Double relatorioValorTotalVendas() {
//        TypedQuery<Double> query = this.em.createQuery("SELECT COUNT(i.valorUnit * i.qtdDeItem) FROM ItemPedido i", Double.class);
//        double quantidade = query.getSingleResult();
//        return quantidade;
//    }
//
//    @Override
//    public Integer relatorioTotalProdutosVendidos() {
//        TypedQuery<Integer> query = this.em.createQuery("SELECT count(i.produto.idProduto) FROM ItemPedido i", Integer.class);
//        int quantidade = query.getSingleResult();
//        return quantidade;
//    }
//
//    @Override
//    public Double relatorioValorMedioVendas() {
//        TypedQuery<Double> query = this.em.createQuery("SELECT sum(i.valorUnit * i.qtdDeItem) / count(distinct i.Pedido.idPedido) FROM ItemPedido i", Double.class);
//        double quantidade = query.getSingleResult();
//        return quantidade;
//    }

}

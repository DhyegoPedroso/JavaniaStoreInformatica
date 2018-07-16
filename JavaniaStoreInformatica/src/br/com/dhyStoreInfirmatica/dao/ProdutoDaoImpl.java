package br.com.dhyStoreInfirmatica.dao;

import br.com.dhyStoreInfirmatica.bean.Produto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Dhyego Pedroso
 */
public class ProdutoDaoImpl extends Dao.BaseDaoAbsImpl implements ProdutoDao {

    public ProdutoDaoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public List<Produto> allProduto() {
        TypedQuery<Produto> query = em.createQuery("SELECT p From Produto p ", Produto.class);
        List<Produto> produtos = query.getResultList();
        return produtos;
    }

    @Override
    public List<Produto> pesquisarProduto(String produto) {
        TypedQuery<Produto> query = em.createQuery("SELECT p From Produto p WHERE p.nomeProduto LIKE :produto", Produto.class);
        query.setParameter("produto", "%" + produto + "%");
        List<Produto> produtos = query.getResultList();
        return produtos;
    }

}

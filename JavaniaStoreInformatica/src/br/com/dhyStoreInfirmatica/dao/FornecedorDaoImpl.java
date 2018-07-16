package br.com.dhyStoreInfirmatica.dao;

import br.com.dhyStoreInfirmatica.bean.Fornecedor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Dhyego Pedroso
 */
public class FornecedorDaoImpl extends Dao.BaseDaoAbsImpl implements FornecedorDao {

    public FornecedorDaoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public List<Fornecedor> allFornecedor() {
        TypedQuery<Fornecedor> query = em.createQuery("SELECT f From Fornecedor f", Fornecedor.class);
        List<Fornecedor> fornecedores = query.getResultList();
        return fornecedores;
    }

    @Override
    public List<Fornecedor> pesquisarNome(String nome) {
        TypedQuery<Fornecedor> query = em.createQuery("SELECT f  FROM Fornecedor f WHERE f.nomeFornecedor LIKE :nome", Fornecedor.class);
        query.setParameter("nome", "%" + nome + "%");
        List<Fornecedor> fornecedores = query.getResultList();
        return fornecedores;
    }

    @Override
    public List<Fornecedor> pesquisarCpf(String cnpj) {
        TypedQuery<Fornecedor> query = em.createQuery("SELECT f FROM Fornecedor f WHERE f.cnpjFornecedor LIKE :cnpj", Fornecedor.class);
        query.setParameter("cnpj", "%" + cnpj + "%");
        List<Fornecedor> fornecedores = query.getResultList();
        return fornecedores;
    }

}

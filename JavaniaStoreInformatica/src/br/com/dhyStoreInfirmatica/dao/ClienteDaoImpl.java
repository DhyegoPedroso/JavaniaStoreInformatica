package br.com.dhyStoreInfirmatica.dao;

import br.com.dhyStoreInfirmatica.bean.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Dhyego Pedroso
 */
public class ClienteDaoImpl extends Dao.BaseDaoAbsImpl implements ClienteDao {

    public ClienteDaoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public List<Cliente> allCliente() {
        TypedQuery<Cliente> query = em.createQuery("SELECT c From Cliente c", Cliente.class);
        List<Cliente> clientes = query.getResultList();
        return clientes;
    }

    @Override
    public List<Cliente> pesquisarNome(String nome) {
        TypedQuery<Cliente> query = em.createQuery("SELECT c FROM Cliente c WHERE c.nomeCliente LIKE :nome", Cliente.class);
        query.setParameter("nome", "%" + nome + "%");
        List<Cliente> clientes = query.getResultList();
        return clientes;
    }

    @Override
    public List<Cliente> pesquisarCpf(String cpf) {
        TypedQuery<Cliente> query = em.createQuery("SELECT c FROM Cliente c WHERE c.cpfCliente LIKE :cpf", Cliente.class);
        query.setParameter("cpf", "%" + cpf + "%");
        List<Cliente> clientes = query.getResultList();
        return clientes;
    }

}

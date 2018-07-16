package br.com.dhyStoreInfirmatica.dao;

import br.com.dhyStoreInfirmatica.bean.Cliente;
import java.util.List;

/**
 *
 * @author Dhyego Pedroso
 */
public interface ClienteDao extends Dao.BaseDao{

    public List<Cliente> allCliente();

    public List<Cliente> pesquisarNome(String nome);

    public List<Cliente> pesquisarCpf(String cpf);

}

package br.com.dhyStoreInfirmatica.dao;

import br.com.dhyStoreInfirmatica.bean.Fornecedor;
import java.util.List;

/**
 *
 * @author Dhyego Pedroso
 */
public interface FornecedorDao extends Dao.BaseDao {

    public List<Fornecedor> allFornecedor();

    public List<Fornecedor> pesquisarNome(String nome);

    public List<Fornecedor> pesquisarCpf(String cnpj);

}

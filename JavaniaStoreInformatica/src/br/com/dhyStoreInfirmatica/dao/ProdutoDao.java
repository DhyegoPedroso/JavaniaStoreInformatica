package br.com.dhyStoreInfirmatica.dao;

import br.com.dhyStoreInfirmatica.bean.Produto;
import java.util.List;

/**
 *
 * @author Dhyego Pedroso
 */
public interface ProdutoDao extends Dao.BaseDao{
    
    public List<Produto> allProduto();

    public List<Produto> pesquisarProduto(String pesquisa);
    
}

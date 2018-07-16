package br.com.dhyStoreInfirmatica.dao;

import br.com.dhyStoreInfirmatica.bean.Marca;
import java.util.List;

/**
 *
 * @author Dhyego Pedroso
 */
public interface MarcaDao extends Dao.BaseDao{
    
      
    public List<Marca> allMarca();

    public List<Marca> pesquisarMarca(String pesquisa);
    
}

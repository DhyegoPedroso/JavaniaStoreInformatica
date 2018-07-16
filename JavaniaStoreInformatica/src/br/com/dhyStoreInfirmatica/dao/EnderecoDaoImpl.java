package br.com.dhyStoreInfirmatica.dao;

import javax.persistence.EntityManager;

/**
 *
 * @author Dhyego Pedroso
 */
public class EnderecoDaoImpl extends Dao.BaseDaoAbsImpl implements EnderecoDao{
    
    public EnderecoDaoImpl(EntityManager em) {
        super(em);
    }
    
}

package br.com.dhyStoreInfirmatica.dao;

import br.com.dhyStoreInfirmatica.bean.Marca;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Dhyego Pedroso
 */
public class MarcaDaoImpl extends Dao.BaseDaoAbsImpl implements MarcaDao{
    
    public MarcaDaoImpl(EntityManager em) {
        super(em);
    }
    
      @Override
    public List<Marca> allMarca() {
        TypedQuery<Marca> query = em.createQuery("SELECT m From Marca m ", Marca.class);
        List<Marca> marcas = query.getResultList();
        return marcas;
    }

    @Override
    public List<Marca> pesquisarMarca(String Marca) {
        TypedQuery<Marca> query = em.createQuery("SELECT m From Marca m WHERE m.nomeMarca :marca", Marca.class);
        query.setParameter("marca", "%" + Marca + "%");
        List<Marca> marcas = query.getResultList();
        return marcas;
    }
    
}

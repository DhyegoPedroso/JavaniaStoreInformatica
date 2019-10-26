package br.com.dhyStoreInfirmatica.bean;

import br.com.dhyStoreInfirmatica.bean.Fornecedor;
import br.com.dhyStoreInfirmatica.bean.Marca;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-26T00:19:29")
@StaticMetamodel(Produto.class)
public class Produto_ { 

    public static volatile SingularAttribute<Produto, String> descProduto;
    public static volatile SingularAttribute<Produto, Integer> qtdProduto;
    public static volatile SingularAttribute<Produto, Marca> marca;
    public static volatile SingularAttribute<Produto, Integer> idProduto;
    public static volatile SingularAttribute<Produto, Double> valorProduto;
    public static volatile SingularAttribute<Produto, Fornecedor> fornecedor;
    public static volatile SingularAttribute<Produto, String> nomeProduto;

}
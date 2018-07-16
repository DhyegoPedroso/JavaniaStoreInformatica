package br.com.dhyStoreInfirmatica.bean;

import br.com.dhyStoreInfirmatica.bean.Endereco;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-03T18:33:01")
@StaticMetamodel(Fornecedor.class)
public class Fornecedor_ { 

    public static volatile SingularAttribute<Fornecedor, Integer> idFornecedor;
    public static volatile SingularAttribute<Fornecedor, String> nomeFornecedor;
    public static volatile SingularAttribute<Fornecedor, Endereco> endereco;
    public static volatile SingularAttribute<Fornecedor, String> cnpjFornecedor;
    public static volatile SingularAttribute<Fornecedor, String> ieFornecedor;
    public static volatile SingularAttribute<Fornecedor, String> telefoneFornecedor;
    public static volatile SingularAttribute<Fornecedor, String> emailFornecedor;
    public static volatile SingularAttribute<Fornecedor, Date> dataCadastro;
    public static volatile SingularAttribute<Fornecedor, String> celularFornecedor;

}
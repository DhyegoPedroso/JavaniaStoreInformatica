package br.com.dhyStoreInfirmatica.bean;

import br.com.dhyStoreInfirmatica.bean.Endereco;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-03T18:33:01")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> emailCliente;
    public static volatile SingularAttribute<Cliente, String> sexoCliente;
    public static volatile SingularAttribute<Cliente, String> cpfCliente;
    public static volatile SingularAttribute<Cliente, String> telefoneCliente;
    public static volatile SingularAttribute<Cliente, String> rgCliente;
    public static volatile SingularAttribute<Cliente, Integer> idCliente;
    public static volatile SingularAttribute<Cliente, Endereco> endereco;
    public static volatile SingularAttribute<Cliente, String> celularCliente;
    public static volatile SingularAttribute<Cliente, String> nomeCliente;
    public static volatile SingularAttribute<Cliente, Date> dataNascimento;
    public static volatile SingularAttribute<Cliente, Date> dataCadastro;

}
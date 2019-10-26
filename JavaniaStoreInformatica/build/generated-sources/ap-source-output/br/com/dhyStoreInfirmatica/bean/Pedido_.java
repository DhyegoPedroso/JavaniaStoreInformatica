package br.com.dhyStoreInfirmatica.bean;

import br.com.dhyStoreInfirmatica.bean.Cliente;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-26T00:19:29")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, Cliente> cliente;
    public static volatile SingularAttribute<Pedido, Integer> idPedido;
    public static volatile SingularAttribute<Pedido, String> tipoPagamento;
    public static volatile SingularAttribute<Pedido, Double> valorTotalVenda;
    public static volatile SingularAttribute<Pedido, Date> dataCompra;

}
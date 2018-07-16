package br.com.dhyStoreInfirmatica.bean;

import br.com.dhyStoreInfirmatica.bean.Pedido;
import br.com.dhyStoreInfirmatica.bean.Produto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-03T18:33:01")
@StaticMetamodel(ItemPedido.class)
public class ItemPedido_ { 

    public static volatile SingularAttribute<ItemPedido, Produto> produto;
    public static volatile SingularAttribute<ItemPedido, Integer> idItemPedido;
    public static volatile SingularAttribute<ItemPedido, Pedido> pedido;
    public static volatile SingularAttribute<ItemPedido, Integer> qtdDeItem;
    public static volatile SingularAttribute<ItemPedido, Double> valorUnit;

}
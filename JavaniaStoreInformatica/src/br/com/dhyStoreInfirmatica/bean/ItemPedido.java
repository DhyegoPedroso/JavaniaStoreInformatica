package br.com.dhyStoreInfirmatica.bean;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Dhyego Pedroso
 */
@Entity
public class ItemPedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idItemPedido;

    @JoinColumn(name = "idPedido")
    @ManyToOne
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "idProduto")
    private Produto produto;

    @Column
    private int qtdDeItem;

    @Column
    private double valorUnit;

    public ItemPedido() {
    }

    public ItemPedido(Pedido pedido, Produto produto, int qtdDeItem, double valorUnit) {
        this.pedido = pedido;
        this.produto = produto;
        this.qtdDeItem = qtdDeItem;
        this.valorUnit = valorUnit;
    }

    public double getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(double valorUnit) {
        this.valorUnit = valorUnit;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQtdDeItem() {
        return qtdDeItem;
    }

    public void setQtdDeItem(int qtdDeItem) {
        this.qtdDeItem = qtdDeItem;
    }

    public int getIdItemPedido() {
        return idItemPedido;
    }

    public void setIdItemPedido(int idItemPedido) {
        this.idItemPedido = idItemPedido;
    }

}

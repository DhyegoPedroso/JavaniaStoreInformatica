package br.com.dhyStoreInfirmatica.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Dhyego Pedroso
 */
@Entity
public class Fornecedor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFornecedor;

    @Column
    private String nomeFornecedor;

    @Column
    private String emailFornecedor;

    @Column
    private String telefoneFornecedor;

    @Column
    private String celularFornecedor;

    @Column
    private String cnpjFornecedor;

    @Column
    private String ieFornecedor;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCadastro;

    @ManyToOne
    @JoinColumn(name = "idEndereco")
    private Endereco endereco;

    public Fornecedor() {
    }

    public Fornecedor(String nomeFornecedor, String emailFornecedor, String telefoneFornecedor, String celularFornecedor, String cnpjFornecedor, String ieFornecedor, Date dataCadastro, Endereco endereco) {
        this.idFornecedor = idFornecedor;
        this.nomeFornecedor = nomeFornecedor;
        this.emailFornecedor = emailFornecedor;
        this.telefoneFornecedor = telefoneFornecedor;
        this.celularFornecedor = celularFornecedor;
        this.cnpjFornecedor = cnpjFornecedor;
        this.ieFornecedor = ieFornecedor;
        this.dataCadastro = dataCadastro;
        this.endereco = endereco;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getEmailFornecedor() {
        return emailFornecedor;
    }

    public void setEmailFornecedor(String emailFornecedor) {
        this.emailFornecedor = emailFornecedor;
    }

    public String getTelefoneFornecedor() {
        return telefoneFornecedor;
    }

    public void setTelefoneFornecedor(String telefoneFornecedor) {
        this.telefoneFornecedor = telefoneFornecedor;
    }

    public String getCelularFornecedor() {
        return celularFornecedor;
    }

    public void setCelularFornecedor(String celularFornecedor) {
        this.celularFornecedor = celularFornecedor;
    }

    public String getCnpjFornecedor() {
        return cnpjFornecedor;
    }

    public void setCnpjFornecedor(String cnpjFornecedor) {
        this.cnpjFornecedor = cnpjFornecedor;
    }

    public String getIeFornecedor() {
        return ieFornecedor;
    }

    public void setIeFornecedor(String ieFornecedor) {
        this.ieFornecedor = ieFornecedor;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return getNomeFornecedor();
    }

    
    
}

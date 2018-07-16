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
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;

    @Column
    private String nomeCliente;

    @Column
    private String sexoCliente;

    @Column
    private String emailCliente;

    @Column
    private String telefoneCliente;

    @Column
    private String celularCliente;

    @Column
    private String cpfCliente;

    @Column
    private String rgCliente;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCadastro;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataNascimento;

    @ManyToOne
    @JoinColumn(name = "idEndereco")
    private Endereco endereco;

    public Cliente() {
    }

    public Cliente(String nomeCliente, String sexoCliente, String emailCliente, String telefoneCliente, String celularCliente, String cpfCliente, String rgCliente, Date dataCadastro, Date dataNascimento, Endereco endereco) {
        this.nomeCliente = nomeCliente;
        this.sexoCliente = sexoCliente;
        this.emailCliente = emailCliente;
        this.telefoneCliente = telefoneCliente;
        this.celularCliente = celularCliente;
        this.cpfCliente = cpfCliente;
        this.rgCliente = rgCliente;
        this.dataCadastro = dataCadastro;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getSexoCliente() {
        return sexoCliente;
    }

    public void setSexoCliente(String sexoCliente) {
        this.sexoCliente = sexoCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String getCelularCliente() {
        return celularCliente;
    }

    public void setCelularCliente(String celularCliente) {
        this.celularCliente = celularCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getRgCliente() {
        return rgCliente;
    }

    public void setRgCliente(String rgCliente) {
        this.rgCliente = rgCliente;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}

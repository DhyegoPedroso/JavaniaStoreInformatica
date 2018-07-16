/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dhyStoreInfirmatica.view;

import Dao.FabricaConexao;
import br.com.dhyStoreInfirmatica.bean.Cliente;
import br.com.dhyStoreInfirmatica.bean.Endereco;
import br.com.dhyStoreInfirmatica.controller.UtilCliente;
import br.com.dhyStoreInfirmatica.dao.ClienteDao;
import br.com.dhyStoreInfirmatica.dao.ClienteDaoImpl;
import br.com.dhyStoreInfirmatica.dao.EnderecoDao;
import br.com.dhyStoreInfirmatica.dao.EnderecoDaoImpl;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Dhyego Pedroso
 */
public class TelaCliente extends javax.swing.JInternalFrame {

    private FabricaConexao fc = new FabricaConexao();
    private EntityManager em = fc.abreConexao("JavaniaStoreInformaticaPU");
    private DefaultTableModel defaultTabelaCliente;
    private UtilCliente utilCliente = new UtilCliente();

    private int linha;

    public TelaCliente() {
        initComponents();

        defaultTabelaCliente = (DefaultTableModel) tabelaCliente.getModel();
        tabelaCliente.setRowSorter(new TableRowSorter(defaultTabelaCliente));
        this.atualizarTabela();
        this.setVisible(true);
        this.setMaximumSize(getMaximumSize());

        this.txtIdCliente.setVisible(false);
        txtDataCadastro.setText(utilCliente.data().format(utilCliente.pegarDataAtual()));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoSexo = new javax.swing.ButtonGroup();
        grupoPesquisa = new javax.swing.ButtonGroup();
        painelPrincipalCliente = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();
        painelPesquisa = new javax.swing.JPanel();
        rbNome = new javax.swing.JRadioButton();
        rbCpf = new javax.swing.JRadioButton();
        txtPesquisar = new javax.swing.JTextField();
        painelPesquisa1 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnMaisInfo = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        painelCliente = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rbFeminino = new javax.swing.JRadioButton();
        rbMasculino = new javax.swing.JRadioButton();
        txtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        lblRg = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        txtDataCadastro = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtCelular = new javax.swing.JFormattedTextField();
        txtIdCliente = new javax.swing.JTextField();
        txtRg = new javax.swing.JFormattedTextField();
        painelEndereco = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtbairro = new javax.swing.JTextField();
        txtUf = new javax.swing.JTextField();
        txtPais = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        txtCep = new javax.swing.JFormattedTextField();
        btnSalvar = new javax.swing.JButton();
        btnSair1 = new javax.swing.JButton();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cliente");
        setPreferredSize(new java.awt.Dimension(1100, 600));

        painelPrincipalCliente.setPreferredSize(new java.awt.Dimension(1295, 600));

        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "E-Mail", "Telefone", "Celular", "CPF", "RG"
            }
        ));
        jScrollPane1.setViewportView(tabelaCliente);

        painelPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        grupoPesquisa.add(rbNome);
        rbNome.setText("Nome");
        rbNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbNomeMouseClicked(evt);
            }
        });

        grupoPesquisa.add(rbCpf);
        rbCpf.setText("Cpf");
        rbCpf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbCpfrbNomeMouseClicked(evt);
            }
        });

        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout painelPesquisaLayout = new javax.swing.GroupLayout(painelPesquisa);
        painelPesquisa.setLayout(painelPesquisaLayout);
        painelPesquisaLayout.setHorizontalGroup(
            painelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(painelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbNome)
                    .addGroup(painelPesquisaLayout.createSequentialGroup()
                        .addComponent(rbCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painelPesquisaLayout.setVerticalGroup(
            painelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(rbNome)
                .addGap(6, 6, 6)
                .addGroup(painelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbCpf)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        painelPesquisa1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/dhyStoreInfirmatica/Icos/usuarioAdd.png"))); // NOI18N
        btnNovo.setToolTipText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnMaisInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/dhyStoreInfirmatica/Icos/usuarioMaisInfo.png"))); // NOI18N
        btnMaisInfo.setToolTipText("Mais Informações");
        btnMaisInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisInfoActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/dhyStoreInfirmatica/Icos/usuarioExcluir.png"))); // NOI18N
        btnExcluir.setToolTipText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/dhyStoreInfirmatica/Icos/usuariosair.png"))); // NOI18N
        btnSair.setToolTipText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/dhyStoreInfirmatica/Icos/usuarioEditar.png"))); // NOI18N
        btnEditar.setToolTipText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPesquisa1Layout = new javax.swing.GroupLayout(painelPesquisa1);
        painelPesquisa1.setLayout(painelPesquisa1Layout);
        painelPesquisa1Layout.setHorizontalGroup(
            painelPesquisa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisa1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMaisInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelPesquisa1Layout.setVerticalGroup(
            painelPesquisa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisa1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelPesquisa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMaisInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(painelPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 247, Short.MAX_VALUE)
                        .addComponent(painelPesquisa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelPesquisa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        painelPrincipalCliente.addTab("Tabela Cliente", jPanel1);

        painelCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        painelCliente.setMinimumSize(new java.awt.Dimension(410, 450));
        painelCliente.setPreferredSize(new java.awt.Dimension(420, 457));

        jLabel1.setText("Nome:");

        jLabel2.setText("Sexo:");

        grupoSexo.add(rbFeminino);
        rbFeminino.setText("Feminino");

        grupoSexo.add(rbMasculino);
        rbMasculino.setText("Masculino");

        jLabel3.setText("E-Mail:");

        jLabel4.setText("Telefone:");

        jLabel5.setText("Celular:");

        jLabel9.setText("Data Nascimento:");

        lblCpf.setText("CPF:");

        lblRg.setText("RG:");

        jLabel8.setText("Data Cadastro:");

        try {
            txtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtDataCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataCadastro.setEnabled(false);

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout painelClienteLayout = new javax.swing.GroupLayout(painelCliente);
        painelCliente.setLayout(painelClienteLayout);
        painelClienteLayout.setHorizontalGroup(
            painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClienteLayout.createSequentialGroup()
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelClienteLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome))
                    .addGroup(painelClienteLayout.createSequentialGroup()
                        .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelClienteLayout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel2)
                                .addGap(6, 6, 6)
                                .addComponent(rbFeminino)
                                .addGap(6, 6, 6)
                                .addComponent(rbMasculino))
                            .addGroup(painelClienteLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDataNascimento)
                                    .addComponent(txtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                    .addComponent(txtDataCadastro)
                                    .addComponent(txtRg)))
                            .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(painelClienteLayout.createSequentialGroup()
                                    .addGap(63, 63, 63)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelClienteLayout.createSequentialGroup()
                                    .addGap(54, 54, 54)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 121, Short.MAX_VALUE))
                    .addGroup(painelClienteLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail)))
                .addGap(6, 6, 6))
            .addGroup(painelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelClienteLayout.setVerticalGroup(
            painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClienteLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelClienteLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1))
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelClienteLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2))
                    .addComponent(rbFeminino)
                    .addComponent(rbMasculino))
                .addGap(18, 18, 18)
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelClienteLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3))
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRg)
                    .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel10.setText("Logradouro:");

        jLabel11.setText("Número:");

        jLabel12.setText("Bairro:");

        jLabel13.setText("Cidade:");

        jLabel14.setText("UF:");

        jLabel15.setText("País:");

        jLabel16.setText("CEP:");

        jLabel17.setText("Complemento:");

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout painelEnderecoLayout = new javax.swing.GroupLayout(painelEndereco);
        painelEndereco.setLayout(painelEnderecoLayout);
        painelEnderecoLayout.setHorizontalGroup(
            painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEnderecoLayout.createSequentialGroup()
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelEnderecoLayout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEnderecoLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelEnderecoLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtbairro, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtUf, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtCep, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPais, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        painelEnderecoLayout.setVerticalGroup(
            painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEnderecoLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/dhyStoreInfirmatica/Icos/usuarioEntrar.png"))); // NOI18N
        btnSalvar.setToolTipText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnSair1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/dhyStoreInfirmatica/Icos/usuariosair.png"))); // NOI18N
        btnSair1.setToolTipText("Sair");
        btnSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSair1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(painelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(painelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(407, 407, 407))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSair1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        painelPrincipalCliente.addTab("Novo Cliente", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipalCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 1098, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipalCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbNomeMouseClicked
        if (rbNome.isSelected()) {
            txtPesquisar.setEnabled(true);
        } else if (rbCpf.isSelected()) {
            txtPesquisar.setEnabled(true);
        } else {
            txtPesquisar.setEnabled(false);
        }
    }//GEN-LAST:event_rbNomeMouseClicked

    private void rbCpfrbNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbCpfrbNomeMouseClicked
        if (rbNome.isSelected()) {
            txtPesquisar.setEnabled(true);
        } else if (rbCpf.isSelected()) {
            txtPesquisar.setEnabled(true);
        } else {
            txtPesquisar.setEnabled(false);
        }
    }//GEN-LAST:event_rbCpfrbNomeMouseClicked

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        painelPrincipalCliente.setSelectedIndex(1);
        utilCliente.pegarDataAtual();
        tabelaCliente.clearSelection();
        grupoPesquisa.clearSelection();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tabelaCliente.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um cliente antes!!");
        } else {
            ClienteDao clienteDao = new ClienteDaoImpl(em);
            if (tabelaCliente.getSelectedRow() != -1) {
                this.setLinha(tabelaCliente.getSelectedRow());
                painelPrincipalCliente.setSelectedIndex(1);
                int id = (int) this.tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 0);
                Cliente cliente = (Cliente) clienteDao.pesquisarPorId(Cliente.class, id);

                txtIdCliente.setText(String.valueOf(cliente.getIdCliente()));
                txtNome.setText(cliente.getNomeCliente());
                if (cliente.getSexoCliente().equalsIgnoreCase("Feminino")) {
                    rbFeminino.setSelected(true);
                } else {
                    rbMasculino.setSelected(true);
                }
                txtEmail.setText(cliente.getEmailCliente());
                txtTelefone.setText(cliente.getTelefoneCliente());
                txtCelular.setText(cliente.getCelularCliente());

                DateFormat dataNascimento = new SimpleDateFormat("dd/MM/yyyy");

                txtDataNascimento.setText(dataNascimento.format(cliente.getDataNascimento()));
                txtCpf.setText(cliente.getCpfCliente());
                txtRg.setText(cliente.getRgCliente());

                DateFormat dataCadastro = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

                txtDataCadastro.setText(dataCadastro.format(cliente.getDataCadastro().getTime()));
                txtLogradouro.setText(cliente.getEndereco().getLogradouro());
                txtComplemento.setText(cliente.getEndereco().getComplemento());
                txtNumero.setText(cliente.getEndereco().getNumero());
                txtbairro.setText(cliente.getEndereco().getBairro());
                txtCidade.setText(cliente.getEndereco().getCidade());
                txtUf.setText(cliente.getEndereco().getUf());
                txtPais.setText(cliente.getEndereco().getPais());
                txtCep.setText(cliente.getEndereco().getCep());

                tabelaCliente.clearSelection();
                grupoPesquisa.clearSelection();
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnMaisInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaisInfoActionPerformed
        if (tabelaCliente.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um cliente antes!!");
        } else {
            ClienteDao clienteDao = new ClienteDaoImpl(em);

            if (tabelaCliente.getSelectedRow() != -1) {
                int id = (int) this.tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 0);
                Cliente cliente = (Cliente) clienteDao.pesquisarPorId(Cliente.class, id);

                DateFormat dataCadastro = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                DateFormat dataNascimento = new SimpleDateFormat("dd/MM/yyyy");

                JOptionPane.showMessageDialog(this, "Nome: " + cliente.getNomeCliente()
                        + "\nSexo: " + cliente.getSexoCliente()
                        + "\nE-Mail: " + cliente.getEmailCliente()
                        + "\nTelefone: " + cliente.getTelefoneCliente()
                        + "\nCelular: " + cliente.getCelularCliente()
                        + "\nData de Nascimento: " + dataNascimento.format(cliente.getDataNascimento())
                        + "\nCPF: " + cliente.getCpfCliente()
                        + "\nRG: " + cliente.getRgCliente()
                        + "\nData de Cadastro: " + dataCadastro.format(cliente.getDataCadastro().getTime())
                        + "\nLogradouro: " + cliente.getEndereco().getLogradouro()
                        + "\nComplemento: " + cliente.getEndereco().getComplemento()
                        + "\nNúmero: " + cliente.getEndereco().getNumero()
                        + "\nBairro: " + cliente.getEndereco().getBairro()
                        + "\nCidade: " + cliente.getEndereco().getCidade()
                        + "\nUF: " + cliente.getEndereco().getUf()
                        + "\nPaís: " + cliente.getEndereco().getPais()
                        + "\nCEP: " + cliente.getEndereco().getCep(), "Informações do Cliente", INFORMATION_MESSAGE);

                tabelaCliente.clearSelection();
                grupoPesquisa.clearSelection();
            }
        }
    }//GEN-LAST:event_btnMaisInfoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tabelaCliente.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um cliente antes!!");
        } else {
            Cliente cliente;
            ClienteDao clienteDao = new ClienteDaoImpl(em);
            UtilCliente vetor = new UtilCliente();
            if (tabelaCliente.getSelectedRow() >= 0) {
                if (JOptionPane.showConfirmDialog(null, "Deseja Excluir o Cliente?", "Confirmar a Exclusão", JOptionPane.YES_NO_OPTION) == 0) {
                    int[] indices = vetor.ordenarVetor(tabelaCliente.getSelectedRows());
                    for (int linha : indices) {
                        int id = (int) this.tabelaCliente.getValueAt(linha, 0);
                        this.defaultTabelaCliente.removeRow(linha);
                        cliente = (Cliente) clienteDao.pesquisarPorId(Cliente.class, id);
                        clienteDao.excluir(cliente);
                        tabelaCliente.clearSelection();
                        grupoPesquisa.clearSelection();
                    }
                }
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
        em.close();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            if (validacaoDeCampos()) {
            } else {
                painelPrincipalCliente.setSelectedIndex(0);
                ClienteDao clienteDao = new ClienteDaoImpl(em);
                Endereco endereco = new Endereco();
                EnderecoDao enderecoDao = new EnderecoDaoImpl(em);
                Cliente cliente = new Cliente();

                DateFormat dateFormatDevolucao = new SimpleDateFormat("dd/MM/yyyy");
                Date dataNascimento = dateFormatDevolucao.parse(txtDataNascimento.getText());
                if (txtIdCliente.getText().equalsIgnoreCase("")) {
                    String sexo;
                    if (rbFeminino.isSelected()) {
                        cliente.setSexoCliente("Feminino");
                        sexo = "Feminino";
                    } else {
                        cliente.setSexoCliente("Masculino");
                        sexo = "Masculino";
                    }
                    endereco = new Endereco(txtLogradouro.getText(), txtComplemento.getText(), txtNumero.getText(), txtbairro.getText(), txtCidade.getText(), txtUf.getText(), txtPais.getText(), txtCep.getText());
                    cliente = new Cliente(txtNome.getText(), sexo, txtEmail.getText(), txtTelefone.getText(), txtCelular.getText(), txtCpf.getText(), txtRg.getText(), new Date(), dataNascimento, endereco);
                    enderecoDao.salvar(endereco);
                    clienteDao.salvar(cliente);
                    this.addLinha(cliente);
                    this.limparCampos();
                    tabelaCliente.clearSelection();
                    grupoPesquisa.clearSelection();

                } else {
                    cliente = (Cliente) clienteDao.pesquisarPorId(Cliente.class, Integer.parseInt(txtIdCliente.getText()));
                    endereco = (Endereco) enderecoDao.pesquisarPorId(Endereco.class, cliente.getEndereco().getIdEndereco());

                    cliente.setNomeCliente(txtNome.getText());
                    cliente.setEmailCliente(txtEmail.getText());
                    cliente.setTelefoneCliente(txtTelefone.getText());
                    cliente.setCelularCliente(txtCelular.getText());
                    cliente.setDataNascimento(dataNascimento);
                    cliente.setCpfCliente(txtCpf.getText());
                    cliente.setRgCliente(txtRg.getText());
                    cliente.setDataCadastro(new Date());
                    if (rbFeminino.isSelected()) {
                        cliente.setSexoCliente("Feminino");
                    } else {
                        cliente.setSexoCliente("Masculino");
                    }
                    endereco.setLogradouro(txtLogradouro.getText());
                    endereco.setComplemento(txtComplemento.getText());
                    endereco.setNumero(txtNumero.getText());
                    endereco.setBairro(txtbairro.getText());
                    endereco.setCidade(txtCidade.getText());
                    endereco.setUf(txtUf.getText());
                    endereco.setPais(txtPais.getText());
                    endereco.setCep(txtCep.getText());

                    enderecoDao.alterar(endereco);
                    cliente.setEndereco(endereco);
                    clienteDao.alterar(cliente);
                    this.editarLinha(cliente, this.getLinha());
                    this.limparCampos();
                    tabelaCliente.clearSelection();
                    grupoPesquisa.clearSelection();
                }
            }
        } catch (ParseException ex) {
            Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSair1ActionPerformed
        painelPrincipalCliente.setSelectedIndex(0);
        limparCampos();
        tabelaCliente.clearSelection();
        grupoPesquisa.clearSelection();
    }//GEN-LAST:event_btnSair1ActionPerformed

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased
        if (!rbCpf.isSelected() && !rbNome.isSelected()) {
            JOptionPane.showMessageDialog(this, "Seleciome uma opcçao ao lado pra fazer a pesquisa!!");
            txtPesquisar.setText("");
        } else {
            if (rbCpf.isSelected()) {
                pesquisarCliente("cpf", txtPesquisar.getText());
            } else if (rbNome.isSelected()) {
                pesquisarCliente("nome", txtPesquisar.getText());
            }
        }
    }//GEN-LAST:event_txtPesquisarKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnMaisInfo;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSair1;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup grupoPesquisa;
    private javax.swing.ButtonGroup grupoSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblRg;
    private javax.swing.JPanel painelCliente;
    private javax.swing.JPanel painelEndereco;
    private javax.swing.JPanel painelPesquisa;
    private javax.swing.JPanel painelPesquisa1;
    private javax.swing.JTabbedPane painelPrincipalCliente;
    private javax.swing.JRadioButton rbCpf;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JRadioButton rbNome;
    private javax.swing.JTable tabelaCliente;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtDataCadastro;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JFormattedTextField txtRg;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JTextField txtUf;
    private javax.swing.JTextField txtbairro;
    // End of variables declaration//GEN-END:variables

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public void atualizarTabela() {
        try {
            defaultTabelaCliente = (DefaultTableModel) tabelaCliente.getModel();
            defaultTabelaCliente.setNumRows(0);
            ClienteDao clienteDao = new ClienteDaoImpl(em);
            for (Cliente c : clienteDao.allCliente()) {
                defaultTabelaCliente.addRow(new Object[]{
                    c.getIdCliente(),
                    c.getNomeCliente(),
                    c.getEmailCliente(),
                    c.getTelefoneCliente(),
                    c.getCelularCliente(),
                    c.getCpfCliente(),
                    c.getRgCliente()
                });
            }
        } catch (Exception e) {
        }
    }

    public void limparCampos() {
        txtCelular.setText("");
        txtCep.setText("");
        txtCidade.setText("");
        txtComplemento.setText("");
        txtCpf.setText("");
        txtDataNascimento.setText("");
        txtDataCadastro.setText("");
        txtEmail.setText("");
        txtLogradouro.setText("");
        txtNome.setText("");
        txtPais.setText("");
        txtNumero.setText("");
        txtRg.setText("");
        txtTelefone.setText("");
        txtUf.setText("");
        txtbairro.setText("");
        txtIdCliente.setText("");
        grupoSexo.clearSelection();
    }

    public void addLinha(Cliente cliente) {
        defaultTabelaCliente.addRow(new Object[]{cliente.getIdCliente(), cliente.getNomeCliente(), cliente.getEmailCliente(),
            cliente.getTelefoneCliente(), cliente.getCelularCliente(), cliente.getCpfCliente(), cliente.getRgCliente()});
    }

    public void editarLinha(Cliente Cliente, int linha) {
        defaultTabelaCliente.setValueAt(Cliente.getNomeCliente(), linha, 1);
        defaultTabelaCliente.setValueAt(Cliente.getEmailCliente(), linha, 2);
        defaultTabelaCliente.setValueAt(Cliente.getTelefoneCliente(), linha, 3);
        defaultTabelaCliente.setValueAt(Cliente.getCelularCliente(), linha, 4);
        defaultTabelaCliente.setValueAt(Cliente.getCpfCliente(), linha, 5);
        defaultTabelaCliente.setValueAt(Cliente.getRgCliente(), linha, 6);
    }

    public void pesquisarCliente(String opcao, String pesquisa) {
        defaultTabelaCliente = (DefaultTableModel) tabelaCliente.getModel();
        defaultTabelaCliente.setNumRows(0);
        ClienteDaoImpl clienteDao = new ClienteDaoImpl(em);
        List<Cliente> clientes;
        if (opcao.equalsIgnoreCase("nome")) {
            clientes = clienteDao.pesquisarNome(pesquisa);
        } else {
            clientes = clienteDao.pesquisarCpf(pesquisa);
        }
        for (Cliente c : clientes) {
            defaultTabelaCliente.addRow(new Object[]{
                c.getIdCliente(),
                c.getNomeCliente(),
                c.getEmailCliente(),
                c.getTelefoneCliente(),
                c.getCelularCliente(),
                c.getCpfCliente(),
                c.getRgCliente()
            });
        }
    }

    public boolean validacaoDeCampos() throws ParseException {
        Enumeration<AbstractButton> botoes = grupoSexo.getElements();
        boolean sexo = false;
        while (botoes.hasMoreElements()) {
            AbstractButton botao = botoes.nextElement();
            if (botao.isSelected()) {
                sexo = true;
            }
        }
        if (txtNome.getText().equals("") || txtEmail.getText().equals("") || txtLogradouro.getText().equals("") || txtComplemento.getText().equals("") || txtNumero.getText().equals("") || txtbairro.getText().equals("")
                || txtCidade.getText().equals("") || txtUf.getText().equals("") || txtPais.getText().equals("") || txtTelefone.getText().equals("(  )     -    ") || txtCelular.getText().equals("(  )      -    ")
                || txtCpf.getText().equals("  .   .   /    -  ") || txtRg.getText().equals("   .   .   ") || txtCep.getText().equals("     -   ") || txtDataNascimento.getText().equals("  /  /    ")) {
            JOptionPane.showMessageDialog(null, "preencher todos os campos do cliente!!");
            return true;
        } else if (sexo == false) {
            JOptionPane.showMessageDialog(null, "Selecione o sexo!!");
            return true;
        } else {
            return false;
        }
    }
}

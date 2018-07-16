package br.com.dhyStoreInfirmatica.view;

import Dao.FabricaConexao;
import br.com.dhyStoreInfirmatica.bean.Endereco;
import br.com.dhyStoreInfirmatica.bean.Fornecedor;
import br.com.dhyStoreInfirmatica.controller.UtilFornecedor;
import br.com.dhyStoreInfirmatica.dao.EnderecoDao;
import br.com.dhyStoreInfirmatica.dao.EnderecoDaoImpl;
import br.com.dhyStoreInfirmatica.dao.FornecedorDao;
import br.com.dhyStoreInfirmatica.dao.FornecedorDaoImpl;
import java.awt.event.ActionEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Dhyego Pedroso
 */
public class TelaFornecedor extends javax.swing.JInternalFrame {

    FabricaConexao fc = new FabricaConexao();
    EntityManager em = fc.abreConexao("JavaniaStoreInformaticaPU");
    private DefaultTableModel defaultTabelaFornecedor;

    int linha;

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    
     static int openFrameCount = 0;
    static final int xOffset = 30, yOffset = 30;
    public TelaFornecedor() {
        
         super("Document #" + (++openFrameCount),
                true,
                true);
        setSize(400, 220);
        setLocation(xOffset * openFrameCount, yOffset * openFrameCount);
        initComponents();

        defaultTabelaFornecedor = (DefaultTableModel) tabelaFornecedor.getModel();
        tabelaFornecedor.setRowSorter(new TableRowSorter(defaultTabelaFornecedor));
        this.atualizarTabela();
        this.pegarDataAtual();
        this.txtIdFornecedor.setVisible(false);
    }

    public void pegarDataAtual() {
        Date data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        txtDataCadastro.setText(formatador.format(data));
    }

    public void atualizarTabela() {
        try {
            defaultTabelaFornecedor = (DefaultTableModel) tabelaFornecedor.getModel();
            defaultTabelaFornecedor.setNumRows(0);
            FornecedorDao fornecedorDao = new FornecedorDaoImpl(em);
            for (Fornecedor f : fornecedorDao.allFornecedor()) {
                defaultTabelaFornecedor.addRow(new Object[]{
                    f.getIdFornecedor(),
                    f.getNomeFornecedor(),
                    f.getEmailFornecedor(),
                    f.getTelefoneFornecedor(),
                    f.getCelularFornecedor(),
                    f.getCnpjFornecedor(),
                    f.getIeFornecedor()
                });
            }
        } catch (Exception e) {
        }
    }

    public void limparCampos() {
        txtCelular.setText("");
        txtCep.setText("");
        txtCidade.setText("");
        txtCnpj.setText("");
        txtEmail.setText("");
        txtLogradouro.setText("");
        txtNome.setText("");
        txtPais.setText("");
        txtNumero.setText("");
        txtIe.setText("");
        txtTelefone.setText("");
        txtUf.setText("");
        txtbairro.setText("");
        txtComplemento.setText("");
        txtIdFornecedor.setText("");
    }

    public void addLinha(Fornecedor fornecedor) {
        defaultTabelaFornecedor.addRow(new Object[]{fornecedor.getIdFornecedor(), fornecedor.getNomeFornecedor(), fornecedor.getEmailFornecedor(),
            fornecedor.getTelefoneFornecedor(), fornecedor.getCelularFornecedor(), fornecedor.getCnpjFornecedor(), fornecedor.getIeFornecedor()});
    }

    public void editarLinha(Fornecedor Fornecedor, int linha) {
        defaultTabelaFornecedor.setValueAt(Fornecedor.getNomeFornecedor(), linha, 1);
        defaultTabelaFornecedor.setValueAt(Fornecedor.getEmailFornecedor(), linha, 2);
        defaultTabelaFornecedor.setValueAt(Fornecedor.getTelefoneFornecedor(), linha, 3);
        defaultTabelaFornecedor.setValueAt(Fornecedor.getCelularFornecedor(), linha, 4);
        defaultTabelaFornecedor.setValueAt(Fornecedor.getCnpjFornecedor(), linha, 5);
        defaultTabelaFornecedor.setValueAt(Fornecedor.getIeFornecedor(), linha, 6);
    }

    public void pesquisarFornecedor(String opcao, String pesquisa) {
        defaultTabelaFornecedor = (DefaultTableModel) tabelaFornecedor.getModel();
        defaultTabelaFornecedor.setNumRows(0);
        FornecedorDaoImpl fornecedorDao = new FornecedorDaoImpl(em);
        List<Fornecedor> fornecedores;
        if (opcao.equalsIgnoreCase("nome")) {
            fornecedores = fornecedorDao.pesquisarNome(pesquisa);
        } else {
            fornecedores = fornecedorDao.pesquisarCpf(pesquisa);
        }
        for (Fornecedor f : fornecedores) {
            defaultTabelaFornecedor.addRow(new Object[]{
                f.getIdFornecedor(),
                f.getNomeFornecedor(),
                f.getEmailFornecedor(),
                f.getTelefoneFornecedor(),
                f.getCelularFornecedor(),
                f.getCnpjFornecedor(),
                f.getIeFornecedor()
            });
        }
    }

    public boolean validacaoDeCampos() {
        return txtNome.getText().equals("") || txtEmail.getText().equals("") || txtLogradouro.getText().equals("") || txtComplemento.getText().equals("") || txtNumero.getText().equals("") || txtbairro.getText().equals("")
                || txtCidade.getText().equals("") || txtUf.getText().equals("") || txtPais.getText().equals("") || txtTelefone.getText().equals("(  )     -    ") || txtCelular.getText().equals("(  )      -    ")
                || txtCnpj.getText().equals("  .   .   /    -  ") || txtIe.getText().equals("   .   .   ") || txtCep.getText().equals("     -   ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pesquisaFornecedor = new javax.swing.ButtonGroup();
        painelPrincipalFornecedor = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFornecedor = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnMaisInfo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        painelPesquisa = new javax.swing.JPanel();
        rbNome = new javax.swing.JRadioButton();
        rbCnpj = new javax.swing.JRadioButton();
        txtPesquisar = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        painelFornecedor = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        lblRg = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDataCadastro = new javax.swing.JFormattedTextField();
        txtCnpj = new javax.swing.JFormattedTextField();
        txtCelular = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtIdFornecedor = new javax.swing.JTextField();
        txtIe = new javax.swing.JFormattedTextField();
        btnSalvar = new javax.swing.JButton();
        btnSair1 = new javax.swing.JButton();
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

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Fornecedor");
        setToolTipText("");

        tabelaFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Fornecedor", "E-Mail", "Telefone", "Celular", "CNPJ", "IE"
            }
        ));
        jScrollPane1.setViewportView(tabelaFornecedor);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/dhyStoreInfirmatica/Icos/usuariosair.png"))); // NOI18N
        btnSair.setToolTipText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/dhyStoreInfirmatica/Icos/usuarioExcluir.png"))); // NOI18N
        btnExcluir.setToolTipText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnMaisInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/dhyStoreInfirmatica/Icos/usuarioMaisInfo.png"))); // NOI18N
        btnMaisInfo.setToolTipText("Mais Informações");
        btnMaisInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisInfoActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/dhyStoreInfirmatica/Icos/usuarioEditar.png"))); // NOI18N
        btnEditar.setToolTipText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/dhyStoreInfirmatica/Icos/usuarioAdd.png"))); // NOI18N
        btnNovo.setToolTipText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMaisInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSair)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMaisInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        painelPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        pesquisaFornecedor.add(rbNome);
        rbNome.setText("Nome");
        rbNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbNomeMouseClicked(evt);
            }
        });

        pesquisaFornecedor.add(rbCnpj);
        rbCnpj.setText("Cnpj");
        rbCnpj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbCnpjrbNomeMouseClicked(evt);
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
                        .addComponent(rbCnpj)
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
                    .addComponent(rbCnpj)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1084, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(painelPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        painelPrincipalFornecedor.addTab("Tabela Forncedores", jPanel1);

        painelFornecedor.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        painelFornecedor.setMinimumSize(new java.awt.Dimension(410, 450));
        painelFornecedor.setPreferredSize(new java.awt.Dimension(420, 457));

        jLabel1.setText("Nome:");

        jLabel3.setText("E-Mail:");

        jLabel4.setText("Telefone:");

        jLabel5.setText("Celular:");

        lblCpf.setText("CNPJ:");

        lblRg.setText("IE:");

        jLabel8.setText("Data Cadastro:");

        try {
            txtDataCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtIe.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout painelFornecedorLayout = new javax.swing.GroupLayout(painelFornecedor);
        painelFornecedor.setLayout(painelFornecedorLayout);
        painelFornecedorLayout.setHorizontalGroup(
            painelFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFornecedorLayout.createSequentialGroup()
                .addGroup(painelFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFornecedorLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome))
                    .addGroup(painelFornecedorLayout.createSequentialGroup()
                        .addGroup(painelFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelFornecedorLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel4))
                            .addGroup(painelFornecedorLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel5))
                            .addGroup(painelFornecedorLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(painelFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(painelFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)
                                        .addComponent(lblCpf)
                                        .addComponent(lblRg, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtIe)
                            .addComponent(txtCnpj, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(txtCelular, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDataCadastro))
                        .addGap(0, 146, Short.MAX_VALUE))
                    .addGroup(painelFornecedorLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail)))
                .addGap(6, 6, 6))
        );
        painelFornecedorLayout.setVerticalGroup(
            painelFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFornecedorLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(painelFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFornecedorLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1))
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFornecedorLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3))
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painelFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFornecedorLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5))
                    .addGroup(painelFornecedorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFornecedorLayout.createSequentialGroup()
                        .addComponent(lblCpf)
                        .addGap(16, 16, 16)
                        .addGroup(painelFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRg)
                            .addComponent(txtIe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addGroup(painelFornecedorLayout.createSequentialGroup()
                        .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(txtDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addComponent(txtIdFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSair1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(painelFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(394, 394, 394))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSair1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(145, Short.MAX_VALUE))
        );

        painelPrincipalFornecedor.addTab("Novo Fornecedor", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipalFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 1098, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(painelPrincipalFornecedor)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
        tabelaFornecedor.clearSelection();
        pesquisaFornecedor.clearSelection();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tabelaFornecedor.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um fornecedor antes!!");
        } else {
            Fornecedor fornecedor;
            FornecedorDao fornecedorDao = new FornecedorDaoImpl(em);
            UtilFornecedor vetor = new UtilFornecedor();
            if (tabelaFornecedor.getSelectedRow() >= 0) {
                if (JOptionPane.showConfirmDialog(null, "Deseja Excluir o Fornecedor?", "Confirmar a Exclusão", JOptionPane.YES_NO_OPTION) == 0) {
                    int[] indices = vetor.ordenarVetor(tabelaFornecedor.getSelectedRows());
                    for (int linha : indices) {
                        int id = (int) this.tabelaFornecedor.getValueAt(linha, 0);
                        this.defaultTabelaFornecedor.removeRow(linha);
                        fornecedor = (Fornecedor) fornecedorDao.pesquisarPorId(Fornecedor.class, id);
                        fornecedorDao.excluir(fornecedor);
                    }
                }
            }
            tabelaFornecedor.clearSelection();
            tabelaFornecedor.clearSelection();
            pesquisaFornecedor.clearSelection();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnMaisInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaisInfoActionPerformed
        if (tabelaFornecedor.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um fornecedor antes!!");
        } else {
            FornecedorDao fornecedorDao = new FornecedorDaoImpl(em);

            if (tabelaFornecedor.getSelectedRow() != -1) {
                int id = (int) this.tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(), 0);
                Fornecedor fornecedor = (Fornecedor) fornecedorDao.pesquisarPorId(Fornecedor.class, id);

                DateFormat dataCadastro = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

                JOptionPane.showMessageDialog(this, "Nome: " + fornecedor.getNomeFornecedor()
                        + "\nE-Mail: " + fornecedor.getEmailFornecedor()
                        + "\nTelefone: " + fornecedor.getTelefoneFornecedor()
                        + "\nCelular: " + fornecedor.getCelularFornecedor()
                        + "\nCNPJ: " + fornecedor.getCnpjFornecedor()
                        + "\nIE: " + fornecedor.getIeFornecedor()
                        + "\nData de Cadastro: " + dataCadastro.format(fornecedor.getDataCadastro())
                        + "\nLogradouro: " + fornecedor.getEndereco().getLogradouro()
                        + "\nComplemento: " + fornecedor.getEndereco().getComplemento()
                        + "\nNúmero: " + fornecedor.getEndereco().getNumero()
                        + "\nBairro: " + fornecedor.getEndereco().getBairro()
                        + "\nCidade: " + fornecedor.getEndereco().getCidade()
                        + "\nUF: " + fornecedor.getEndereco().getUf()
                        + "\nPaís: " + fornecedor.getEndereco().getPais()
                        + "\nCEP: " + fornecedor.getEndereco().getCep(), "Informações do Fornecedor", INFORMATION_MESSAGE);
            }
            tabelaFornecedor.clearSelection();
            tabelaFornecedor.clearSelection();
            pesquisaFornecedor.clearSelection();
        }
    }//GEN-LAST:event_btnMaisInfoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tabelaFornecedor.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um fornecedor antes!!");
        } else {
            FornecedorDao fornecedorDao = new FornecedorDaoImpl(em);
            if (tabelaFornecedor.getSelectedRow() != -1) {
                painelPrincipalFornecedor.setSelectedIndex(1);
                this.setLinha(tabelaFornecedor.getSelectedRow());
                int id = (int) this.tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(), 0);
                Fornecedor fornecedor = (Fornecedor) fornecedorDao.pesquisarPorId(Fornecedor.class, id);

                txtIdFornecedor.setText(String.valueOf(fornecedor.getIdFornecedor()));
                txtNome.setText(fornecedor.getNomeFornecedor());
                txtEmail.setText(fornecedor.getEmailFornecedor());
                txtTelefone.setText(fornecedor.getTelefoneFornecedor());
                txtCelular.setText(fornecedor.getCelularFornecedor());
                txtCnpj.setText(fornecedor.getCnpjFornecedor());
                txtIe.setText(fornecedor.getIeFornecedor());

                DateFormat dataCadastro = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

                txtDataCadastro.setText(dataCadastro.format(fornecedor.getDataCadastro().getTime()));
                txtLogradouro.setText(fornecedor.getEndereco().getLogradouro());
                txtComplemento.setText(fornecedor.getEndereco().getComplemento());
                txtNumero.setText(fornecedor.getEndereco().getNumero());
                txtbairro.setText(fornecedor.getEndereco().getBairro());
                txtCidade.setText(fornecedor.getEndereco().getCidade());
                txtUf.setText(fornecedor.getEndereco().getUf());
                txtPais.setText(fornecedor.getEndereco().getPais());
                txtCep.setText(fornecedor.getEndereco().getCep());
            }
            tabelaFornecedor.clearSelection();
            tabelaFornecedor.clearSelection();
            pesquisaFornecedor.clearSelection();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        painelPrincipalFornecedor.setSelectedIndex(1);
        this.pegarDataAtual();
        tabelaFornecedor.clearSelection();
        pesquisaFornecedor.clearSelection();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void rbNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbNomeMouseClicked
        if (rbNome.isSelected()) {
            txtPesquisar.setEnabled(true);
        } else if (rbCnpj.isSelected()) {
            txtPesquisar.setEnabled(true);
        } else {
            txtPesquisar.setEnabled(false);
        }
    }//GEN-LAST:event_rbNomeMouseClicked

    private void rbCnpjrbNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbCnpjrbNomeMouseClicked
        if (rbNome.isSelected()) {
            txtPesquisar.setEnabled(true);
        } else if (rbCnpj.isSelected()) {
            txtPesquisar.setEnabled(true);
        } else {
            txtPesquisar.setEnabled(false);
        }
    }//GEN-LAST:event_rbCnpjrbNomeMouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        if (validacaoDeCampos()) {
            JOptionPane.showMessageDialog(this, "Preenceher todos os campos antes de salvar o fornecedor!!");
        } else {
            painelPrincipalFornecedor.setSelectedIndex(0);
            EnderecoDao enderecoDao = new EnderecoDaoImpl(em);
            FornecedorDao fornecedorDao = new FornecedorDaoImpl(em);
            try {
                if (txtIdFornecedor.getText().equalsIgnoreCase("")) {
                    Endereco endereco;
                    Fornecedor fornecedor;
                    endereco = new Endereco(txtLogradouro.getText(), txtComplemento.getText(), txtNumero.getText(), txtbairro.getText(), txtCidade.getText(), txtUf.getText(), txtPais.getText(), txtCep.getText());
                    fornecedor = new Fornecedor(txtNome.getText(), txtEmail.getText(), txtTelefone.getText(), txtCelular.getText(), txtCnpj.getText(), txtIe.getText(), new Date(), endereco);

                    enderecoDao.salvar(endereco);
                    fornecedorDao.salvar(fornecedor);
                    this.addLinha(fornecedor);
                    this.limparCampos();
                    tabelaFornecedor.clearSelection();
                    pesquisaFornecedor.clearSelection();
                } else {
                    Endereco endereco;
                    Fornecedor fornecedor;
                    fornecedor = (Fornecedor) fornecedorDao.pesquisarPorId(Fornecedor.class, Integer.parseInt(txtIdFornecedor.getText()));
                    endereco = (Endereco) enderecoDao.pesquisarPorId(Endereco.class, fornecedor.getEndereco().getIdEndereco());

                    fornecedor.setNomeFornecedor(txtNome.getText());
                    fornecedor.setEmailFornecedor(txtEmail.getText());
                    fornecedor.setTelefoneFornecedor(txtTelefone.getText());
                    fornecedor.setCelularFornecedor(txtCelular.getText());
                    fornecedor.setCnpjFornecedor(txtCnpj.getText());
                    fornecedor.setIeFornecedor(txtIe.getText());
                    fornecedor.setDataCadastro(new Date());

                    endereco.setLogradouro(txtLogradouro.getText());
                    endereco.setComplemento(txtComplemento.getText());
                    endereco.setNumero(txtNumero.getText());
                    endereco.setBairro(txtbairro.getText());
                    endereco.setCidade(txtCidade.getText());
                    endereco.setUf(txtUf.getText());
                    endereco.setPais(txtPais.getText());
                    endereco.setCep(txtCep.getText());

                    enderecoDao.alterar(endereco);
                    fornecedor.setEndereco(endereco);
                    fornecedorDao.alterar(fornecedor);
                    this.editarLinha(fornecedor, this.getLinha());
                    this.limparCampos();
                    tabelaFornecedor.clearSelection();
                    pesquisaFornecedor.clearSelection();
                }
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSair1ActionPerformed
        painelPrincipalFornecedor.setSelectedIndex(0);
        limparCampos();
        tabelaFornecedor.clearSelection();
        pesquisaFornecedor.clearSelection();
    }//GEN-LAST:event_btnSair1ActionPerformed

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased
        if (!rbCnpj.isSelected() && !rbNome.isSelected()) {
            JOptionPane.showMessageDialog(this, "Seleciome uma opcçao ao lado pra fazer a pesquisa!!");
            txtPesquisar.setText("");
        } else {
            if (rbCnpj.isSelected()) {
                pesquisarFornecedor("cnpj", txtPesquisar.getText());
            } else if (rbNome.isSelected()) {
                pesquisarFornecedor("nome", txtPesquisar.getText());
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblRg;
    private javax.swing.JPanel painelEndereco;
    private javax.swing.JPanel painelFornecedor;
    private javax.swing.JPanel painelPesquisa;
    private javax.swing.JTabbedPane painelPrincipalFornecedor;
    private javax.swing.ButtonGroup pesquisaFornecedor;
    private javax.swing.JRadioButton rbCnpj;
    private javax.swing.JRadioButton rbNome;
    private javax.swing.JTable tabelaFornecedor;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtCnpj;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtDataCadastro;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIdFornecedor;
    private javax.swing.JFormattedTextField txtIe;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JTextField txtUf;
    private javax.swing.JTextField txtbairro;
    // End of variables declaration//GEN-END:variables

}

package br.com.dhyStoreInfirmatica.view;

import Dao.FabricaConexao;
import br.com.dhyStoreInfirmatica.bean.Fornecedor;
import br.com.dhyStoreInfirmatica.bean.Marca;
import br.com.dhyStoreInfirmatica.bean.Produto;
import br.com.dhyStoreInfirmatica.controller.UtilProduto;
import br.com.dhyStoreInfirmatica.dao.FornecedorDao;
import br.com.dhyStoreInfirmatica.dao.FornecedorDaoImpl;
import br.com.dhyStoreInfirmatica.dao.MarcaDao;
import br.com.dhyStoreInfirmatica.dao.MarcaDaoImpl;
import br.com.dhyStoreInfirmatica.dao.ProdutoDao;
import br.com.dhyStoreInfirmatica.dao.ProdutoDaoImpl;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Dhyego Pedroso
 */
public class TelaProduto extends javax.swing.JInternalFrame {

    FabricaConexao fc = new FabricaConexao();
    EntityManager em = fc.abreConexao("JavaniaStoreInformaticaPU");
    private DefaultTableModel defaultTabelaProduto;

    int linha;

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public TelaProduto() {
        initComponents();
        defaultTabelaProduto = (DefaultTableModel) tabelaProduto.getModel();
        tabelaProduto.setRowSorter(new TableRowSorter(defaultTabelaProduto));
        this.atualizarTabela();
        this.popularBoxFornecedor();
        this.popularBoxMarca();
        this.txtIdProduto.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipalProduto = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        painelPesquisa = new javax.swing.JPanel();
        txtPesquisar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        painelProduto = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        txtQtd = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        boxFornecedor = new javax.swing.JComboBox<>();
        txtIdProduto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        boxMarca = new javax.swing.JComboBox<>();
        btnNovaMarca = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnSair1 = new javax.swing.JButton();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Produto");

        tabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Produto", "Descrição", "Marca", "Quantidade", "Valor", "Fornecedor"
            }
        ));
        jScrollPane2.setViewportView(tabelaProduto);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/dhyStoreInfirmatica/Icos/produtoSair.png"))); // NOI18N
        btnSair.setToolTipText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairbtnSairActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/dhyStoreInfirmatica/Icos/produtoExcluir.png"))); // NOI18N
        btnExcluir.setToolTipText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirbtnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/dhyStoreInfirmatica/Icos/produtoEditarpng.png"))); // NOI18N
        btnEditar.setToolTipText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarbtnEditarActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/dhyStoreInfirmatica/Icos/produtoAdd.png"))); // NOI18N
        btnNovo.setToolTipText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovobtnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSair)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        painelPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyReleased(evt);
            }
        });

        jLabel6.setText("Produto:");

        javax.swing.GroupLayout painelPesquisaLayout = new javax.swing.GroupLayout(painelPesquisa);
        painelPesquisa.setLayout(painelPesquisaLayout);
        painelPesquisaLayout.setHorizontalGroup(
            painelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelPesquisaLayout.setVerticalGroup(
            painelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(painelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1078, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(painelPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        painelPrincipalProduto.addTab("Tabela Produto", jPanel4);

        jPanel6.setPreferredSize(new java.awt.Dimension(1266, 688));

        painelProduto.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        painelProduto.setMinimumSize(new java.awt.Dimension(410, 450));
        painelProduto.setPreferredSize(new java.awt.Dimension(420, 457));

        jLabel1.setText("Nome:");

        jLabel3.setText("Descrição:");

        jLabel4.setText("Qtd Produto:");

        jLabel5.setText("Valor:");

        jLabel9.setText("Fornecedor:");

        boxFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        jLabel2.setText("Marca:");

        boxMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        btnNovaMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/dhyStoreInfirmatica/Icos/produtoAdd.png"))); // NOI18N
        btnNovaMarca.setToolTipText("Nova Marca");
        btnNovaMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaMarcabtnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelProdutoLayout = new javax.swing.GroupLayout(painelProduto);
        painelProduto.setLayout(painelProdutoLayout);
        painelProdutoLayout.setHorizontalGroup(
            painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelProdutoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDesc)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelProdutoLayout.createSequentialGroup()
                        .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boxMarca, 0, 169, Short.MAX_VALUE)
                            .addComponent(txtQtd, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtValor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(boxFornecedor, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnNovaMarca))
                    .addComponent(txtNome))
                .addGap(65, 65, 65))
            .addGroup(painelProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelProdutoLayout.setVerticalGroup(
            painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelProdutoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(12, 12, 12)
                .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelProdutoLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel4))
                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovaMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelProdutoLayout.createSequentialGroup()
                        .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(boxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelProdutoLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel5))
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/dhyStoreInfirmatica/Icos/produtoAceitar.png"))); // NOI18N
        btnSalvar.setToolTipText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnSair1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/dhyStoreInfirmatica/Icos/produtoSair.png"))); // NOI18N
        btnSair1.setToolTipText("Sair");
        btnSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSair1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSair1))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(painelProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(664, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(185, 185, 185))
        );

        painelPrincipalProduto.addTab("Novo Produto", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(painelPrincipalProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 1092, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipalProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 504, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairbtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairbtnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairbtnSairActionPerformed

    private void btnExcluirbtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirbtnExcluirActionPerformed
        if (tabelaProduto.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um produto antes!!");
        } else {
            Produto produto;
            ProdutoDao produtoDao = new ProdutoDaoImpl(em);
            UtilProduto vetor = new UtilProduto();
            if (tabelaProduto.getSelectedRow() >= 0) {
                if (JOptionPane.showConfirmDialog(null, "Deseja Excluir o produto?", "Confirmar a Exclusão", JOptionPane.YES_NO_OPTION) == 0) {
                    int[] indices = vetor.ordenarVetor(tabelaProduto.getSelectedRows());
                    for (int linha : indices) {
                        int id = (int) this.tabelaProduto.getValueAt(linha, 0);
                        this.defaultTabelaProduto.removeRow(linha);
                        produto = (Produto) produtoDao.pesquisarPorId(Produto.class, id);
                        produtoDao.excluir(produto);
                    }
                }
            }
            tabelaProduto.clearSelection();
            tabelaProduto.clearSelection();
        }
    }//GEN-LAST:event_btnExcluirbtnExcluirActionPerformed

    private void btnEditarbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarbtnEditarActionPerformed
        if (tabelaProduto.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um produto antes!!");
        } else {
            if (tabelaProduto.getSelectedRow() != -1) {
                ProdutoDao produtoDao = new ProdutoDaoImpl(em);

                this.setLinha(tabelaProduto.getSelectedRow());
                painelPrincipalProduto.setSelectedIndex(1);
                int id = (int) this.tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(), 0);
                Produto produto = (Produto) produtoDao.pesquisarPorId(Produto.class, id);

                txtIdProduto.setText(String.valueOf(produto.getIdProduto()));
                txtNome.setText(produto.getNomeProduto());
                txtDesc.setText(produto.getDescProduto());
                txtQtd.setText(String.valueOf(produto.getQtdProduto()));
                txtValor.setText(String.valueOf(produto.getValorProduto()));
                boxMarca.setSelectedItem(produto.getMarca());
                boxFornecedor.setSelectedItem(produto.getFornecedor().getNomeFornecedor());
            }
            tabelaProduto.clearSelection();
            tabelaProduto.clearSelection();
        }
    }//GEN-LAST:event_btnEditarbtnEditarActionPerformed

    private void btnNovobtnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovobtnNovoActionPerformed
        painelPrincipalProduto.setSelectedIndex(1);
        tabelaProduto.clearSelection();
    }//GEN-LAST:event_btnNovobtnNovoActionPerformed

    private void btnNovaMarcabtnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaMarcabtnNovoActionPerformed
        TelaMarca telaMarca = new TelaMarca();
        TelaPrincipal.painelTelaPrincipal.add(telaMarca);
        telaMarca.setVisible(true);
        
           try {
                telaMarca.setSelected(true);
                telaMarca.setMaximizable(true);
                telaMarca.setMaximum(true);
            } catch (java.beans.PropertyVetoException e) {

            }
        
        this.dispose();
    }//GEN-LAST:event_btnNovaMarcabtnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txtNome.getText().equals("") || txtDesc.getText().equals("") || txtQtd.getText().equals("") || txtValor.getText().equals("")
                || boxFornecedor.getSelectedItem().equals("Selecione") || boxMarca.getSelectedItem().equals("Selecione")) {
            JOptionPane.showMessageDialog(this, "Preencher todos os campos antes de salvar!!");
        } else {
            painelPrincipalProduto.setSelectedIndex(0);
            Produto produto = new Produto();
            ProdutoDao produtoDao = new ProdutoDaoImpl(em);
            Fornecedor fornecedor = new Fornecedor();
            FornecedorDao fornecedorDao = new FornecedorDaoImpl(em);
            Marca marca = new Marca();
            try {
                if (txtIdProduto.getText().equalsIgnoreCase("")) {
                    produto.setNomeProduto(txtNome.getText());
                    produto.setDescProduto(txtDesc.getText());
                    produto.setQtdProduto(Integer.parseInt(txtQtd.getText()));
                    produto.setValorProduto(Double.parseDouble(txtValor.getText()));

                    marca = (Marca) boxMarca.getSelectedItem();
                    produto.setMarca(marca);

                    fornecedor = (Fornecedor) boxFornecedor.getSelectedItem();
                    produto.setFornecedor(fornecedor);

                    produtoDao.salvar(produto);
                    this.limparCampos();
                    this.addLinha(produto);
                    tabelaProduto.clearSelection();
                } else {
                    produto = (Produto) produtoDao.pesquisarPorId(Produto.class, Integer.parseInt(txtIdProduto.getText()));
                    fornecedor = (Fornecedor) fornecedorDao.pesquisarPorId(Fornecedor.class, produto.getFornecedor().getIdFornecedor());

                    produto.setNomeProduto(txtNome.getText());
                    produto.setDescProduto(txtDesc.getText());
                    produto.setQtdProduto(Integer.parseInt(txtQtd.getText()));
                    produto.setValorProduto(Double.parseDouble(txtValor.getText()));

                    marca = (Marca) boxMarca.getSelectedItem();
                    produto.setMarca(marca);

                    fornecedor = (Fornecedor) boxFornecedor.getSelectedItem();
                    produto.setFornecedor(fornecedor);

                    produtoDao.alterar(produto);
                    this.editarLinha(produto, this.getLinha());
                }
            } catch (Exception e) {
            }
            tabelaProduto.clearSelection();
            tabelaProduto.clearSelection();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSair1ActionPerformed
        painelPrincipalProduto.setSelectedIndex(0);
    }//GEN-LAST:event_btnSair1ActionPerformed

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased
        pesquisarProduto(txtPesquisar.getText());
    }//GEN-LAST:event_txtPesquisarKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Object> boxFornecedor;
    private javax.swing.JComboBox<Object> boxMarca;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovaMarca;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSair1;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel painelPesquisa;
    private javax.swing.JTabbedPane painelPrincipalProduto;
    private javax.swing.JPanel painelProduto;
    private javax.swing.JTable tabelaProduto;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtIdProduto;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtQtd;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
public void atualizarTabela() {
        try {
            defaultTabelaProduto = (DefaultTableModel) tabelaProduto.getModel();
            defaultTabelaProduto.setNumRows(0);
            ProdutoDao produtoDao = new ProdutoDaoImpl(em);
            for (Produto p : produtoDao.allProduto()) {
                defaultTabelaProduto.addRow(new Object[]{
                    p.getIdProduto(),
                    p.getNomeProduto(),
                    p.getDescProduto(),
                    p.getMarca().getNomeMarca(),
                    p.getQtdProduto(),
                    p.getValorProduto(),
                    p.getFornecedor().getNomeFornecedor()
                });
            }
        } catch (Exception e) {
        }
    }

    public void limparCampos() {
        txtNome.setText("");
        txtDesc.setText("");
        txtQtd.setText("");
        txtValor.setText("");
        boxFornecedor.setSelectedItem("Selecione");
        txtIdProduto.setText("");
    }

    public void addLinha(Produto produto) {
        defaultTabelaProduto.addRow(new Object[]{produto.getIdProduto(), produto.getNomeProduto(), produto.getDescProduto(), produto.getMarca().getNomeMarca(),
            produto.getQtdProduto(), produto.getValorProduto(), produto.getFornecedor().getNomeFornecedor()});
    }

    public void editarLinha(Produto produto, int linha) {
        defaultTabelaProduto.setValueAt(produto.getNomeProduto(), linha, 1);
        defaultTabelaProduto.setValueAt(produto.getDescProduto(), linha, 2);
        defaultTabelaProduto.setValueAt(produto.getMarca().getNomeMarca(), linha, 3);
        defaultTabelaProduto.setValueAt(produto.getQtdProduto(), linha, 4);
        defaultTabelaProduto.setValueAt(produto.getValorProduto(), linha, 5);
        defaultTabelaProduto.setValueAt(produto.getFornecedor().getNomeFornecedor(), linha, 6);
    }

    public void popularBoxFornecedor() {
        FornecedorDao fornecedorDao = new FornecedorDaoImpl(em);
        for (Fornecedor c : fornecedorDao.allFornecedor()) {
            boxFornecedor.addItem(c);
        }
    }

    public void popularBoxMarca() {
        MarcaDao marcaDao = new MarcaDaoImpl(em);
        for (Marca m : marcaDao.allMarca()) {
            boxMarca.addItem(m.getNomeMarca());
        }
    }

    public void pesquisarProduto(String pesquisa) {
        defaultTabelaProduto = (DefaultTableModel) tabelaProduto.getModel();
        defaultTabelaProduto.setNumRows(0);
        ProdutoDao produtoDao = new ProdutoDaoImpl(em);
        List<Produto> produtos;

        produtos = produtoDao.pesquisarProduto(pesquisa);

        for (Produto p : produtos) {
            defaultTabelaProduto.addRow(new Object[]{
                p.getIdProduto(),
                p.getNomeProduto(),
                p.getDescProduto(),
                p.getQtdProduto(),
                p.getValorProduto(),
                p.getFornecedor().getNomeFornecedor()
            });
        }
    }

}

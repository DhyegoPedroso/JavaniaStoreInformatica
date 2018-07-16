package br.com.dhyStoreInfirmatica.view;

import Dao.FabricaConexao;
import br.com.dhyStoreInfirmatica.bean.Cliente;
import br.com.dhyStoreInfirmatica.dao.ClienteDaoImpl;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Dhyego Pedroso
 */
public class TelaPesquisarClientes extends javax.swing.JInternalFrame {

    TelaAreaDeVenda telaAreaDeVenda;
    private DefaultTableModel defaultTabelaCliente;
    FabricaConexao fc = new FabricaConexao();
    EntityManager em = fc.abreConexao("JavaniaStoreInformaticaPU");

    public TelaPesquisarClientes() {
        initComponents();
        defaultTabelaCliente = (DefaultTableModel) tabelaCliente.getModel();
        tabelaCliente.setRowSorter(new TableRowSorter(defaultTabelaCliente));
    }

    TelaPesquisarClientes(TelaAreaDeVenda telaAreaDeVenda) {
        initComponents();
        this.setVisible(true);
        this.telaAreaDeVenda = telaAreaDeVenda;
        DefaultTableModel modeloAuto = (DefaultTableModel) tabelaCliente.getModel();
        tabelaCliente.setRowSorter(new TableRowSorter(modeloAuto));
    }

    public void pesquisarCliente(String pesquisa) {
        defaultTabelaCliente = (DefaultTableModel) tabelaCliente.getModel();
        defaultTabelaCliente.setNumRows(0);
        ClienteDaoImpl clienteDao = new ClienteDaoImpl(em);
        List<Cliente> clientes;

        clientes = clienteDao.pesquisarNome(pesquisa);

        for (Cliente c : clientes) {
            defaultTabelaCliente.addRow(new Object[]{
                c.getIdCliente(),
                c.getNomeCliente(),
                c.getCpfCliente(),
                c.getRgCliente()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnAceitar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Pesquisar Cliente");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Pesquisar Cliente:");

        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "CPF", "RG"
            }
        ));
        jScrollPane1.setViewportView(tabelaCliente);

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/dhyStoreInfirmatica/Icos/usuarioAdd.png"))); // NOI18N
        btnAdd.setToolTipText("Novo");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnAceitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/dhyStoreInfirmatica/Icos/usuarioEntrar.png"))); // NOI18N
        btnAceitar.setToolTipText("Ok");
        btnAceitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceitarActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/dhyStoreInfirmatica/Icos/usuariosair.png"))); // NOI18N
        btnSair.setToolTipText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceitar)
                .addGap(18, 18, 18)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSair)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceitar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)))
                .addGap(0, 336, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceitarActionPerformed
        if (tabelaCliente.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecion um Cliente antes!");
        } else {
            try {

                telaAreaDeVenda.setTxtIdCliente(this.tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 0).toString());
                telaAreaDeVenda.setTxtNome(this.tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 1).toString());
                telaAreaDeVenda.setTxtCpf(this.tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 2).toString());
                telaAreaDeVenda.setTxtRg(this.tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 3).toString());

                telaAreaDeVenda.setSelected(true);
                telaAreaDeVenda.setMaximizable(true);
                telaAreaDeVenda.setMaximum(true);

//                TelaPrincipal.painelTelaPrincipal.add(telaAreaDeVenda);
//                telaAreaDeVenda.setVisible(true);
            } catch (java.beans.PropertyVetoException e) {

            }
            this.dispose();

        }
    }//GEN-LAST:event_btnAceitarActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        TelaCliente telaCliente = new TelaCliente();
        TelaPrincipal.painelTelaPrincipal.add(telaCliente);
        telaCliente.setVisible(true);

        try {
            telaCliente.setSelected(true);
            telaCliente.setMaximizable(true);
            telaCliente.setMaximum(true);
        } catch (java.beans.PropertyVetoException e) {

        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
        TelaAreaDeVenda telaAreaDeVenda = new TelaAreaDeVenda();
        TelaPrincipal.painelTelaPrincipal.add(telaAreaDeVenda);
        telaAreaDeVenda.setVisible(true);

        try {
            telaAreaDeVenda.setSelected(true);
            telaAreaDeVenda.setMaximizable(true);
            telaAreaDeVenda.setMaximum(true);
        } catch (java.beans.PropertyVetoException e) {

        }
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased
        this.pesquisarCliente(txtPesquisar.getText());
    }//GEN-LAST:event_txtPesquisarKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceitar;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaCliente;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}

package br.com.dhyStoreInfirmatica.view;

import Dao.FabricaConexao;
import br.com.dhyStoreInfirmatica.bean.Marca;
import br.com.dhyStoreInfirmatica.dao.MarcaDao;
import br.com.dhyStoreInfirmatica.dao.MarcaDaoImpl;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Dhyego Pedroso
 */
public class TelaMarca extends javax.swing.JInternalFrame {

    FabricaConexao fc = new FabricaConexao();
    EntityManager em = fc.abreConexao("JavaniaStoreInformaticaPU");

    public TelaMarca() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setToolTipText("Marca");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Marca:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/dhyStoreInfirmatica/Icos/produtoAdd.png"))); // NOI18N
        btnNovo.setToolTipText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovobtnNovoActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/dhyStoreInfirmatica/Icos/produtoSair.png"))); // NOI18N
        btnSair.setToolTipText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairbtnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSair)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovobtnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovobtnNovoActionPerformed
        Marca marca = new Marca();
        MarcaDao marcaDao = new MarcaDaoImpl(em);

        if (txtMarca.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preenceher campo nome marca.");
        } else {
            marca.setNomeMarca(txtMarca.getText());
            marcaDao.salvar(marca);
            this.dispose();

            TelaProduto telaProduto = new TelaProduto();
            TelaPrincipal.painelTelaPrincipal.add(telaProduto);
            telaProduto.setVisible(true);

            try {
                telaProduto.setSelected(true);
                telaProduto.setMaximizable(true);
                telaProduto.setMaximum(true);
            } catch (java.beans.PropertyVetoException e) {

            }
        }
    }//GEN-LAST:event_btnNovobtnNovoActionPerformed

    private void btnSairbtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairbtnSairActionPerformed
        this.dispose();
        TelaProduto telaProduto = new TelaProduto();
        TelaPrincipal.painelTelaPrincipal.add(telaProduto);
        telaProduto.setVisible(true);

        try {
            telaProduto.setSelected(true);
            telaProduto.setMaximizable(true);
            telaProduto.setMaximum(true);
        } catch (java.beans.PropertyVetoException e) {

        }
    }//GEN-LAST:event_btnSairbtnSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtMarca;
    // End of variables declaration//GEN-END:variables
}
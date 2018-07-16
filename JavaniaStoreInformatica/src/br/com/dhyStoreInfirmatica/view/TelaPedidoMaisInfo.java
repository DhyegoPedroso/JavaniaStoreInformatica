package br.com.dhyStoreInfirmatica.view;

import Dao.FabricaConexao;
import br.com.dhyStoreInfirmatica.bean.ItemPedido;
import br.com.dhyStoreInfirmatica.bean.Pedido;
import br.com.dhyStoreInfirmatica.dao.ItemPedidoDao;
import br.com.dhyStoreInfirmatica.dao.ItemPedidoDaoImpl;
import br.com.dhyStoreInfirmatica.dao.PedidoDao;
import br.com.dhyStoreInfirmatica.dao.PedidoDaoImpl;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Dhyego Pedroso
 */
public class TelaPedidoMaisInfo extends javax.swing.JInternalFrame {

    FabricaConexao fc = new FabricaConexao();
    EntityManager em = fc.abreConexao("JavaniaStoreInformaticaPU");
    DefaultTableModel defaultTabelaPedidoMaisInfo;

    TelaPedidos telaPedidos;

    public TelaPedidoMaisInfo() {
        initComponents();
        this.setVisible(true);

        defaultTabelaPedidoMaisInfo = (DefaultTableModel) tabelaPedidoMaisInfo.getModel();
        tabelaPedidoMaisInfo.setRowSorter(new TableRowSorter(defaultTabelaPedidoMaisInfo));
    }

    public TelaPedidoMaisInfo(int id) {
        initComponents();
        this.setVisible(true);
        this.atualizarTabela(id);

        defaultTabelaPedidoMaisInfo = (DefaultTableModel) tabelaPedidoMaisInfo.getModel();
        tabelaPedidoMaisInfo.setRowSorter(new TableRowSorter(defaultTabelaPedidoMaisInfo));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPedidoMaisInfo = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Mais Informações do Pedido");
        setToolTipText("");

        tabelaPedidoMaisInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº do Pedido", "Produto", "Marca", "Quantidade", "Valor Unt.", "Valor Total", "Data da Compra"
            }
        ));
        jScrollPane1.setViewportView(tabelaPedidoMaisInfo);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/dhyStoreInfirmatica/Icos/pedidoSair.png"))); // NOI18N
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
                .addComponent(btnSair)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1085, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
        TelaPedidos telaPedidos = new TelaPedidos();
        TelaPrincipal.painelTelaPrincipal.add(telaPedidos);
        telaPedidos.setVisible(true);

        try {
            telaPedidos.setSelected(true);
            telaPedidos.setMaximizable(true);
            telaPedidos.setMaximum(true);
        } catch (java.beans.PropertyVetoException e) {

        }


    }//GEN-LAST:event_btnSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaPedidoMaisInfo;
    // End of variables declaration//GEN-END:variables

    private void atualizarTabela(int id) {
        try {
            defaultTabelaPedidoMaisInfo = (DefaultTableModel) tabelaPedidoMaisInfo.getModel();
            defaultTabelaPedidoMaisInfo.setNumRows(0);
            ItemPedidoDao itemPedidoDao = new ItemPedidoDaoImpl(em);

            for (ItemPedido i : itemPedidoDao.pesquisarPorId(id)) {
                defaultTabelaPedidoMaisInfo.addRow(new Object[]{
                    i.getPedido().getIdPedido(),
                    i.getProduto().getNomeProduto(),
                    i.getProduto().getMarca().getNomeMarca(),
                    i.getQtdDeItem(),
                    i.getValorUnit(),
                    (i.getQtdDeItem() * i.getValorUnit()),
                    i.getPedido().getDataCompra()
                });
            }

        } catch (Exception e) {
        }
    }

}

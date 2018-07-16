package br.com.dhyStoreInfirmatica.view;

import Dao.FabricaConexao;
import br.com.dhyStoreInfirmatica.bean.Pedido;
import br.com.dhyStoreInfirmatica.dao.ItemPedidoDao;
import br.com.dhyStoreInfirmatica.dao.ItemPedidoDaoImpl;
import br.com.dhyStoreInfirmatica.dao.PedidoDao;
import br.com.dhyStoreInfirmatica.dao.PedidoDaoImpl;
import static br.com.dhyStoreInfirmatica.view.TelaPrincipal.painelTelaPrincipal;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Dhyego Pedroso
 */
public class TelaPedidos extends javax.swing.JInternalFrame {
    
    FabricaConexao fc = new FabricaConexao();
    EntityManager em = fc.abreConexao("JavaniaStoreInformaticaPU");
    DefaultTableModel defaultTabelaPedido;
    
    public TelaPedidos() {
        initComponents();
        this.atualizarTabela();
        
        
        defaultTabelaPedido = (DefaultTableModel) tabelaPedido.getModel();
        tabelaPedido.setRowSorter(new TableRowSorter(defaultTabelaPedido));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        btnMaisInfo = new javax.swing.JButton();
        btnPdf = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txtNPedido = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPedido = new javax.swing.JTable();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Pedidos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/dhyStoreInfirmatica/Icos/pedidoSair.png"))); // NOI18N
        btnSair.setToolTipText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnMaisInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/dhyStoreInfirmatica/Icos/pedidoMaisInfo.png"))); // NOI18N
        btnMaisInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisInfoActionPerformed(evt);
            }
        });

        btnPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/dhyStoreInfirmatica/Icos/Pdf.png"))); // NOI18N
        btnPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPdfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMaisInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMaisInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        txtNPedido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNPedidoKeyReleased(evt);
            }
        });

        jLabel1.setText("Nº do Pedido:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabelaPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº do Pedido", "Cliente", "Valor ", "Pagamento", "Data da Compra"
            }
        ));
        jScrollPane1.setViewportView(tabelaPedido);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1087, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMaisInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaisInfoActionPerformed
        if (tabelaPedido.getSelectedRow() != -1) {
            TelaPedidoMaisInfo telaPedidoMaisInfo = new TelaPedidoMaisInfo(
                    Integer.parseInt(this.tabelaPedido.getValueAt(tabelaPedido.getSelectedRow(), 0).toString()));
            
            this.dispose();
            TelaPrincipal.painelTelaPrincipal.add(telaPedidoMaisInfo);
            telaPedidoMaisInfo.setVisible(true);
            
            try {
                telaPedidoMaisInfo.setSelected(true);
                telaPedidoMaisInfo.setMaximizable(true);
                telaPedidoMaisInfo.setMaximum(true);
            } catch (java.beans.PropertyVetoException e) {
                
            }
            
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um pedido!!");
        }

    }//GEN-LAST:event_btnMaisInfoActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPdfActionPerformed
        
        this.gerarPdf();
        

    }//GEN-LAST:event_btnPdfActionPerformed

    private void txtNPedidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNPedidoKeyReleased
        this.pesquisarNumeroDoPedido(txtNPedido.getText());
    }//GEN-LAST:event_txtNPedidoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMaisInfo;
    private javax.swing.JButton btnPdf;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaPedido;
    private javax.swing.JTextField txtNPedido;
    // End of variables declaration//GEN-END:variables
 public void atualizarTabela() {
        try {
            defaultTabelaPedido = (DefaultTableModel) tabelaPedido.getModel();
            defaultTabelaPedido.setNumRows(0);
            
            DateFormat dataCompra = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            
            PedidoDao pedidoDao = new PedidoDaoImpl(em);
            for (Pedido p : pedidoDao.allPedido()) {
                defaultTabelaPedido.addRow(new Object[]{
                    p.getIdPedido(),
                    p.getCliente().getNomeCliente(),
                    p.getValorTotalVenda(),
                    p.getTipoPagamento(),
                    dataCompra.format(p.getDataCompra())
                });
            }
        } catch (Exception e) {
        }
    }
    
    public void gerarPdf() {
        
        JFileChooser selecionarPasta = new JFileChooser();
        selecionarPasta.setDialogTitle("Relatorio de Pedidos");
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivo", "pdf");
        selecionarPasta.setFileFilter(filtro);
        int retorno = selecionarPasta.showSaveDialog(this);
        
        if (retorno == JFileChooser.APPROVE_OPTION) {
            PedidoDao pedidoDao = new PedidoDaoImpl(em);
            Document doc = new Document();
            List<Pedido> relatorioPedidos = pedidoDao.allPedido();
            
            File f = selecionarPasta.getSelectedFile();
            String arquivoPdf = f.toString();
            
            DateFormat dataCompra = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            
            try {
                PdfWriter.getInstance(doc, new FileOutputStream(arquivoPdf));
                doc.open();
                
                Paragraph p = new Paragraph("Relatorio de Pedidos");
                p.setAlignment(1);
                doc.add(p);
                p = new Paragraph("");
                doc.add(p);
                
                PdfPTable pTable = new PdfPTable(5);
                
                pTable.addCell(new PdfPCell(new Paragraph("Nº do Pedido")));
                pTable.addCell(new PdfPCell(new Paragraph("Cliente")));
                pTable.addCell(new PdfPCell(new Paragraph("Valor")));
                pTable.addCell(new PdfPCell(new Paragraph("Pagamento")));
                pTable.addCell(new PdfPCell(new Paragraph("Data da Compra")));
                
                for (Pedido pedido : relatorioPedidos) {
                    pTable.addCell(new PdfPCell(new Paragraph(String.valueOf(pedido.getIdPedido()))));
                    pTable.addCell(new PdfPCell(new Paragraph(pedido.getCliente().getNomeCliente())));
                    pTable.addCell(new PdfPCell(new Paragraph(pedido.getValorTotalVenda().toString())));
                    pTable.addCell(new PdfPCell(new Paragraph(pedido.getTipoPagamento())));
                    pTable.addCell(new PdfPCell(new Paragraph(dataCompra.format(pedido.getDataCompra()))));
                }
                
                doc.add(pTable);
                doc.close();
                
                Desktop.getDesktop().open(new File(arquivoPdf));
                
            } catch (DocumentException | IOException e) {
            }
        }
    }
    
    public void imprimirTabela() {
        MessageFormat cabecalho = new MessageFormat("Listagem e Pedidos:");
        MessageFormat rodape = new MessageFormat("Page{0,number,integer}");
        try {
            
            tabelaPedido.print(JTable.PrintMode.FIT_WIDTH, cabecalho, rodape);
        } catch (PrinterException e) {
            JOptionPane.showMessageDialog(this, "Erro ao gerar relatorio!!");
        }
    }
    
    public void pesquisarNumeroDoPedido(String pesquisa) {
        
        try {
            
            defaultTabelaPedido = (DefaultTableModel) tabelaPedido.getModel();
            defaultTabelaPedido.setNumRows(0);
            PedidoDaoImpl pedidoDao = new PedidoDaoImpl(em);
            List<Pedido> pedidos;
            
            pedidos = pedidoDao.pesquisarNumeroDoPedido(Integer.parseInt(pesquisa));
            
            for (Pedido p : pedidos) {
                defaultTabelaPedido.addRow(new Object[]{
                    p.getIdPedido(),
                    p.getCliente().getNomeCliente(),
                    p.getValorTotalVenda(),
                    p.getTipoPagamento(),
                    p.getDataCompra(),});
            }
            
        } catch (Exception e) {
        }
    }
    

}

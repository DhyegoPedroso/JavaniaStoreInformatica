package br.com.dhyStoreInfirmatica.view;

import Dao.FabricaConexao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Dhyego Pedroso
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private FabricaConexao fc = new FabricaConexao();
    private EntityManager em = fc.abreConexao("JavaniaStoreInformaticaPU");

    boolean telasIniciadas;

    public TelaPrincipal() {
        initComponents();

        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelTelaPrincipal = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jlData = new javax.swing.JLabel();
        jlHora = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuAreaDeVenda = new javax.swing.JMenuItem();
        menuPedidos = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();
        menuGereciamento = new javax.swing.JMenu();
        menuGerenciarCliente = new javax.swing.JMenuItem();
        menuGerenciarFornecedor = new javax.swing.JMenuItem();
        menuGerenciarProduto = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Javania Store Informatica");
        setPreferredSize(new java.awt.Dimension(1115, 635));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        painelTelaPrincipal.setPreferredSize(new java.awt.Dimension(1100, 550));

        javax.swing.GroupLayout painelTelaPrincipalLayout = new javax.swing.GroupLayout(painelTelaPrincipal);
        painelTelaPrincipal.setLayout(painelTelaPrincipalLayout);
        painelTelaPrincipalLayout.setHorizontalGroup(
            painelTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1117, Short.MAX_VALUE)
        );
        painelTelaPrincipalLayout.setVerticalGroup(
            painelTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jlData.setBackground(new java.awt.Color(255, 255, 255));
        jlData.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jlData.setForeground(new java.awt.Color(51, 51, 51));
        jlData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jlHora.setBackground(new java.awt.Color(255, 255, 255));
        jlHora.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jlHora.setForeground(new java.awt.Color(51, 51, 51));
        jlHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/dhyStoreInfirmatica/Icos/Dukelogo48.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("JAVANIA STORE INFORMÁTICA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlData, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlHora, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jlData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jlHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menuArquivo.setText("Arquivo");

        menuAreaDeVenda.setText("Área de Venda");
        menuAreaDeVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAreaDeVendaActionPerformed(evt);
            }
        });
        menuArquivo.add(menuAreaDeVenda);

        menuPedidos.setText("Pedidos");
        menuPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPedidosActionPerformed(evt);
            }
        });
        menuArquivo.add(menuPedidos);

        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuArquivo.add(menuSair);

        jMenuBar1.add(menuArquivo);

        menuGereciamento.setText("Gerenciamento");

        menuGerenciarCliente.setText("Clientes");
        menuGerenciarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGerenciarClienteActionPerformed(evt);
            }
        });
        menuGereciamento.add(menuGerenciarCliente);

        menuGerenciarFornecedor.setText("Fornedecores");
        menuGerenciarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGerenciarFornecedorActionPerformed(evt);
            }
        });
        menuGereciamento.add(menuGerenciarFornecedor);

        menuGerenciarProduto.setText("Produtos");
        menuGerenciarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGerenciarProdutoActionPerformed(evt);
            }
        });
        menuGereciamento.add(menuGerenciarProduto);

        jMenuBar1.add(menuGereciamento);

        menuAjuda.setText("Ajuda");
        menuAjuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAjudaMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelTelaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1117, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelTelaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuAjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAjudaMouseClicked
        JOptionPane.showMessageDialog(null, "Programa desenvolvido pelo aluno: \nDhyego Pedroso"
                + "\n¬¬¬¬¬¬¬¬¬ SENAC - Palhoça ¬¬¬¬¬¬¬¬¬");
    }//GEN-LAST:event_menuAjudaMouseClicked

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        System.exit(0);
        em.close();
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuAreaDeVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAreaDeVendaActionPerformed
        JInternalFrame[] jFrames = painelTelaPrincipal.getAllFrames();
        for (int i = 0; i < jFrames.length; i++) {
            jFrames[i].setVisible(false);
        }
        TelaAreaDeVenda telaAreaDeVenda = new TelaAreaDeVenda();
        painelTelaPrincipal.add(telaAreaDeVenda);
        telaAreaDeVenda.setVisible(true);

        try {
            telaAreaDeVenda.setSelected(true);
            telaAreaDeVenda.setMaximizable(true);
            telaAreaDeVenda.setMaximum(true);
        } catch (java.beans.PropertyVetoException e) {

        }
    }//GEN-LAST:event_menuAreaDeVendaActionPerformed

    private void menuPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPedidosActionPerformed
        JInternalFrame[] jFrames = painelTelaPrincipal.getAllFrames();
        for (int i = 0; i < jFrames.length; i++) {
            jFrames[i].setVisible(false);
        }
        TelaPedidos telaPedidos = new TelaPedidos();
        painelTelaPrincipal.add(telaPedidos);
        telaPedidos.setVisible(true);

        try {
            telaPedidos.setSelected(true);
            telaPedidos.setMaximizable(true);
            telaPedidos.setMaximum(true);
        } catch (java.beans.PropertyVetoException e) {

        }
    }//GEN-LAST:event_menuPedidosActionPerformed

    private void menuGerenciarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGerenciarClienteActionPerformed
        JInternalFrame[] jFrames = painelTelaPrincipal.getAllFrames();
        for (int i = 0; i < jFrames.length; i++) {
            jFrames[i].setVisible(false);
        }
        TelaCliente telaCliente = new TelaCliente();
        painelTelaPrincipal.add(telaCliente);
        telaCliente.setVisible(true);

        try {
            telaCliente.setSelected(true);
            telaCliente.setMaximizable(true);
            telaCliente.setMaximum(true);
        } catch (java.beans.PropertyVetoException e) {

        }
    }//GEN-LAST:event_menuGerenciarClienteActionPerformed

    private void menuGerenciarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGerenciarFornecedorActionPerformed
        JInternalFrame[] jFrames = painelTelaPrincipal.getAllFrames();
        for (int i = 0; i < jFrames.length; i++) {
            jFrames[i].setVisible(false);
        }
        TelaFornecedor telaFornecedor = new TelaFornecedor();
        painelTelaPrincipal.add(telaFornecedor);
        telaFornecedor.setVisible(true);

        try {
            telaFornecedor.setSelected(true);
            telaFornecedor.setMaximizable(true);
            telaFornecedor.setMaximum(true);
        } catch (java.beans.PropertyVetoException e) {

        }

    }//GEN-LAST:event_menuGerenciarFornecedorActionPerformed

    private void menuGerenciarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGerenciarProdutoActionPerformed
        JInternalFrame[] jFrames = painelTelaPrincipal.getAllFrames();
        for (int i = 0; i < jFrames.length; i++) {
            jFrames[i].setVisible(false);
        }
        TelaProduto telaProduto = new TelaProduto();
        painelTelaPrincipal.add(telaProduto);
        telaProduto.setVisible(true);

        try {
            telaProduto.setSelected(true);
            telaProduto.setMaximizable(true);
            telaProduto.setMaximum(true);
        } catch (java.beans.PropertyVetoException e) {

        }
    }//GEN-LAST:event_menuGerenciarProdutoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(MAXIMIZED_BOTH);

        Date dataSistema = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        jlData.setText(formato.format(dataSistema));

        Timer timer = new Timer(1000, new hora());
        timer.start();


    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
//            UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
        }
        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlData;
    private javax.swing.JLabel jlHora;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenuItem menuAreaDeVenda;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuGereciamento;
    private javax.swing.JMenuItem menuGerenciarCliente;
    private javax.swing.JMenuItem menuGerenciarFornecedor;
    private javax.swing.JMenuItem menuGerenciarProduto;
    private javax.swing.JMenuItem menuPedidos;
    private javax.swing.JMenuItem menuSair;
    public static javax.swing.JDesktopPane painelTelaPrincipal;
    // End of variables declaration//GEN-END:variables

    class hora implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Calendar now = Calendar.getInstance();
            jlHora.setText(String.format("%1$tH:%1$tM:%1$tS", now));
        }
    }
}

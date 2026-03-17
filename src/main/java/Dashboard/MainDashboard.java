package Dashboard;

import Content.*;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class MainDashboard extends javax.swing.JFrame {

    TelaHome a = new TelaHome();
    TelaPedidos b = new TelaPedidos();
    CadastrosFornecedores c = new CadastrosFornecedores();
    CadastroProdutos d = new CadastroProdutos();
    CadastroClientes e = new CadastroClientes();
    ListaFornecedores f = new ListaFornecedores();
    
    public class MyForm extends javax.swing.JFrame {

    // Lista para armazenar os botões
    private List<javax.swing.JButton> botoes = new ArrayList<>();
    private int yPos = 50; // Posição Y inicial

    public MyForm() {
        initComponents();
        // Inicializa a posição dos botões (ex: fora da tela à esquerda)
        inicializarBotoes();
    }

    private void inicializarBotoes() {
        botoes.add(btnFornecedores);
        botoes.add(btnProdutos);
        botoes.add(btnClientes);
        
        // Esconde ou joga para fora da tela inicialmente
        for (javax.swing.JButton btn : botoes) {
            btn.setLocation(-100, btn.getY());
        }
    }

    // Ação do botão que inicia a cascata
    private void iniciarCascata() {
        final int delay = 100; // milissegundos entre cada botão
        final int finalX = 50; // posição final X
        
        for (int i = 0; i < botoes.size(); i++) {
            final javax.swing.JButton btn = botoes.get(i);
            final int index = i;
            
            // Timer para cada botão com atraso acumulado
            Timer timer = new Timer(delay * index, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Simples animação de deslizar
                    new Thread(() -> {
                        for (int pos = -100; pos <= finalX; pos += 10) {
                            btn.setLocation(pos, btn.getY());
                            try { Thread.sleep(10); } catch (Exception ex) {}
                        }
                    }).start();
                }
            });
            timer.setRepeats(false);
            timer.start();
        }
    }
    }

    public MainDashboard() {
        initComponents();
        this.pack();
        
        main.add(a);
        main.add(b);
        main.add(c);
        main.add(d);
        main.add(e);
        main.add(f);

        
        a.setVisible(true);
        b.setVisible(false);
        c.setVisible(false);
        d.setVisible(false);
        e.setVisible(false);
        f.setVisible(false);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnPedidos = new javax.swing.JButton();
        btnFornecedores = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CADASTROS = new javax.swing.JLabel();
        CADASTROS1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        main = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 800));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(150, 551));

        btnHome.setText("HOME");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnPedidos.setText("Pedidos");
        btnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosActionPerformed(evt);
            }
        });

        btnFornecedores.setText("Fornecedores");
        btnFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFornecedoresActionPerformed(evt);
            }
        });

        btnProdutos.setText("Produtos");
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });

        btnClientes.setText("Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU DE NAVEGAÇÃO");

        CADASTROS.setBackground(new java.awt.Color(153, 153, 153));
        CADASTROS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CADASTROS.setForeground(new java.awt.Color(0, 0, 0));
        CADASTROS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CADASTROS.setText("Cadastros");

        CADASTROS1.setBackground(new java.awt.Color(153, 153, 153));
        CADASTROS1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CADASTROS1.setForeground(new java.awt.Color(0, 0, 0));
        CADASTROS1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CADASTROS1.setText("Relatórios");

        jButton1.setText("Lista Fornecedores");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CADASTROS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CADASTROS1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome)
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPedidos)
                .addGap(10, 10, 10)
                .addComponent(CADASTROS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFornecedores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CADASTROS1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(252, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_START);

        main.setLayout(new java.awt.CardLayout());
        getContentPane().add(main, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        a.setVisible(true);
        b.setVisible(false);
        c.setVisible(false);
        d.setVisible(false);
        e.setVisible(false);
        f.setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosActionPerformed
        a.setVisible(false);
        b.setVisible(true);
        c.setVisible(false);
        d.setVisible(false);
        e.setVisible(false);
        f.setVisible(false);
    }//GEN-LAST:event_btnPedidosActionPerformed

    private void btnFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFornecedoresActionPerformed
        a.setVisible(false);
        b.setVisible(false);
        c.setVisible(true);
        d.setVisible(false);
        e.setVisible(false);
        f.setVisible(false);
    }//GEN-LAST:event_btnFornecedoresActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        a.setVisible(false);
        b.setVisible(false);
        c.setVisible(false);
        d.setVisible(true);
        e.setVisible(false);
        f.setVisible(false);
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        a.setVisible(false);
        b.setVisible(false);
        c.setVisible(false);
        d.setVisible(false);
        e.setVisible(true);
        f.setVisible(false);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        a.setVisible(false);
        b.setVisible(false);
        c.setVisible(false);
        d.setVisible(false);
        e.setVisible(false);
        f.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {MainDashboard frame = new MainDashboard();
            frame.setVisible(true); // Garante que o JFrame principal apareça
            frame.setLocationRelativeTo(null); // Centraliza na tela
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CADASTROS;
    private javax.swing.JLabel CADASTROS1;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnFornecedores;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLayeredPane main;
    // End of variables declaration//GEN-END:variables
}

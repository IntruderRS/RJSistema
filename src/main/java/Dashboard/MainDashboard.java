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
    ListaProdutos g = new ListaProdutos();
    ListaClientes h = new ListaClientes();
    CadastroCategoria i = new CadastroCategoria();
    ListaPedidos j = new ListaPedidos();
    Usuarios k = new Usuarios();
    Permissoes l = new Permissoes();
    
    
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
        main.add(g);
        main.add(h);
        main.add(i);
        main.add(j);
        main.add(k);
        main.add(l);

        
        a.setVisible(true);
        b.setVisible(false);
        c.setVisible(false);
        d.setVisible(false);
        e.setVisible(false);
        f.setVisible(false);
        g.setVisible(false);
        h.setVisible(false);
        i.setVisible(false);
        j.setVisible(false);
        k.setVisible(false);
        l.setVisible(false);
       
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
        btnListaFornecedores = new javax.swing.JButton();
        btnListaProdutos = new javax.swing.JButton();
        btnListaClientes = new javax.swing.JButton();
        btnCategoria = new javax.swing.JButton();
        btnListaPedidos = new javax.swing.JButton();
        CADASTROS2 = new javax.swing.JLabel();
        btnUsuarios = new javax.swing.JButton();
        btnPermissoes = new javax.swing.JButton();
        main = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 800));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setForeground(new java.awt.Color(35, 43, 49));
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

        btnListaFornecedores.setText("Lista Fornecedores");
        btnListaFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaFornecedoresActionPerformed(evt);
            }
        });

        btnListaProdutos.setText("Lista Produtos");
        btnListaProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaProdutosActionPerformed(evt);
            }
        });

        btnListaClientes.setText("Lista Clientes");
        btnListaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaClientesActionPerformed(evt);
            }
        });

        btnCategoria.setText("Categoria");
        btnCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaActionPerformed(evt);
            }
        });

        btnListaPedidos.setText("Lista Pedidos");
        btnListaPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaPedidosActionPerformed(evt);
            }
        });

        CADASTROS2.setBackground(new java.awt.Color(153, 153, 153));
        CADASTROS2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CADASTROS2.setForeground(new java.awt.Color(0, 0, 0));
        CADASTROS2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CADASTROS2.setText("Administração");

        btnUsuarios.setText("Usuários");
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnPermissoes.setText("Permissões");
        btnPermissoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPermissoesActionPerformed(evt);
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
            .addComponent(btnListaFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnListaProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnListaClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnListaPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CADASTROS2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPermissoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome)
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPedidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CADASTROS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFornecedores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CADASTROS1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListaFornecedores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListaProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListaClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListaPedidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CADASTROS2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsuarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPermissoes)
                .addContainerGap(56, Short.MAX_VALUE))
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
        g.setVisible(false);
        h.setVisible(false);
        i.setVisible(false);
        j.setVisible(false);
        k.setVisible(false);
        l.setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosActionPerformed
        a.setVisible(false);
        b.setVisible(true);
        c.setVisible(false);
        d.setVisible(false);
        e.setVisible(false);
        f.setVisible(false);
        g.setVisible(false);
        h.setVisible(false);
        i.setVisible(false);
        j.setVisible(false);
        k.setVisible(false);
        l.setVisible(false);
    }//GEN-LAST:event_btnPedidosActionPerformed

    private void btnFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFornecedoresActionPerformed
        a.setVisible(false);
        b.setVisible(false);
        c.setVisible(true);
        d.setVisible(false);
        e.setVisible(false);
        f.setVisible(false);
        g.setVisible(false);
        h.setVisible(false);
        i.setVisible(false);
        j.setVisible(false);
        k.setVisible(false);
        l.setVisible(false);
    }//GEN-LAST:event_btnFornecedoresActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        a.setVisible(false);
        b.setVisible(false);
        c.setVisible(false);
        d.setVisible(true);
        e.setVisible(false);
        f.setVisible(false);
        g.setVisible(false);
        h.setVisible(false);
        i.setVisible(false);
        j.setVisible(false);
        k.setVisible(false);
        l.setVisible(false);
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        a.setVisible(false);
        b.setVisible(false);
        c.setVisible(false);
        d.setVisible(false);
        e.setVisible(true);
        f.setVisible(false);
        g.setVisible(false);
        h.setVisible(false);
        i.setVisible(false);
        j.setVisible(false);
        k.setVisible(false);
        l.setVisible(false);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnListaFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaFornecedoresActionPerformed
        a.setVisible(false);
        b.setVisible(false);
        c.setVisible(false);
        d.setVisible(false);
        e.setVisible(false);
        f.setVisible(true);
        g.setVisible(false);
        h.setVisible(false);
        i.setVisible(false);
        j.setVisible(false);
        k.setVisible(false);
        l.setVisible(false);
    }//GEN-LAST:event_btnListaFornecedoresActionPerformed

    private void btnListaProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaProdutosActionPerformed
        a.setVisible(false);
        b.setVisible(false);
        c.setVisible(false);
        d.setVisible(false);
        e.setVisible(false);
        f.setVisible(false);
        g.setVisible(true);
        h.setVisible(false);
        i.setVisible(false);
        j.setVisible(false);
        k.setVisible(false);
        l.setVisible(false);
    }//GEN-LAST:event_btnListaProdutosActionPerformed

    private void btnListaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaClientesActionPerformed
        a.setVisible(false);
        b.setVisible(false);
        c.setVisible(false);
        d.setVisible(false);
        e.setVisible(false);
        f.setVisible(false);
        g.setVisible(false);
        h.setVisible(true);
        i.setVisible(false);
        j.setVisible(false);
        k.setVisible(false);
        l.setVisible(false);
    }//GEN-LAST:event_btnListaClientesActionPerformed

    private void btnCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaActionPerformed
        a.setVisible(false);
        b.setVisible(false);
        c.setVisible(false);
        d.setVisible(false);
        e.setVisible(false);
        f.setVisible(false);
        g.setVisible(false);
        h.setVisible(false);
        i.setVisible(true);
        j.setVisible(false);
        k.setVisible(false);
        l.setVisible(false);
    }//GEN-LAST:event_btnCategoriaActionPerformed

    private void btnListaPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaPedidosActionPerformed
        a.setVisible(false);
        b.setVisible(false);
        c.setVisible(false);
        d.setVisible(false);
        e.setVisible(false);
        f.setVisible(false);
        g.setVisible(false);
        h.setVisible(false);
        i.setVisible(false);
        j.setVisible(true);
        k.setVisible(false);
        l.setVisible(false);
    }//GEN-LAST:event_btnListaPedidosActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        a.setVisible(false);
        b.setVisible(false);
        c.setVisible(false);
        d.setVisible(false);
        e.setVisible(false);
        f.setVisible(false);
        g.setVisible(false);
        h.setVisible(false);
        i.setVisible(false);
        j.setVisible(false);
        k.setVisible(true);
        l.setVisible(false);
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnPermissoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPermissoesActionPerformed
        a.setVisible(false);
        b.setVisible(false);
        c.setVisible(false);
        d.setVisible(false);
        e.setVisible(false);
        f.setVisible(false);
        g.setVisible(false);
        h.setVisible(false);
        i.setVisible(false);
        j.setVisible(false);
        k.setVisible(false);
        l.setVisible(true);
    }//GEN-LAST:event_btnPermissoesActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {MainDashboard frame = new MainDashboard();
            frame.setVisible(true); // Garante que o JFrame principal apareça
            frame.setLocationRelativeTo(null); // Centraliza na tela
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CADASTROS;
    private javax.swing.JLabel CADASTROS1;
    private javax.swing.JLabel CADASTROS2;
    private javax.swing.JButton btnCategoria;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnFornecedores;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnListaClientes;
    private javax.swing.JButton btnListaFornecedores;
    private javax.swing.JButton btnListaPedidos;
    private javax.swing.JButton btnListaProdutos;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnPermissoes;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLayeredPane main;
    // End of variables declaration//GEN-END:variables
}

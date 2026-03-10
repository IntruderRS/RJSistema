package Dashboard;

import Content.*;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class MainDashboard extends javax.swing.JFrame {

    // private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainDashboard.class.getName());
    TelaHome a = new TelaHome();
    TelaPedidos b = new TelaPedidos();
    TelaCadastros c = new TelaCadastros();
    TelaRelatorios d = new TelaRelatorios();
    TelaAdministracao e = new TelaAdministracao();
    
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
        botoes.add(btnCadastros);
        botoes.add(btnRelatorios);
        botoes.add(btnAdministracao);
        
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

        
        a.setVisible(true);
        b.setVisible(false);
        c.setVisible(false);
        d.setVisible(false);
        e.setVisible(false);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnPedidos = new javax.swing.JButton();
        btnCadastros = new javax.swing.JButton();
        btnRelatorios = new javax.swing.JButton();
        btnAdministracao = new javax.swing.JButton();
        main = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 700));

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

        btnCadastros.setText("Cadastros");
        btnCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrosActionPerformed(evt);
            }
        });

        btnRelatorios.setText("Relatorios");
        btnRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatoriosActionPerformed(evt);
            }
        });

        btnAdministracao.setText("Administração");
        btnAdministracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministracaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCadastros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAdministracao, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome)
                .addGap(83, 83, 83)
                .addComponent(btnPedidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRelatorios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdministracao)
                .addContainerGap(329, Short.MAX_VALUE))
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
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosActionPerformed
        a.setVisible(false);
        b.setVisible(true);
        c.setVisible(false);
        d.setVisible(false);
        e.setVisible(false);
    }//GEN-LAST:event_btnPedidosActionPerformed

    private void btnCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrosActionPerformed
        a.setVisible(false);
        b.setVisible(false);
        c.setVisible(true);
        d.setVisible(false);
        e.setVisible(false);
    }//GEN-LAST:event_btnCadastrosActionPerformed

    private void btnRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatoriosActionPerformed
        a.setVisible(false);
        b.setVisible(false);
        c.setVisible(false);
        d.setVisible(true);
        e.setVisible(false);
    }//GEN-LAST:event_btnRelatoriosActionPerformed

    private void btnAdministracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministracaoActionPerformed
        a.setVisible(false);
        b.setVisible(false);
        c.setVisible(false);
        d.setVisible(false);
        e.setVisible(true);
    }//GEN-LAST:event_btnAdministracaoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {MainDashboard frame = new MainDashboard();
            frame.setVisible(true); // Garante que o JFrame principal apareça
            frame.setLocationRelativeTo(null); // Centraliza na tela
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministracao;
    private javax.swing.JButton btnCadastros;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnRelatorios;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLayeredPane main;
    // End of variables declaration//GEN-END:variables
}

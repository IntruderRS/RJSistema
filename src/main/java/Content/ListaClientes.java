package Content;

import Classes.Cliente;
import Classes.ClienteDAO;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class ListaClientes extends javax.swing.JPanel {

    public ListaClientes() {
        initComponents();
        atualizarTabela();

        
        for (int column = 0; column < tblListaClientes.getColumnCount(); column++) {
            int width = 100; // Tamanho mínimo
            for (int row = 0; row < tblListaClientes.getRowCount(); row++) {
                javax.swing.table.TableCellRenderer renderer = tblListaClientes.getCellRenderer(row, column);
                java.awt.Component comp = tblListaClientes.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width + 1, width);
            }
            tblListaClientes.getColumnModel().getColumn(column).setPreferredWidth(width);
        }

    }

    public void atualizarTabela() {
        ClienteDAO dao = new ClienteDAO();
        List<Cliente> lista = dao.listarTodos();

        // Pega o modelo da tabela que você criou no Design
        DefaultTableModel modelo = (DefaultTableModel) tblListaClientes.getModel();

        // Limpa a tabela antes de preencher para não duplicar dados
        modelo.setNumRows(0);

        // Adiciona cada cliente na linha da tabela
        for (Cliente c : lista) {
            modelo.addRow(new Object[]{
                //c.getId(),
                c.getNomeRazao(),
                c.getNomeFantasia(),
                c.getCnpjCpf(),
                //c.getNascimento(),
                c.getProfissao(),
                c.getRua(),
                c.getBairro(),
                c.getCidade(),
                c.getEstado(),
                c.getCep(),
                c.getTelefone(),
                c.getWhatsapp(),
                c.getEmail(),});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaClientes = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LISTA CLIENTES");

        tblListaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome/Razão", "Nome Fantasia", "CNPJ/CPF", "Atividade/Profissão", "Rua", "Bairro", "Cidade", "Estado", "CEP", "Telefone", "Whatsapp", "Email"
            }
        ));
        tblListaClientes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(tblListaClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListaClientes;
    // End of variables declaration//GEN-END:variables
}


package Classes;

import java.util.ArrayList;


public class Pedido {
    public int id;
    public Cliente cliente;
    public ArrayList<Produto> itens = new ArrayList<>();
    public String formaPagamento;

    public Pedido(int id, Cliente cliente, String formaPagamento) {
        this.id = id;
        this.cliente = cliente;
        this.formaPagamento = formaPagamento;
    }

    public void adicionarProduto(Produto p) {
        itens.add(p);
    }

    public void exibirResumo() {
        System.out.println("Pedido #" + id + " - Cliente: " + cliente.nome);
        double total = 0;
        for (Produto p : itens) {
            p.exibirProduto();
            total += p.precoVenda;
        }
        System.out.println("Total: R$" + total + " | Pagamento: " + formaPagamento);
    }

}


package Classes;


public class Estoque {
    public Produto produto;
    public int quantidade;

    public Estoque(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public void exibirEstoque() {
        System.out.println("Estoque de " + produto.nome + ": " + quantidade + " unidades");
    }

}

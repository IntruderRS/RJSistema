
package Classes;


public class Produto {
    public int id;
    public String nome;
    public String codigo;
    public double precoCusto;
    public double precoVenda;
    public int quantidade;
    public String fornecedor;

    public Produto(int id, String nome, String codigo, double precoCusto, double precoVenda, int quantidade, String fornecedor) {
        this.id = id;
        this.nome = nome;
        this.codigo = codigo;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
    }

    public void exibirProduto() {
        System.out.println("Produto: " + nome + " | Código: " + codigo + " | Preço: R$" + precoVenda);
    }
   
}

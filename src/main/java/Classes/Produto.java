package Classes;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Produto {
    
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     
     
    @Column(name = "Nome")
    private String nome;

    @Column(name = "ValorCusto")
    private String valorCusto;

    @Column(name = "PorcentagemLucro")
    private String porcetagemLucro;

    @Column(name = "ValorVenda")
    private String valorVenda;

    @Column(name = "Quantidade")
    private String quantidade;

    @Column(name = "Peso")
    private String peso;

    @Column(name = "Dimensoes")
    private String dimensoes;

    @Column(name = "CodigoBarras")
    private String codigoBarras;

    @Column(name = "NCM")
    private String NCM;

    @Column(name = "CEP")
    private String cep;

    @Column(name = "Lote")
    private String lote;

    @Column(name = "Vencimento")
    private String vencimento;
    
    @Column(name = "observacao", columnDefinition = "TEXT")
    private String observacao;

    @Column(name = "Categoria")
    private String categoria;

    @Column(name = "Fornecedor")
    private String fornecedor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(String valorCusto) {
        this.valorCusto = valorCusto;
    }

    public String getPorcetagemLucro() {
        return porcetagemLucro;
    }

    public void setPorcetagemLucro(String porcetagemLucro) {
        this.porcetagemLucro = porcetagemLucro;
    }

    public String getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(String valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getDimensoes() {
        return dimensoes;
    }

    public void setDimensoes(String dimensoes) {
        this.dimensoes = dimensoes;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getNCM() {
        return NCM;
    }

    public void setNCM(String NCM) {
        this.NCM = NCM;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    
    
    }





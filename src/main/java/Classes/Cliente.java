package Classes;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")

public class Cliente {

    @Id
    public Integer id;
    private String NomeRazao;
    private String NomeFantasia;
    public String CNPJ_CPF;
    public String Nascimento;
    public String ProfissaoAtividade;
    public String Rua;
    public String Bairro;
    public String Cidade;
    public String Estado;
    public String CEP;
    public String Telefone;
    public String Whatsapp;
    public String Email;

    public Cliente() {
        //O Hibernate usa isso para "criar" o objeto antes de preencher os dados.
    }
    
    public Cliente(int id, String nome, String nomefantasia, String CNPJ_CPF, String Nascimento, String ProfissaoAtividade, String Rua, String Bairro, String Cidade, String Estado, String CEP, String Telefone, String Whatsapp, String Email) {
        this.id = id;
        this.NomeRazao = nome;
        this.NomeFantasia = nomefantasia;
        this.CNPJ_CPF = CNPJ_CPF; // Corrigido (estava this.NomeFantasia =)
        this.Nascimento = Nascimento; // Corrigido
        this.ProfissaoAtividade = ProfissaoAtividade; // Corrigido
        this.Rua = Rua; // Corrigido
        this.Bairro = Bairro; // Corrigido
        this.Cidade = Cidade; // Corrigido
        this.Estado = Estado; // Corrigido
        this.CEP = CEP;
        this.Telefone = Telefone; // Corrigido
        this.Whatsapp = Whatsapp; // Corrigido
        this.Email = Email; // Corrigido
    }

    @Override
    public String toString() {
        return this.NomeRazao; // É isso que o Swing vai mostrar na tela
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeRazao() {
        return NomeRazao;
    }

    public void setNomeRazao(String NomeRazao) {
        this.NomeRazao = NomeRazao;
    }

    public String getNomeFantasia() {
        return NomeFantasia;
    }

    public void setNomeFantasia(String NomeFantasia) {
        this.NomeFantasia = NomeFantasia;
    }

    public String getCNPJ_CPF() {
        return CNPJ_CPF;
    }

    public void setCNPJ_CPF(String CNPJ_CPF) {
        this.CNPJ_CPF = CNPJ_CPF;
    }

    public String getNascimento() {
        return Nascimento;
    }

    public void setNascimento(String Nascimento) {
        this.Nascimento = Nascimento;
    }

    public String getProfissaoAtividade() {
        return ProfissaoAtividade;
    }

    public void setProfissaoAtividade(String ProfissaoAtividade) {
        this.ProfissaoAtividade = ProfissaoAtividade;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getWhatsapp() {
        return Whatsapp;
    }

    public void setWhatsapp(String Whatsapp) {
        this.Whatsapp = Whatsapp;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

}

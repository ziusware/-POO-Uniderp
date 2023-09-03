package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public abstract class basePessoaFisica extends basePessoa{
    protected String nome;
    protected String rg;
    protected String cpf;
    protected LocalDate dataNascimento;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public basePessoaFisica(int codigo, LocalDate dataInsercao, String endereco, String telefone, String nome,
            String rg, String cpf, LocalDate dataNascimento) {
        super(codigo, dataInsercao, endereco, telefone);
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }
      
}

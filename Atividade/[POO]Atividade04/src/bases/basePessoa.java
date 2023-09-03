package bases;

import java.time.LocalDate;

public abstract class basePessoa extends baseID{
    protected String nome;
    protected LocalDate dtNascimento;
    protected String email;
    protected String telefone;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getDtNascimento() {
        return dtNascimento;
    }
    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public basePessoa(int codigo, String nome, String telefone, String email, LocalDate dtNascimento) {
        super(codigo);
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.email = email;
        this.telefone = telefone;
    }
    
    

    
}

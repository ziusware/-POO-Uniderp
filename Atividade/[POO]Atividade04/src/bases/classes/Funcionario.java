package bases.classes;

import java.time.LocalDate;

import bases.baseUsuario;

public class Funcionario extends baseUsuario{
    private String contaCorrente;
    private String cracha;
    private String senha;
    public String getContaCorrente() {
        return contaCorrente;
    }
    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
    public String getCracha() {
        return cracha;
    }
    public void setCracha(String cracha) {
        this.cracha = cracha;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Funcionario(int codigo, String email, String telefone, String nome, LocalDate dtNascimento, String usuario,
            String registro, String contaCorrente, String cracha, String senha) {
        super(codigo, email, telefone, nome, dtNascimento, usuario, registro);
        this.contaCorrente = contaCorrente;
        this.cracha = cracha;
        this.senha = senha;
    }

    
}

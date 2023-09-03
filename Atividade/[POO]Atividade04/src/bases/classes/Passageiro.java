package bases.classes;

import java.time.LocalDate;

import bases.baseUsuario;

public class Passageiro extends baseUsuario{
    private String numeroCartao;
    private String documento;
    public String getNumeroCartao() {
        return numeroCartao;
    }
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public Passageiro(int codigo, String nome, String telefone, String email, LocalDate dtNascimento, String usuario,
            String registro, String numeroCartao, String documento) {
        super(codigo, nome, telefone, email, dtNascimento, usuario, registro);
        this.numeroCartao = numeroCartao;
        this.documento = documento;
    }
    

    
}

package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public abstract class basePessoa extends baseDadosComuns{
    protected String endereco;
    protected String telefone;
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public basePessoa(int codigo, LocalDate dataInsercao, String endereco, String telefone) {
        super(codigo, dataInsercao);
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
}

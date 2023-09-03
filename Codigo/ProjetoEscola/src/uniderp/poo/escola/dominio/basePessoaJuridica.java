package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public abstract class basePessoaJuridica extends basePessoa {
    protected String nomeFantasia;
    protected String razaoSocial;
    protected String cnpf;
    protected String ie;
    protected LocalDate dataAbertura;
    
    public String getNomeFantasia() {
        return nomeFantasia;
    }
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public String getCnpf() {
        return cnpf;
    }
    public void setCnpf(String cnpf) {
        this.cnpf = cnpf;
    }
    public String getIe() {
        return ie;
    }
    public void setIe(String ie) {
        this.ie = ie;
    }
    public LocalDate getDataAbertura() {
        return dataAbertura;
    }
    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
    public basePessoaJuridica(int codigo, LocalDate dataInsercao, String endereco, String telefone, String nomeFantasia,
            String razaoSocial, String cnpf, String ie, LocalDate dataAbertura) {
        super(codigo, dataInsercao, endereco, telefone);
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpf = cnpf;
        this.ie = ie;
        this.dataAbertura = dataAbertura;
    }

    
}

package classes.bases;

import java.time.LocalDate;

public abstract class baseVeiculo {
    protected int codigo;
    protected String nome;
    protected String modelo;
    protected String cor;
    protected LocalDate anoModelo;
    protected LocalDate anoFabricacao;
    protected String fabricante;
    protected String tipoCombustivel;
    protected int qtdeOcupantes;
    protected int qtdeMotores;
    protected int rodas;
    protected double potencia;
    protected String estadoUF;
    protected String cidadeUF;
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public LocalDate getAnoModelo() {
        return anoModelo;
    }
    public void setAnoModelo(LocalDate anoModelo) {
        this.anoModelo = anoModelo;
    }
    public LocalDate getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(LocalDate anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    public int getQtdeOcupantes() {
        return qtdeOcupantes;
    }
    public void setQtdeOcupantes(int qtdeOcupantes) {
        this.qtdeOcupantes = qtdeOcupantes;
    }
    public int getQtdeMotores() {
        return qtdeMotores;
    }
    public void setQtdeMotores(int qtdeMotores) {
        this.qtdeMotores = qtdeMotores;
    }
    public int getRodas() {
        return rodas;
    }
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
    public double getPotencia() {
        return potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    public String getEstadoUF() {
        return estadoUF;
    }
    public void setEstadoUF(String estadoUF) {
        this.estadoUF = estadoUF;
    }
    public String getCidadeUF() {
        return cidadeUF;
    }
    public void setCidadeUF(String cidadeUF) {
        this.cidadeUF = cidadeUF;
    }
    public baseVeiculo(int codigo, String nome, String modelo, String cor, LocalDate anoModelo, LocalDate anoFabricacao,
            String fabricante, String tipoCombustivel, int qtdeOcupantes, int qtdeMotores, int rodas, double potencia,
            String estadoUF, String cidadeUF) {
        this.codigo = codigo;
        this.nome = nome;
        this.modelo = modelo;
        this.cor = cor;
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
        this.fabricante = fabricante;
        this.tipoCombustivel = tipoCombustivel;
        this.qtdeOcupantes = qtdeOcupantes;
        this.qtdeMotores = qtdeMotores;
        this.rodas = rodas;
        this.potencia = potencia;
        this.estadoUF = estadoUF;
        this.cidadeUF = cidadeUF;
    }
    

    
}

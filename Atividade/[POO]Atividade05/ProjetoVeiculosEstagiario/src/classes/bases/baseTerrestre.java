package classes.bases;

import java.time.LocalDate;

public abstract class baseTerrestre extends baseVeiculo {
    protected String nomeProprietario;
    protected int portas;
    protected int assentos;
    protected String chassi;
    protected String placa;
    protected int codigoRenavam;
    protected int eixos;
    
    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }
    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getCodigoRenavam() {
        return codigoRenavam;
    }
    public void setCodigoRenavam(int codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }
    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    public String getNomeProprietario() {
        return nomeProprietario;
    }
    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }
    public baseTerrestre(int codigo, String nome, String modelo, String cor, LocalDate anoModelo,
            LocalDate anoFabricacao, String fabricante, String tipoCombustivel, int qtdeOcupantes, int qtdeMotores,
            int rodas, double potencia, String estadoUF, String cidadeUF, String nomeProprietario, int portas,
            int assentos, String chassi, String placa, int codigoRenavam, int eixos) {
        super(codigo, nome, modelo, cor, anoModelo, anoFabricacao, fabricante, tipoCombustivel, qtdeOcupantes,
                qtdeMotores, rodas, potencia, estadoUF, cidadeUF);
        this.nomeProprietario = nomeProprietario;
        this.portas = portas;
        this.assentos = assentos;
        this.chassi = chassi;
        this.placa = placa;
        this.codigoRenavam = codigoRenavam;
        this.eixos = eixos;
    }
    
    
    
}

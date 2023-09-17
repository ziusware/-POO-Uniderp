package classes.bases;

import java.time.LocalDate;

public abstract class baseTransporte extends baseTerrestre{
    protected int pesoLiquido;
    protected int pesoTotal;
    public int getPesoLiquido() {
        return pesoLiquido;
    }
    public void setPesoLiquido(int pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }
    public int getPesoTotal() {
        return pesoTotal;
    }
    public void setPesoTotal(int pesoTotal) {
        this.pesoTotal = pesoTotal;
    }
    public baseTransporte(int codigo, String nome, String modelo, String cor, LocalDate anoModelo,
            LocalDate anoFabricacao, String fabricante, String tipoCombustivel, int qtdeOcupantes, int qtdeMotores,
            int rodas, double potencia, String estadoUF, String cidadeUF, String nomeProprietario, int portas,
            int assentos, String chassi, String placa, int codigoRenavam, int eixos, int pesoLiquido, int pesoTotal) {
        super(codigo, nome, modelo, cor, anoModelo, anoFabricacao, fabricante, tipoCombustivel, qtdeOcupantes,
                qtdeMotores, rodas, potencia, estadoUF, cidadeUF, nomeProprietario, portas, assentos, chassi, placa,
                codigoRenavam, eixos);
        this.pesoLiquido = pesoLiquido;
        this.pesoTotal = pesoTotal;
    }
    
}

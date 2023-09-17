package classes;

import java.time.LocalDate;

import classes.bases.baseTerrestre;

public class Carro extends baseTerrestre{
    private String id_Carro;

    public String getId_Carro() {
        return id_Carro;
    }

    public void setId_Carro(String id_Carro) {
        this.id_Carro = id_Carro;
    }

    public Carro(int codigo, String nome, String modelo, String cor, LocalDate anoModelo, LocalDate anoFabricacao,
            String fabricante, String tipoCombustivel, int qtdeOcupantes, int qtdeMotores, int rodas, double potencia,
            String estadoUF, String cidadeUF, String nomeProprietario, int portas, int assentos, String chassi,
            String placa, int codigoRenavam, int eixos, String id_Carro) {
        super(codigo, nome, modelo, cor, anoModelo, anoFabricacao, fabricante, tipoCombustivel, qtdeOcupantes,
                qtdeMotores, rodas, potencia, estadoUF, cidadeUF, nomeProprietario, portas, assentos, chassi, placa,
                codigoRenavam, eixos);
        this.id_Carro = id_Carro;
    }

    
}

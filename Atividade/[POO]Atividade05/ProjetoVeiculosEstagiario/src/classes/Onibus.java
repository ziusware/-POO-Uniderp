package classes;

import java.time.LocalDate;

import classes.bases.baseTransporte;

public class Onibus extends baseTransporte{
    private String id_Onibus;

    public String getId_Onibus() {
        return id_Onibus;
    }

    public void setId_Onibus(String id_Onibus) {
        this.id_Onibus = id_Onibus;
    }

    public Onibus(int codigo, String nome, String modelo, String cor, LocalDate anoModelo, LocalDate anoFabricacao,
            String fabricante, String tipoCombustivel, int qtdeOcupantes, int qtdeMotores, int rodas, double potencia,
            String estadoUF, String cidadeUF, String nomeProprietario, int portas, int assentos, String chassi,
            String placa, int codigoRenavam, int eixos, int pesoLiquido, int pesoTotal, String id_Onibus) {
        super(codigo, nome, modelo, cor, anoModelo, anoFabricacao, fabricante, tipoCombustivel, qtdeOcupantes,
                qtdeMotores, rodas, potencia, estadoUF, cidadeUF, nomeProprietario, portas, assentos, chassi, placa,
                codigoRenavam, eixos, pesoLiquido, pesoTotal);
        this.id_Onibus = id_Onibus;
    }
    
}

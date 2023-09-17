package classes;

import java.time.LocalDate;

import classes.bases.baseTransporte;

public class Motocicleta extends baseTransporte{
    private String id_Motocicleta;

    public String getId_Motocicleta() {
        return id_Motocicleta;
    }

    public void setId_Motocicleta(String id_Motocicleta) {
        this.id_Motocicleta = id_Motocicleta;
    }

    public Motocicleta(int codigo, String nome, String modelo, String cor, LocalDate anoModelo, LocalDate anoFabricacao,
            String fabricante, String tipoCombustivel, int qtdeOcupantes, int qtdeMotores, int rodas, double potencia,
            String estadoUF, String cidadeUF, String nomeProprietario, int portas, int assentos, String chassi,
            String placa, int codigoRenavam, int eixos, int pesoLiquido, int pesoTotal, String id_Motocicleta) {
        super(codigo, nome, modelo, cor, anoModelo, anoFabricacao, fabricante, tipoCombustivel, qtdeOcupantes,
                qtdeMotores, rodas, potencia, estadoUF, cidadeUF, nomeProprietario, portas, assentos, chassi, placa,
                codigoRenavam, eixos, pesoLiquido, pesoTotal);
        this.id_Motocicleta = id_Motocicleta;
    }

    
    
}

package classes;

import java.time.LocalDate;

import classes.bases.baseVeiculo;

public class Aviao extends baseVeiculo {
    private int id_aviao;

    public int getId_aviao() {
        return id_aviao;
    }

    public void setId_aviao(int id_aviao) {
        this.id_aviao = id_aviao;
    }

    public Aviao(int codigo, String nome, String modelo, String cor, LocalDate anoModelo, LocalDate anoFabricacao,
            String fabricante, String tipoCombustivel, int qtdeOcupantes, int qtdeMotores, int rodas, double potencia,
            String estadoUF, String cidadeUF, int id_aviao) {
        super(codigo, nome, modelo, cor, anoModelo, anoFabricacao, fabricante, tipoCombustivel, qtdeOcupantes,
                qtdeMotores, rodas, potencia, estadoUF, cidadeUF);
        this.id_aviao = id_aviao;
    }

    
}

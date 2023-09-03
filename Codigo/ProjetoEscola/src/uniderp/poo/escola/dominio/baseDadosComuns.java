package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public abstract class baseDadosComuns extends baseIdentificador{
    
    protected LocalDate dataInsercao;

    public LocalDate getDataInsercao() {
        return dataInsercao;
    }

    public void setDataInsercao(LocalDate dataInsercao) {
        this.dataInsercao = dataInsercao;
    }

    public baseDadosComuns(int codigo, LocalDate dataInsercao) {
        super(codigo);
        this.dataInsercao = dataInsercao;
    }

    

    
}

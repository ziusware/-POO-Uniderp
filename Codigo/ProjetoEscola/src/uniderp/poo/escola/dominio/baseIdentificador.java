package uniderp.poo.escola.dominio;

public abstract class baseIdentificador {
    protected int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public baseIdentificador(int codigo) {
        this.codigo = codigo;
    }
    
}

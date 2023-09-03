package bases;

public abstract class baseID {
    protected int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public baseID(int codigo) {
        this.codigo = codigo;
    }

    
}

package bases;

import java.time.LocalDate;

public abstract class baseUsuario extends basePessoa{
    protected String usuario;
    protected String registro;
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public baseUsuario(int codigo, String nome, String telefone, String email, LocalDate dtNascimento, String usuario,
            String registro) {
        super(codigo, nome, telefone, email, dtNascimento);
        this.usuario = usuario;
        this.registro = registro;
    }
    
        
}

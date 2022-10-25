
package redesahora.DTO;


public class RedSocial {
    protected String usuario;
    protected String password;
    
    public RedSocial(){
        this.usuario = "";
        this.password = "";
    }

    public RedSocial(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void listar(){
        System.out.println("Usuario: " + this.usuario);
        System.out.println("Contraseña: " + this.password);
    }
    
    
    public String mostrar(){
        return usuario;
    }
    
}

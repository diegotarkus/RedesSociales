
package redesahora.DTO;


public class Instagram extends RedSocial {
    private int id;
    private String historia;
    private boolean estado;
    
    public Instagram (){
        this.id = 0;
        this.historia = "";
        this.estado = false;
    }

    public Instagram(int id, String historia, boolean estado, String usuario, String password) {
        super(usuario, password);
        this.id = id;
        this.historia = historia;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public void lista(){
        super.listar();
        System.out.println("ID: " + this.id);
        System.out.println("Estado: " + this.estado);
        System.out.println("Historia: " + this.historia);
    }
    
    public String mostrarHistoria(){
        return super.mostrar() + ": " + this.historia; 
    }
    
    public String mostrarEstado(){
        return "Conectado?: " + this.estado; 
    }
    
    public void Imprimir(){
        System.out.println(this.usuario);
    }
        
    @Override
    
    public String toString(){
        return (this.usuario);
    }
   }
   


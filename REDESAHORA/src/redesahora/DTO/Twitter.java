
package redesahora.DTO;

import java.util.Date;


public class Twitter extends RedSocial{
    private int id;
    private String noticia;
    private Date fecha;
    
    public Twitter (){
        this.id = 0;
        this.noticia = "";
        this.fecha = new Date();
    }

    public Twitter(int id, String noticia, Date fecha, String usuario, String password) {
        super(usuario, password);
        this.id = id;
        this.noticia = noticia;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoticia() {
        return noticia;
    }

    public void setNoticia(String noticia) {
        this.noticia = noticia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public void lista(){
        super.listar();
        System.out.println("ID: " + this.id);
        System.out.println("Noticia: " + this.noticia);
        System.out.println("Fecha: " + this.fecha);
    }
    
    public String mostrarNoticia(){
        return super.mostrar() + ": " + this.noticia;
    }
    
    public String mostrarFecha(){
        return super.mostrar() + ": " + this.fecha;
    }
    
    public void Imprimir(){
        System.out.println(this.usuario);
    }
    
    @Override
    public String toString(){
        return this.usuario;
    }
}

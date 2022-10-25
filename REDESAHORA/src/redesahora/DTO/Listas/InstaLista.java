
package redesahora.DTO.Listas;

import java.util.ArrayList;
import redesahora.DTO.Instagram;


public class InstaLista {
    private ArrayList<Instagram> lista;
    
    public InstaLista(){
        lista = new ArrayList();
    }

    public InstaLista(ArrayList<Instagram> lista) {
        this.lista = lista;
    }

    public ArrayList<Instagram> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Instagram> lista) {
        this.lista = lista;
    }
    
    public void AgregarInstagram(Instagram instagram){
        this.lista.add(instagram);
    }
    
    public void Imprimir (){
        for (Instagram instagram : this.lista){
            System.out.println(instagram);
        }
    
        
    }
}
    
    


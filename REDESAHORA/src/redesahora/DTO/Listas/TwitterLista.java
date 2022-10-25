
package redesahora.DTO.Listas;

import java.util.ArrayList;
import redesahora.DTO.Twitter;

public class TwitterLista {
    ArrayList<Twitter> lista;
    
    public TwitterLista(){
        lista = new ArrayList();
    }

    public TwitterLista(ArrayList<Twitter> lista) {
        this.lista = lista;
    }

    public ArrayList<Twitter> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Twitter> lista) {
        this.lista = lista;
    }
    
    public void AgregarTwitter(Twitter twitter){
        this.lista.add(twitter);
    }
    
    public void Imprimir(){
        for (Twitter twitter : this.lista){
            System.out.println(twitter);
        }
            
    }
}

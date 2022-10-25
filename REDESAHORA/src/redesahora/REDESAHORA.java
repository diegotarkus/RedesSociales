
package redesahora;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import redesahora.DTO.Instagram;
import redesahora.DTO.Listas.InstaLista;
import redesahora.DTO.Listas.TwitterLista;
import redesahora.DTO.Twitter;


public class REDESAHORA {

    public static void main(String[] args) {
        InstaLista listaIg = new InstaLista();
        TwitterLista listaTw = new TwitterLista();
        Scanner sc = new Scanner(System.in);
        
        
        Instagram insta1 = new Instagram();
        insta1.setUsuario("Diego");
        insta1.setPassword("pico666");
        insta1.setId(20);
        insta1.setHistoria("Aqui con los cauros");
        insta1.setEstado(true);
        
        listaIg.AgregarInstagram(insta1);
        
        Instagram insta2 = new Instagram();
        insta2.setUsuario("Bodoque");
        insta2.setPassword("holanda");
        insta2.setId(70);
        insta2.setHistoria("EL TULIO SE LA KOME");
        insta2.setEstado(false);
        
        listaIg.AgregarInstagram(insta2);
        
        Twitter twit1 = new Twitter();
        twit1.setUsuario("Pepito");
        twit1.setPassword("tula999");
        twit1.setId(56);
        twit1.setNoticia("Alexis Sanchez se declara homosexual");
        twit1.setFecha(new Date());
        
        listaTw.AgregarTwitter(twit1);
        
        Twitter twit2 = new Twitter();
        twit2.setUsuario("Loreno");
        twit2.setPassword("loreno");
        twit2.setId(69);
        twit2.setNoticia("Se culearon a tu hermana!");
        twit2.setFecha(new Date());
        
        listaTw.AgregarTwitter(twit2);
        
        boolean exit = false;
        do{
            System.out.println("=======******=======");
            System.out.println("1. Mostrar historias Instagram");
            System.out.println("2. Mostrar noticias Twitter");
            System.out.println("3. Ver datos usuarios Instagram");
            System.out.println("4. Ver datos usuarios Twitter");
            System.out.println("5. Lista de usuarios RRSS");
            System.out.println("6. Salir");
            System.out.println("=======******=======");
            System.out.println("Ingrese opción: ");
            int op = sc.nextInt();

            
            switch(op){
                case 1:
                    System.out.println(insta1.mostrarHistoria());
                    System.out.println(insta1.mostrarEstado());
                    System.out.println("-------");
                    System.out.println(insta2.mostrarHistoria());
                    System.out.println(insta2.mostrarEstado());
                    break;
                case 2:
                    System.out.println(twit1.mostrarNoticia());
                    System.out.println(twit1.mostrarFecha());
                    System.out.println("-------");
                    System.out.println(twit2.mostrarNoticia());
                    System.out.println(twit2.mostrarFecha());
                    break;
                case 3:
                    System.out.println("Datos de usuario Instagram: ");
                    insta1.lista();
                    System.out.println("=================");
                    insta2.lista();
                    break;
                case 4:
                    System.out.println("Datos de usuario Twitter: ");
                    twit1.listar();
                    System.out.println("=================");
                    twit2.listar();
                    break;
                case 5:
                    System.out.println("=================");
                    System.out.println("Lista Instagram: ");      
                    listaIg.Imprimir();
                    System.out.println("=================");
                    System.out.println("Lista Twitter: ");
                    listaTw.Imprimir();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Ingrese un número correcto.");
                    sc.nextInt();
                }
            } while (!exit);
    }
}
        
            
            
               
        
        

        /*System.out.println(insta1.mostrarHistoria());
        System.out.println(insta1.mostrarEstado());
        System.out.println("=================");
        System.out.println(twit1.mostrarNoticia());
        System.out.println(twit1.mostrarFecha());
        System.out.println("Datos de usuario Instagram: ");
        insta1.listar();
        System.out.println("=================");
        insta2.listar();
        System.out.println("=================");
        System.out.println("Datos de usuario Twitter: ");
        twit1.listar();
        System.out.println("=================");
        twit2.listar();
        System.out.println("=================");
        System.out.println("Lista Instagram: ");      
        listaIg.Imprimir();
        System.out.println("=================");
        System.out.println("Lista Twitter: ");
        listaTw.Imprimir();
        
            
        }
        */
        

    
    


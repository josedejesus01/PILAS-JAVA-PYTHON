
package Pilas;
import java.util.Scanner;
/**
 *
 * @author JOSE
 */
public class composicion_Pila {
    Scanner entrada=new Scanner(System.in);// se insetar la libreria escanner para leer los datos
    Pila cima;// se crea una variable que es de tipo pila 
    public composicion_Pila(){ // se define la cabeza o el inicio  de nuestr pila o la cima 
        cima=null;// se crea nuestra variable con un valor null
        
    }
    public void ingresarPila(){// se crea nuestro metodo ingresar pila 
        Pila nuevo =new Pila();// se crea una variable de tipo pila
        System.out.println("ingrese el dato que contendra la nuevo pila");// se pide el valor desde el teclado
        nuevo.dato=entrada.nextInt();// se da un valor al nuevo dato para identificarlo
       nuevo.siguente=cima;// se inserta la variable nuevo con nuestro apuntador siguente para
                           // indicar que vaya y haga lo que esta haciendo nuestro dato cima
        cima=nuevo;// se inserta la variable cima indicandole al nuevo valor que este introducido en ella
        System.out.println("\n valor de pila  ingresado correctamente: " );// se imprime el mesaje con la instruccion de datos introcucidos
        
    }
    public void desplegarpila(){// se crea un metodo  para ver si los datos son ingresados correctamente
       Pila actual=new Pila();// se crea un objeto de tipo pila 
        actual=cima; // este pila actual apuntara a la variable cima
        if(cima!=null){ // se usa una condicion, si cima es diferente de null 
            while(actual!=null){// se utiliza una condicion, mientras actual es diferentes  a null y si es igual rompe el ciclo
                System.out.println(""+actual.dato);// le indicamos que se imprima el valor de actual dato 
                actual=actual.siguente;//se crea una instruccion actual que de un salto al siguente pila 
            }
        }else{
            System.out.println("\n la pila se encuentra vacia: ");// se introduce el mensaje para indicar si esta vacia nuestro pila
            
            
        }
        
    }
}


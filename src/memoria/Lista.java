/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memoria;

/**
 *
 * @author ashley
 */
public class Lista {
    
    private Nodo inicio = null;
    private int size=0;
    
    public boolean isEmpty(){
        return inicio==null;
    }
    
    public void add(Nodo objeto){
        if(objeto==null)
            return;
        if(isEmpty()){
            inicio=objeto;
        } else{
            Nodo tmp = inicio;
            
            while(tmp.siguiente != null){
                tmp = tmp.siguiente;
            }
            
            tmp.siguiente = objeto;
        }
        
        size++;
    }
    
    public void print() {
        Nodo tmp = inicio;

        while (tmp != null) {
            System.out.println(tmp);
            tmp = tmp.siguiente;
        }
    }
    
    public Nodo get(int code){
        
        Nodo tmp = inicio;
        
        while(tmp!=null){
            
            if(tmp.codigo==code)
                return tmp;
            
            tmp = tmp.siguiente;
        }
        
        return null;
    }
    
    /*
        Continuar con el ejercicio de lista y nodo.
    
        Agregar las siguientes funciones:
        Eliminar un nodo cuyo código coincida usando remove(int codigo). Debe devolver true si lo eliminó correctamente o false si no se encontró.

        Obtener la cantidad de nodos almacenados con el método size().

        Insertar un nodo en una posición específica con el método add(int index, Nodo obj). Si el índice es mayor al tamaño de la lista debe lanzar IndexOutOfBoundsException. Si el índice es 0, el nodo debe colocarse al inicio.

        Crear una clase Main, en donde, se debe probar las opciones publicas y crear un menú que permita ingresar datos desde el teclado(consola)
        Nota: Evitar el uso de chatGPT(No recomendado).
    */
    
    public boolean eliminar(int code){
        
        if(isEmpty()){
            return false;
        }
        
        if(inicio != null && inicio.codigo == code){
            inicio = inicio.siguiente;
            size--;
            return true;
        }
        
        Nodo tmp = inicio;
        
        while(tmp != null && tmp.siguiente != null){
            if(tmp.siguiente.codigo == code){
                tmp.siguiente = tmp.siguiente.siguiente;
                size--;
                return true;
            }
            tmp = tmp.siguiente;
            
        }
        
        return false;  
    }
    
    public int size(){
        return size;
    }
    
    public void add(int index, Nodo objeto){
        
        if(objeto==null)
            return;
        
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Indice "+index+", size "+size);
        }
        
        if(index == 0){
            objeto.siguiente = inicio;
            inicio = objeto;
        } else {
            Nodo tmp = inicio;
            
             for (int i = 0; i < index-1 ; i++) {
                tmp = tmp.siguiente;
            }
             
            objeto.siguiente = tmp.siguiente;
            tmp.siguiente = objeto;
        }
        
        size++;
    }

}

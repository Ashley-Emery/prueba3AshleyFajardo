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
    
    // falta eliminar

}

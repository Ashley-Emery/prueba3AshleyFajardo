/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memoria;

/**
 *
 * @author ashley
 */

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        /*
            Crear una clase Main, en donde, se debe probar las opciones publicas y crear un menú que permita ingresar datos desde el teclado(consola)
            Nota: Evitar el uso de chatGPT(No recomendado).
        */
        
        Lista lista = new Lista();
        
        Scanner sc = new Scanner(System.in);
        
        int opcion = 0;
        
        do{
            System.out.println("** ========= MENU ========= **");
            System.out.println("1. Agregar nodo (al final)");
            System.out.println("2. Agregar nodo en posicion especifica");
            System.out.println("3. Eliminar un nodo por codigo");
            System.out.println("4. Imprimir lista");
            System.out.println("5. Buscar nodo por codigo");
            System.out.println("6. Mostrar tamano");
            System.out.println("7. Salir");
            
            System.out.print("> ");
            opcion=sc.nextInt();
            
            sc.nextLine();
            
            switch (opcion) {
                
                case 1 -> {
                    System.out.print("Codigo: ");
                    int codigo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    lista.add(new Nodo(codigo, nombre));
                    System.out.println("Nodo agregado");
                }
                
                case 2 -> {
                    System.out.print("Indice donde insertar: ");
                    int index = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Codigo: ");
                    int codigo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    lista.add(index, new Nodo(codigo, nombre));
                    System.out.println("Nodo insertado en indice: "+index);
                }
                
                case 3 -> {
                    System.out.print("Codigo del nodo a eliminar: ");
                    int codeDel = sc.nextInt();
                    sc.nextLine();

                    if (lista.eliminar(codeDel)) {
                        System.out.println("Nodo eliminado");
                    } else {
                        System.out.println("No existe un nodo con ese codigo");
                    }
                }
                
                case 4 -> {
                    System.out.println("\nContenido de la lista:");
                    lista.print();
                }
                
                case 5 -> {
                    
                    System.out.print("Código del nodo a buscar: ");
                    int codeBusc = sc.nextInt();
                    sc.nextLine();

                    Nodo node = lista.get(codeBusc);
                    if (node != null) {
                        System.out.println("Nodo encontrado: "+node);
                    } else {
                        System.out.println("No existe un nodo con ese codigo");
                    }
                }
                
                case 6 -> {
                    System.out.println("Tamano actual de la lista: "+lista.size());
                }
                
                case 7 -> System.out.println("\n");
                default -> System.out.println("Opcion invalida. Intente otra vez.");
            }

        } while (opcion != 7);

    }
}

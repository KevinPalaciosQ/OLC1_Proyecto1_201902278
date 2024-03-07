/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import java.util.LinkedList;

/**
 *
 * @author kevin
 */
public class saltos {
    public static int contador = 0;
    public static LinkedList<String> lista_general = new LinkedList<>();
    public static String recepcion(LinkedList<Object> valores) {
        StringBuilder recibir = new StringBuilder("! Salida: ");
        int size = valores.size();
        for (int i = 0; i < size; i++) {
            recibir.append(valores.get(i));
            if (i < size - 1) { // Agregar coma y espacio si no es el último elemento
                recibir.append(", ");
            }
        }
        recibir.append("\n");
        return recibir.toString();
    }
    
    public static String lista_salto_de_linea(Object[] lista, String nombretitulo){
        StringBuilder t = new StringBuilder("------------\n");
        t.append(nombretitulo);
        t.append("\n------------\n");
        contador++; // Incrementar contador
        for (int i = 0; i < lista.length; i++) {
            t.append(lista[i].toString()+"\n");
        }
        return t.toString();
    }

    public static void mostrar(){
        
        lista_general.forEach(System.out::print);
    }
}
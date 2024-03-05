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

    public static LinkedList<String> lista_salto_de_linea(LinkedList<String> lista){
        contador++; // Incrementar contador
        for (int i = 0; i < lista.size(); i++) {
            lista.set(i, "\n" + lista.get(i));
        }
        return lista;
    }

    public static void mostrar(){
        lista_general.forEach(System.out::print);
    }
}
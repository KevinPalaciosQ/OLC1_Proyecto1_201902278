/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

/**
 *
 * @author kevin
 */
public class est {

    public static void main(String[] args) {
        // Ejemplo de lista de datos enteros
        int[] valores = {10, 20, 15, 18, 12};

        // Llamar a la función para calcular la media y obtener el resultado
        double mediaCalculada = media(valores);

        // Imprimir la media
        System.out.println("La media es: " + mediaCalculada);
    }

    public static double media(int[] datos) {
        // Convertir el arreglo de enteros a un arreglo de dobles
        double[] valores = new double[datos.length];
        for (int i = 0; i < datos.length; i++) {
            valores[i] = (double) datos[i];
        }

        // Crear un objeto DescriptiveStatistics y agregar los valores
        DescriptiveStatistics stats = new DescriptiveStatistics();
        for (double valor : valores) {
            stats.addValue(valor);
        }

        // Calcular y retornar la media
        return stats.getMean();
    }
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import java.util.Arrays;

/**
 *
 * @author kevin
 */
public class estadisticas {
        public static void main(String[] args) {
        // Prueba de las funciones
        double[] VALORES = {9,3,8,8,9,8,9,18};
        double media = Media(VALORES);
        double mediana = Mediana(VALORES);
        double moda = Moda(VALORES);
        double varianza = Varianza(VALORES);
        double maximo = Maximo(VALORES);
        double minimo = Minimo(VALORES);
      

        System.out.println("La media es: " + media);
        System.out.println("La mediana es: " + mediana);
        System.out.println("La moda es: " + moda);
        System.out.println("La Varianza es: " + varianza);
        
        System.out.println("El valor máximo en el arreglo es: " + maximo);
        System.out.println("El valor minímo en el arreglo es: " + minimo);
        
    }
        
    public static double Media(double[] arreglo) {
        if (arreglo == null || arreglo.length == 0) {
            // Manejar el caso en que el arreglo esté vacío o sea nulo
            throw new IllegalArgumentException("El arreglo no puede ser nulo o vacío");
        }

        double suma = 0;

        // Calcular la suma de todos los elementos en el arreglo
        for (double valor : arreglo) {
            suma += valor;
        }

        // Calcular la media dividiendo la suma por el número de elementos
        double media = suma / arreglo.length;

        return media;
    }        
    public static double Mediana(double[] arreglo) {
        if (arreglo == null || arreglo.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo o vacío");
        }

        // Ordenar el arreglo
        Arrays.sort(arreglo);

        int n = arreglo.length;
        if (n % 2 == 0) {
            // Si hay una cantidad par de elementos, calcular la media de los dos valores centrales
            return (arreglo[n / 2 - 1] + arreglo[n / 2]) / 2.0;
        } else {
            // Si hay una cantidad impar de elementos, devolver el valor central
            return arreglo[n / 2];
        }
    }    
    public static double Moda(double[] arreglo) {
        if (arreglo == null || arreglo.length == 0) {
            // Manejar el caso en que el arreglo esté vacío o sea nulo
            throw new IllegalArgumentException("El arreglo no puede ser nulo o vacío");
        }

        // Ordenar el arreglo para facilitar la búsqueda de la moda
        Arrays.sort(arreglo);

        double moda = arreglo[0]; // Primer Elemento es moda
        int maxFrecuencia = 1; // Frecuencia máxima encontrada hasta ahora
        int frecuenciaActual = 1; // Frecuencia del elemento actual
        double elementoActual = arreglo[0]; // Elemento actual

        // Iterar sobre el arreglo para encontrar la moda
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] == elementoActual) {
                frecuenciaActual++;
            } else {
                if (frecuenciaActual > maxFrecuencia) {
                    maxFrecuencia = frecuenciaActual;
                    moda = elementoActual;
                }
                frecuenciaActual = 1;
                elementoActual = arreglo[i];
            }
        }

        // Comprobar el último grupo de elementos
        if (frecuenciaActual > maxFrecuencia) {
            moda = elementoActual;
        }

        return moda;
    }

    public static double Varianza(double[] arreglo) {
        if (arreglo == null || arreglo.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo o vacío");
        }

        double media = Media(arreglo);
        double sumaCuadradosDiferencias = 0;

        // Calcular la suma de los cuadrados de las diferencias entre cada valor y la media
        for (double valor : arreglo) {
            sumaCuadradosDiferencias += Math.pow(valor - media, 2);
        }

        // Calcular la varianza dividiendo la suma de los cuadrados de las diferencias entre el número de elementos
        double varianza = sumaCuadradosDiferencias / arreglo.length;

        return varianza;
    }    
    public static double Maximo(double[] arreglo) {
        if (arreglo == null || arreglo.length == 0) {
            // Manejar el caso en que el arreglo esté vacío o sea nulo
            throw new IllegalArgumentException("El arreglo no puede ser nulo o vacío");
        }

        double maximo = arreglo[0]; // Suponemos que el primer elemento es el máximo inicialmente

        // Iteramos sobre el arreglo para encontrar el máximo
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
        }

        return maximo;
    }
    public static double Minimo(double[] arreglo) {
        if (arreglo == null || arreglo.length == 0) {
            // Manejar el caso en que el arreglo esté vacío o sea nulo
            throw new IllegalArgumentException("El arreglo no puede ser nulo o vacío");
        }

        double minimo = arreglo[0]; // Suponemos que el primer elemento es el máximo inicialmente

        // Iteramos sobre el arreglo para encontrar el máximo
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < minimo) {
                minimo = arreglo[i];
            }
        }

        return minimo;
    }

}

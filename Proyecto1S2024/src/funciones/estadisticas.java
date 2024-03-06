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
        double media = media(VALORES);
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
        
    public static double media(double[] arreglo) {


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


        double media = media(arreglo);
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


        double minimo = arreglo[0]; // Suponemos que el primer elemento es el máximo inicialmente

        // Iteramos sobre el arreglo para encontrar el máximo
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < minimo) {
                minimo = arreglo[i];
            }
        }

        return minimo;
    }
    public static void calcularFrecuencias(double[] valores) {
        // Ordenamos los valores para facilitar el cálculo
        Arrays.sort(valores);

        // Creamos un array para almacenar los valores únicos y su frecuencia
        double[] valoresUnicos = new double[valores.length];
        int indiceUnico = 0;

        // Calculamos las frecuencias para cada valor único
        double valorActual = valores[0];
        int frecuencia = 1;
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] == valorActual) {
                frecuencia++;
            } else {
                valoresUnicos[indiceUnico] = valorActual;
                indiceUnico++;
                valorActual = valores[i];
                frecuencia = 1;
            }
        }
        // Agregamos el último valor único
        valoresUnicos[indiceUnico] = valorActual;

        // Calculamos la cantidad total de valores únicos
        int totalValoresUnicos = indiceUnico + 1;

        // Creamos arrays para almacenar las frecuencias brutas y acumuladas
        int[] fb = new int[totalValoresUnicos];
        int[] fa = new int[totalValoresUnicos];
        double[] fr = new double[totalValoresUnicos];

        // Calculamos las frecuencias brutas y acumuladas, y las frecuencias relativas acumuladas
        int frecuenciaAcumulada = 0;
        double sumaFr = 0;
        for (int i = 0; i < totalValoresUnicos; i++) {
            fb[i] = contarRepeticiones(valores, valoresUnicos[i]);
            frecuenciaAcumulada += fb[i];
            fa[i] = frecuenciaAcumulada;
            fr[i] = (double) Math.round(((double) fb[i] / valores.length) * 100);
            sumaFr += fr[i];
        }

        // Imprimimos la cabecera de la tabla
        System.out.println("_____________________________");
        
        System.out.println("Valor\tFb\tFa\tFr");
        System.out.println("_____________________________");

        // Imprimimos los datos
        for (int i = 0; i < totalValoresUnicos; i++) {
            System.out.println(valoresUnicos[i] + "\t" + fb[i] + "\t" + fa[i] + "\t" + fr[i]+"%");
        }

        // Imprimimos la línea divisoria inferior y los totales
        System.out.println("_____________________________");
        System.out.println("Totales: " + Arrays.stream(fb).sum() + "\t" + Arrays.stream(fa).sum() + "\t" + sumaFr + "%");
        System.out.println("_____________________________");
    }

    public static int contarRepeticiones(double[] array, double valor) {
        int contador = 0;
        for (double elemento : array) {
            if (elemento == valor) {
                contador++;
            }
        }
        return contador;
    }

}

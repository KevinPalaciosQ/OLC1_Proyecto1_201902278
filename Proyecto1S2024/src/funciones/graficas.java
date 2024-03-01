/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.statistics.HistogramDataset;

/**
 *
 * @author kevin
 */
public class graficas {
    public static void barras(
            String Titulo, 
            String TituloX,
            String TituloY,
            double valores[],
            String ejex []
    )
    {
        //Ingreso de datos
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    
        dataset.addValue(2.0, "Valor", "EjeX");
        
        for(int i = 0; i < 5; i++){
            dataset.addValue(valores[i], "Valor", ejex[i]);
        }
        
        // Creación de gráfica
        JFreeChart grafica = 
            ChartFactory.createBarChart(
                Titulo, //TITULO
                TituloX, TituloY, 
                dataset, 
                PlotOrientation.VERTICAL,
                true, true, true);
        
        
        // Mostrar
        ChartFrame frame = new ChartFrame("Ejemplo", grafica);
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void linea(
            String Titulo, 
            String TituloX,
            String TituloY,
            double valores[],
            String ejex []
    )
    {
        //Ingreso de datos
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    
        
        for(int i = 0; i < 5; i++){
            dataset.addValue(valores[i], "Valor", ejex[i]);
        }
        
        // Creación de gráfica
        JFreeChart grafica = 
            ChartFactory.createLineChart(
                    Titulo, 
                    TituloX,
                    TituloY, 
                    dataset);
        
        
        // Mostrar
        ChartFrame frame = new ChartFrame("Proyecto1", grafica);
        frame.pack();
        frame.setVisible(true);
    }
    
    
    public static void Pie(
            String Titulo, 
            String TituloX,
            String TituloY,
            double valores[],
            String ejex []
    )
    {
        //Entrada de datos
        DefaultPieDataset dataset = new DefaultPieDataset( );
      
        for(int i = 0; i < 5; i++){
            dataset.setValue(ejex[i], valores[i]);
        }
        // Creación de gráfica
        JFreeChart grafica = 
            ChartFactory.createPieChart(Titulo, dataset);
            //ChartFactory.createHistogram(Titulo, TituloY, TituloY, dataset, PlotOrientation.HORIZONTAL, true, true, true)
        
        //Invocar grafica
        ChartFrame frame = new ChartFrame("Proyecto1", grafica);
        frame.pack();
        frame.setVisible(true);
    }
public static void histograma(
            String titulo,
            double valores[]
    ) {
        // Crear conjunto de datos para el histograma
        HistogramDataset dataset = new HistogramDataset();
        
        dataset.addSeries("Histograma", valores,15); // 10 es el número de bins (intervalos)

        // Crear histograma
        JFreeChart grafica =
                ChartFactory.createHistogram(
                        titulo,
                        null,
                        null,
                        dataset,
                        PlotOrientation.VERTICAL,
                        true,
                        true,
                        false);

        // Mostrar histograma
        ChartFrame frame = new ChartFrame("Análisis de Arreglo", grafica);
        frame.pack();
        frame.setVisible(true);
    }     
}
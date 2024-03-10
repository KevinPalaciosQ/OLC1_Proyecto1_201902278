/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;



import static funciones.reportes.abrirArchivoHTML;
import java.awt.Color;
import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Position;
import javax.swing.text.Segment;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.statistics.HistogramDataset;

/**
 *
 * @author kevin
 */
public class graficas {
    public static int contador = 0; // Contador para nombres correlativos
    
    public static String titulo = "";
    public static String titulox ="";
    public static String tituloy ="";
    public static String[] label = {};
    public static double[] values ={};
    public static String[] ejex = {};
    public static double[] ejey = {};
    
    double[] valores = {10.0, 20.0, 30.0, 40.0, 50.0, 10.0, 20.0};
public static List<String> imageFiles = new ArrayList<>();
public static void limpiarParametros() {
    titulo = "";
    titulox = "";
    tituloy = "";
    label = new String[]{};
    values = new double[]{};
    ejex = new String[]{};
    ejey = new double[]{};
}
public static void generarGraficas() {
    try {
        String rutaHTML = "C:\\Users\\kevin\\OneDrive\\Documentos\\OLC1_Proyecto1_201902278\\Proyecto1S2024\\\\ReportesGraficas.html";
        HtmlImagen(imageFiles, rutaHTML);
        abrirArchivoHTML(rutaHTML);
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    public static String barras(
            //String titulo,
            //String Titulo,
            //String TituloX,
            //String TituloY,
            //double valores[],
            //String ejex[]
    ) throws IOException {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (int i = 0; i < ejey.length; i++) {
            dataset.addValue(ejey[i], titulox, ejex[i]);
        }

        JFreeChart grafica = ChartFactory.createBarChart(
                titulo,
                titulox,
                tituloy,
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false);

        // Personaliza los colores de las barras con valores aleatorios
        CategoryPlot plot = grafica.getCategoryPlot();
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        Random random = new Random();
        for (int i = 0; i < ejey.length; i++) {
            Color randomColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            renderer.setSeriesPaint(i, randomColor);
        }


        // Guarda la gráfica como archivo JPEG
        String filename = "barras_" + contador + ".jpg";
        contador++; // Incrementar el contador
        ChartUtilities.saveChartAsJPEG(new File(filename), grafica, 500, 300);

        return filename;
    }


    public static String linea(

    ) throws IOException {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
       
       for (int i = 0; i < ejey.length; i++) {
        dataset.addValue(ejey[i], titulox, ejex[i]);
    }

        JFreeChart grafica = ChartFactory.createLineChart(
                titulo,
                titulox,
                tituloy,
                dataset);

        String filename = "linea_" + contador + ".jpg";
        contador++; // Incrementar el contador
        ChartUtilities.saveChartAsJPEG(new File(filename), grafica, 500, 300);
        return filename;
    }

    public static String pie(
            
    ) throws IOException {
        DefaultPieDataset dataset = new DefaultPieDataset();

        for (int i = 0; i < values.length; i++) {
            dataset.setValue( label[i], values[i]);
            
        }

        JFreeChart grafica = ChartFactory.createPieChart(titulo, dataset);
            PiePlot plot = (PiePlot) grafica.getPlot();
            plot.setLabelGenerator(new StandardPieSectionLabelGenerator("{0}: {1}"));
        String filename = "pie_" + contador + ".jpg";
        contador++; // Incrementar el contador
        ChartUtilities.saveChartAsJPEG(new File(filename), grafica, 500, 300);
        return filename;
    }

    public static String histograma() throws IOException {
        
        HistogramDataset dataset = new HistogramDataset();



        dataset.addSeries(titulo, values,15);

        JFreeChart grafica = ChartFactory.createHistogram(
                titulo,
                null,
                null,
                dataset,
                org.jfree.chart.plot.PlotOrientation.VERTICAL,
                true,
                true,
                false);

        String filename = "histograma_" + contador + ".jpg";
        contador++; // Incrementar el contador
        ChartUtilities.saveChartAsJPEG(new File(filename), grafica, 500, 300);
        return filename;
    }

    public static void HtmlImagen(List<String> imageFiles, String outputFile) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write("<!DOCTYPE html>");
            writer.write("<html>");
            writer.write("<head>");
            writer.write("<title>Gráficos Generados</title>");
            writer.write("<style>");
            writer.write("img {");
            writer.write("display: block;");
            writer.write("margin-left: auto;");
            writer.write("margin-right: auto;");
            writer.write("margin-bottom: 20px;"); // Añadir margen entre las imágenes
            writer.write("}");
            writer.write("</style>");
            writer.write("</head>");
            writer.write("<body style='background-color: #ADD8E6;'>"); // Fondo celeste

            for (String imageFile : imageFiles) {
                writer.write("<img src='" + imageFile + "'><br>");
            }

            writer.write("</body>");
            writer.write("</html>");
        }
    }

    public static void abrirArchivoHTML(String rutaHTML) {
        File archivoHTML = new File(rutaHTML);

        if (archivoHTML.exists()) {
            try {
                Desktop.getDesktop().browse(archivoHTML.toURI());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("El archivo HTML no existe.");
        }
    }
}
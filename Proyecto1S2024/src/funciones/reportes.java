/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;


public class reportes {
    //otros
    public static LinkedList<Object> ListaTokensDF = new LinkedList<Object>();
    public static LinkedList<Object> ListaErroresDF = new LinkedList<Object>();
    


    public static void TablaTokensDF(String lexema, String token, int linea, int columna) {
        funciones.tokensdataforge tokensS = new funciones.tokensdataforge();
        tokensS.recibir_token(lexema, token, linea, columna);
        ListaTokensDF.add(tokensS);
    }

    public static void TablaErroresDF(String lexema, String descripcion, int linea, int columna) {
        funciones.erroresdataforge error_df = new funciones.erroresdataforge();
        error_df.recibir_error_dataforge(lexema, descripcion, linea, columna);
        ListaErroresDF.add(error_df);
    }

    public static void tokens_DF() {
        // Generar el código HTML
        StringBuilder constructort = new StringBuilder();
        constructort.append("<html lang=\"en\">");
        constructort.append("<head>");
        constructort.append("<meta charset=\"utf-8\">");
        constructort.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
        constructort.append("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">");
        constructort.append("<link rel=\"shortcut icon\" href=\"Icono.ico\">");
        constructort.append("<title>Reporte de Tokens DataForge</title>");
        constructort.append("</head>");
        constructort.append("<body>");
        constructort.append("<div class=\"p-3 mb-2 text-white\" style=\"background-color:#63e526\">");
        constructort.append("<h1><center>Reporte de Tokens DataForge</center></h1>");
        constructort.append("</div>");
        constructort.append("<table class=\"table table-dark table-hover table-bordered\">");
        constructort.append("<thead>");
        constructort.append("<tr>");
        constructort.append("<th scope=\"col\">#</th>");
        constructort.append("<th scope=\"col\">Lexema</th>");
        constructort.append("<th scope=\"col\">Token</th>");
        constructort.append("<th scope=\"col\">Línea</th>");
        constructort.append("<th scope=\"col\">Columna</th>");
        constructort.append("</tr>");
        constructort.append("</thead>");
        constructort.append("<tbody>");
        int contadort = 1;
        for (Object tokensS : ListaTokensDF) {
            funciones.tokensdataforge dato = (funciones.tokensdataforge) tokensS;
            constructort.append("<tr class=\"table-success\">");
            constructort.append("<td>").append(contadort).append("</td>");
            constructort.append("<td>").append(dato.getLexema()).append("</td>");
            constructort.append("<td>").append(dato.getToken()).append("</td>");
            constructort.append("<td>").append(dato.getLinea()).append("</td>");
            constructort.append("<td>").append(dato.getColumna()).append("</td>");
            constructort.append("</tr>");
            contadort++;
        }

        constructort.append("</tbody>");
        constructort.append("</table>");
        constructort.append("</body>");
        constructort.append("</html>");

        // Escribir el código HTML en un archivo
        try {
            FileWriter tokensS = new FileWriter("ReporteTokens_DataForge.html");
            tokensS.write(constructort.toString());
            tokensS.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
        ListaTokensDF.clear();

    }


    public static void errores_DF() {
        // Generar el código HTML
        StringBuilder constructor = new StringBuilder();
        constructor.append("<!doctype html>");
        constructor.append("<html lang=\"en\">");
        constructor.append("<head>");
        constructor.append("<meta charset=\"utf-8\">");
        constructor.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
        constructor.append("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">");
        constructor.append("<link rel=\"shortcut icon\" href=\"Icono.ico\">");
        constructor.append("<title>Reporte de Errores DataForge</title>");
        constructor.append("</head>");
        constructor.append("<body>");
        constructor.append("<div class=\"p-3 mb-2 text-white\" style=\"background-color: #d84933 \">");
        constructor.append("<h1><center>Reporte de Errores DataForge</center></h1>");
        constructor.append("</div>");
        constructor.append("<table class=\"table table-dark table-hover table-bordered\">");
        constructor.append("<thead>");
        constructor.append("<tr>");
        constructor.append("<th scope=\"col\">#</th>");
        constructor.append("<th scope=\"col\">Lexema</th>");
        constructor.append("<th scope=\"col\">Descripción</th>");
        constructor.append("<th scope=\"col\">Fila</th>");
        constructor.append("<th scope=\"col\">Columna</th>");
        constructor.append("</tr>");
        constructor.append("</thead>");
        constructor.append("<tbody>");

        int contadores = 1;
        for (Object danos : ListaErroresDF) {
            funciones.erroresdataforge dato = (funciones.erroresdataforge) danos;
            constructor.append("<tr class=\"table-danger\">");
            constructor.append("<th scope=\"row\">").append(contadores).append("</th>");
            constructor.append("<td>").append(dato.getLexema()).append("</td>");
            constructor.append("<td>").append(dato.getDescripcion()).append("</td>");
            constructor.append("<td>").append(dato.getLinea()).append("</td>");
            constructor.append("<td>").append(dato.getColumna()).append("</td>");
            constructor.append("</tr>");
            contadores++;
        }

        constructor.append("</tbody>");
        constructor.append("</table>");
        constructor.append("</body>");
        constructor.append("</html>");

        // Escribir el código HTML en un archivo
        try (FileWriter danos = new FileWriter("ReporteErrores_DataForge.html")) {
            danos.write(constructor.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        ListaErroresDF.clear();
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

    public static void main(String[] args) {
        String rutaHTML = ("C:\\Users\\kevin\\OneDrive\\Documentos\\OLC1_Proyecto1_201902278\\Proyecto1S2024\\ReporteErrores_DataForge.html");;
        abrirArchivoHTML(rutaHTML);
    }
}

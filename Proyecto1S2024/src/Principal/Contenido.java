/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;
import GUI.Window;
import java.io.StringReader;
/**
 *
 * @author kevin
 */

public class Contenido {
  
        public static void main(String[] args) {  
        analizadores("src/DataForge_/", "Lexer.jflex", "Parser.cup"); 
        Window pantallita = new Window ();
        pantallita.setVisible(true);
    }
        public static void analizadores(String ruta, String jflexFile, String cupFile){
        try {
            String opcionesJflex[] =  {ruta+jflexFile,"-d",ruta};
            jflex.Main.generate(opcionesJflex);

            String opcionesCup[] =  {"-destdir", ruta,"-parser","Parser",ruta+cupFile};
            java_cup.Main.main(opcionesCup);
            
        } catch (Exception e) {
            System.out.println("No se ha podido generar los analizadores");
            System.out.println(e);
        }
    }       


        
        //pantallita.setLocation(null);
    }


    /*
    public static void main(String[] args) {
        // TODO code application logic here
        Window swindow = new Window ();
        swindow.setVisible(true);
    }
   
}
*/
/*
        public static void main(String[] args) {
        //analizadores("src/DataForge_/", "Lexer.jflex", "Parser.cup");
        
        String entrada = """
                         var : DOUBLE :: < - 2.5 END;
                         var : CHAR[] :: < - "HOLA" END;
                         """;
        
        
        
        analizar(entrada); System.out.println(DataForge_.Parser.resultado);
    }
    
 
    // Realizar Analisis
    public static void analizar (String entrada){
        try {
            DataForge_.Lexer lexer = new DataForge_.Lexer(new StringReader(entrada)); 
            DataForge_.Parser parser = new DataForge_.Parser(lexer);
            parser.parse();
        } catch (Exception e) {
            System.out.println("Error fatal en compilación de entrada.");
            System.out.println(e);
        }
 
} 
}
*/
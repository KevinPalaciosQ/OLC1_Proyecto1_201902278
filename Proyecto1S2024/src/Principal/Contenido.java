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
            
        //analizadores("src/DataForge_/", "Lexer.jflex", "Parser.cup"); 
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


        //public static void main(String[] args) {
        //analizadores("src/DataForge_/", "Lexer.jflex", "Parser.cup");
        /*
        String entrada = """
                                PROGRAM
                         	! Variables
                         	var:double:: notaAprobar <- 61 end;
                         	var:char[]:: labelAprobar <- "Nota Minima" end;
                         	
                         	! Arreglos
                         	arr:double:: @notas <- [notaAprobar, MUL(75, 0.45), DIV(SUM(80,20), RES(75,25))] end;
                         	arr:char[]:: @labels <- [labelAprobar, "P1", "P2"] end;
                         	!Prints
                         	var:char[]:: titulo1 <- "Titulo histograma" end;
                         	console::column = "test" -> [10, 15.5, 61.1] end;
                         	console::column = "Notas" -> @notas end;
                         	console::column = titulo1 -> @labels end;
                         	
                         	console::print = "Media", "Mediana", "Moda", "Varianza", "Max", "Min" end;
                         	console::print = Media(@notas), Mediana(@notas), Moda(@notas), Varianza(@notas), Max(@notas), Min(@notas) end;
                         	console::print = "Hola Mundo", MOD(10, 9), notaAprobar, labelAprobar end;
                         	
                         	
                         	<! FELICIDADES
                         		Lo de arriba ya es medio proyecto
                         		Tu puedes !>
                         	
                         	var:double:: gb1 <- 61 end;
                         	var:char[]:: gbt <- "Datos" end;
                         	graphBar(
                         		!grafica 1
                         		tituloX::char[] = "Actividades" end;
                         		tituloY::char[] = gbt end;
                         		titulo::char[] = "Estudiantes" end;
                         		ejeX::char[] = ["1 Parcial", "2 parcial", "Final"] end;
                         		ejeY::double = [gb1, 30, 70] end;
                         		EXEC graphBar end;
                         	) end;
                         	
                         	graphPie(
                         		<! FELICIDADES
                         		La de pie es facil !>
                         	
                         		label::char[] = ["Uno", "Dos", "Tres"] end;
                         		titulo::char[] = "Ejemplo Gráfica de Pie" end;
                         		values::double = [50, 30, 20] end;
                         		EXEC graphPie end;
                         	) end;
                         	
                         	
                         	graphLine(
                         	!testing de variables en graficas
                         		titulo::char[] = "Gráfica de Línea" end;
                         		ejeX::char[] = @labels end;
                         		ejeY::double = @notas end;
                         		tituloX::char[] = "Actividades" end;
                         		tituloY::char[] = "Notas" end;
                         		EXEC graphLine end;
                         	) end;
                         	
                         	Histogram(
                         		titulo::char[] = titulo1 end;
                         		values::char[] = [2,2,2,5,5,7,8] end;
                         		EXEC Histogram end;
                         	) end;
                         	
                         <! En las graficas los datos se declaran directamente o por medio de variables
                         Buena suerte
                         Deben generar todas las graficas en una ejecucion
                          !>
                         
                         END PROGRAM
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
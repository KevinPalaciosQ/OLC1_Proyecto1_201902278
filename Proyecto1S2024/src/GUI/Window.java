/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Font;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rtextarea.RTextScrollPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import javax.swing.border.Border;
import javax.swing.filechooser.FileFilter;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.statistics.HistogramDataset;

/**
 *
 * @author kevin
 */
public class Window extends javax.swing.JFrame {
    private JTabbedPane tabbedPane;
    private int tabCounter = 1;
    RSyntaxTextArea textArea;
    //public javax.swing.JPanel jPanel2;

    /**
     * Creates new form Window
     */
    public Window() {
        initComponents();
        RSyntax();
        setTitle("DataForge");
// Cargando la imagen desde la ruta especificada
        ImageIcon icono = new ImageIcon("C:\\Users\\kevin\\OneDrive\\Documentos\\OLC1_Proyecto1_201902278\\Proyecto1S2024\\src\\Iconos\\data-collection.png");

// Asignando el icono a la ventana principal
        setIconImage(icono.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Salida = new javax.swing.JTextArea();
        Pestana = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        NuevoArchivo = new javax.swing.JMenuItem();
        AbrirArchivo = new javax.swing.JMenuItem();
        Guardar = new javax.swing.JMenuItem();
        GuardarComo = new javax.swing.JMenuItem();
        EliminarPestana = new javax.swing.JMenu();
        NuevaPestana = new javax.swing.JMenuItem();
        NuevaPestanaa = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        ReportedeTokens = new javax.swing.JMenuItem();
        ReporteLexicos = new javax.swing.JMenuItem();
        ReporteSimbolos = new javax.swing.JMenuItem();
        Reportegraficas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 102, 255));
        jLabel1.setText("Entrada");

        jLabel2.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 102, 255));
        jLabel2.setText("Salida");

        Salida.setEditable(false);
        Salida.setBackground(new java.awt.Color(204, 204, 204));
        Salida.setColumns(20);
        Salida.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Salida.setRows(5);
        jScrollPane1.setViewportView(Salida);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.CardLayout());
        Pestana.addTab("Pestaña", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1268, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pestana))
                .addGap(102, 102, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pestana, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        jMenu1.setText("Archivo");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        NuevoArchivo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        NuevoArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/IconoAgregar.png"))); // NOI18N
        NuevoArchivo.setText("Nuevo Archivo");
        NuevoArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoArchivoActionPerformed(evt);
            }
        });
        jMenu1.add(NuevoArchivo);

        AbrirArchivo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        AbrirArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/folder.png"))); // NOI18N
        AbrirArchivo.setText("Abrir Archivo");
        AbrirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirArchivoActionPerformed(evt);
            }
        });
        jMenu1.add(AbrirArchivo);

        Guardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/guardarmin.png"))); // NOI18N
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        jMenu1.add(Guardar);

        GuardarComo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        GuardarComo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/guardar-como.png"))); // NOI18N
        GuardarComo.setText("Guardar Como");
        GuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarComoActionPerformed(evt);
            }
        });
        jMenu1.add(GuardarComo);

        jMenuBar1.add(jMenu1);

        EliminarPestana.setText("Pestañas");
        EliminarPestana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarPestanaActionPerformed(evt);
            }
        });

        NuevaPestana.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        NuevaPestana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/plus.png"))); // NOI18N
        NuevaPestana.setText("Nueva Pestaña (+)");
        NuevaPestana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaPestanaActionPerformed(evt);
            }
        });
        EliminarPestana.add(NuevaPestana);

        NuevaPestanaa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_0, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        NuevaPestanaa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/minus.png"))); // NOI18N
        NuevaPestanaa.setText("Eliminar Pestaña (-)");
        NuevaPestanaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaPestanaaActionPerformed(evt);
            }
        });
        EliminarPestana.add(NuevaPestanaa);

        jMenuBar1.add(EliminarPestana);

        jMenu2.setText("Ejecutar");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/compilar.png"))); // NOI18N
        jMenuItem3.setText("Iniciar depuración");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Reporte");

        ReportedeTokens.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ReportedeTokens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/reporte.png"))); // NOI18N
        ReportedeTokens.setText("Reporte de Tokens");
        ReportedeTokens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportedeTokensActionPerformed(evt);
            }
        });
        jMenu3.add(ReportedeTokens);

        ReporteLexicos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ReporteLexicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/reporte-de-negocios.png"))); // NOI18N
        ReporteLexicos.setText("Reporte de Errores Léxicos");
        ReporteLexicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteLexicosActionPerformed(evt);
            }
        });
        jMenu3.add(ReporteLexicos);

        ReporteSimbolos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ReporteSimbolos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/table.png"))); // NOI18N
        ReporteSimbolos.setText("Tabla de Simbolos");
        ReporteSimbolos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteSimbolosActionPerformed(evt);
            }
        });
        jMenu3.add(ReporteSimbolos);

        Reportegraficas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Reportegraficas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/limpiar.png"))); // NOI18N
        Reportegraficas.setText("Limpiar Gráficas");
        jMenu3.add(Reportegraficas);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void RSyntax(){
        textArea = new RSyntaxTextArea();
        RTextScrollPane sp = new RTextScrollPane(textArea);
        textArea.setFont(new Font("Monospaced",Font.PLAIN,18));
        textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_PYTHON);//Syntax Estilo java
        jPanel3.add(sp);

    }
    


    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
 
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void AbrirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirArchivoActionPerformed
    JFileChooser fc = new JFileChooser();

    // Se crea el filtro de extensiones de documento
    FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo DF (*.df)", "df");
    // Se indica el uso del filtro
    fc.setFileFilter(filtro);

    // Verificar si hay contenido en la pestaña actual antes de abrir un nuevo archivo
    if (Pestana.getSelectedIndex() != -1) {
        JPanel panel = (JPanel) Pestana.getSelectedComponent();
        RSyntaxTextArea textArea = (RSyntaxTextArea) ((RTextScrollPane) panel.getComponent(0)).getViewport().getView();
        String contenidoActual = textArea.getText();

        // Si hay contenido en la pestaña actual, preguntar al usuario si desea guardar antes de abrir otro archivo
        if (!contenidoActual.isEmpty()) {
            int opcion = JOptionPane.showConfirmDialog(this, "¿Desea guardar el archivo actual antes de abrir uno nuevo?", "Guardar archivo", JOptionPane.YES_NO_CANCEL_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                // Llamar a la función para guardar el archivo actual
                
                GuardarActionPerformed(null);
            } else if (opcion == JOptionPane.CANCEL_OPTION) {
                // Si el usuario elige cancelar, salir de la función sin abrir un nuevo archivo
                return;
            }
        }
    }

    // Se abre ventana y se cargan 
    int seleccion = fc.showOpenDialog(this);
    // Si el usuario presiona aceptar
    if (seleccion == JFileChooser.APPROVE_OPTION) {
        File fichero = fc.getSelectedFile();
        archivoAbierto = fichero; // Actualiza el archivo abierto

        // Obtenemos el nombre del archivo seleccionado
        String nombreArchivo = fichero.getName();

        try (FileReader fr = new FileReader(fichero)) {
            String cadena = "";
            int valor = fr.read();
            while (valor != -1) {
                cadena = cadena + (char) valor;
                valor = fr.read();
            }

            // Obtener el panel de la pestaña seleccionada
            JPanel panel = (JPanel) Pestana.getSelectedComponent();
            // Obtener el RSyntaxTextArea del panel
            RSyntaxTextArea textArea = (RSyntaxTextArea) ((RTextScrollPane) panel.getComponent(0)).getViewport().getView();
            // Establecer el texto en el RSyntaxTextArea
            textArea.setText(cadena);

            // Establecer el nombre de la pestaña como el nombre del archivo
            Pestana.setTitleAt(Pestana.getSelectedIndex(), nombreArchivo);

        } catch (IOException el) {
            el.printStackTrace();
        }
    }
 
    }//GEN-LAST:event_AbrirArchivoActionPerformed

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
    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
    // Guardar Archivo
    if (archivoAbierto != null) {
        try {
            // Obtener el texto del RSyntaxTextArea de la pestaña actual
            JPanel panel = (JPanel) Pestana.getSelectedComponent();
            RSyntaxTextArea textArea = (RSyntaxTextArea) ((RTextScrollPane) panel.getComponent(0)).getViewport().getView();
            String texto = textArea.getText();

            // Escribir el texto en el archivo abierto
            FileWriter fw = new FileWriter(archivoAbierto);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(texto);
            bw.close();

            JOptionPane.showMessageDialog(this, "Se guardó el archivo correctamente");
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al guardar el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "No hay un archivo abierto para guardar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_GuardarActionPerformed
    private File archivoAbierto = null;
    private void GuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarComoActionPerformed
    JFileChooser guardarArchivo = new JFileChooser();
    guardarArchivo.setDialogTitle("Guardar Como");

    // Agrega los filtros para las extensiones
    FileNameExtensionFilter filtroSP = new FileNameExtensionFilter("Archivo DF (*.df)", "df");
    guardarArchivo.addChoosableFileFilter(filtroSP);

    int opcion = guardarArchivo.showSaveDialog(this);
    File archivo;

    if (opcion == JFileChooser.APPROVE_OPTION) {
        String nombre = guardarArchivo.getSelectedFile().getName();
        String ruta = guardarArchivo.getSelectedFile().getAbsolutePath();
        
        // Obtener el filtro seleccionado
        FileFilter filtroSeleccionado = guardarArchivo.getFileFilter();
        
        // Obtener la extensión del filtro seleccionado
        String extension = "df";
        if (filtroSeleccionado instanceof FileNameExtensionFilter) {
            FileNameExtensionFilter filtroExtension = (FileNameExtensionFilter) filtroSeleccionado;
            extension = filtroExtension.getExtensions()[0];
        }
        
        archivo = new File(ruta + "." + extension);

        try {
            if (!archivo.exists()) {
                archivo.createNewFile();
            }

            // Obtener el panel de la pestaña seleccionada
            JPanel panel = (JPanel) Pestana.getSelectedComponent();
            // Obtener el RSyntaxTextArea del panel
            RSyntaxTextArea textArea = (RSyntaxTextArea) ((RTextScrollPane) panel.getComponent(0)).getViewport().getView();
            
            // Obtener el nombre de la pestaña actual
            String nombrePestana = Pestana.getTitleAt(Pestana.getSelectedIndex());

            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(textArea.getText());
            bw.close();
            
            // Cambiar el nombre de la pestaña actual al nombre del archivo
            Pestana.setTitleAt(Pestana.getSelectedIndex(), nombre);
            
            JOptionPane.showMessageDialog(this, "Se guardó el archivo correctamente");
        } catch (IOException ex) {
            // Manejo de excepciones
        }
    

    }
    }//GEN-LAST:event_GuardarComoActionPerformed
private String obtenerTextoPestanaSeleccionada() {
    // Obtener el panel de la pestaña seleccionada
    JPanel panel = (JPanel) Pestana.getSelectedComponent();
    // Obtener el RSyntaxTextArea del panel
    RSyntaxTextArea textArea = (RSyntaxTextArea) ((RTextScrollPane) panel.getComponent(0)).getViewport().getView();
    // Obtener el texto del RSyntaxTextArea
    return textArea.getText();
    
}
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your hansdling code here:
    // Obtener el texto del área de texto de la pestaña seleccionada
    String textoPestanaSeleccionada = obtenerTextoPestanaSeleccionada();
    
    // Llamar a la función analizar con el texto de la pestaña seleccionada
    System.out.println("Analizando...");
    analizar(textoPestanaSeleccionada);
    funciones.reportes.tokens_DF();
    funciones.reportes.errores_DF();
    funciones.reportes.tabla_simbolos();
        String jump="";
        for (int i = 0; i < funciones.saltos.lista_general.size(); i++) {
            jump+=funciones.saltos.lista_general.get(i);
        }Salida.setText(jump);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void EliminarPestanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarPestanaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_EliminarPestanaActionPerformed

    private void ReportedeTokensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportedeTokensActionPerformed
        // TODO add your handling code here:
        funciones.reportes.abrirArchivoHTML("C:\\Users\\kevin\\OneDrive\\Documentos\\OLC1_Proyecto1_201902278\\Proyecto1S2024\\ReporteTokens_DataForge.html"
);
        
        
    }//GEN-LAST:event_ReportedeTokensActionPerformed

    private void ReporteLexicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteLexicosActionPerformed
        // TODO add your handling code here:
        funciones.reportes.abrirArchivoHTML("C:\\Users\\kevin\\OneDrive\\Documentos\\OLC1_Proyecto1_201902278\\Proyecto1S2024\\ReporteErrores_DataForge.html");

    }//GEN-LAST:event_ReporteLexicosActionPerformed

    private void NuevaPestanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaPestanaActionPerformed
        // TODO add your handling code here:
        
        
        addNewTab();
        System.out.println("Pestaña Agregada");
    }//GEN-LAST:event_NuevaPestanaActionPerformed

    private void ReporteSimbolosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteSimbolosActionPerformed
        // TODO add your handling code here:
        funciones.reportes.abrirArchivoHTML("C:\\Users\\kevin\\OneDrive\\Documentos\\OLC1_Proyecto1_201902278\\Proyecto1S2024\\ReporteSimbolos_DataForge.html");
        System.out.println("Tabla de Símbolos");
    }//GEN-LAST:event_ReporteSimbolosActionPerformed

    private void NuevaPestanaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaPestanaaActionPerformed
        // TODO add your handling code here:
        EliminarPestana();
        System.out.println("Pestaña Eliminada");
    }//GEN-LAST:event_NuevaPestanaaActionPerformed

    private void NuevoArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoArchivoActionPerformed
        // TODO add your handling code here:
        Nuevo();
        System.out.println("Nuevo Archivo");
        
    }//GEN-LAST:event_NuevoArchivoActionPerformed
public void mostrarSiguienteGrafica() {

}


private void ContadorPestana(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        Pestana = new JTabbedPane();
        add(Pestana, BorderLayout.CENTER);

        JButton addButton = new JButton("Agregar Pestaña");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNewTab();
                //Nuevo();
            }
        });
        add(addButton, BorderLayout.SOUTH);
    }
private void ContadorNuevo(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        Pestana = new JTabbedPane();
        add(Pestana, BorderLayout.CENTER);

        JButton addButton = new JButton("Agregar Pestaña");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //addNewTab();
                Nuevo();
            }
        });
        add(addButton, BorderLayout.SOUTH);
    }
private void Nuevo() {
    JPanel panel = new JPanel(new BorderLayout()); // Creamos un panel con un layout BorderLayout
    panel.setBackground(Color.WHITE);

    RSyntaxTextArea textArea = new RSyntaxTextArea(); // Creamos el RSyntaxTextArea
    RTextScrollPane sp = new RTextScrollPane(textArea); // Envolvemos el RSyntaxTextArea en un RTextScrollPane

    textArea.setFont(new Font("Monospaced", Font.PLAIN, 18));
    textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_PYTHON); // Establecemos el estilo de sintaxis

    panel.add(sp, BorderLayout.CENTER); // Agregamos el RTextScrollPane al centro del panel

    Pestana.addTab("Sin título " + tabCounter, panel); // Agregamos el panel a la pestaña
    Pestana.setSelectedIndex(tabCounter - 1); // Establecemos la nueva pestaña como la pestaña actual
    tabCounter++;
}
private void addNewTab() {
    JPanel panel = new JPanel(new BorderLayout()); // Creamos un panel con un layout BorderLayout
    panel.setBackground(Color.WHITE);

    RSyntaxTextArea textArea = new RSyntaxTextArea(); // Creamos el RSyntaxTextArea
    RTextScrollPane sp = new RTextScrollPane(textArea); // Envolvemos el RSyntaxTextArea en un RTextScrollPane

    textArea.setFont(new Font("Monospaced", Font.PLAIN, 18));
    textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_PYTHON); // Establecemos el estilo de sintaxis

    panel.add(sp, BorderLayout.CENTER); // Agregamos el RTextScrollPane al centro del panel

    Pestana.addTab("Pestaña " + tabCounter, panel); // Agregamos el panel a la pestaña
    Pestana.setSelectedIndex(tabCounter - 1); // Establecemos la nueva pestaña como la pestaña actual
    tabCounter++;
}
private void EliminarPestana() {
    int selectedIndex = Pestana.getSelectedIndex();
    if (selectedIndex != -1) { // Verifica si hay una pestaña seleccionada
        Pestana.remove(selectedIndex); // Elimina la pestaña seleccionada
    }
}


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AbrirArchivo;
    private javax.swing.JMenu EliminarPestana;
    private javax.swing.JMenuItem Guardar;
    private javax.swing.JMenuItem GuardarComo;
    private javax.swing.JMenuItem NuevaPestana;
    private javax.swing.JMenuItem NuevaPestanaa;
    private javax.swing.JMenuItem NuevoArchivo;
    private javax.swing.JTabbedPane Pestana;
    private javax.swing.JMenuItem ReporteLexicos;
    private javax.swing.JMenuItem ReporteSimbolos;
    private javax.swing.JMenuItem ReportedeTokens;
    private javax.swing.JMenuItem Reportegraficas;
    private javax.swing.JTextArea Salida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

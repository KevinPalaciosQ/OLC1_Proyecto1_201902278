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

/**
 *
 * @author kevin
 */
public class Window extends javax.swing.JFrame {
RSyntaxTextArea textArea;
    /**
     * Creates new form Window
     */
    public Window() {
        initComponents();
        RSyntax();
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
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Pestana = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        AbrirArchivo = new javax.swing.JMenuItem();
        Guardar = new javax.swing.JMenuItem();
        GuardarComo = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        ReportedeTokens = new javax.swing.JMenuItem();
        ReporteLexicos = new javax.swing.JMenuItem();
        ReporteSimbolos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 102, 255));
        jLabel1.setText("Entrada");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 102, 255));
        jLabel2.setText("Salida");

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane1.setViewportView(jTextArea2);

        jButton1.setText("Anterior");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Siguiente");

        jLabel3.setBackground(new java.awt.Color(153, 102, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 102, 255));
        jLabel3.setText("Ver gráficas");

        jTabbedPane1.setForeground(new java.awt.Color(51, 153, 255));

        jPanel3.setBackground(new java.awt.Color(153, 255, 255));
        jPanel3.setLayout(new java.awt.CardLayout());
        Pestana.addTab("tab1", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(536, 536, 536)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 944, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pestana, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(201, 201, 201))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addComponent(Pestana, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );

        jMenu1.setText("Archivo");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        AbrirArchivo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        AbrirArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/IconoAgregar.png"))); // NOI18N
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

        jMenu4.setText("Pestañas");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/plus.png"))); // NOI18N
        jMenuItem6.setText("Nueva Pestaña (+)");
        jMenu4.add(jMenuItem6);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/minus.png"))); // NOI18N
        jMenuItem5.setText("Eliminar Pestaña (-)");
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

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

        ReportedeTokens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/reporte.png"))); // NOI18N
        ReportedeTokens.setText("Reporte de Tokens");
        ReportedeTokens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportedeTokensActionPerformed(evt);
            }
        });
        jMenu3.add(ReportedeTokens);

        ReporteLexicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/reporte-de-negocios.png"))); // NOI18N
        ReporteLexicos.setText("Reporte de Errores Léxicos");
        ReporteLexicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteLexicosActionPerformed(evt);
            }
        });
        jMenu3.add(ReporteLexicos);

        ReporteSimbolos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/table.png"))); // NOI18N
        ReporteSimbolos.setText("Tabla de Simbolos");
        jMenu3.add(ReporteSimbolos);

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
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
 
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void AbrirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirArchivoActionPerformed
// Abrir Archivo
           //se crea el Objeto JFileChooser
        JFileChooser fc =  new JFileChooser();
        
        //Se crea el filtro de extensiones de documento
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo DF (*.df)", "df");
        //Se indica el uso del filtro
        fc.setFileFilter(filtro);
        //Se abre ventana y se cargan 
        int seleccion = fc.showOpenDialog(this);
        //Si el usuario presiona aceptar
        if (seleccion ==JFileChooser.APPROVE_OPTION){
        File fichero = fc.getSelectedFile();
        archivoAbierto = fichero;

        // Obtenemos el nombre del archivo seleccionado
        String nombrearchivo = fichero.getName();

            archivoAbierto = fichero;
            //Analizador3.setText(nombrearchivo);
            //Escribe la ruta del fichero seleccionado en el campo de texto

            try(FileReader fr = new FileReader(fichero)){
                String cadena ="";
                int valor = fr.read();
                while (valor!=-1){
                    cadena = cadena +(char)valor;
                    valor =fr.read();
                }
                this.textArea.setText(cadena);
                
            }catch(IOException el){
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
        try (FileWriter fw = new FileWriter(archivoAbierto)) {
            String contenido = textArea.getText(); // Obtener contenido del JTextArea
            fw.write(contenido);
        } catch (IOException e) {
            e.printStackTrace();
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
    
    FileNameExtensionFilter filtroSeleccionado = (FileNameExtensionFilter) guardarArchivo.getFileFilter();
    String extension = filtroSeleccionado.getExtensions()[0];
    
    archivo = new File(ruta + "." + extension);

    try {
        if (!archivo.exists()) {
            archivo.createNewFile();
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(textArea.getText());
            bw.close();
        }
        JOptionPane.showMessageDialog(this, "Se guardó el archivo correctamente");
    } catch (IOException ex) {
        // Manejo de excepciones
    }
}

        
    }//GEN-LAST:event_GuardarComoActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your hansdling code here:
        System.out.println("Analizando");
        analizar(textArea.getText());
        funciones.reportes.tokens_DF();
        funciones.reportes.errores_DF();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void ReportedeTokensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportedeTokensActionPerformed
        // TODO add your handling code here:
        funciones.reportes.abrirArchivoHTML("C:\\Users\\kevin\\OneDrive\\Documentos\\OLC1_Proyecto1_201902278\\Proyecto1S2024\\ReporteTokens_DataForge.html"
);
        
        
    }//GEN-LAST:event_ReportedeTokensActionPerformed

    private void ReporteLexicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteLexicosActionPerformed
        // TODO add your handling code here:
        funciones.reportes.abrirArchivoHTML("C:\\Users\\kevin\\OneDrive\\Documentos\\OLC1_Proyecto1_201902278\\Proyecto1S2024\\ReporteErrores_DataForge.html");

    }//GEN-LAST:event_ReporteLexicosActionPerformed

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
    private javax.swing.JMenuItem Guardar;
    private javax.swing.JMenuItem GuardarComo;
    private javax.swing.JTabbedPane Pestana;
    private javax.swing.JMenuItem ReporteLexicos;
    private javax.swing.JMenuItem ReporteSimbolos;
    private javax.swing.JMenuItem ReportedeTokens;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}

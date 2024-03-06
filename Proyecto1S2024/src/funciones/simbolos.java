/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

/**
 *
 * @author kevin
 */
public class simbolos {

    /**
     * @return the dato
     */
    public String getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(String dato) {
        this.dato = dato;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the valor
     */
    public Object getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Object valor) {
        this.valor = valor;
    }
    public void setValores(Object[] valores) {
        this.valores = valores;
    }

    /**
     * @return the linea
     */
    public int getLinea() {
        return linea;
    }
    public Object[]  getValores() {
        return valores;
    }
    /**
     * @param linea the linea to set
     */
    public void setLinea(int linea) {
        this.linea = linea;
    }

    /**
     * @return the columna
     */
    public int getColumna() {
        return columna;
    }

    /**
     * @param columna the columna to set
     */
    public void setColumna(int columna) {
        this.columna = columna;
    }
    //TIPO  DE DATO-STRING, ID-ID, VALOR-STRING, LINEA-STRING, COLUMNAS-STRING
    private String dato = "";
    private String id = "";
    private Object valor ;
    private int linea = 0;
    private int columna = 0;
    public  void recibir_datos(String dato, String id, Object valor,int linea, int columna){
        this.setDato(dato);
        this.setId(id);
        this.setValor(valor);
        this.setLinea(linea);
        this.setColumna(columna);
    }
    private Object[] valores;
    public  void recibir_datos(String dato, String id, Object[] valores,int linea, int columna){
        this.setDato(dato);
        this.setId(id);
        this.setValores(valores);
        this.setLinea(linea);
        this.setColumna(columna);
    }  
    
}
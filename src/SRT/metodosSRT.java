/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SRT;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rszaldumbide
 */
public class metodosSRT {

    private char[] matrizChar;
    private String[] matrizString;
    private int cont;
    
    public metodosSRT() {
    }
    
    public char[] MatrizChar(int tamaño) {
                
        matrizChar = new char[tamaño];
        cont=0;                                                                                                             
        
        for(int fila=0; fila<tamaño; fila++){
            matrizChar[fila]=(char)('A'+cont);
            cont++;
            }

        return matrizChar;   
    }
    
    public void imprimirMatriz(char[] matriz, int filas, JTable nombre) {

        DefaultTableModel modelo = (DefaultTableModel) nombre.getModel();

        modelo.setRowCount(filas);
        int col=0;
        for (int fila = 0; fila < filas; fila++) {
            nombre.setValueAt(matriz[fila], fila, col);
        }   
    }
    
    public void imprimirMatriz(String matriz[], int filas, JTable nombre) {

        DefaultTableModel modelo = (DefaultTableModel) nombre.getModel();

        modelo.setRowCount(filas);
        int col=0;
        for (int fila = 0; fila < filas; fila++) {
            nombre.setValueAt(matriz[fila], fila, col);
        }   
    }
    
    public String[] MatrizString(int tamaño) {
                
        matrizString = new String[tamaño];                                                                                                           
        
        for(int fila=0; fila<tamaño; fila++){
            matrizString[fila]="";
            }

        return matrizString;   
    }
    
    
    public void imprimirMatrizRafaga(String[] matriz, int filas, int rafagas, JTable nombre) {

        DefaultTableModel modelo = (DefaultTableModel) nombre.getModel();

        modelo.setRowCount(filas);
        
        String vector[]=new String[rafagas];
        cont=0;
        for(int i=0; i<rafagas; i++){
            if(i==0){
                vector[i]="procesos/rafaga";
            }else{
                vector[i]=""+cont;
                cont++;
            }
        }
        modelo.setColumnIdentifiers(vector);
        
        int col=0;
        cont=0;
        for (int fila = 0; fila < filas; fila++) {
            if(col==0){
            }else{
                nombre.setValueAt(matriz[fila], fila, col);
            }
        }   
    }

}

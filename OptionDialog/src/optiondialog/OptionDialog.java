/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optiondialog;

import javax.swing.JOptionPane;


/**
 *
 * @author Antonio Olanda
 */
public class OptionDialog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Este programa dice El nombre introducido por el teclado
        
        String nombre;
        int contador;
        
        do {
        nombre= JOptionPane.showInputDialog("Introduccion de datos","Teclee su nombre");
         contador = JOptionPane.showConfirmDialog(null, "¿Quiere poner su nombre de nuevo?", "Arreglo de Nombres", JOptionPane.YES_NO_OPTION);
        
        
    } while (contador==JOptionPane.YES_NO_OPTION);
 
      JOptionPane.showMessageDialog(null, "El nombre es "+nombre);
        
    } 
}

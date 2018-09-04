/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheroajlist;

/**
 *
 * @author admin
 */
public class FicheroaJList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VistaAbstracta vista = new Vista();
        ModeloAbstracto modelo = new Modelo();
        
        modelo.vista = vista;
        vista.modelo = modelo;
        
        modelo.leer();
        vista.visualizar();
        
        
    }
    
}

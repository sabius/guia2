/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package impuesto;

import impuesto.controlador.Controlador;
import impuesto.modelo.Modelo;
import impuesto.vista.Vista;

/**
 *
 * @author gonzalodaniel
 */
public class Impuesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        
        Controlador ctrl = new Controlador(vista, modelo);
        
        ctrl.iniciar();
        vista.setVisible(true);
    }
}

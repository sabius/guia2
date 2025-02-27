/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package impuesto;

import impuesto.controladores.ControladorVehiculo;
import impuesto.vistas.VistaVehiculo;

/**
 *
 * @author gonzalodaniel
 */
public class Impuesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VistaVehiculo vista = new VistaVehiculo();
        
        new ControladorVehiculo(vista);
        vista.setVisible(true);
    }
}

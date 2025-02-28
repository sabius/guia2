/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impuesto.controladores;

import java.awt.event.ActionListener;

import impuesto.modelos.Vehiculo;
import impuesto.modelos.CalculadoraImpuestos;
import impuesto.vistas.VistaVehiculo;

import java.awt.event.ActionEvent;

/**
 *
 * @author gonzalodaniel
 */
public class ControladorVehiculo {
    private VistaVehiculo vista;

    public ControladorVehiculo(VistaVehiculo vista) {
        this.vista = vista;

        // Agregar acción al botón de calcular
        this.vista.addCalcularListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                procesarCalculo();
            }
        });
    }

    private void procesarCalculo() {
        try {
            // Obtener datos de la vista
            String marca = vista.textFieldMarca.getText();
            String modelo = vista.textFieldModelo.getText();
            int anio = Integer.parseInt(vista.textFieldAnioDeFabricacion.getText());
            int cilindraje = Integer.parseInt(vista.textFieldCilindraje.getText());
            double avaluo = Double.parseDouble(vista.textFieldAvaluo.getText());
            String tipoUso = String.valueOf(vista.comboBoxTipoDeUso.getSelectedItem());

            // Crear objeto Vehiculo
            Vehiculo vehiculo = new Vehiculo(marca, modelo, anio, cilindraje, avaluo, tipoUso);

            // Calcular el impuesto
            double impuesto = CalculadoraImpuestos.calcularImpuesto(
                vehiculo.getAvaluoComercial(), 
                vehiculo.getAnioFabricacion(), 
                vehiculo.getCilindraje(), 
                vehiculo.getTipoUso()
            );
            
            
            
            // Mostrar resultado en la vista
            vehiculo.mostrarInfo();
            vista.labelResultado.setText("El impuesto calculado es: ");
            vista.textFieldResultado.setText("$" + impuesto);
        } catch (Exception ex) {
            vista.labelResultado.setText("Error al procesar los datos. Verifique los valores ingresados.");
        }
    }
}
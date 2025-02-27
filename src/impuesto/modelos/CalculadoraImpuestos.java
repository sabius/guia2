/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impuesto.modelos;

/**
 *
 * @author gonzalodaniel
 */
public class CalculadoraImpuestos {

    // Método para calcular el impuesto del vehículo
    public static double calcularImpuesto(double avaluoComercial, int anioFabricacion, int cilindraje, String tipoUso) {
        double impuestoBase = avaluoComercial * 0.015; // 1.5% del avalúo comercial
        
        // Ajuste por antigüedad (descuento por autos más antiguos)
        int aniosDeUso = 2025 - anioFabricacion; 
        if (aniosDeUso > 10) {
            impuestoBase *= 0.8; // Descuento del 20% si el auto tiene más de 10 años
        }

        // Ajuste por cilindraje (recargo si es mayor a 2000 cc)
        if (cilindraje > 2000) {
            impuestoBase *= 1.2; // Aumento del 20% para autos de alto cilindraje
        }

        // Ajuste por tipo de uso
        if (tipoUso.equalsIgnoreCase("público")) {
            impuestoBase *= 0.9; // Descuento del 10% para autos de uso público
        }

        return impuestoBase;
    }
}
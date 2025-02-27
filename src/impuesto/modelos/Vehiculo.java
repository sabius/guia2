/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package impuesto.modelos;

/**
 *
 * @author gonzalodaniel
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private int cilindraje;
    private double avaluoComercial;
    private String tipoUso; // Particular o Público. Considerar un enum.

    /**
     * @param args the command line arguments
     */
    public Vehiculo(String marca, String modelo, int anioFabricacion, int cilindraje, double avaluoComercial, String tipoUso) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.cilindraje = cilindraje;
        this.avaluoComercial = avaluoComercial;
        this.tipoUso = tipoUso;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public double getAvaluoComercial() {
        return avaluoComercial;
    }

    public String getTipoUso() {
        return tipoUso;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public void setAvaluoComercial(double avaluoComercial) {
        this.avaluoComercial = avaluoComercial;
    }

    public void setTipoUso(String tipoUso) {
        this.tipoUso = tipoUso;
    }
    
    public void mostrarInfo() {
        System.out.println("Vehículo: " + marca + " " + modelo + " (" + anioFabricacion + ")");
        System.out.println("Cilindraje: " + cilindraje + " cc");
        System.out.println("Avalúo comercial: $" + avaluoComercial);
        System.out.println("Tipo de uso: " + tipoUso);
    }
}

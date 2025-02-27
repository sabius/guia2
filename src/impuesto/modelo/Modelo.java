/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impuesto.modelo;

/**
 *
 * @author gonzalodaniel
 */
public class Modelo {
    private String marca;
    private String modelo;
    private int avaluo;
    private int resultado;

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAvaluo() {
        return avaluo;
    }

    public int getResultado() {
        return resultado;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAvaluo(int avaluo) {
        this.avaluo = avaluo;
    }
    
    public void setResultado(String resultado) {
        this.resultado = Integer.parseInt(resultado);
    }
    
    public int calcularAvaluo() {
        this.resultado = this.avaluo;
        
        return this.resultado;
    }
}

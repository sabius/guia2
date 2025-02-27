/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impuesto.controlador;

import java.awt.event.ActionListener;

import impuesto.modelo.Modelo;
import impuesto.vista.Vista;
import java.awt.event.ActionEvent;

/**
 *
 * @author gonzalodaniel
 */
public class Controlador implements ActionListener {
    private Vista view;
    private Modelo model;
    
    public Controlador(Vista view, Modelo model) {
        this.view = view;
        this.model = model;
        
        this.view.btnCalcular.addActionListener(this);
    }
    
    public void iniciar() {
        view.setTitle("Impuesto de Automovil MVC");
        view.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e) {
        model.setMarca(view.textFieldMarca.getText());
        model.setModelo(view.textFieldModelo.getText());
        model.setAvaluo(Integer.parseInt(view.textFieldAvaluo.getText()));
        model.calcularAvaluo();
        
        view.textFieldResultado.setText(String.valueOf(model.getResultado()));
    }
}

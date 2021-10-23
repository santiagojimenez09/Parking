/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parking.modelos;

/**
 *
 * @author 505
 */
public class Vehiculos {
    
    private String placa;
    private String fecha;
    private String horaIngreso;
    private String horaSalida;
    private int valor;
    private String idParking;

    public Vehiculos() {
    }

    public Vehiculos(String placa, String fecha, String horaIngreso, String horaSalida, int valor, String idParking) {
        this.placa = placa;
        this.fecha = fecha;
        this.horaIngreso = horaIngreso;
        this.horaSalida = horaSalida;
        this.valor = valor;
        this.idParking = idParking;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobus;

/**
 *
 * @author ADSI
 */
public class Bus {

    private String placa;
    private int capacidadPasajeros;
    private double preciosPasajes;
    private int pasajerosActuales;
    private int totalPasajeros;

    public Bus(String placa, int capacidadPasajeros, double preciosPasajes, int pasajerosActuales, int totalPasajeros) {
        super();
        this.placa = placa;
        this.capacidadPasajeros = capacidadPasajeros;
        this.preciosPasajes = preciosPasajes;
        this.pasajerosActuales = pasajerosActuales;
        this.totalPasajeros = totalPasajeros;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public double getPreciosPasajes() {
        return preciosPasajes;
    }

    public void setPreciosPasajes(double preciosPasajes) {
        this.preciosPasajes = preciosPasajes;
    }

    public int getPasajerosActuales() {
        return pasajerosActuales;
    }

    public void setPasajerosActuales(int pasajerosActuales) {
        this.pasajerosActuales = pasajerosActuales;
    }

    public int getTotalPasajeros() {
        return totalPasajeros;
    }

    public void setTotalPasajeros(int totalPasajeros) {
        this.totalPasajeros = totalPasajeros;
    }

    public void subirPasajeros(int pasajeros) {
        int maximo = this.capacidadPasajeros - this.pasajerosActuales;
        if (pasajeros <= maximo) {
            this.pasajerosActuales = this.pasajerosActuales + pasajeros;
            this.totalPasajeros = this.totalPasajeros + pasajeros;

        } else {
            this.pasajerosActuales = this.pasajerosActuales + maximo;
            this.totalPasajeros = this.totalPasajeros + maximo;
        }
    }

    public double getDineroAcumulado() {
        return this.preciosPasajes * this.totalPasajeros;
    }
    
    public void bajarPasajeros(int pasajeros){
        if (pasajeros <= this.pasajerosActuales) {
            this.pasajerosActuales = this.pasajerosActuales - pasajeros;

        } else {
            this.pasajerosActuales = 0;
        }

    }
}

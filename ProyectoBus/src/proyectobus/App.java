/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobus;
import proyectobus.Bus;
/**
 *
 * @author ADSI
 */
public class App {
    public static void main(String[] args) {
        
        Bus bus1 = new Bus("THK-123", 10, 3000, 0, 0);
        System.err.println("SUBÍ 2");
        bus1.subirPasajeros(2);
        System.err.println("BAJÉ 1");
        bus1.bajarPasajeros(1);
        System.err.println("SUBÍ 10");
        bus1.subirPasajeros(10);
        System.err.println("BAJÉ 5");
        bus1.bajarPasajeros(5);
        System.err.println("SUBÍ 3");
        bus1.subirPasajeros(3);
        
        System.out.println("Hemos transportado "+ bus1.getTotalPasajeros()+ " En total hemos recogido " + bus1.getDineroAcumulado() + " en el bus van: "+bus1.getPasajerosActuales());
        
    }
}
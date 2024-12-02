/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.ejercicioauto;

import ec.edu.espoch.ejercicioauto.Autom.Autom;
import ec.edu.espoch.ejercicioauto.Autom.TipoAuto;
import ec.edu.espoch.ejercicioauto.Autom.TipoCombus;
import java.awt.Color;

/**
 *
 * @author USER
 */
public class EjercicioAuto {

    public static void main(String[] args) {
         Autom objAuto = new Autom("Ford",2018, 3, TipoCombus.DIESEL, TipoAuto.EJECUTIVO, 5, 6, 250, Color.GREEN);
                 
         objAuto.MostarAtributos();
         objAuto.acelerar(20);
         System.out.println("La velocidad Actual"+objAuto.getVelocActual()+"km/h");
         
         objAuto.descacelerar(100);
         System.out.println("La velocidad Actual"+objAuto.getVelocActual()+"km/h");
         
         objAuto.frenar();
         System.out.println("La velocidad Actual"+objAuto.getVelocActual());
                 objAuto.descacelerar(20); 


        
    }
}

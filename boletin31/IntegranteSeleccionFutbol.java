/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin31;

/**
 *
 * @author igonzaleziglesias
 */
public interface IntegranteSeleccionFutbol {
    public void concentrarse();
    public void viajar();
    public void entrenar();
    public void jugarPartido();
    
    default public void ruedaPrensa(){
        System.out.println("rueda de prensa");
    }
    
    default public void videoPublicitario(){
        System.out.println("Publicidad");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Logica.CapturaTeclado;
import Logica.EjemploCiclo;
import Logica.EjemploCondicional;

/**
 *
 * @author Estudiantes
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println("Ejemplo de captura");
        CapturaTeclado ct = new CapturaTeclado();
        ct.operacion();
        System.out.println("Ejemplo de condicional");
        EjemploCondicional ec = new EjemploCondicional();
        ec.operacion();
        System.out.println("Ejemplo de cilos");
        EjemploCiclo el = new EjemploCiclo();
        el.operacion();
    }
    
}

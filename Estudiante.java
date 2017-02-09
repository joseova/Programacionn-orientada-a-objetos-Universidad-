/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.util.ArrayList;

/**
 *
 * @author jdovalle
 */
public class Estudiante {
    ArrayList<Estudiante> estudiantes;
     int id;
     String nombre;
     
    public Estudiante(int id) {
        this.id = id;
        estudiantes = new ArrayList(); 
    }
     
    
}

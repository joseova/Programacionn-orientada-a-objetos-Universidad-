/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.util.ArrayList;

/**
 * +
 *
 * @author jdovalle
 */
public class Universidad {
    
    ArrayList<Curso> cursos;
    ArrayList<Profesor> profesores;
    
    public  Universidad() {
         cursos = new ArrayList<>(); 
         profesores = new ArrayList<>(); 
    }
    public void agregarProfesor(){
        Profesor p1 = new Profesor(1);
        profesores.add(p1);
    }
    public void agregarCurso(){
        Curso c = new Curso(10);
        cursos.add(c);
    }
    
    public void registrarProfesorCurso(Profesor p, Curso c){
        p.cursos.add(c);
        c.setProfesor(p);
    }
            
            
            
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

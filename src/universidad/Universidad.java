/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * +
 *
 * @author jdovalle
 */
public class Universidad {
    
    ArrayList<Curso> cursos;
    ArrayList<Profesor> profesores;
    ArrayList<Estudiante> estudiantes;
    
    public  Universidad() {
         cursos = new ArrayList<>(); 
         profesores = new ArrayList<>(); 
         estudiantes = new ArrayList<>(); 
    }
    public void agregarProfesor(){
        boolean seguir = true;
        while(seguir = true){
            Scanner sc = new Scanner(System.in);      
            System.out.println("Digite el codigo de un profesor");
            int cod = sc.nextInt();
            Profesor i = new Profesor(cod);
            profesores.add(i);
            System.out.println("Desea seguir? 1 si, 2 no");
            int option = sc.nextInt();
            if (option == 2) {
                seguir = false;
                if (profesores.size()==1) 
                    System.out.println("Hay " + profesores.size()+ " profesores");
                else
                    System.out.println("Hay " + profesores.size()+ " profesores");
            }
            
        }
    }
    public void agregarCurso(){
        Curso c = new Curso(10);
        cursos.add(c);
    }
    
    public void agregarEstudiante(){
        Estudiante e1 = new Estudiante(1233);
        estudiantes.add(e1);
    }
    
    public void registrarProfesorCurso(Profesor p, Curso c){
        p.cursos.add(c);
        c.setProfesor(p);
    }
    
    public void registrarEstudianteCurso(Estudiante e, Curso c){
        e.cursos.add(c);
        c.setEstudiantes(e);
    } 
            
            
            
    public static void main(String[] args) {
        // Menu / seleccion
        Universidad u=new Universidad();
        Scanner sc = new Scanner(System.in);
        System.out.println("¬¬ Menu ¬¬");
        System.out.println("Selecciona una opcion");
        System.out.println("1) Agregar profesor");
        System.out.println("2) Agregar estudiante");
        System.out.println("3) Agregar curso");
        System.out.println("4) Asignar profesor a curso");
        System.out.println("5) Asignar estudiante a curso");
        System.out.println("6) Cuantos cursos tiene cada profesor");
        System.out.println("7) Cuantos cursos tiene cada estudiante");
        System.out.println("8) Salir");
        int menu = sc.nextInt();
        switch(menu){
            
            case 1:
                u.agregarProfesor();
                break;
            
            case 2:
                u.agregarCurso();
                break;
            
            case 3:
                u.agregarEstudiante();
                break; 
            
            case 4:
                System.out.println("Digite el codigo del profesor");
                int cod = sc.nextInt();
                Profesor i = new Profesor(cod);
                System.out.println("Digite el nrc del curso");
                int nrc = sc.nextInt();
                Curso a = new Curso(nrc);
                u.registrarProfesorCurso(i, a);
                break;
            
            case 5:
                System.out.println("Digite el id del estudiante");
                int id = sc.nextInt();
                Estudiante estu = new Estudiante(id);
                System.out.println("Digite el nrc del curso");
                int nrc2 = sc.nextInt();
                Curso a1 = new Curso(nrc2);
                u.registrarEstudianteCurso(estu, a1);
       
                break;
                
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
        }
    }
    
}

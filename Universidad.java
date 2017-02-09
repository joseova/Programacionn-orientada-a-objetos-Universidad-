/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.util.ArrayList;
import java.util.Iterator;
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
        while(seguir){
            Scanner sc = new Scanner(System.in);      
            System.out.println("Digite el codigo de un profesor");
            int cod = sc.nextInt();
            Profesor i = new Profesor(cod);
            profesores.add(i);
            System.out.println("Desea seguir? 1 si, 2 no");
            int option = sc.nextInt();
            if (option == 2) {
                seguir = false;
                System.out.println("Hay " + profesores.size()+ " profesores");
            }            
        }
    }
    
    public void agregarCurso(){
        boolean seguir = true;
        while(seguir){
            Scanner sc = new Scanner(System.in);      
            System.out.println("Digite el nrc del curso");
            int nrc = sc.nextInt();
            Curso c = new Curso(nrc);
            cursos.add(c);
            System.out.println("Desea seguir? 1 si, 2 no");
            int option = sc.nextInt();
            if (option == 2) {
                seguir = false;
                System.out.println("Hay " + cursos.size()+ " curso");
            }            
        }
    }
    
    public void agregarEstudiante(){
        boolean seguir = true;
        while(seguir){
            Scanner sc = new Scanner(System.in);      
            System.out.println("Digite el id del estudiante");
            int id = sc.nextInt();
            Estudiante e1 = new Estudiante(id);
            estudiantes.add(e1);
            System.out.println("Desea seguir? 1 si, 2 no");
            int option = sc.nextInt();
            if (option == 2) {
                seguir = false;
                System.out.println("Hay " + estudiantes.size()+ " estudiantes");
            }            
        }
    }
    
    public void registrarProfesorCurso(Profesor p, Curso c){
        p.cursos.add(c);
        c.setProfesor(p);
    }
    
    public void registrarEstudianteCurso(Estudiante e, Curso c){
        e.cursos.add(c);
        c.setEstudiantes(e);
    } 
            
    public void ContadorProfesorCurso(){
        for(Iterator<Profesor> i = profesores.iterator(); i.hasNext(); ) {
            Profesor item = i.next();
            System.out.println("Tiene " + item.cursos.size() + " cursos");
        }
        System.out.println("Si funciona, :v" + profesores.size());
    }                    
    public void ContadorEstudianteCurso(){
        for(Iterator<Estudiante> i = estudiantes.iterator(); i.hasNext(); ) {
            Estudiante item = i.next();
            System.out.println("Tiene " + item.cursos.size() + " cursos");
        }
        System.out.println("Si funciona, :v" + estudiantes.size());
    }                    
    
    public static void main(String[] args) {
        // Menu / seleccion
        int menu;
        do {
            Universidad u=new Universidad();
            Scanner sc = new Scanner(System.in);
            System.out.println("¬¬ Menu ¬¬");
            System.out.println("Selecciona una opcion");
            System.out.println("1) Agregar profesor");
            System.out.println("2) Agregar curso");
            System.out.println("3) Agregar estudiante");
            System.out.println("4) Asignar profesor a curso");
            System.out.println("5) Asignar estudiante a curso");
            System.out.println("6) Cuantos cursos tiene cada profesor");
            System.out.println("7) Cuantos cursos tiene cada estudiante");
            System.out.println("8) Salir");
            menu = sc.nextInt();
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
                    u.ContadorProfesorCurso();
                    break;

                case 7:
                    u.ContadorEstudianteCurso();
                    break;
            }
        } while (menu != 8);
        
    }
    
}

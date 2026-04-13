package GestionAlumnos;

import java.util.*;

public class Main {
     public static void main(String[] args) {
          Curso c = new Curso();
          Scanner consola = new Scanner(System.in);
          System.out.println("Comision 600");
          System.out.println("Ingrese cantidad de alumnos del curso ");
          int Cantidadalumnos = consola.nextInt();
          consola.nextLine();
          Alumno[] CursoAlumnos = new Alumno[Cantidadalumnos];
          for (int i = 0; i < CursoAlumnos.length; i++) {
               Alumno s = new Alumno();
               System.out.println("Ingrese nombre del alumno");
               String nombre = consola.nextLine();
               if (s.VerificarNombre(nombre)) {
                    s.AlmacenarNombre(nombre);
               }
               System.out.println("Ingrese nota del examen");
               int nota = consola.nextInt();
               if (s.VerificarNota(nota)) {
                    s.AlmacenarNota(nota);
               }
               System.out.println("el alumno aprobo el Trabajo Practico(True/False)?");
               boolean tp = consola.nextBoolean();
               consola.nextLine();
               s.AlmacenarAprobacionTp(tp);
               CursoAlumnos[i] = s;

          }
          c.CambiarNota(CursoAlumnos, "Maria", 4);
          float PromedioNota = c.PromedioNotas(CursoAlumnos);
          int NotaMasAlta = c.CalculoNotaMasAlta(CursoAlumnos);
          int NotaMasBaja = c.CalculoNotaMasBaja(CursoAlumnos);
          String AlumnoNotaMasAlta = c.BuscarAlumnoNotaMasAlta(CursoAlumnos, NotaMasAlta);
          String AlumnoNotaMasBaja = c.BuscarAlumnoNotaMasBaja(CursoAlumnos, NotaMasBaja);
          Alumno[] EstudiantesAprobados = c.AlumnosAprobados(CursoAlumnos);
          System.out.println("Los alumnos aprobados son:");
          for (int i=0;i<EstudiantesAprobados.length;i++){
               if(EstudiantesAprobados[i]!=null){
                    System.out.println("El alumno:  "+ EstudiantesAprobados[i].nombre + "con nota "+ EstudiantesAprobados[i].nota);
               }    
          }
          System.out.println("El promedio de notas es: " + PromedioNota);
          System.out.println("La nota mas alta del curso es: " + NotaMasAlta + " es el alumno: " + AlumnoNotaMasAlta);
          System.out.println("La nota mas baja del curso es : " + NotaMasBaja + " es el alumno: " + AlumnoNotaMasBaja);
          
     }
}
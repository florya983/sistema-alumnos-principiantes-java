
package GestionAlumnos;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    public void CambiarNota(List<Alumno> CursoAlumnos, String nombreabuscar, int notanueva) {
        for (Alumno a : CursoAlumnos) {
            if (a.nombre.equalsIgnoreCase(nombreabuscar)) {
                a.nota = notanueva;

            }
        }

    }

    public float PromedioNotas(List<Alumno> CursoAlumnos) {
        int suma = 0;
        for (Alumno a : CursoAlumnos) {
            suma = suma + a.nota;

        }
        return (float) suma / CursoAlumnos.size();

    }

    public int CalculoNotaMasAlta(List<Alumno> CursoAlumnos) {
        if (CursoAlumnos.isEmpty()) {
            return -1;
        }
        int NotaMasAlta = CursoAlumnos.get(0).nota;
        for (Alumno a : CursoAlumnos) {
            if (a.nota > NotaMasAlta) {
                NotaMasAlta = a.nota;
            }
        }
        return NotaMasAlta;

    }

    public int CalculoNotaMasBaja(List<Alumno> CursoAlumnos) {
        if (CursoAlumnos.size() == 0) {
            return -1;
        }
        int NotaMasBaja = CursoAlumnos.get(0).nota;
        for (Alumno a : CursoAlumnos) {
            if (a.nota < NotaMasBaja) {
                NotaMasBaja = a.nota;
            }
        }
        return NotaMasBaja;
    }

    public String BuscarAlumnoNotaMasAlta(List<Alumno> CursoAlumnos, int notaalta) {
        String AlumnoBuscado = "";
        for (Alumno a : CursoAlumnos) {
            if (a.nota == notaalta) {
                AlumnoBuscado = a.nombre;

            }
        }
        return AlumnoBuscado;
    }

    public String BuscarAlumnoNotaMasBaja(List<Alumno> CursoAlumnos, int notabaja) {
        String AlumnoBuscado = "";
        for (Alumno a : CursoAlumnos) {
            if (a.nota == notabaja) {
                AlumnoBuscado = a.nombre;

            }
        }
        return AlumnoBuscado;
    }

    public List<Alumno> AlumnosAprobados(List<Alumno> CursoAlumnos) {
        List<Alumno> aprobados = new ArrayList<>();
        for (Alumno a : CursoAlumnos) {
            if (a.nota >= 4 && a.tp) {
                aprobados.add(a);

            }
        }
        return aprobados;
    }

    public void MostrarAlumnos(List<Alumno> CursoAlumnos) {
        System.out.println("Alumnos del curso: ");
        for (Alumno a : CursoAlumnos) {
            System.out.println(a.nombre);
            System.out.println(a.nota);
            System.out.println(a.tp);

        }

    }

}

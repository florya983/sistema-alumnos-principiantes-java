package GestionAlumnos;

public class Curso {

    public void CambiarNota(Alumno[] CursoAlumnos, String nombreabuscar, int notanueva) {
        for (int i = 0; i < CursoAlumnos.length; i++) {
            if (nombreabuscar.equals(CursoAlumnos[i].nombre)) {
                CursoAlumnos[i].nota = notanueva;
            }
        }

    }

    public float PromedioNotas(Alumno[] CursoAlumnos) {
        int suma = 0;
        for (int i = 0; i < CursoAlumnos.length; i++) {
            suma = suma + CursoAlumnos[i].nota;

        }
        return (float) suma / CursoAlumnos.length;

    }

    public int CalculoNotaMasAlta(Alumno[] CursoAlumnos) {
        int NotaMasAlta = CursoAlumnos[0].nota;
        for (int i = 0; i < CursoAlumnos.length; i++) {
            if (CursoAlumnos[i].nota > NotaMasAlta) {
                NotaMasAlta = CursoAlumnos[i].nota;
            }
        }
        return NotaMasAlta;

    }

    public int CalculoNotaMasBaja(Alumno[] CursoAlumnos) {
        int NotaMasBaja = CursoAlumnos[0].nota;
        for (int i = 0; i < CursoAlumnos.length; i++) {
            if (CursoAlumnos[i].nota < NotaMasBaja) {
                NotaMasBaja = CursoAlumnos[i].nota;
            }
        }
        return NotaMasBaja;
    }

    public String BuscarAlumnoNotaMasAlta(Alumno[] CursoAlumnos, int notaalta) {
        String AlumnoBuscado = "";
        for (int i = 0; i < CursoAlumnos.length; i++) {
            if (CursoAlumnos[i].nota == notaalta) {
                AlumnoBuscado = CursoAlumnos[i].nombre;

            }
        }
        return AlumnoBuscado;
    }

    public String BuscarAlumnoNotaMasBaja(Alumno[] CursoAlumnos, int notabaja) {
        String AlumnoBuscado = "";
        for (int i = 0; i < CursoAlumnos.length; i++) {
            if (CursoAlumnos[i].nota == notabaja) {
                AlumnoBuscado = CursoAlumnos[i].nombre;

            }
        }
        return AlumnoBuscado;
    }

    public Alumno[] AlumnosAprobados(Alumno[] CursoAlumnos) {
        Alumno[] aprobados = new Alumno[CursoAlumnos.length];
        int j = 0;
        for (int i = 0; i < CursoAlumnos.length; i++) {
            if (CursoAlumnos[i].nota >= 4 && CursoAlumnos[i].tp == true) {
                aprobados[j] = CursoAlumnos[i];
                j++;
            }
        }
        return aprobados;
    }

}

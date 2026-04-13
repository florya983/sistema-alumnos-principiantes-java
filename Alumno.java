package GestionAlumnos;


    public class  Alumno {
            String nombre; 
             int nota;
             boolean tp;

            public  boolean VerificarNombre(String nombre){
               return nombre!=null && !nombre.equals("");
             }   
             public  void AlmacenarNombre(String nombre){
                this.nombre=nombre;
             }
             public boolean VerificarNota(int nota){
                return nota<=10 && nota>0;
             }
            public  void AlmacenarNota(int nota){
                this.nota=nota;
            }
            public void AlmacenarAprobacionTp(boolean tp){
                this.tp=tp;
              
            }
           
} 
           

           

                    


    


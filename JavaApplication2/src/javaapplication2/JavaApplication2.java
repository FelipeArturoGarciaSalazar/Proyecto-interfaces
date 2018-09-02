
package javaapplication2;

/**
 *
 * @author fagar02
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Alumno alumno = () -> {
            String Nombre = "Juan Perez";
            String Codigo = "201827034321";
            int grupo = 800;
            String Programa = "Comunicación Social";
        };

        Profesor profesor = () -> {
            String Nombre = "Osman Ferre";
            int grupo = 800;
            String Documento = "1234567890";
            String Materia = "POO";
        };
        
        Director director = () -> {
            String Nombre = "Luis Adolfo Ansola";
            String Documento = "123876498860";
            String Area = "Practicas";
        };
         
    }
    
    public static void crearA(Alumno A)
    {
        A.crearAlumno();
    }
    
    public static void crearP(Profesor P)
    {
        P.crearProfesor();
    }
    
    public static void crearD(Director D)
    {
        D.crearDirector();
    }
}

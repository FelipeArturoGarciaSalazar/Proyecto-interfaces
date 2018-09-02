
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
            String Nombre = "Raul Montaña";
            int grupo = 800;
            String Documento = "1234567890";
            String Materia = "Calculo";
        };
        
        Director director = () -> {
            String Nombre = "Pedro Jose Osorio";
            String Documento = "1234567890";
            String Area = "Ingenieria";
            String Materia = "Calculo";
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

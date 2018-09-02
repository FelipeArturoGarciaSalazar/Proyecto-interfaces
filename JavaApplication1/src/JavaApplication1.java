/**
 *
 * @author fagar02
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona persona = new Persona();
        
        hacerCantar(persona);
        
        Canario canario = new Canario();
        
        hacerCantar(canario);
        
    }
    
    public static void hacerCantar(Cantante C)
    {
        C.cantar();
    }
    
}

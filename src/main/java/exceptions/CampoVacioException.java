package exceptions;

/**
 *Clase que modela una excepcion cuando el campo de texto está vacío 
 * @author Candido Vidal 
 */
public class CampoVacioException extends Exception {
    
    
     public CampoVacioException  (String msg) {
    
    super ("Ha habido un problema: " + msg);
		
}
    
}

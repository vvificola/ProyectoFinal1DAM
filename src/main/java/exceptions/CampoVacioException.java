package exceptions;

/**
 *
 * @author carlac
 */
public class CampoVacioException extends Exception {
    
    
     public CampoVacioException  (String msg) {
    
    super ("Ha habido un problema: " + msg);
		
}
    
}

package exceptions;



/**
 *Clase que modela una excepción cuando el formato de email no es correcto
 * @author Cándido Vidal 
 */
public class EmailNoValidoException extends Exception {
	
	   public EmailNoValidoException  (String msg) {
		    
		    super ("Ha habido un problema: " + msg);
				
		}

}

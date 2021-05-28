package exceptions;

public class EmailNoValidoException extends Exception {
	
	   public EmailNoValidoException  (String msg) {
		    
		    super ("Ha habido un problema: " + msg);
				
		}

}

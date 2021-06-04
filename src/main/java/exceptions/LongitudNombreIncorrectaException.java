/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**Clase que modela una excepción cuando la longitud del nombre es incorrecta
 * @author Cándido Vidal 
 */
public class LongitudNombreIncorrectaException extends Exception  {
    
   public LongitudNombreIncorrectaException  (String msg) {
    
    super ("Ha habido un problema: " + msg);
		
}
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**Clase que modela una excepción cuando la contraseña introducida no coincide con su confirmación
 * @author Cándido Vidal 
 */
public class ContrasenaNoCoincideException extends Exception{
    
    public ContrasenaNoCoincideException  (String msg) {
    
    super ("Ha habido un problema: " + msg);
		
}
    
    
}

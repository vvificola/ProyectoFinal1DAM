/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *Clase que modela una excepción cuando la contraseña introducida es demasiado corta
 * @author Cándido Vidal 
 */
public class ContraseñaMuyCortaException extends Exception{
    
    public ContraseñaMuyCortaException (String msg) {
    
    super ("Ha habido un problema: " + msg);
		
}
}
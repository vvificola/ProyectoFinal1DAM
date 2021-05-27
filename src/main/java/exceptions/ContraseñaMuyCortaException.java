/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author carlac
 */
public class ContraseñaMuyCortaException extends Exception{
    
    public ContraseñaMuyCortaException (String msg) {
    
    super ("Ha habido un problema: " + msg);
		
}
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *Clase que modela una excepción cuando el campo nombre está vacío
 * @author Cándido Vidal 

 */
public class NombreVacioException extends Exception {
    
    
     public NombreVacioException  (String msg) {
    
    super ("Ha habido un problema: " + msg);
		
}
    
}

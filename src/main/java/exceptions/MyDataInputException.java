/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**Clase que modela una excepción cuando los datos introducidos no cumplen los parámetros requeridos
 * @author Cándido Vidal 
 */
public class MyDataInputException extends Exception{
    
    
    public MyDataInputException (String msg) {
		
		super ("Ha habido un problema: " + msg);
		
		
	}
    
}

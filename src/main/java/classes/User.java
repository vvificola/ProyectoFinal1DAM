/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JTextField;

import interfaces.PantallaRegistro;
import preferenceEnums.DietaryRestrictions;
/**
 *
 * @author carlac
 */
public class User {
    
    private String userName;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private boolean genre;
    private short height; //en centímetros
    private short weight; //en centímetros
    private LocalDate birthDate;
    private ArrayList<Product> favorites;
    private ArrayList<DietaryRestrictions> dietaryOptions;
    private ArrayList <Menu> savedMenu;
    
    
	public User(String userName) {
		
		
		
		
	}
    
    
    
    
    
    
}

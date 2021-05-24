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
    
    private static String userName = new String ();
    private static String password;
    private static String email;
    private static String firstName;
    private static String lastName;
    private static String secondLastName;
    private static boolean genre;
    private static short height; //en centímetros
    private static short weight; //en centímetros
    private static LocalDate birthDate;
    private ArrayList<Product> favorites;
    private ArrayList<DietaryRestrictions> dietaryOptions;
    private ArrayList <Menu> savedMenu;
    private PantallaRegistro p;
    
    
    
    
    
	public User(String userName, String password, String email, String firstName, String lastName, boolean genre,
			short height, short weight, LocalDate birthDate, ArrayList<DietaryRestrictions> dietaryOptions) {
		super();
		
		User.lastName = lastName;
		User.firstName = firstName;
        User.secondLastName = secondLastName;
		User.genre = genre;
		User.height = height;
		User.weight = weight;
		User.birthDate = birthDate;
		User.userName = userName;
		User.password = password;
		User.email = email;
		this.dietaryOptions = dietaryOptions;

	}

	
	public static boolean checkPassword(String input) {
		if (input== User.getPassword()) {
			return true;
		} else {
		return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//getter y setters
	
	
	
	
	
	
	public static String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		User.userName = userName;
	}

	public static String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public  static String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public static String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public static String getSecondLastName() {

		return lastName;
	}

	public void setSecondLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public boolean isGenre() {
		return genre;
	}

	public void setGenre(boolean genre) {
		this.genre = genre;
	}

	public short getHeight() {
		return height;
	}

	public void setHeight(short height) {
		this.height = height;
	}

	public static short getWeight() {
		return weight;
	}

	public void setWeight(short weight) {
		this.weight = weight;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public ArrayList<Product> getFavorites() {
		return favorites;
	}


	public void setFavorites(ArrayList<Product> favorites) {
		this.favorites = favorites;
	}

	public ArrayList<DietaryRestrictions> getDietaryOptions() {
		return dietaryOptions;
	}

	public void setDietaryOptions(ArrayList<DietaryRestrictions> dietaryOptions) {
		this.dietaryOptions = dietaryOptions;
	}
	
	public ArrayList<Menu> getSavedMenu() {
		return savedMenu;
	}

	public void setSavedMenu(ArrayList<Menu> savedMenu) {
		this.savedMenu = savedMenu;
	}

	public PantallaRegistro getP() {
		return p;
	}

	public void setP(PantallaRegistro p) {
		this.p = p;
	}
	
	
    
    
  
    

	
	
}
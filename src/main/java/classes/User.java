/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import interfaces.PantallaRegistro;
import preferenceEnums.DietaryRestrictions;

/**
 *
 * @author carlac
 */
public class User {

    private static String userName;
    private static String password;
    private static String email;
    private static String firstName;
    private static String lastName;
    private static String secondLastName;
    private static boolean genre;
    private static short height; //en centímetros
    private static short weight; //en centímetros
    private static LocalDate birthDate;
    private ArrayList<User> usuarios;
    private ArrayList<Product> favoriteProducts;
    private ArrayList<Recipe> favoriteRecipes;
    private ArrayList<DietaryRestrictions> dietaryOptions;
    private ArrayList<Menu> savedMenu;
    private PantallaRegistro p;

    /**
     *
     * @param userName
     * @param password
     *
     */
    public static boolean createUserNamePassword(String userNameInput, String passwordInput, String passwordInputConfirm) throws Exception {

        if (userNameInput.length() >= 8 && userNameInput.length() <= 14) {
            User.userName = userNameInput;

        } else {
            Exception DataInputException = new Exception("Nombre de usuario incorrecto.");
            JOptionPane.showMessageDialog(null, "Nombre de usuario incorrecto. Asegúrese de que el nombre de usuario tiene entre 8 y 14 caracteres");
            return false;

        }

        if ((passwordInput.length() >= 6 && passwordInput.length() <= 10) && (passwordInput.length()==passwordInputConfirm.length())) {
            JOptionPane.showMessageDialog(null, "Usuario creado con éxito");
             User.password = passwordInput;
             return true;
            
        } else if (!(passwordInput.length()==passwordInputConfirm.length())){
             Exception MyDataInputException = new Exception("Formato de contraseña no válido.");
             JOptionPane.showMessageDialog(null, 
                     "Asegúrese de que las contraseñas coinciden");
             return false;
  
        }
        return true;

    }
    
    public static boolean registerUser (String firstNameInput, String lastNameInput, String secondLastNameInput,
    		boolean genreInput, String emailInput, LocalDate birthDateInput, boolean veganInput, boolean lowCarbInput,
    		boolean halalInput, boolean highProteinInput) throws Exception {
				
    	User.firstName = firstNameInput;
    	User.lastName = lastNameInput; 
    	User.secondLastName = secondLastNameInput; 
    	User.genre= genreInput; 
    	User.email = emailInput; 
    	User.birthDate = birthDateInput;
    	
    	
    	
    	
    	
    	
    	return true;
    }
    		
    
    
    

    public static boolean checkPasswordUser(String inputU, String inputP) {

        if (inputP.equals(User.getPassword()) && inputU.equals(User.getUserName())) {
            JOptionPane.showInputDialog("contraseña correcta/usuario logado");
            return true;

        } else {
            JOptionPane.showInputDialog("contraseña o nombre de usuario incorrectos");
            return false;
        }

    }

    //getter y setters
    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        User.userName = userName;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        User.password = password;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        User.email = email;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String firstName) {
        User.firstName = firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        User.lastName = lastName;
    }

    public static String getSecondLastName() {
        return secondLastName;
    }

    public static void setSecondLastName(String secondLastName) {
        User.secondLastName = secondLastName;
    }

    public static boolean isGenre() {
        return genre;
    }

    public static void setGenre(boolean genre) {
        User.genre = genre;
    }

    public static short getHeight() {
        return height;
    }

    public static void setHeight(short height) {
        User.height = height;
    }

    public static short getWeight() {
        return weight;
    }

    public static void setWeight(short weight) {
        User.weight = weight;
    }

    public static LocalDate getBirthDate() {
        return birthDate;
    }

    public static void setBirthDate(LocalDate birthDate) {
        User.birthDate = birthDate;
    }

    public ArrayList<User> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<User> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Product> getFavoriteProducts() {
        return favoriteProducts;
    }

    public void setFavoriteProducts(ArrayList<Product> favoriteProducts) {
        this.favoriteProducts = favoriteProducts;
    }

    public ArrayList<Recipe> getFavoriteRecipes() {
        return favoriteRecipes;
    }

    public void setFavoriteRecipes(ArrayList<Recipe> favoriteRecipes) {
        this.favoriteRecipes = favoriteRecipes;
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

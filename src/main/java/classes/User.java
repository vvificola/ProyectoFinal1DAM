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
    private static int height; //en centímetros
    private static int weight; //en centímetros
    private static LocalDate birthDate;
    private ArrayList<User> usuarios;
    private ArrayList<Product> favoriteProducts;
    private ArrayList<Recipe> favoriteRecipes;
    private static ArrayList<DietaryRestrictions> dietaryOptions;
    private ArrayList<Menu> savedMenu;
    private PantallaRegistro p;

    /**
     *
     * @param userName
     * @param password
     *
     */
    public static boolean createUserNamePassword(String userNameInput, String passwordInput, String passwordInputConfirm) throws Exception {

        if ((userNameInput.length() < 8 || userNameInput.length() > 14)){
             JOptionPane.showMessageDialog(null, userNameInput + "no es un nombre de usuario válido");
             return false;
        
        }else if (passwordInput.equals(passwordInputConfirm)) {
            JOptionPane.showMessageDialog(null, userNameInput + "las contraseñas no coinciden");
            return false;
            
        } else if (passwordInput.length() <=5 ) {
            JOptionPane.showMessageDialog(null, userNameInput + "la contraseña es demasiado corta");
            return false;
            
        
        
        }else {
            User.userName = userNameInput;
            User.password = passwordInput;
        
        }
        return true;
             
    }
            
  
    

    public static boolean registerUser(String userName,  String password, String firstNameInput, String lastNameInput, String secondLastNameInput,
            boolean genreInput, int heightInput, int weightInput, String emailInput, LocalDate birthDateInput, boolean veganInput, boolean lowCarbInput,
            boolean halalInput, boolean highProteinInput) throws Exception {
        User.userName = userName;
        User.password = password;
        User.firstName = firstNameInput;
        User.lastName = lastNameInput;
        User.secondLastName = secondLastNameInput;
        User.genre = genreInput;
        User.email = emailInput;
        User.birthDate = birthDateInput;

        if (veganInput) {
            dietaryOptions.add(DietaryRestrictions.VEGAN);
        }

        if (lowCarbInput) {
            dietaryOptions.add(DietaryRestrictions.LOWCARB);
        }

        if (halalInput) {
            dietaryOptions.add(DietaryRestrictions.HALAL);
        }

        if (highProteinInput) {

            dietaryOptions.add(DietaryRestrictions.HIGHPROTEIN);
        }
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

    public static int getHeight() {
        return height;
    }

    public static void setHeight(short height) {
        User.height = height;
    }

    public static int getWeight() {
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

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import exceptions.ContraseñaMuyCortaException;
import exceptions.ContraseñaMuyLargaException;
import exceptions.ContraseñaNoCoincideException;
import exceptions.EmailNoValidoException;
import exceptions.LongitudNombreIncorrectaException;
import exceptions.NombreVacioException;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import enums.IMCGradation;
import interfaces.PantallaRegistro;
import preferenceEnums.DietaryRestrictions;

/**
 *
 * @author carlac
 */
public class User {

    private  String userName;
    private  String password;
    private  String email;
    private  String firstName;
    private  String lastName;
    private  String secondLastName;
    private boolean genre;
    private boolean halal;
    private boolean vegan;
    private boolean lowCarb;
    private boolean highProtein;
    private int height; //en centímetros
    private  int weight; //en centímetros
    private  LocalDate birthDate;
    private ArrayList<User> usuarios;
    private ArrayList<Product> favoriteProducts;
    private ArrayList<Recipe> favoriteRecipes;
    private  ArrayList<DietaryRestrictions> dietaryOptions;
    private ArrayList<Menu> savedMenu;
    private PantallaRegistro p;

    public User(String userName, String password, String email, String firstName, String lastName, String secondLastName, boolean genre, int height, int weight, LocalDate birthDate,
    		boolean halal, boolean vegan, boolean lowCarb, boolean highProtein) {
        this.userName = userName;
        this.password =password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondLastName = secondLastName;
        this.genre = genre;
        this.height = height;
        this.weight = weight;
        this.birthDate = birthDate;
        this.halal=halal;
        this.vegan=vegan;
        this.lowCarb=lowCarb;
    
    }
    
    public User(String userName, String password, String passwordConfirm) throws ContraseñaMuyCortaException, ContraseñaMuyLargaException, ContraseñaNoCoincideException, NombreVacioException, LongitudNombreIncorrectaException {
        this.setUserName(userName);
        this.setPassword(password, passwordConfirm);

    }
    
    
    public float calculateIMC(int weight, int height) {
		
		float imc = 26;
		return imc;
    }
    
    public IMCGradation gradeIMC(float imc) {
		 IMCGradation grade = null;
    	//aquí no puedo aplicar switch/case así que no htengo otro remedio que hacerlo con else if
    	
    	if (imc <18.5) {
    		grade = grade.UNDERWEIGHT;
    	
    	}else if (imc>=18.5 && imc<=24.9) {
    		grade = grade.NORMAL_WEIGHT;
    	
    	}else if (imc>24.9 && imc<=29.9) {
    		grade = grade.OVERWEIGHT;
    	
    	}else if (imc>=30 && imc<34.9) {
    		grade = grade.OBESE;
    	
    	}else if (imc>=34.9) {
    		grade = grade.EXTREMELY_OBESE;
    	
    	}
    	
    	System.out.println(grade);
    	return grade;
  
    	
    	}
    
    
    public byte calculateAge (LocalDate birthDate) {
    	
    	 LocalDate today = LocalDate.now();   
    	 byte age = (byte) ChronoUnit.YEARS.between(birthDate, today); 
		 return age;
    	
    }
    
    	
		
     
    
   
    
    
    
    
    //getter y setters
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) throws NombreVacioException, LongitudNombreIncorrectaException {
        if (userName.isBlank()){
           throw new NombreVacioException ("El nombre de usuario no puede estar vacío");
           
        } else if (userName.length()<3 || userName.length()>14){
            throw new LongitudNombreIncorrectaException ("La longitud del nombre no es correcta");

        }
        
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, String confirmPassword) throws ContraseñaMuyCortaException, ContraseñaMuyLargaException, ContraseñaNoCoincideException {
        if (password.length()< 8) {
            throw new ContraseñaMuyCortaException("La contraseña es demasiado corta");
        }  else if(password.length()>14) {
            throw new ContraseñaMuyLargaException("La contraseña es demasiado corta");
         
        } else if (!password.contentEquals(confirmPassword)) {
          throw new ContraseñaNoCoincideException("La contraseña es demasiado corta");

        } 
        this.password = password;
        
    }

    public  String getEmail() {
        return email;
    }

    public  void setEmail(String email) throws EmailNoValidoException {
    	
    	if (!email.contains("@") || !email.contains(".")) {
          throw new EmailNoValidoException("No es un formato de mail correcto");
    	}
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public  void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public  void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public  String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public  boolean isGenre() {
        return genre;
    }

    public  void setGenre(boolean genre) {
      this.genre = genre;
    }

    public int getHeight() {
        return height;
    }

    public  void setHeight(short height) {
       this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public  void setWeight(short weight) {
        this.weight = weight;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public  void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
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
    
    @Override
    public String toString (){
    return super.toString()+ firstName + lastName;
    
    }

}

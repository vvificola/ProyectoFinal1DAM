package interfaces;

import java.time.LocalDate;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Locale;

import javax.swing.JFrame;

import classes.Recipe;
import classes.User;
import exceptions.CampoVacioException;

/**
 * Clase a partir de la cual se construyen todas las demás ventanas del proyecto 
 * @author Cándido Vidal 
 */


/**
 * Constructor de la clase Ventana
 * @author Cándido Vidal 
 */

public class Ventana extends JFrame {

    private PantallaRegistro pantallaRegistro;
    private PantallaInicio pantallaInicio;
    private PantallaUsuario pantallaUsuario;
    private PantallaCreacionUsuarioyPass pantallaCreacionUsuario;
    private PantallaBuscador pantallaBuscador;
    private PantallaCargaProductos pantallaCargaProductos;
    private PantallaDisplayMenu pantallaDisplayMenu;
    private PantallaDisplayReceta pantallaDisplayReceta;



    private Ventana v;
    private User u;
    private Recipe r;

    public Ventana() {

        this.setSize(307, 207);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        pantallaInicio = new PantallaInicio(this);
        this.setContentPane(pantallaInicio);
        this.setVisible(true);

    }
    /**
     * Función que ejecuta el paso de la interfaz de pantalla inicial hacia la de la creación de un nuevo usuario
     */

    public void goCreateUser() {

        if (this.pantallaCreacionUsuario == null) {
            this.pantallaCreacionUsuario = new PantallaCreacionUsuarioyPass(this);
        }
        this.pantallaInicio.setVisible(false);
        this.setTitle("creación usuario");
        this.setContentPane(this.pantallaCreacionUsuario);
        this.setSize(pantallaCreacionUsuario.getSize());
        this.pantallaCreacionUsuario.setVisible(true);

    }
     
    /**
     * Función que muestra la interfaz para el login con las credenciales del usuario 
     */
    public void goLogin() {

        if (this.pantallaInicio == null) {
            this.pantallaInicio = new PantallaInicio(this);
        }
        if (this.pantallaRegistro != null) {   pantallaRegistro.setVisible(false);}
        if (this.pantallaCreacionUsuario != null) {pantallaCreacionUsuario.setVisible(false);}
        this.setTitle("login");
        this.setContentPane(this.pantallaInicio);
        this.setSize(pantallaInicio.getSize());
        this.pantallaInicio.setVisible(true);

    }
    
 

    /**
     * Función que muestra la interefaz para el registro de datos y recibe por parámetros la instancia del nuevo usuario creado 
     * @param creado El usuario creado
     */

    public void goRegister(User creado) {

        if (this.pantallaRegistro == null) {
            this.pantallaRegistro = new PantallaRegistro(this, creado );
        }
        this.pantallaInicio.setVisible(false);
        this.setTitle("pantalla registro");
        this.setContentPane(this.pantallaRegistro);
        this.setSize(pantallaRegistro.getSize());
        this.pantallaRegistro.setVisible(true);

    }

 
     /**
      * Función que muestra la interfaz de usuario recibiendo por parámetros los datos de este
      * @param u instancia del usuario que usa el programa
      * @throws CampoVacioException 
      */
    public void userLogged(User u) throws CampoVacioException {

        if (this.pantallaUsuario == null) {
            this.pantallaUsuario = new PantallaUsuario(this, u);
        }
        
        if (this.pantallaCargaProductos != null) {
        	this.pantallaCargaProductos.setVisible(false);
        }
        else if (this.pantallaInicio != null) {
        	 this.pantallaInicio.setVisible(false);
        }
        
        else if (this.pantallaInicio != null) {
        	
        	
        }
        
        else if (this.pantallaDisplayMenu != null) {
       	 this.pantallaDisplayMenu.setVisible(false);
       }
       
        this.setContentPane(this.pantallaUsuario);
        this.setSize(pantallaUsuario.getSize());
        this.setTitle("menú usuario");
        this.pantallaUsuario.setVisible(true);

    }
    
    /**
     * Función que muestra la interfaz de busqueda de recetas 
     * @param u instancia del usuario que está usando el programa 
     * @throws CampoVacioException 
     */
    
    public void goSearchRecipes (User u)  throws CampoVacioException {
    	
    	 if (this.pantallaBuscador == null) {
             this.pantallaBuscador = new PantallaBuscador(this, u);
         }
         this.pantallaUsuario.setVisible(false);
         this.setContentPane(this.pantallaBuscador);
         this.setSize(pantallaBuscador.getSize());
         this.setTitle("buscador de recetas");
         this.pantallaBuscador.setVisible(true);

     }
    
    
    /**
     * Función que muestra la interfaz de carga de nuevos product
     * @param u
     * @throws CampoVacioException 
     */
    public void goChargeProducts (User u)  throws CampoVacioException {
    	
    	 if (this.pantallaCargaProductos == null) {
             this.pantallaCargaProductos = new PantallaCargaProductos(this, u);
         }
         this.pantallaUsuario.setVisible(false);
         this.setContentPane(this.pantallaCargaProductos);
         this.setSize(pantallaCargaProductos.getSize());
         this.setTitle("carga de recetas");
         this.pantallaCargaProductos.setVisible(true);

     }
    
    public void DisplayMenu (User u)  {

		LocalDate date = LocalDate.now();
		TemporalField woy = WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear(); 
		byte weekNumber = (byte) date.get(woy);
    	
    	
    	
   	 if (this.pantallaDisplayMenu == null) {
            this.pantallaDisplayMenu = new PantallaDisplayMenu(this, u);
        }
        this.pantallaUsuario.setVisible(false);
        this.setContentPane(this.pantallaDisplayMenu);
        this.setSize(pantallaDisplayMenu.getSize());
        this.setTitle("menú correspondiente a la semana" + "" + weekNumber);
        this.pantallaDisplayMenu.setVisible(true);

    }
    
    public void DisplayReceta (String [] ip, User u)  {

		
    	
    	
   	 if (this.pantallaDisplayReceta == null) {
            this.pantallaDisplayReceta = new PantallaDisplayReceta(this, u, ip);
        }
        this.pantallaUsuario.setVisible(false);
        this.setContentPane(this.pantallaDisplayReceta);
        this.setSize(pantallaDisplayReceta.getSize());
        
        this.pantallaDisplayReceta.setVisible(true);

    }
    
    	
    	
    	
    }
    
    
    
    
    
    
    
    
    

   /* public void userLoggedFromRegister(User creado) {

        if (this.pantallaUsuario == null) {
            this.pantallaUsuario = new PantallaUsuario(this, creado);
        }

        this.pantallaRegistro.setVisible(false);
        this.setContentPane(this.pantallaUsuario);
        this.setSize(pantallaUsuario.getSize());
        this.pantallaUsuario.setVisible(true);

    }*/



package interfaces;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Locale;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import classes.User;
import exceptions.CampoVacioException;

public class Ventana extends JFrame {

    private PantallaRegistro pantallaRegistro;
    private PantallaInicio pantallaInicio;
    private PantallaUsuario pantallaUsuario;
    private PantallaCreacionUsuarioyPass pantallaCreacionUsuario;
    private PantallaBuscador pantallaBuscador;
    private PantallaCargaRecetas pantallaCargaRecetas;
    private PantallaDisplayMenu pantallaDisplayMenu;


    private Ventana v;
    private User u;

    public Ventana() {

        this.setSize(307, 207);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        pantallaInicio = new PantallaInicio(this);
        this.setContentPane(pantallaInicio);
        this.setVisible(true);

    }

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

 

    public void userLogged(User u) throws CampoVacioException {

        if (this.pantallaUsuario == null) {
            this.pantallaUsuario = new PantallaUsuario(this, u);
        }
        
        if (this.pantallaCargaRecetas != null) {
        	this.pantallaCargaRecetas.setVisible(false);
        }
        else if (this.pantallaInicio != null) {
        	 this.pantallaInicio.setVisible(false);
        }
        
        else if (this.pantallaBuscador != null) {
       	 this.pantallaInicio.setVisible(false);
       }
       
        this.setContentPane(this.pantallaUsuario);
        this.setSize(pantallaUsuario.getSize());
        this.setTitle("menú usuario");
        this.pantallaUsuario.setVisible(true);

    }
    
    
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
    
    
    
    public void goChargeProducts (User u)  throws CampoVacioException {
    	
    	 if (this.pantallaCargaRecetas == null) {
             this.pantallaCargaRecetas = new PantallaCargaRecetas(this, u);
         }
         this.pantallaUsuario.setVisible(false);
         this.setContentPane(this.pantallaCargaRecetas);
         this.setSize(pantallaCargaRecetas.getSize());
         this.setTitle("carga de recetas");
         this.pantallaCargaRecetas.setVisible(true);

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



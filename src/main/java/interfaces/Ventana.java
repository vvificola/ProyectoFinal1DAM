package interfaces;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import classes.User;



public class Ventana extends JFrame{

	private PantallaRegistro pantallaRegistro;
	private PantallaInicio pantallaInicio;
	private PantallaUsuario pantallaUsuario;
	private Ventana v;
	 
	public Ventana() {
		
	
			
	    this.setSize(320,450);
		this.isAlwaysOnTop();
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		pantallaRegistro = new PantallaRegistro(this);
		this.setContentPane (pantallaRegistro);
		this.setVisible(true);

	}
	
	public void goLogin (){
		
		if(this.pantallaInicio  == null) {
			this.pantallaInicio = new PantallaInicio(this);
		}
		this.pantallaRegistro.setVisible(false);
		this.setTitle("login");
		this.setContentPane(this.pantallaInicio);
		this.setSize(pantallaInicio.getSize());
		this.pantallaInicio.setVisible(true);
	
		
	} 
	
   public void goRegister(){
		
		if(this.pantallaRegistro  == null) {
			this.pantallaRegistro = new PantallaRegistro(this);
		}
		this.pantallaInicio.setVisible(false);
		this.setTitle("pantalla registro");
		this.setContentPane(this.pantallaRegistro);
		this.setSize(pantallaRegistro.getSize());
		this.pantallaRegistro.setVisible(true);
		
	}
   
   public void userCreated() {JOptionPane.showMessageDialog(pantallaRegistro, "Usuario creado con éxito");}
   
  
   public void userLogged(){
		
		if(this.pantallaUsuario  == null) {
			this.pantallaUsuario = new PantallaUsuario(this);
		}
		this.pantallaInicio.setVisible(false);
		this.setContentPane(this.pantallaUsuario);
		this.setSize(pantallaUsuario.getSize());
		this.setTitle("menú usuario");
		this.pantallaUsuario.setVisible(true);
		
	}
   
   public void userLoggedFromRegister(){
		
 		if(this.pantallaUsuario  == null) {
 			this.pantallaUsuario = new PantallaUsuario(this);
 		}
 		
 		this.pantallaRegistro.setVisible(false);
 		this.setContentPane(this.pantallaUsuario);
 		this.setSize(pantallaUsuario.getSize());
 		this.pantallaUsuario.setVisible(true);
 		
 	}
    
   
   
}
 
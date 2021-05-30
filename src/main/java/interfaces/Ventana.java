package interfaces;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

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
        this.pantallaInicio.setVisible(false);
        this.setContentPane(this.pantallaUsuario);
        this.setSize(pantallaUsuario.getSize());
        this.setTitle("menú usuario");
        this.pantallaUsuario.setVisible(true);

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

}

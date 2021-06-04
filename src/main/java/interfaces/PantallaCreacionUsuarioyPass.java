package interfaces;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import javax.swing.UIManager;

import classes.User;
import exceptions.ContraseñaMuyCortaException;
import exceptions.ContraseñaMuyLargaException;
import exceptions.ContraseñaNoCoincideException;
import exceptions.LongitudNombreIncorrectaException;
import exceptions.NombreVacioException;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import java.awt.Component;
import javax.swing.Box;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
/**
 * Interfaz de usuario para la creación de un usuario y una contraseñas previos al registro de datos 
 * @author Candido Vidal 
 */


public class PantallaCreacionUsuarioyPass extends JPanel {

    private JTextField userNameField;
    private JPasswordField passwordField;
    private JPasswordField passwordField_1;
    private Ventana ventana;
    private User user;
    private JLabel labelUsername;
    private JLabel labelPassword;
    private JLabel labelRepeatPassword;

    public PantallaCreacionUsuarioyPass(Ventana v) {
   
        this.ventana = v;
        this.setSize(365, 221);
        setLayout(new BorderLayout(3, 0));

        JPanel panelCentral = new JPanel();
        add(panelCentral, BorderLayout.CENTER);
        panelCentral.setLayout(null);

        userNameField = new JTextField();
        userNameField.setColumns(10);
        userNameField.setBounds(189, 34, 149, 17);
        panelCentral.add(userNameField);

        passwordField = new JPasswordField();
        passwordField.setBounds(189, 62, 149, 17);
        panelCentral.add(passwordField);

        passwordField_1 = new JPasswordField();
        passwordField_1.setBounds(189, 89, 149, 17);
        panelCentral.add(passwordField_1);

        labelUsername = new JLabel("nombre usuario");
        labelUsername.setHorizontalAlignment(SwingConstants.CENTER);
        labelUsername.setFont(new Font("Futura", Font.PLAIN, 12));
        labelUsername.setBounds(25, 35, 139, 16);
        panelCentral.add(labelUsername);

        labelPassword = new JLabel("contraseña");
        labelPassword.setHorizontalAlignment(SwingConstants.CENTER);
        labelPassword.setFont(new Font("Futura", Font.PLAIN, 12));
        labelPassword.setBounds(25, 63, 139, 16);
        panelCentral.add(labelPassword);

        labelRepeatPassword = new JLabel("repita contraseña");
        labelRepeatPassword.setHorizontalAlignment(SwingConstants.CENTER);
        labelRepeatPassword.setFont(new Font("Futura", Font.PLAIN, 12));
        labelRepeatPassword.setBounds(25, 90, 139, 16);
        panelCentral.add(labelRepeatPassword);

        JButton registerButton = new JButton("crear usuario");
        registerButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		registerButton.setBackground(new Color (200,0,0));
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		registerButton.setBackground(null);
        	}
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		String userName = userNameField.getText();
        		String password = new String (passwordField.getPassword());
         		String confirmPassword = new String (passwordField_1.getPassword());
        		
        		try {
					User creado = new User (userName, password, confirmPassword);
					JOptionPane.showConfirmDialog(ventana, "Usuario creado" + "\n" + "¿Desea continuar con el registro?");
					ventana.goRegister(creado);
					
				} catch (ContraseñaMuyCortaException e1) {
					JOptionPane.showMessageDialog(ventana,"La contraseña es demasiado corta","Error",  JOptionPane.ERROR_MESSAGE);
					passwordField.setBackground(new Color (255, 210, 210)); 
					
				} catch (ContraseñaMuyLargaException e1) {
					JOptionPane.showMessageDialog(ventana,"La contraseña es demasiado larga", "Error", JOptionPane.ERROR_MESSAGE);
					passwordField.setBackground(new Color (255, 210, 210)); 

					
				} catch (ContraseñaNoCoincideException e1) {
					JOptionPane.showMessageDialog(ventana,"Las contraseñas no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
					passwordField.setBackground(new Color (255, 210, 210)); 

					
					
				} catch (NombreVacioException e1) {
					JOptionPane.showMessageDialog(ventana,"El nombre no puede estar vacío",  "Error",JOptionPane.ERROR_MESSAGE);
					userNameField .setBackground(new Color (255, 210, 210));

					
				} catch ( LongitudNombreIncorrectaException e1){
					JOptionPane.showMessageDialog(ventana ,userName +"no es un nombre de usuario válido", "Error", JOptionPane.ERROR_MESSAGE);
					userNameField .setBackground(new Color (255, 210, 210));
					  
				}
        		
        		
        		 
        	}
        });
        
        registerButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
        registerButton.setBounds(189, 132, 127, 23);
        panelCentral.add(registerButton);
        
        JButton btnNewButton = new JButton("volver a inicio");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ventana.goLogin();
        		JOptionPane.showConfirmDialog(ventana, "¿Desea descartar la creación de usuario?");
        	}
        });
        btnNewButton.setBounds(25, 132, 127, 23);
        panelCentral.add(btnNewButton);

    }
}

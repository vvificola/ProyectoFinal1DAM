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

public class PantallaCreacionUsuarioyPass extends JPanel {

    private JTextField userNameField;
    private JPasswordField passwordField;
    private JPasswordField passwordField_1;
    private Ventana ventana;
    private User user;
    private JLabel lblNewLabel;
    private JLabel labelUsername;
    private JLabel labelPassword;
    private JLabel labelRepeatPassword;

    public PantallaCreacionUsuarioyPass(Ventana v) {

        this.ventana = v;
        this.setSize(310, 199);
        setLayout(new BorderLayout(3, 0));

        JPanel panelCentral = new JPanel();
        add(panelCentral, BorderLayout.CENTER);
        panelCentral.setLayout(null);

        userNameField = new JTextField();
        userNameField.setColumns(10);
        userNameField.setBounds(132, 53, 149, 17);
        panelCentral.add(userNameField);

        passwordField = new JPasswordField();
        passwordField.setBounds(132, 82, 149, 17);
        panelCentral.add(passwordField);

        passwordField_1 = new JPasswordField();
        passwordField_1.setBounds(132, 111, 149, 17);
        panelCentral.add(passwordField_1);

        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setBounds(0, 0, 309, 26);
        panelCentral.add(panel);

        lblNewLabel = new JLabel("creacion usuario y contraseña");
        panel.add(lblNewLabel);
        lblNewLabel.setFont(new Font("Futura", Font.PLAIN, 12));
        lblNewLabel.setForeground(Color.BLACK);

        labelUsername = new JLabel("nombre usuario");
        labelUsername.setHorizontalAlignment(SwingConstants.CENTER);
        labelUsername.setFont(new Font("Futura", Font.PLAIN, 12));
        labelUsername.setBounds(0, 54, 139, 16);
        panelCentral.add(labelUsername);

        labelPassword = new JLabel("contraseña");
        labelPassword.setHorizontalAlignment(SwingConstants.CENTER);
        labelPassword.setFont(new Font("Futura", Font.PLAIN, 12));
        labelPassword.setBounds(0, 82, 139, 16);
        panelCentral.add(labelPassword);

        labelRepeatPassword = new JLabel("repita contraseña");
        labelRepeatPassword.setHorizontalAlignment(SwingConstants.CENTER);
        labelRepeatPassword.setFont(new Font("Futura", Font.PLAIN, 12));
        labelRepeatPassword.setBounds(0, 111, 139, 16);
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
					
				} catch (ContraseñaMuyCortaException e1) {
					JOptionPane.showMessageDialog(ventana,"Error", "La contraseña es demasiado corta", JOptionPane.ERROR_MESSAGE);
					passwordField.setBackground(new Color (255, 210, 210)); 
					
				} catch (ContraseñaMuyLargaException e1) {
					JOptionPane.showMessageDialog(ventana,"Error","La contraseña es demasiado larga", JOptionPane.ERROR_MESSAGE);
					passwordField.setBackground(new Color (255, 210, 210)); 

					
				} catch (ContraseñaNoCoincideException e1) {
					JOptionPane.showMessageDialog(ventana,"Error", "Las contraseñas no coinciden", JOptionPane.ERROR_MESSAGE);
					passwordField.setBackground(new Color (255, 210, 210)); 

					
					
				} catch (NombreVacioException e1) {
					JOptionPane.showMessageDialog(ventana, "Error","El nombre no puede estar vacío", JOptionPane.ERROR_MESSAGE);
					userNameField .setBackground(new Color (255, 210, 210));

					
				} catch ( LongitudNombreIncorrectaException e1){
					JOptionPane.showMessageDialog(ventana , "Error",userName +"no es un nombre de usuario válido", JOptionPane.ERROR_MESSAGE);
					userNameField .setBackground(new Color (255, 210, 210));
					  
				}
        		ventana.goRegister();
        		
        		 
        	}
        });
        
        registerButton.setFont(new Font("Futura", Font.PLAIN, 11));
        registerButton.setBounds(104, 138, 100, 29);
        panelCentral.add(registerButton);

    }
}

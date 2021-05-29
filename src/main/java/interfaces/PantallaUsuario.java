package interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.SoftBevelBorder;

import classes.User;
import enums.IMCGradation;

import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;

public class PantallaUsuario  extends JPanel{
	private Ventana ventana;
	private JButton btnLoadMenu;
	private JButton modifyUsername;
	private JButton btnLogout;
	private User usuario;
	
	
	public PantallaUsuario(Ventana v, User u) {
		this.ventana=v;
		this.usuario=u;
		this.setSize(585, 491);
		v.setResizable(false);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panelCentral = new JPanel();
		add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(null);
		btnLoadMenu = new JButton("cargar menú");
		btnLoadMenu.setIcon(new ImageIcon("./images/baseline_sync_black_24dp.png"));
		btnLoadMenu.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		btnLoadMenu.setBounds(358, 44, 185, 42);
		panelCentral.add(btnLoadMenu);
	
 
		
		//datos usuario
		
		JLabel lblUser = new JLabel("usuario:" +  u.getUserName());
		lblUser.setHorizontalAlignment(SwingConstants.LEFT);
		lblUser.setFont(new Font("Futura", Font.PLAIN, 10));
		lblUser.setBounds(55, 44, 115, 16);
		panelCentral.add(lblUser);
		
		
		
		JLabel firstNameLabel = new JLabel("nombre:" + u.getFirstName());
		firstNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		firstNameLabel.setFont(new Font("Futura", Font.PLAIN, 10));
		firstNameLabel.setBounds(55, 72, 115, 16);
		panelCentral.add(firstNameLabel);
		
		JLabel lastNameLabel = new JLabel("primer apellido:"  + u.getLastName());
		lastNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lastNameLabel.setFont(new Font("Futura", Font.PLAIN, 10));
		lastNameLabel.setBounds(55, 100, 115, 16);
		panelCentral.add(lastNameLabel);
		
		JLabel secondLastNameLabel = new JLabel("segundo apellido:" + u.getSecondLastName());
		secondLastNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		secondLastNameLabel.setFont(new Font("Futura", Font.PLAIN, 10));
		secondLastNameLabel.setBounds(55, 128, 127, 16);
		panelCentral.add(secondLastNameLabel);
		
		
		JLabel emailLabel = new JLabel("email:" + u.getEmail());
		emailLabel.setHorizontalAlignment(SwingConstants.LEFT);
		emailLabel.setFont(new Font("Futura", Font.PLAIN, 10));
		emailLabel.setBounds(55, 156, 127, 16);
		panelCentral.add(emailLabel);
	
		
		JButton btnNewButton;
		modifyUsername = new JButton("modificar");
		modifyUsername.setVerticalAlignment(SwingConstants.TOP);
		modifyUsername.setFont(new Font("Futura", Font.PLAIN, 9));
		modifyUsername.setBounds(216, 48, 71, 12);
		panelCentral.add(modifyUsername);
		
		
		JButton btnGenerateMenu = new JButton("generar menú");
		btnGenerateMenu.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		btnGenerateMenu.setBounds(358, 102, 185, 42);
		panelCentral.add(btnGenerateMenu);
		
		JButton btnSearch = new JButton("buscador recetas");
		btnSearch.setIcon(new ImageIcon("./images/icon_busqueda.png"));
		btnSearch.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		btnSearch.setBounds(358, 325, 185, 30);
		panelCentral.add(btnSearch);
		
		JButton btnFavorites = new JButton("favoritos");
		btnFavorites.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		btnFavorites.setBounds(358, 177, 185, 23);
		panelCentral.add(btnFavorites);
		
		JButton modifyFirstName = new JButton("modificar");
		modifyFirstName.setVerticalAlignment(SwingConstants.TOP);
		modifyFirstName.setFont(new Font("Futura", Font.PLAIN, 9));
		modifyFirstName.setBounds(216, 72, 71, 12);
		panelCentral.add(modifyFirstName);
		
		JButton modifyLastName = new JButton("modificar");
		modifyLastName.setVerticalAlignment(SwingConstants.TOP);
		modifyLastName.setFont(new Font("Futura", Font.PLAIN, 9));
		modifyLastName.setBounds(216, 100, 71, 12);
		panelCentral.add(modifyLastName);
		
		JButton modifySecondLastName = new JButton("modificar");
		modifySecondLastName.setVerticalAlignment(SwingConstants.TOP);
		modifySecondLastName.setFont(new Font("Futura", Font.PLAIN, 9));
		modifySecondLastName.setBounds(216, 128, 71, 12);
		panelCentral.add(modifySecondLastName);
		
		JButton modifyEmail = new JButton("modificar");
		modifyEmail.setVerticalAlignment(SwingConstants.TOP);
		modifyEmail.setFont(new Font("Futura", Font.PLAIN, 9));
		modifyEmail.setBounds(216, 160, 71, 12);
		panelCentral.add(modifyEmail);
		
		
		
		
		
		
		
		
		
		//datos biométricos 
		JLabel heightLabel = new JLabel("altura: "+ u.getHeight());
		heightLabel.setHorizontalAlignment(SwingConstants.LEFT);
		heightLabel.setFont(new Font("Futura", Font.PLAIN, 12));
		heightLabel.setBounds(55, 299, 71, 16);
		panelCentral.add(heightLabel);
		

		JLabel weightLabel = new JLabel("peso: " + u.getWeight());
		weightLabel.setHorizontalAlignment(SwingConstants.LEFT);
		weightLabel.setFont(new Font("Futura", Font.PLAIN, 12));
		weightLabel.setBounds(55, 280, 60, 16);
		panelCentral.add(weightLabel);
	    
		float imc = (float)u.calculateIMC(u.getWeight(), u.getHeight());
		
	    IMCGradation gradeIMC = u.gradeIMC(imc);
	
		JLabel imcLabel = new JLabel("IMC: ");
		imcLabel.setFont(new Font("Futura", Font.PLAIN, 12));
		imcLabel.setBounds(55, 318, 32, 16);
		panelCentral.add(imcLabel);
		
		String n = "";
		JLabel nutritionLabel = new JLabel("" + " " + n );
		nutritionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nutritionLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		nutritionLabel.setBounds(95, 318, 123, 16);
		panelCentral.add(nutritionLabel);
		
		switch (gradeIMC) {
		
		case UNDERWEIGHT:
			n+="desnutrición";
		    nutritionLabel = new JLabel(imc + n);
		    nutritionLabel.setForeground(new Color (189, 0, 0));
			nutritionLabel.setBounds(95, 318, 123, 16);
		    panelCentral.add(nutritionLabel);
			break;
		case NORMAL_WEIGHT:
			n+="peso ideal";
		    nutritionLabel = new JLabel(imc + n);
			nutritionLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		    nutritionLabel.setForeground(new Color (112, 223, 0));
			nutritionLabel.setBounds(95, 318, 123, 16);
		    panelCentral.add(nutritionLabel);
			break;
		case OVERWEIGHT:
			n+="ligero sobrepeso";
		    nutritionLabel = new JLabel(imc + n);
		    nutritionLabel.setForeground(new Color (255, 223, 0));
			nutritionLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			nutritionLabel.setBounds(95, 318, 123, 16);
			panelCentral.add(nutritionLabel);
			break;
		case OBESE:
			n+="sobrepeso";
		    nutritionLabel = new JLabel(imc + n);
		    nutritionLabel.setForeground(new Color (200, 0, 0));
			nutritionLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			nutritionLabel.setBounds(95, 318, 123, 16);
			panelCentral.add(nutritionLabel);
			break;
		case EXTREMELY_OBESE:
			n+="obesidad";
		    nutritionLabel = new JLabel(imc + n);
		    nutritionLabel.setForeground(new Color (220, 0, 0));
			nutritionLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			nutritionLabel.setBounds(95, 318, 123, 16);
			panelCentral.add(nutritionLabel);
			break;

		}
	    
		JLabel lblNewLabel = new JLabel("Datos biométricos");
		lblNewLabel.setBounds(53, 231, 155, 16);
		panelCentral.add(lblNewLabel);
		
		
		JLabel lblTipoDeDieta = new JLabel("Tipo de dieta: " + u.getDietaryOptions());
		lblTipoDeDieta.setFont(new Font("Futura", Font.PLAIN, 12));
		lblTipoDeDieta.setBounds(55, 339, 257, 16);
		panelCentral.add(lblTipoDeDieta);
		
        
		JLabel lblEdad = new JLabel("edad: " + u.calculateAge(u.getBirthDate()));
		lblEdad.setHorizontalAlignment(SwingConstants.LEFT);
		lblEdad.setFont(new Font("Futura", Font.PLAIN, 12));
		lblEdad.setBounds(55, 259, 55, 16);
		panelCentral.add(lblEdad);
		
	
	
		
		
		JPanel panelSouth = new JPanel();
		panelSouth.setBorder(null);
		add(panelSouth, BorderLayout.SOUTH);
		panelSouth.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton modifyPassword = new JButton("cambiar contraseña");
		panelSouth.add(modifyPassword);
		modifyPassword.setFont(new Font("Futura", Font.PLAIN, 9));
		
		JButton btnLogOut;
		btnLogout = new JButton("LOG OUT");
		btnLogout.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		panelSouth.add(btnLogout);
		
		JLabel titulo = new JLabel("pantalla usuario ");
		titulo.setFont(new Font("Futura", Font.PLAIN, 12));
		titulo.setForeground(Color.BLACK);
		titulo.setBackground(Color.DARK_GRAY);
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		add(titulo, BorderLayout.NORTH);
	}
}



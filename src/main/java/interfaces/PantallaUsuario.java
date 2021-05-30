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
import exceptions.CampoVacioException;

import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;

public class PantallaUsuario  extends JPanel{
	private Ventana ventana;
	private JButton btnLoadMenu;
	private JButton modifyUsername;
	private JButton btnLogout;
	private User usuario;
	
	
	public PantallaUsuario(Ventana v, User u) throws CampoVacioException {
		this.ventana=v;
		this.usuario=u;
		this.setSize(713, 491);
		v.setResizable(false);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panelCentral = new JPanel();
		add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(null);
		btnLoadMenu = new JButton("cargar menú");
		btnLoadMenu.setIcon(new ImageIcon("./images/baseline_sync_black_24dp.png"));
		btnLoadMenu.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnLoadMenu.setBounds(427, 44, 185, 42);
		panelCentral.add(btnLoadMenu);
	
 
		
		//datos usuario
		
		JLabel lblUser = new JLabel("usuario:" +  u.getUserName());
		lblUser.setHorizontalAlignment(SwingConstants.LEFT);
		lblUser.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblUser.setBounds(41, 44, 129, 16);
		panelCentral.add(lblUser);
		
		
		
		JLabel firstNameLabel = new JLabel("nombre:" + u.getFirstName());
		firstNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		firstNameLabel.setFont(new Font("SansSerif", Font.BOLD, 12));
		firstNameLabel.setBounds(41, 72, 129, 16);
		panelCentral.add(firstNameLabel);
		
		JLabel lastNameLabel = new JLabel("primer apellido:"  + u.getLastName());
		lastNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lastNameLabel.setFont(new Font("SansSerif", Font.BOLD, 12));
		lastNameLabel.setBounds(41, 100, 167, 16);
		panelCentral.add(lastNameLabel);
		
		JLabel secondLastNameLabel = new JLabel("segundo apellido:" + u.getSecondLastName());
		secondLastNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		secondLastNameLabel.setFont(new Font("SansSerif", Font.BOLD, 12));
		secondLastNameLabel.setBounds(41, 128, 177, 16);
		panelCentral.add(secondLastNameLabel);
		
		
		JLabel emailLabel = new JLabel("email:" + u.getEmail());
		emailLabel.setHorizontalAlignment(SwingConstants.LEFT);
		emailLabel.setFont(new Font("SansSerif", Font.BOLD, 12));
		emailLabel.setBounds(41, 156, 141, 16);
		panelCentral.add(emailLabel);
	
		
		JButton btnNewButton;
		modifyUsername = new JButton("modificar");
		modifyUsername.setVerticalAlignment(SwingConstants.TOP);
		modifyUsername.setFont(new Font("Futura", Font.PLAIN, 9));
		modifyUsername.setBounds(242, 44, 85, 16);
		panelCentral.add(modifyUsername);
		
		
		JButton btnGenerateMenu = new JButton("generar menú");
		btnGenerateMenu.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnGenerateMenu.setBounds(427, 97, 185, 42);
		panelCentral.add(btnGenerateMenu);
		
		JButton btnSearch = new JButton("buscador recetas");
		btnSearch.setIcon(new ImageIcon("./images/icon_busqueda.png"));
		btnSearch.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnSearch.setBounds(427, 285, 185, 30);
		panelCentral.add(btnSearch);
		
		JButton btnFavorites = new JButton("favoritos");
		btnFavorites.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnFavorites.setBounds(427, 172, 185, 23);
		panelCentral.add(btnFavorites);
		
		
		
		
		
		
		
		
		
		//datos biométricos 
		JLabel heightLabel = new JLabel("altura: "+ u.getHeight());
		heightLabel.setHorizontalAlignment(SwingConstants.LEFT);
		heightLabel.setFont(new Font("SansSerif", Font.BOLD, 12));
		heightLabel.setBounds(41, 299, 85, 16);
		panelCentral.add(heightLabel);
		

		JLabel weightLabel = new JLabel("peso: " + u.getWeight());
		weightLabel.setHorizontalAlignment(SwingConstants.LEFT);
		weightLabel.setFont(new Font("SansSerif", Font.BOLD, 12));
		weightLabel.setBounds(41, 280, 74, 16);
		panelCentral.add(weightLabel);
	    
		float imc = (float)u.calculateIMC(u.getWeight(), u.getHeight());
		
	    IMCGradation gradeIMC = u.gradeIMC(imc);
	
		JLabel imcLabel = new JLabel("IMC: ");
		imcLabel.setFont(new Font("SansSerif", Font.BOLD, 12));
		imcLabel.setBounds(41, 318, 46, 16);
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
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(41, 228, 155, 16);
		panelCentral.add(lblNewLabel);
		
		
		JLabel lblTipoDeDieta = new JLabel("Tipo de dieta: " + u.getDietaryOptions());
		lblTipoDeDieta.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblTipoDeDieta.setBounds(41, 339, 271, 16);
		panelCentral.add(lblTipoDeDieta);
		
        
		JLabel lblEdad = new JLabel("edad: " + u.calculateAge(u.getBirthDate()));
		lblEdad.setHorizontalAlignment(SwingConstants.LEFT);
		lblEdad.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblEdad.setBounds(41, 259, 69, 16);
		panelCentral.add(lblEdad);
		
		JLabel lblDatosUsuario = new JLabel("Datos usuario");
		lblDatosUsuario.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDatosUsuario.setBounds(41, 23, 155, 16);
		panelCentral.add(lblDatosUsuario);
		
		JButton modifyUsername_1 = new JButton("modificar");
		modifyUsername_1.setVerticalAlignment(SwingConstants.TOP);
		modifyUsername_1.setFont(new Font("Futura", Font.PLAIN, 9));
		modifyUsername_1.setBounds(242, 74, 85, 16);
		panelCentral.add(modifyUsername_1);
		
		JButton modifyUsername_2 = new JButton("modificar");
		modifyUsername_2.setVerticalAlignment(SwingConstants.TOP);
		modifyUsername_2.setFont(new Font("Futura", Font.PLAIN, 9));
		modifyUsername_2.setBounds(242, 102, 85, 16);
		panelCentral.add(modifyUsername_2);
		
		JButton modifyUsername_2_1 = new JButton("modificar");
		modifyUsername_2_1.setVerticalAlignment(SwingConstants.TOP);
		modifyUsername_2_1.setFont(new Font("Futura", Font.PLAIN, 9));
		modifyUsername_2_1.setBounds(242, 130, 85, 16);
		panelCentral.add(modifyUsername_2_1);
		
		JButton modifyUsername_2_1_1 = new JButton("modificar");
		modifyUsername_2_1_1.setVerticalAlignment(SwingConstants.TOP);
		modifyUsername_2_1_1.setFont(new Font("Futura", Font.PLAIN, 9));
		modifyUsername_2_1_1.setBounds(242, 158, 85, 16);
		panelCentral.add(modifyUsername_2_1_1);
		
	
	
		
		
		JPanel panelSouth = new JPanel();
		panelSouth.setBorder(null);
		add(panelSouth, BorderLayout.SOUTH);
		panelSouth.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton modifyPassword = new JButton("cambiar contraseña");
		panelSouth.add(modifyPassword);
		modifyPassword.setFont(new Font("SansSerif", Font.BOLD, 12));
		
		JButton btnLogOut;
		btnLogout = new JButton("LOG OUT");
		btnLogout.setFont(new Font("SansSerif", Font.BOLD, 12));
		panelSouth.add(btnLogout);
		
		JLabel titulo = new JLabel("pantalla usuario ");
		titulo.setFont(new Font("Futura", Font.PLAIN, 12));
		titulo.setForeground(Color.BLACK);
		titulo.setBackground(Color.DARK_GRAY);
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		add(titulo, BorderLayout.NORTH);
	}
}



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
import javax.swing.JOptionPane;
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
		emailLabel.setBounds(41, 156, 177, 16);
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
		
		JButton searchRecipesButton = new JButton("buscador recetas");
		searchRecipesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		searchRecipesButton.setIcon(new ImageIcon("./images/icon_busqueda.png"));
		searchRecipesButton.setFont(new Font("SansSerif", Font.BOLD, 12));
		searchRecipesButton.setBounds(427, 285, 185, 30);
		panelCentral.add(searchRecipesButton);
		
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
		weightLabel.setBounds(41, 280, 85, 16);
		panelCentral.add(weightLabel);
	    
		float imc = (float)u.calculateIMC(u.getWeight(), u.getHeight());
		
	    IMCGradation gradeIMC = u.gradeIMC(imc);
	
		JLabel imcLabel = new JLabel("IMC: ");
		imcLabel.setFont(new Font("SansSerif", Font.BOLD, 12));
		imcLabel.setBounds(41, 318, 44, 16);
		panelCentral.add(imcLabel);
		
		String n = "";
		JLabel nutritionLabel = new JLabel("" + " " + n );
		nutritionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nutritionLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		nutritionLabel.setBounds(95, 318, 91, 16);
		panelCentral.add(nutritionLabel);
		
		switch (gradeIMC) {
		
		case UNDERWEIGHT:
			n+="desnutrición";
		    nutritionLabel = new JLabel(imc + ""+n);
		    nutritionLabel.setForeground(new Color (189, 0, 0));
			nutritionLabel.setBounds(95, 318, 123, 16);
		    panelCentral.add(nutritionLabel);
			break;
		case NORMAL_WEIGHT:
			n+="peso ideal";
		    nutritionLabel = new JLabel(imc + "" + " " +n);
			nutritionLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		    nutritionLabel.setForeground(new Color (112, 223, 0));
			nutritionLabel.setBounds(95, 318, 123, 16);
		    panelCentral.add(nutritionLabel);
			break;
		case OVERWEIGHT:
			n+="ligero sobrepeso";
		    nutritionLabel = new JLabel(imc + ""+ n);
		    nutritionLabel.setForeground(new Color (255, 223, 0));
			nutritionLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			nutritionLabel.setBounds(95, 318, 123, 16);
			panelCentral.add(nutritionLabel);
			break;
		case OBESE:
			n+="sobrepeso";
		    nutritionLabel = new JLabel(imc + ""+ n);
		    nutritionLabel.setForeground(new Color (200, 0, 0));
			nutritionLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			nutritionLabel.setBounds(95, 318, 123, 16);
			panelCentral.add(nutritionLabel);
			break;
		case EXTREMELY_OBESE:
			n+="obesidad";
		    nutritionLabel = new JLabel(imc +""+ n);
		    nutritionLabel.setForeground(new Color (220, 0, 0));
			nutritionLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			nutritionLabel.setBounds(95, 318, 123, 16);
			panelCentral.add(nutritionLabel);
			break;

		}
	    
		JLabel biometicDataLabel = new JLabel("Datos biométricos");
		biometicDataLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		biometicDataLabel.setBounds(41, 228, 155, 16);
		panelCentral.add(biometicDataLabel);
		
		
		JLabel lblTipoDeDieta = new JLabel("Tipo de dieta: " + u.getDietaryOptions());
		lblTipoDeDieta.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblTipoDeDieta.setBounds(427, 340, 271, 16);
		panelCentral.add(lblTipoDeDieta);
		
        
		JLabel ageLabel = new JLabel("edad: " + u.calculateAge(u.getBirthDate()));
		ageLabel.setHorizontalAlignment(SwingConstants.LEFT);
		ageLabel.setFont(new Font("SansSerif", Font.BOLD, 12));
		ageLabel.setBounds(41, 259, 85, 16);
		panelCentral.add(ageLabel);
		
		JLabel mbiLabel = new JLabel("tasa metabólica: " + u.calculateMBI(u.getWeight(),u.getHeight(),u.isGenre(),  u.calculateAge(u.getBirthDate())) + "kcal/día");
		mbiLabel.addMouseListener(new MouseAdapter() {
			@Override
        	public void mouseEntered(MouseEvent e) {
				mbiLabel.setForeground(new Color (207, 168, 43));
        	}
        	public void mouseExited(MouseEvent e) {
        		mbiLabel.setForeground(null);
        	}
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(mbiLabel, "El metabolismo basal representa en un adulto entre e 40% y el 70% del gasto energético." 
			+ "\n" + "Esta tasa se ha calculado en función de los datosque nos has proporcionado y podría variar a lo largo del tiempo.");
				
				
			}
		});
		mbiLabel.setHorizontalAlignment(SwingConstants.LEFT);
		mbiLabel.setFont(new Font("SansSerif", Font.BOLD, 12));
		mbiLabel.setBounds(41, 340, 195, 16);
		panelCentral.add(mbiLabel);
		
		
		JLabel lblDatosUsuario = new JLabel("Datos usuario");
		lblDatosUsuario.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDatosUsuario.setBounds(41, 23, 155, 16);
		panelCentral.add(lblDatosUsuario);
		
		JButton modifyName = new JButton("modificar");
		modifyName.setVerticalAlignment(SwingConstants.TOP);
		modifyName.setFont(new Font("Futura", Font.PLAIN, 9));
		modifyName.setBounds(242, 74, 85, 16);
		panelCentral.add(modifyName);
		
		JButton modifyLastName = new JButton("modificar");
		modifyLastName.setVerticalAlignment(SwingConstants.TOP);
		modifyLastName.setFont(new Font("Futura", Font.PLAIN, 9));
		modifyLastName.setBounds(242, 102, 85, 16);
		panelCentral.add(modifyLastName);
		
		JButton modifySecondLastName = new JButton("modificar");
		modifySecondLastName.setVerticalAlignment(SwingConstants.TOP);
		modifySecondLastName.setFont(new Font("Futura", Font.PLAIN, 9));
		modifySecondLastName.setBounds(242, 130, 85, 16);
		panelCentral.add(modifySecondLastName);
		
		JButton modifyEmail = new JButton("modificar");
		modifyEmail.setVerticalAlignment(SwingConstants.TOP);
		modifyEmail.setFont(new Font("Futura", Font.PLAIN, 9));
		modifyEmail.setBounds(242, 158, 85, 16);
		panelCentral.add(modifyEmail);
		
	
	
		
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



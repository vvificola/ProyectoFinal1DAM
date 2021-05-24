package interfaces;

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


public class PantallaRegistro extends JPanel {
	
	private JTextField firstNameField; 
	private JTextField lastNameField;
	private JTextField secondLastNameField;
	private JTextField mailField;
	private JTextField birthField;
	private JTextField userNameField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private Ventana ventana;

	

	public PantallaRegistro(Ventana v) {
		
		this.ventana=v;
		this.setSize(323, 416);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panelCentral = new JPanel();
		add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(null);
		
		lastNameField = new JTextField();
		lastNameField.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lastNameField.setBounds(141, 51, 167, 17);
		panelCentral.add(lastNameField);
		lastNameField.setColumns(10);
		
		firstNameField = new JTextField();
		firstNameField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstNameFieldValue=firstNameField.getText();
				
				}
		});
		firstNameField.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		firstNameField.setColumns(10);
		firstNameField.setBounds(141, 22, 167, 17);
		panelCentral.add(firstNameField);
		
		JLabel firstNameLabel = new JLabel("nombre");
		firstNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		firstNameLabel.setFont(new Font("Futura", Font.BOLD, 11));
		firstNameLabel.setBounds(0, 23, 143, 16);
		panelCentral.add(firstNameLabel);
		
		secondLastNameField = new JTextField();
		secondLastNameField.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		secondLastNameField.setColumns(10);
		secondLastNameField.setBounds(141, 80, 167, 17);
		panelCentral.add(secondLastNameField);
		
		JComboBox fieldGenre = new JComboBox();
		fieldGenre.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		fieldGenre.setModel(new DefaultComboBoxModel(new String[] {"hombre", "mujer"}));
		fieldGenre.setBounds(141, 105, 167, 26);
		panelCentral.add(fieldGenre);
		
		JLabel lblFirstName = new JLabel("primer apellido");
		lblFirstName.setHorizontalAlignment(SwingConstants.CENTER);
		lblFirstName.setFont(new Font("Futura", Font.BOLD, 11));
		lblFirstName.setBounds(0, 52, 143, 16);
		panelCentral.add(lblFirstName);
		
		JLabel labelSecondLastName = new JLabel("segundo apellido");
		labelSecondLastName.setHorizontalAlignment(SwingConstants.CENTER);
		labelSecondLastName.setFont(new Font("Futura", Font.BOLD, 11));
		labelSecondLastName.setBounds(0, 80, 143, 16);
		panelCentral.add(labelSecondLastName);
		
		JLabel labelGenre = new JLabel("género");
		labelGenre.setHorizontalAlignment(SwingConstants.CENTER);
		labelGenre.setFont(new Font("Futura", Font.BOLD, 11));
		labelGenre.setBounds(0, 109, 143, 16);
		panelCentral.add(labelGenre);
		
		JLabel labelMail = new JLabel("email");
		labelMail.setHorizontalAlignment(SwingConstants.CENTER);
		labelMail.setFont(new Font("Futura", Font.BOLD, 11));
		labelMail.setBounds(0, 134, 143, 16);
		panelCentral.add(labelMail);
		
		mailField = new JTextField();
		mailField.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		mailField.setColumns(10);
		mailField.setBounds(141, 133, 167, 17);
		panelCentral.add(mailField);
		
		JLabel labelWeight = new JLabel("peso (kg)");
		labelWeight.setHorizontalAlignment(SwingConstants.LEFT);
		labelWeight.setFont(new Font("Futura", Font.PLAIN, 10));
		labelWeight.setBounds(202, 215, 58, 16);
		panelCentral.add(labelWeight);
		
		JLabel labelHeight = new JLabel("altura (cm)");
		labelHeight.setHorizontalAlignment(SwingConstants.LEFT);
		labelHeight.setFont(new Font("Futura", Font.PLAIN, 10));
		labelHeight.setBounds(202, 194, 58, 16);
		panelCentral.add(labelHeight);
		
		JSpinner spinnerWeight = new JSpinner();
		spinnerWeight.setBounds(262, 209, 34, 26);
		panelCentral.add(spinnerWeight);
		
		JSpinner spinnerHeight = new JSpinner();
		spinnerHeight.setBounds(262, 188, 34, 26);
		panelCentral.add(spinnerHeight);
		
		JLabel labelBirth = new JLabel("fecha nacimiento");
		labelBirth.setHorizontalAlignment(SwingConstants.CENTER);
		labelBirth.setFont(new Font("Futura", Font.BOLD, 10));
		labelBirth.setBounds(0, 162, 143, 16);
		panelCentral.add(labelBirth);
		
		birthField = new JTextField();
		birthField.setToolTipText("(dd/mm/aaaa)");
		birthField.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		birthField.setColumns(10);
		birthField.setBounds(141, 162, 167, 17);
		panelCentral.add(birthField);
		
		JCheckBox checkLowCarb = new JCheckBox("low carb");
		checkLowCarb.setFont(new Font("Futura", Font.PLAIN, 9));
		checkLowCarb.setBounds(83, 190, 71, 23);
		panelCentral.add(checkLowCarb);
		
		JCheckBox checkVegan = new JCheckBox("vegano");
		checkVegan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		checkVegan.setFont(new Font("Futura", Font.PLAIN, 9));
		checkVegan.setBounds(15, 190, 71, 23);
		panelCentral.add(checkVegan);
		
		JCheckBox checkHighProtein = new JCheckBox("high protein");
		checkHighProtein.setFont(new Font("Futura", Font.PLAIN, 9));
		checkHighProtein.setBounds(83, 211, 84, 23);
		panelCentral.add(checkHighProtein);
		
		JCheckBox checkHalal = new JCheckBox("halal");
		checkHalal.setFont(new Font("Futura", Font.PLAIN, 9));
		checkHalal.setBounds(15, 211, 51, 23);
		panelCentral.add(checkHalal);
		
		JLabel userNameLabel = new JLabel("usuario");
		userNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		userNameLabel.setFont(new Font("Futura", Font.BOLD, 12));
		userNameLabel.setBounds(0, 256, 143, 16);
		panelCentral.add(userNameLabel);
		
		JLabel labelPassword = new JLabel("contraseña");
		labelPassword.setHorizontalAlignment(SwingConstants.CENTER);
		labelPassword.setFont(new Font("Futura", Font.BOLD, 12));
		labelPassword.setBounds(0, 284, 143, 16);
		panelCentral.add(labelPassword);
		
		JLabel labelConfirmPassword = new JLabel("repita contraseña");
		labelConfirmPassword.setHorizontalAlignment(SwingConstants.CENTER);
		labelConfirmPassword.setFont(new Font("Futura", Font.BOLD, 12));
		labelConfirmPassword.setBounds(0, 313, 143, 16);
		panelCentral.add(labelConfirmPassword);
		
		userNameField = new JTextField();
		userNameField.setColumns(10);
		userNameField.setBounds(141, 255, 167, 17);
		panelCentral.add(userNameField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(141, 283, 167, 17);
		panelCentral.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(141, 312, 167, 17);
		panelCentral.add(passwordField_1);
		
		JPanel panelSouth = new JPanel();
		add(panelSouth, BorderLayout.SOUTH);
		panelSouth.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
	
		JButton registerButton = new JButton("registrame");
		registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					ventana.userCreated();
					ventana.userLoggedFromRegister();
				}
		});
		registerButton.setForeground(new Color(0, 0, 51));
		panelSouth.add(registerButton);
		
		JButton loginButton = new JButton("inicio sesión");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.goLogin();
				
			}
		});
	
		panelSouth.add(loginButton);
		
		JLabel titulo = new JLabel("formulario de registro");
		titulo.setFont(new Font("Futura", Font.PLAIN, 12));
		titulo.setForeground(Color.BLACK);
		titulo.setBackground(Color.DARK_GRAY);
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		add(titulo, BorderLayout.NORTH);
	}



	public String getUserNameField(JTextField t) {
		return t.getText();
	}


	
}

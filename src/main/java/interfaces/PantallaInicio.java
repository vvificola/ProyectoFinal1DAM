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
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import java.awt.Component;
import javax.swing.Box;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PantallaInicio extends JPanel {
	private JTextField userNameField;
	private JPasswordField passwordField;
	private Ventana ventana;
	
	
	public PantallaInicio(Ventana v) {
		this.ventana=v; 
		this.setSize(323, 207);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panelCentral = new JPanel();
		add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(null);
		
		JLabel userNameLabel = new JLabel("usuario");
		userNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		userNameLabel.setFont(new Font("Futura", Font.PLAIN, 12));
		userNameLabel.setBounds(0, 28, 162, 16);
		panelCentral.add(userNameLabel);
		
		JLabel labelPassword = new JLabel("contraseña");
		labelPassword.setHorizontalAlignment(SwingConstants.CENTER);
		labelPassword.setFont(new Font("Futura", Font.PLAIN, 12));
		labelPassword.setBounds(0, 57, 162, 16);
		panelCentral.add(labelPassword);
		
		userNameField = new JTextField();
		userNameField.setHorizontalAlignment(SwingConstants.LEFT);
		userNameField.setColumns(10);
		userNameField.setBounds(141, 28, 120, 17);
		panelCentral.add(userNameField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(141, 57, 120, 17);
		panelCentral.add(passwordField);
		
		JLabel labelGoRegister = new JLabel("No tengo cuenta. Resgistrarme.");
		labelGoRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				ventana.goRegister();
			}
		});
		labelGoRegister.setForeground(new Color(0, 139, 139));
		labelGoRegister.setHorizontalAlignment(SwingConstants.CENTER);
		labelGoRegister.setFont(new Font("Futura", Font.PLAIN, 10));
		labelGoRegister.setBounds(0, 102, 323, 16);
		panelCentral.add(labelGoRegister);
		
		JPanel panelSouth = new JPanel();
		add(panelSouth, BorderLayout.SOUTH);
		panelSouth.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton loginButton = new JButton("Iniciar sesión");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 ventana.userLogged();     
			 
			}
		});
		loginButton.setForeground(new Color(0, 0, 0));
		panelSouth.add(loginButton);
		
		JLabel titulo = new JLabel("inicio de sesión");
		titulo.setFont(new Font("Futura", Font.PLAIN, 14));
		titulo.setForeground(Color.BLACK);
		titulo.setBackground(Color.DARK_GRAY);
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		add(titulo, BorderLayout.NORTH);
	}
}

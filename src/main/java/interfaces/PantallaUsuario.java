package interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;

public class PantallaUsuario  extends JPanel{
	private Ventana ventana;
	private JButton btnLoadMenu;
	private JButton modifyUsername;
	private JButton btnLogout;
	
	
	public PantallaUsuario(Ventana v) {
		this.ventana=v;
		this.setSize(585, 491);
		v.setResizable(false);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panelCentral = new JPanel();
		add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(null);
		btnLoadMenu = new JButton("cargar menú");
		btnLoadMenu.setIcon(new ImageIcon("./images/baseline_sync_black_24dp.png"));
		btnLoadMenu.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		btnLoadMenu.setBounds(358, 82, 185, 42);
		panelCentral.add(btnLoadMenu);
		
		JLabel lblUser = new JLabel("user:" + User.getUserName());
		lblUser.setHorizontalAlignment(SwingConstants.LEFT);
		lblUser.setFont(new Font("Futura", Font.PLAIN, 12));
		lblUser.setBounds(55, 44, 115, 16);
		panelCentral.add(lblUser);
		
		JLabel firstNameLabel = new JLabel("nombre:" + User.getFirstName());
		firstNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		firstNameLabel.setFont(new Font("Futura", Font.PLAIN, 12));
		firstNameLabel.setBounds(55, 72, 115, 16);
		panelCentral.add(firstNameLabel);
		
		JLabel lastNameLabel = new JLabel("primer apellido:"  + User.getLastName());
		lastNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lastNameLabel.setFont(new Font("Futura", Font.PLAIN, 12));
		lastNameLabel.setBounds(55, 100, 115, 16);
		panelCentral.add(lastNameLabel);
		
		JLabel secondLastNameLabel = new JLabel("segundo apellido:" + User.getSecondLastName());
		secondLastNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		secondLastNameLabel.setFont(new Font("Futura", Font.PLAIN, 12));
		secondLastNameLabel.setBounds(55, 128, 127, 16);
		panelCentral.add(secondLastNameLabel);
		
		
		
		
		JLabel heightLabel = new JLabel("altura: "+ User.getEmail());
		heightLabel.setHorizontalAlignment(SwingConstants.LEFT);
		heightLabel.setFont(new Font("Futura", Font.PLAIN, 12));
		heightLabel.setBounds(55, 184, 115, 16);
		panelCentral.add(heightLabel);
		
		JLabel emailLabel = new JLabel("email:" + User.getEmail());
		emailLabel.setHorizontalAlignment(SwingConstants.LEFT);
		emailLabel.setFont(new Font("Futura", Font.PLAIN, 12));
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
		btnGenerateMenu.setBounds(358, 158, 185, 42);
		panelCentral.add(btnGenerateMenu);
		
		JButton btnSearch = new JButton("buscador recetas");
		btnSearch.setIcon(new ImageIcon("./images/icon_busqueda.png"));
		btnSearch.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		btnSearch.setBounds(363, 325, 137, 30);
		panelCentral.add(btnSearch);
		
		JButton btnFavorites = new JButton("favoritos");
		btnFavorites.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		btnFavorites.setBounds(73, 330, 185, 23);
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
		
		JLabel weightLabel = new JLabel("peso:0");
		weightLabel.setHorizontalAlignment(SwingConstants.LEFT);
		weightLabel.setFont(new Font("Futura", Font.PLAIN, 12));
		weightLabel.setBounds(55, 212, 115, 16);
		panelCentral.add(weightLabel);
		
		JButton modifyHeight = new JButton("modificar");
		modifyHeight.setVerticalAlignment(SwingConstants.TOP);
		modifyHeight.setFont(new Font("Futura", Font.PLAIN, 9));
		modifyHeight.setBounds(216, 188, 71, 12);
		panelCentral.add(modifyHeight);
		
		JButton modifyWeight = new JButton("modificar");
		modifyWeight.setVerticalAlignment(SwingConstants.TOP);
		modifyWeight.setFont(new Font("Futura", Font.PLAIN, 9));
		modifyWeight.setBounds(216, 216, 71, 12);
		panelCentral.add(modifyWeight);
		
		
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



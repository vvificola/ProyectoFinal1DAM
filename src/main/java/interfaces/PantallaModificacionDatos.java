package interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

import classes.User;

import javax.swing.JTextPane;

public class PantallaModificacionDatos extends JPanel{
	
	private Ventana ventana;
	
	public PantallaModificacionDatos(Ventana v) {
		
		this.ventana=v;
		this.setSize(597, 319);
		setLayout(null);
		
		JPanel panelCentral = new JPanel();
		panelCentral.setBounds(0, 0, 597, 319);
		add(panelCentral);
		panelCentral.setLayout(null);
		
		JLabel lblModificacion = new JLabel("modificación datos usuario");
		lblModificacion.setBackground(new Color(0, 0, 128));
		lblModificacion.setBounds(0, 0, 597, 16);
		lblModificacion.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(lblModificacion);
		
		JLabel lblNewLabel = new JLabel("user:" + User.getUserName());
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Futura", Font.PLAIN, 12));
		lblNewLabel.setBounds(0, 44, 300, 16);
		panelCentral.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("nombre:" + User.getFirstName());
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Futura", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(0, 72, 300, 16);
		panelCentral.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("primer apellido:"  + User.getLastName());
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Futura", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(0, 100, 300, 16);
		panelCentral.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("segundo apellido:" + User.getSecondLastName());
		lblNewLabel_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_2.setFont(new Font("Futura", Font.PLAIN, 12));
		lblNewLabel_1_1_1_2.setBounds(0, 128, 300, 16);
		panelCentral.add(lblNewLabel_1_1_1_2);
		
		
		
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("peso:" +  User.getWeight());
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("Futura", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setBounds(0, 184, 300, 16);
		panelCentral.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("email:" + User.getEmail());
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Futura", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1.setBounds(0, 156, 300, 16);
		panelCentral.add(lblNewLabel_1_1_1_1_1);
		
		JButton btnNewButton = new JButton("modificar");
		btnNewButton.setFont(new Font("Futura", Font.PLAIN, 11));
		btnNewButton.setBounds(104, 226, 92, 29);
		panelCentral.add(btnNewButton);
		
		JButton btnCambiarContrasea = new JButton("cambiar contraseña");
		btnCambiarContrasea.setFont(new Font("Futura", Font.PLAIN, 8));
		btnCambiarContrasea.setBounds(92, 267, 115, 29);
		panelCentral.add(btnCambiarContrasea);
		
		
	}
}

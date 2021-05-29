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
	private User usuario;
	
	public PantallaModificacionDatos(Ventana v, User u) {
		
		this.ventana=v;
		this.usuario=u;
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
		
		JLabel lblNewLabel = new JLabel("user:" + usuario.getUserName());
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Futura", Font.PLAIN, 12));
		lblNewLabel.setBounds(0, 44, 300, 16);
		panelCentral.add(lblNewLabel);
		
		JLabel lblFirstName= new JLabel("nombre:" + usuario.getFirstName());
		lblFirstName.setFont(new Font("Futura", Font.PLAIN, 12));
		lblFirstName.setBounds(0, 72, 300, 16);
		panelCentral.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("primer apellido:"  + usuario.getLastName());
		lblLastName.setHorizontalAlignment(SwingConstants.CENTER);
		lblLastName .setFont(new Font("Futura", Font.PLAIN, 12));
		lblLastName .setBounds(0, 100, 300, 16);
		panelCentral.add(lblLastName);
		
		JLabel lblsecondLastName = new JLabel("segundo apellido:" + usuario.getSecondLastName());
		lblsecondLastName.setHorizontalAlignment(SwingConstants.CENTER);
		lblsecondLastName.setFont(new Font("Futura", Font.PLAIN, 12));
		lblsecondLastName.setBounds(0, 128, 300, 16);
		panelCentral.add(lblsecondLastName);
		
		
		
		
		JLabel lblWeight = new JLabel("peso:" +  usuario.getWeight());
		lblWeight .setHorizontalAlignment(SwingConstants.CENTER);
		lblWeight .setFont(new Font("Futura", Font.PLAIN, 12));
		lblWeight .setBounds(0, 184, 300, 16);
		panelCentral.add(lblWeight);
		
		JLabel lblEmail = new JLabel("email:" + usuario.getEmail());
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(new Font("Futura", Font.PLAIN, 12));
		lblEmail.setBounds(0, 156, 300, 16);
		panelCentral.add(lblEmail);
		
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

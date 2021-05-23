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
import javax.swing.border.BevelBorder;

public class PantallaUsuario  extends JPanel{
	private Ventana ventana;
	private JButton cargarMenu;
	
	
	public PantallaUsuario(Ventana v) {
		this.ventana=v;
		this.setSize(243, 261);
		v.setResizable(false);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panelCentral = new JPanel();
		add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(null);
		
		cargarMenu = new JButton("cargar menú");
		cargarMenu.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		cargarMenu.setBounds(0, 38, 243, 23);
		panelCentral.add(cargarMenu);
		
		JButton btnNewButton_1_1 = new JButton("generar menú");
		btnNewButton_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		btnNewButton_1_1.setBounds(0, 84, 243, 23);
		panelCentral.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("buscador recetas");
		btnNewButton_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		btnNewButton_1_1_1.setBounds(0, 128, 243, 23);
		panelCentral.add(btnNewButton_1_1_1);
		
		
		JPanel panelSouth = new JPanel();
		panelSouth.setBorder(null);
		add(panelSouth, BorderLayout.SOUTH);
		panelSouth.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton_1 = new JButton("modificar datos");
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.goRegister();
			}
		});
		panelSouth.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("LOG OUT");
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		panelSouth.add(btnNewButton);
		
		JLabel titulo = new JLabel("pantalla usuario ");
		titulo.setFont(new Font("Futura", Font.PLAIN, 12));
		titulo.setForeground(Color.BLACK);
		titulo.setBackground(Color.DARK_GRAY);
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		add(titulo, BorderLayout.NORTH);
	}
}



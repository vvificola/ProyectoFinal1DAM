package interfaces;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import preferenceEnums.RecipeDifficulty;
import preferenceEnums.Storage;
import preferenceEnums.TypeOfCooking;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import preferenceEnums.DietaryRestrictions;

public class PantallaBuscador extends JPanel {
	
	private Storage storage;
	private RecipeDifficulty difficulty;
	private TypeOfCooking cooking;
	private Ventana ventana;
	
	
	
	public PantallaBuscador(Ventana v) {
		this.ventana=v; 
		this.setSize(252, 317);
		setLayout(new BorderLayout(0, 0));
	
		JPanel panelCentral = new JPanel();
		add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(TypeOfCooking.values()));
		comboBox.setBounds(32, 50, 189, 27);
		panelCentral.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(RecipeDifficulty.values()));
		comboBox_1.setBounds(32, 107, 189, 27);
		panelCentral.add(comboBox_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(DietaryRestrictions.values()));
		comboBox_1_1.setBounds(32, 169, 189, 27);
		panelCentral.add(comboBox_1_1);
		
		JLabel titulo = new JLabel("buscador recetas");
		titulo.setFont(new Font("Futura", Font.PLAIN, 14));
		titulo.setForeground(Color.BLACK);
		titulo.setBackground(Color.DARK_GRAY);
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		add(titulo, BorderLayout.NORTH);
	}
}
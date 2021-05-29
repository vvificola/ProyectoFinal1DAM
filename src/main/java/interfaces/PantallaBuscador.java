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
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaBuscador extends JPanel {
	
	private Storage storage;
	private RecipeDifficulty difficulty;
	private TypeOfCooking cooking;
	private Ventana ventana;
	private JTextField searchField;
	
	
	
	public PantallaBuscador(Ventana v) {
		this.ventana=v; 
		this.setSize(379, 270);
		setLayout(new BorderLayout(0, 0));
	
		JPanel panelCentral = new JPanel();
		add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(null);
		
		JComboBox cookingComboBox = new JComboBox();
		cookingComboBox.setModel(new DefaultComboBoxModel(TypeOfCooking.values()));
		cookingComboBox.setBounds(123, 32, 189, 27);
		panelCentral.add(cookingComboBox);
		
		JComboBox difficultyComboBox = new JComboBox();
		difficultyComboBox.setModel(new DefaultComboBoxModel(RecipeDifficulty.values()));
		difficultyComboBox.setBounds(123, 71, 189, 27);
		panelCentral.add(difficultyComboBox);
		
		JComboBox restrictionsComboBox = new JComboBox();
		restrictionsComboBox.setModel(new DefaultComboBoxModel(DietaryRestrictions.values()));
		restrictionsComboBox.setBounds(123, 146, 189, 27);
		panelCentral.add(restrictionsComboBox);
		
		JLabel difficultyLabel = new JLabel("por dificultad");
		difficultyLabel.setFont(new Font("Futura", Font.PLAIN, 10));
		difficultyLabel.setBounds(52, 76, 59, 16);
		panelCentral.add(difficultyLabel);
		
		JLabel cookinLabel = new JLabel("por tipo de cocina");
		cookinLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cookinLabel.setFont(new Font("Futura", Font.PLAIN, 10));
		cookinLabel.setBounds(26, 37, 97, 16);
		panelCentral.add(cookinLabel);
		
		JLabel nutritionalLabel = new JLabel("por aporte nutricional");
		nutritionalLabel.setFont(new Font("Futura", Font.PLAIN, 10));
		nutritionalLabel.setBounds(17, 112, 106, 16);
		panelCentral.add(nutritionalLabel);
		
		JLabel restrictionsLabel = new JLabel("otras restricciones");
		restrictionsLabel.setFont(new Font("Futura", Font.PLAIN, 10));
		restrictionsLabel.setBounds(32, 151, 91, 16);
		panelCentral.add(restrictionsLabel);
		
		JComboBox nutritionalComboBox = new JComboBox();
		nutritionalComboBox.setModel(new DefaultComboBoxModel(new String[] {"LOWCARB", "HIGH PROTEIN"}));
		nutritionalComboBox.setBounds(123, 110, 189, 27);
		panelCentral.add(nutritionalComboBox);
		
		JCheckBox checkType = new JCheckBox("");
		checkType.setBounds(324, 32, 28, 23);
		panelCentral.add(checkType);
		
		JCheckBox checkDifficulty = new JCheckBox("");
		checkDifficulty.setBounds(324, 71, 28, 23);
		panelCentral.add(checkDifficulty);
		
		JCheckBox checkNutritional = new JCheckBox("");
		checkNutritional.setBounds(324, 110, 28, 23);
		panelCentral.add(checkNutritional);
		
		JCheckBox checkRestrictions = new JCheckBox("");
		checkRestrictions.setBounds(324, 146, 28, 23);
		panelCentral.add(checkRestrictions);
		
		JLabel labelSearch = new JLabel("por palabra clave");
		labelSearch.setFont(new Font("Futura", Font.PLAIN, 10));
		labelSearch.setBounds(32, 191, 91, 16);
		panelCentral.add(labelSearch);
		
		searchField = new JTextField();
		searchField.setBounds(123, 185, 189, 26);
		panelCentral.add(searchField);
		searchField.setColumns(10);
		
		JButton btnSearch = new JButton("buscar");
		btnSearch.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	btnSearch.setBackground(new Color(84, 117, 166));
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	btnSearch.setBackground(null);
            }
        });
	
		
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
			}
		});
		btnSearch.setIcon(new ImageIcon("/Users/carlac/NetBeansProjects/ProyectoFinal1DAM/images/icon_busqueda.png"));
		btnSearch.setFont(new Font("Futura", Font.PLAIN, 12));
		btnSearch.setBounds(131, 215, 117, 29);
		panelCentral.add(btnSearch);
		
		JLabel titulo = new JLabel("buscador recetas");
		titulo.setFont(new Font("Futura", Font.PLAIN, 14));
		titulo.setForeground(Color.BLACK);
		titulo.setBackground(Color.DARK_GRAY);
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		add(titulo, BorderLayout.NORTH);
	}
}
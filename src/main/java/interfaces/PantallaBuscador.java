package interfaces;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import classes.User;
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
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class PantallaBuscador extends JPanel {
	
	private Storage storage;
	private RecipeDifficulty difficulty;
	private TypeOfCooking cooking;
	private Ventana ventana;
	private User usuario;
	private JTextField searchField;
	
	
	
	public PantallaBuscador(Ventana v, User u) {
		this.usuario= u;
		this.ventana=v; 
		this.setSize(509, 416);
		setLayout(new BorderLayout(0, 0));
	
		JPanel panelCentral = new JPanel();
		add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(null);
		
		
	
		
		
		
		
		JCheckBox checkType = new JCheckBox("");
		checkType.setBounds(412, 37, 21, 23);
		panelCentral.add(checkType);
		
		
		JComboBox cookingComboBox = new JComboBox();
		cookingComboBox.setModel(new DefaultComboBoxModel(TypeOfCooking.values()));
		cookingComboBox.setBounds(217, 37, 189, 27);
		panelCentral.add(cookingComboBox);
		cookingComboBox.setEnabled(false);	
	
		
		checkType.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					cookingComboBox.setEnabled(true);	
				}else if (e.getStateChange()==ItemEvent.DESELECTED) {
					cookingComboBox.setEnabled(false);	

				}
				
			}
		});
		
		
		JCheckBox checkDifficulty = new JCheckBox("");
		checkDifficulty.setBounds(412, 76, 21, 23);
		panelCentral.add(checkDifficulty);
		
		JComboBox difficultyComboBox = new JComboBox();
		difficultyComboBox.setModel(new DefaultComboBoxModel(RecipeDifficulty.values()));
		difficultyComboBox.setBounds(217, 76, 189, 27);
		panelCentral.add(difficultyComboBox);
		difficultyComboBox.setEnabled(false);
		
		
		checkDifficulty.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					difficultyComboBox.setEnabled(true);	
				}else if (e.getStateChange()==ItemEvent.DESELECTED) {
					difficultyComboBox.setEnabled(false);	
				}
				
			}
		});
		
		
		
		JCheckBox checkRestrictions = new JCheckBox("");
		checkRestrictions.setBounds(412, 151, 21, 23);
		panelCentral.add(checkRestrictions);
	
		
		JComboBox restrictionsComboBox = new JComboBox();
		restrictionsComboBox.setModel(new DefaultComboBoxModel(DietaryRestrictions.values()));
		restrictionsComboBox.setBounds(217, 151, 189, 27);
		panelCentral.add(restrictionsComboBox);
		restrictionsComboBox.setEnabled(false);

		checkRestrictions.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					restrictionsComboBox.setEnabled(true);	
				}else if (e.getStateChange()==ItemEvent.DESELECTED) {
					restrictionsComboBox.setEnabled(false);	
				}
				
			}
		});
		
		
		
		
		JCheckBox checkNutritional = new JCheckBox("");
		checkNutritional.setBounds(412, 114, 21, 23);
		panelCentral.add(checkNutritional);
		
		
		JComboBox nutritionalComboBox = new JComboBox();
		nutritionalComboBox.setModel(new DefaultComboBoxModel(new String[] {"LOWCARB", "HIGH PROTEIN"}));
		nutritionalComboBox.setBounds(217, 114, 189, 27);
		panelCentral.add(nutritionalComboBox);
		nutritionalComboBox.setEnabled(false);
		
		

		checkNutritional.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					nutritionalComboBox.setEnabled(true);	
				}else if (e.getStateChange()==ItemEvent.DESELECTED) {
					nutritionalComboBox.setEnabled(false);	
				}
				
			}
		});

		
		
		
		
		JLabel difficultyLabel = new JLabel("por dificultad");
		difficultyLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		difficultyLabel.setBounds(32, 76, 117, 16);
		panelCentral.add(difficultyLabel);
		
		JLabel cookingLabel = new JLabel("por tipo de cocina");
		cookingLabel.setHorizontalAlignment(SwingConstants.LEFT);
		cookingLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		cookingLabel.setBounds(32, 37, 134, 16);
		panelCentral.add(cookingLabel);
		
		JLabel nutritionalLabel = new JLabel("por aporte nutricional");
		nutritionalLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		nutritionalLabel.setBounds(32, 120, 134, 16);
		panelCentral.add(nutritionalLabel);
		
		JLabel restrictionsLabel = new JLabel("otras restricciones");
		restrictionsLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		restrictionsLabel.setBounds(32, 157, 117, 16);
		panelCentral.add(restrictionsLabel);
		
		
		
	
	
		
		JLabel searchLabel = new JLabel("por palabra clave");
		searchLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		searchLabel.setBounds(32, 201, 117, 16);
		panelCentral.add(searchLabel);
		
		searchField = new JTextField();
		searchField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (searchField.isEnabled()) {
					nutritionalComboBox.setEnabled(false);
					restrictionsComboBox.setEnabled(false);	
					difficultyComboBox.setEnabled(false);
					cookingComboBox.setEnabled(false);
					checkNutritional.setSelected(false);
					checkDifficulty.setSelected(false);
					checkRestrictions.setSelected(false);
					checkType.setSelected(false);
			
					
				}
			}
		});
		searchField.setToolTipText("busca las recetas con tus productos favoritos");
		searchField.setBounds(217, 191, 189, 26);
		panelCentral.add(searchField);
		searchField.setColumns(10);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		JButton searchButton = new JButton("buscar");
		searchButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	searchButton.setBackground(new Color(84, 117, 166));
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	searchButton.setBackground(null);
            }
        });
	
		
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
			}
		});
		searchButton.setIcon(new ImageIcon("/Users/carlac/NetBeansProjects/ProyectoFinal1DAM/images/icon_busqueda.png"));
		searchButton.setFont(new Font("Futura", Font.PLAIN, 12));
		searchButton.setBounds(198, 292, 117, 29);
		panelCentral.add(searchButton);
	}
}
package interfaces;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

import classes.User;
import exceptions.CampoVacioException;
import preferenceEnums.RecipeDifficulty;
import preferenceEnums.Storage;
import preferenceEnums.TypeOfCooking;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import typeOfEnums.TypeOfCondiment;
import typeOfEnums.TypeOfFish;
import typeOfEnums.TypeOfFruit;
import typeOfEnums.TypeOfLegume;
import typeOfEnums.TypeOfMeat;
import typeOfEnums.TypeOfVegetable;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.beans.PropertyChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class PantallaCargaRecetas extends JPanel {
	
	private Storage storage;
	private RecipeDifficulty difficulty;
	private TypeOfCooking cooking;
	private Ventana ventana;
	private User usuario;
	private JTextField searchField;
	private JTextField textField;
	
	
	public PantallaCargaRecetas(Ventana v, User u) {
		this.usuario= u;
		this.ventana=v; 
		this.setSize(509, 563);
		setLayout(new BorderLayout(0, 0));
	
		JPanel panelCentral = new JPanel();
		add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(null);
		
		JLabel labelTipoDeProducto = new JLabel("categoría de producto");
		labelTipoDeProducto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelTipoDeProducto.setBounds(34, 45, 127, 16);
		panelCentral.add(labelTipoDeProducto);
		
		JComboBox comboBoxTipo = new JComboBox();
		comboBoxTipo.setModel(new DefaultComboBoxModel(TypeOfCondiment.values()));
		comboBoxTipo.setBounds(185, 86, 225, 27);
		panelCentral.add(comboBoxTipo);
		
		JComboBox comboBoxTipoProducto = new JComboBox();
		comboBoxTipoProducto.setModel(new DefaultComboBoxModel(new String[] {"Condimento", "Pescado", "Fruta", "Legumbre", "Carne", "Verdura"}));
		comboBoxTipoProducto.setBounds(185, 40, 225, 27);
		panelCentral.add(comboBoxTipoProducto);
		comboBoxTipoProducto.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				byte index = (byte)comboBoxTipoProducto.getSelectedIndex();
				
				switch (index) {
				
				case 0: 
					comboBoxTipo.setModel(new DefaultComboBoxModel(TypeOfCondiment.values()));
					break;
				case 1: 
					comboBoxTipo.setModel(new DefaultComboBoxModel(TypeOfFish.values()));
					break;
				case 2: 
					comboBoxTipo.setModel(new DefaultComboBoxModel(TypeOfFruit.values()));
					break;
				case 3: 
					comboBoxTipo.setModel(new DefaultComboBoxModel(TypeOfLegume.values()));
					break;
				case 4: 
					comboBoxTipo.setModel(new DefaultComboBoxModel(TypeOfMeat.values()));
					break;
				case 5: 
					comboBoxTipo.setModel(new DefaultComboBoxModel(TypeOfVegetable.values()));
					break;

				}
				
			}
		});

		

		JLabel labelCategoriaProducto = new JLabel("categoría de producto");
		labelCategoriaProducto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelCategoriaProducto.setBounds(34, 90, 127, 16);
		panelCentral.add(labelCategoriaProducto);

		JLabel labelNombreProducto = new JLabel("nombre de producto");
		labelNombreProducto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelNombreProducto.setBounds(34, 134, 127, 16);
		panelCentral.add(labelNombreProducto);
		
		textField = new JTextField();
		textField.setBounds(185, 133, 225, 20);
		panelCentral.add(textField);
		textField.setColumns(10);
		
		
		
		JLabel contadorCaloriasLabel = new JLabel("0");
		contadorCaloriasLabel.setBounds(430, 186, 23, 14);
		panelCentral.add(contadorCaloriasLabel);
		
		
		  JSlider sliderCalories = new JSlider();
		  sliderCalories.setMaximum(999);
		  sliderCalories.setValue(0);
		  sliderCalories.setBounds(195, 174, 215, 26);
			panelCentral.add(sliderCalories);
			
			sliderCalories.addChangeListener(new ChangeListener() {
		    	public void stateChanged(ChangeEvent e) {
		    		 int index = ((JSlider)e.getSource()).getValue();
		    		 contadorCaloriasLabel.setText(index + "");
		    	}
		    });
		
		
		JLabel labelCaloricDensity = new JLabel("densidad calórica (kcal/100g)");
		labelCaloricDensity.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelCaloricDensity.setBounds(30, 179, 158, 16);
		panelCentral.add(labelCaloricDensity);
		
		JSpinner spinnerCarbs = new JSpinner();
		spinnerCarbs.setBounds(126, 229, 30, 20);
		panelCentral.add(spinnerCarbs);
		
		JSpinner spinnerProtein = new JSpinner();
		spinnerProtein.setBounds(251, 229, 30, 20);
		panelCentral.add(spinnerProtein);
		
		JSpinner spinnerGrease= new JSpinner();
		spinnerGrease.setBounds(380, 229, 30, 20);
		panelCentral.add(spinnerGrease);
		
		JLabel carbsLabel = new JLabel("carbohidratos");
		carbsLabel.setBounds(41, 232, 75, 14);
		panelCentral.add(carbsLabel);
		
		JLabel proteinLabel = new JLabel("proteínas");
		proteinLabel.setBounds(190, 232, 51, 14);
		panelCentral.add(proteinLabel);
		
		JLabel greaseLabel = new JLabel("grasas");
		greaseLabel.setBounds(335, 233, 37, 14);
		panelCentral.add(greaseLabel);
		
		JLabel labelAlmacenaje = new JLabel("almacenaje");
		labelAlmacenaje.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelAlmacenaje.setBounds(29, 288, 127, 16);
		panelCentral.add(labelAlmacenaje);
		
		JComboBox comboBoxTipoProducto_1 = new JComboBox();
		comboBoxTipoProducto_1.setModel(new DefaultComboBoxModel(Storage.values()));
		comboBoxTipoProducto_1.setBounds(185, 285, 225, 27);
		panelCentral.add(comboBoxTipoProducto_1);
		
		JLabel lblGr = new JLabel("(gr/100)");
		lblGr.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblGr.setBounds(41, 245, 75, 14);
		panelCentral.add(lblGr);
		
		JLabel lblGr_1 = new JLabel("(gr/100)");
		lblGr_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblGr_1.setBounds(190, 245, 75, 14);
		panelCentral.add(lblGr_1);
		
		JLabel lblGr_2 = new JLabel("(gr/100)");
		lblGr_2.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblGr_2.setBounds(335, 245, 75, 14);
		panelCentral.add(lblGr_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("vegano");
		chckbxNewCheckBox.setBounds(24, 352, 97, 23);
		panelCentral.add(chckbxNewCheckBox);
		
		JCheckBox chckbxHalal = new JCheckBox("halal");
		chckbxHalal.setBounds(145, 352, 97, 23);
		panelCentral.add(chckbxHalal);
		
		JCheckBox chckbxProt = new JCheckBox("proteíco");
		chckbxProt.setBounds(266, 352, 97, 23);
		panelCentral.add(chckbxProt);
		
		JCheckBox chckbxCarb = new JCheckBox("bajos hidratos");
		chckbxCarb.setBounds(387, 352, 97, 23);
		panelCentral.add(chckbxCarb);
		
		JButton btnCargar = new JButton("alta producto");
		btnCargar.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
	            	//inicializados a false
	            	boolean halal = false;
	            	boolean vegan = false;
	            	boolean lowCarb = false;
	            	boolean highProtein =false;
	                String productName = textField.getText();
	                String insert;
	                byte typeOf = (byte)comboBoxTipoProducto.getSelectedIndex();
	                switch (typeOf) {
					
					case 0: 
						 insert = "CONDIMENT";
						break;
					case 1: 
						 insert = "FISH";
						break;
					case 2: 
						 insert = "FRUIT";
						break;
					case 3: 
						 insert = "LEGUME";
						break;
					case 4: 
						 insert = "MEAT";
						break;
					case 5: 
						 insert = "VEGETABLE";
						break;

					}
	                
	   
	                short caloricDensity = (short)sliderCalories.getValue();
	                short protein = 
	                String date = (birthField.getText());
	                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/uuuu");
	                LocalDate birthDate = LocalDate.parse(date, formatter);
	               if (checkVegan.isSelected()) {
	            	   vegan=true;     	   
	               } else {vegan = false;}
	               
	               if (checkLowCarb.isSelected()) {
	            	   lowCarb = true;
	            	
	               } else { lowCarb = false;}
	               
	               if (checkHalal.isSelected()) {
	                 halal = true;
	                
	               } else { halal = false;}
	               
	               if (checkHighProtein.isSelected()) {
	            	   highProtein = true;
	            	   
	               }else {highProtein = false;}
	               
	               
	               try {
	                              
	                User registrado  = new User (creado.getUserName(), creado.getPassword(), email, firstName, lastName, secondLastName, 
	                		genre, height, weight, birthDate, halal, vegan, lowCarb, highProtein);
	                
	                Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/esquematablasproyecto", 
	                		"root", "UXa19661!");
	                Statement smt = c.createStatement();
	                
	                
	                //executeQuery solo para los select
	                smt.executeUpdate("insert into user "
	                		+ "values ('"+creado.getUserName()+"', '"+creado.getPassword()+"', '"+email+"', '"+firstName+"', '"+lastName+"',  '"+secondLastName+"',  '"+birthDate.toString()+"', "+genre+",  "+halal+",  "+vegan+",  "+lowCarb+",  "+highProtein+",  "+height+",  "+weight+");");           
	 
	                smt.close();
	                c.close();
	                JOptionPane.showMessageDialog(ventana, "Usuario registrado", "Se ha completado el registro", JOptionPane.INFORMATION_MESSAGE);
	                ventana.userLogged(registrado);
	                
	   	 
	               } catch (SQLException e1) {
					// TODO Auto-generated catch block
	            	   JOptionPane.showMessageDialog(ventana,  "Ha habido un problema completando el registro", "Problema base de datos", JOptionPane.ERROR_MESSAGE);
				  } catch (CampoVacioException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	              
	            }
	        });
		
		
		panelCentral.add(btnCargar);
		
		JButton btnBack = new JButton("volver");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBack.setBounds(104, 529, 89, 23);
		panelCentral.add(btnBack);
		
		
		
	
		
		
		
		
	}
}

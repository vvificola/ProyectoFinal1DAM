package interfaces;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

import classes.Product;
import classes.User;
import exceptions.CampoVacioException;
import preferenceEnums.DietaryRestrictions;
import preferenceEnums.RecipeDifficulty;
import preferenceEnums.Storage;
import preferenceEnums.TypeOfCooking;
import products.Condiment;
import products.Fish;
import products.Fruit;
import products.Meat;
import products.Vegetable;
import products.Legume;

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
import java.util.ArrayList;
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
		
		JComboBox comboBoxCategoriaProducto = new JComboBox();
		comboBoxCategoriaProducto.setModel(new DefaultComboBoxModel(TypeOfCondiment.values()));
		comboBoxCategoriaProducto.setBounds(185, 86, 225, 27);
		panelCentral.add(comboBoxCategoriaProducto);
		
		JComboBox comboBoxTipoProducto = new JComboBox();
		comboBoxTipoProducto.setModel(new DefaultComboBoxModel(new String[] {"Condimento", "Pescado", "Fruta", "Legumbre", "Carne", "Verdura"}));
		comboBoxTipoProducto.setBounds(185, 40, 225, 27);
		panelCentral.add(comboBoxTipoProducto);
		comboBoxTipoProducto.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				byte index = (byte)comboBoxTipoProducto.getSelectedIndex();
				
				switch (index) {
				
				case 0: 
					comboBoxCategoriaProducto.setModel(new DefaultComboBoxModel(TypeOfCondiment.values()));
					break;
				case 1: 
					comboBoxCategoriaProducto.setModel(new DefaultComboBoxModel(TypeOfFish.values()));
					break;
				case 2: 
					comboBoxCategoriaProducto.setModel(new DefaultComboBoxModel(TypeOfFruit.values()));
					break;
				case 3: 
					comboBoxCategoriaProducto.setModel(new DefaultComboBoxModel(TypeOfLegume.values()));
					break;
				case 4: 
					comboBoxCategoriaProducto.setModel(new DefaultComboBoxModel(TypeOfMeat.values()));
					break;
				case 5: 
					comboBoxCategoriaProducto.setModel(new DefaultComboBoxModel(TypeOfVegetable.values()));
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
		
		JSpinner spinnerFats= new JSpinner();
		spinnerFats.setBounds(380, 229, 30, 20);
		panelCentral.add(spinnerFats);
		
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
		
		JCheckBox chckbxVegan = new JCheckBox("vegano");
		chckbxVegan.setBounds(24, 352, 97, 23);
		panelCentral.add(chckbxVegan);
		
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
				    ArrayList<DietaryRestrictions> restrictions = new ArrayList <DietaryRestrictions>();
	            	boolean halal = false;
	            	boolean vegan = false;
	            	boolean lowCarb = false;
	            	boolean highProtein =false;
	                String productName = textField.getText();
	                String insert;
	                String typeOfProduct;
	                byte typeOf = (byte)comboBoxTipoProducto.getSelectedIndex();
	                byte indexCategoria = (byte)comboBoxCategoriaProducto.getSelectedIndex();
	                switch (typeOf) {
					
					case 0: 
						 insert = "CONDIMENT";
						 switch (indexCategoria) {
						 case 0: 
						 typeOfProduct = TypeOfCondiment.OIL.toString();
					     break;
						 case 1: 
						 typeOfProduct = TypeOfCondiment.SWEETENER.toString();
						 break;
						 case 2: 
					     typeOfProduct = TypeOfCondiment.SALT.toString();
						 break;
						 case 3: 
						 typeOfProduct = TypeOfCondiment.SPICES.toString();
						 break;
						 case 4: 
						typeOfProduct = TypeOfCondiment.OTHER.toString();
						 break;
						 }
						break;
						
					case 1: 
						 insert = "FISH";
						 switch (indexCategoria) {
						 case 0: 
					    typeOfProduct = TypeOfFish.BLUEFISH.toString();
					     break;
						 case 1: 
							 typeOfProduct = TypeOfFish.WHITEFISH.toString();
						 break;
						 case 2: 
							 typeOfProduct = TypeOfFish.SEAFOOD.toString();
						 break;
						 }
						break;
						
						
						
					case 2: 
						 insert = "FRUIT";
						 switch (indexCategoria) {
						 case 0: 
					     typeOfProduct = TypeOfFruit.APPLE.toString();
					     break;
						 case 1: 
					     typeOfProduct = TypeOfFruit.PEAR.toString();
						 break;
						 case 2: 
						 typeOfProduct = TypeOfFruit.WATERMELON.toString();
						 break;
						 case 3: 
						 typeOfProduct = TypeOfFruit.LEMON.toString();
						 break;
					     case 4: 
						 typeOfProduct = TypeOfFruit.ORANGE.toString();
						 break;
						 case 5: 
						 typeOfProduct = TypeOfFruit.STRAWBERRY.toString();
						 break; 
						 case 6: 
						 typeOfProduct = TypeOfFruit.BANANA.toString();
						 break;
				   	     case 7: 
						 typeOfProduct = TypeOfFruit.PEACH.toString();
						 break;
						 case 8: 
						 typeOfProduct = TypeOfFruit.PINNEAPPLE.toString();
						 break;
						 case 9: 
						 typeOfProduct = TypeOfFruit.AVOCADO.toString();
						 break;
						 }
						break;
						
					case 3: 
						 insert = "LEGUME";
						 switch (indexCategoria) {
						 case 0: 
					     typeOfProduct = TypeOfLegume.PEANUTS.toString();
					     break;
						 case 1: 
						 typeOfProduct =TypeOfLegume.LENTILLS.toString();
						 break;
						 case 2: 
						 typeOfProduct =TypeOfLegume.PEAS.toString();
						 break;
						 case 3: 
						 typeOfProduct =TypeOfLegume.LUPINS.toString();
						 break;
						 case 4:
					     typeOfProduct =TypeOfLegume.ALMONDS.toString();	
					     break;
					case 4: 
						 insert = "MEAT";
						 
						break;
					case 5: 
						 insert = "VEGETABLE";
						break;

					}
	                
	   
	                short caloricDensity = (short)sliderCalories.getValue();
	                short proteins =  (short) spinnerProtein.getValue();
	                short fats =  (short) spinnerFats.getValue();
	                short carbs = (short) spinnerCarbs.getValue();

	                
	               if (chckbxVegan.isSelected()) {
	            	   vegan=true; 
	            	   restrictions.add(DietaryRestrictions.VEGAN);
	               } else {vegan = false;}
	               
	               if (chckbxCarb.isSelected()) {
	            	   lowCarb = true;
	            	   restrictions.add(DietaryRestrictions.LOWCARB);
	               } else { lowCarb = false;}
	               
	               if (chckbxHalal.isSelected()) {
	                 halal = true;
	                 restrictions.add(DietaryRestrictions.HALAL);
	                
	               } else { halal = false;}
	               
	               if (chckbxProt.isSelected()) {
	            	   highProtein = true;
	            	   restrictions.add(DietaryRestrictions.HIGHPROTEIN);
	            	   
	               }else {highProtein = false;}
	               
	               
	               
	               try {
	            	   switch (typeOf) {
						
						case 0: 
							 insert = "CONDIMENT";
							 Product newCondiment = new Condiment (productName, caloricDensity, carbs, proteins, fats, vegan, halal, highProtein, lowCarb, (short) 0, Storage.DRY, restrictions, null);
							break;
						case 1: 
						     insert = "FISH";
						     Product newFish = new Fish (productName, caloricDensity, carbs, proteins, fats, vegan, halal, highProtein, lowCarb, (short) 0, Storage.COLD, restrictions, null);
							break;
						case 2: 
							 Product newFruit = new Fruit (productName, caloricDensity, carbs, proteins, fats, vegan, halal, highProtein, lowCarb, (short) 0, Storage.COLD, restrictions, null);
							 insert = "FRUIT";
							break;
						case 3: 
							 Product newLegume = new Legume (productName, caloricDensity, carbs, proteins, fats, vegan, halal, highProtein, lowCarb, (short) 0, Storage.COLD, restrictions, null);
							 insert = "LEGUME";
							break;
						case 4: 
							 Product newMeat = new Meat (productName, caloricDensity, carbs, proteins, fats, vegan, halal, highProtein, lowCarb, (short) 0, Storage.COLD, restrictions, null);
							 insert = "MEAT";
							break;
						case 5: 
							 Product newVegetable = new Vegetable  (productName, caloricDensity, carbs, proteins, fats, vegan, halal, highProtein, lowCarb, (short) 0, Storage.COLD, restrictions, null);

							 insert = "VEGETABLE";
							break;

						}
	            	   
	            	   
	            	   
	                Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/esquematablasproyecto", 
	                		"root", "UXa19661!");
	                Statement smt = c.createStatement();
	                
	                
	                //executeQuery solo para los select
	                smt.executeUpdate("insert into user "
	                		+ "values ('"+creado.getUserName()+"', '"+creado.getPassword()+"', '"+email+"', '"+firstName+"', '"+lastName+"',  '"+secondLastName+"',  '"+birthDate.toString()+"', "+genre+",  "+halal+",  "+vegan+",  "+lowCarb+",  "+highProtein+",  "+height+",  "+weight+");");           
	 
	                smt.close();
	                c.close();
	                JOptionPane.showMessageDialog(ventana, "", "Se ha dado de alta el producto satisfactoriamente", JOptionPane.INFORMATION_MESSAGE);
	                
	   	 
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

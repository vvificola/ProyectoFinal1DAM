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
import java.awt.SystemColor;

/**
 * Interfaz de usuario que permite añadir nuevos productos a la base de datos
 * @author Candido Vidal 
 */
public class PantallaCargaProductos extends JPanel {

    private Storage storage;
    private RecipeDifficulty difficulty;
    private TypeOfCooking cooking;
    private Ventana ventana;
    private User usuario;
    private JTextField searchField;
    private JTextField textField;
    private JTextField fieldPeso;

    public PantallaCargaProductos(Ventana v, User u) {
        this.usuario = u;
        this.ventana = v;
        this.setSize(493, 660);
		v.setResizable(true);
        setLayout(new BorderLayout(0, 0));

        JPanel panelCentral = new JPanel();
        add(panelCentral, BorderLayout.CENTER);
        panelCentral.setLayout(null);
        

        JLabel labelTipoDeProducto = new JLabel("categoría de producto");
        labelTipoDeProducto.setFont(new Font("Tahoma", Font.PLAIN, 12));
        labelTipoDeProducto.setBounds(34, 45, 127, 16);
        panelCentral.add(labelTipoDeProducto);

        JComboBox comboBoxCategoriaProducto = new JComboBox();
        comboBoxCategoriaProducto.setBackground(SystemColor.text);
        comboBoxCategoriaProducto.setModel(new DefaultComboBoxModel(TypeOfCondiment.values()));
        comboBoxCategoriaProducto.setBounds(185, 86, 225, 27);
        panelCentral.add(comboBoxCategoriaProducto);

        JComboBox comboBoxTipoProducto = new JComboBox();
        comboBoxTipoProducto.setBackground(SystemColor.text);
        comboBoxTipoProducto.setModel(new DefaultComboBoxModel(new String[]{"Condimento", "Pescado", "Fruta", "Legumbre", "Carne", "Verdura"}));
        comboBoxTipoProducto.setBounds(185, 40, 225, 27);
        panelCentral.add(comboBoxTipoProducto);
        comboBoxTipoProducto.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                byte index = (byte) comboBoxTipoProducto.getSelectedIndex();

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
                int index = ((JSlider) e.getSource()).getValue();
                contadorCaloriasLabel.setText(index + "");
            }
        });

        JLabel labelCaloricDensity = new JLabel("densidad calórica (kcal/100g)");
        labelCaloricDensity.setFont(new Font("Tahoma", Font.PLAIN, 12));
        labelCaloricDensity.setBounds(30, 179, 158, 16);
        panelCentral.add(labelCaloricDensity);

        JSpinner spinnerCarbs = new JSpinner();
        spinnerCarbs.setBounds(117, 237, 44, 20);
        panelCentral.add(spinnerCarbs);

        JSpinner spinnerProtein = new JSpinner();
        spinnerProtein.setBounds(270, 237, 44, 20);
        panelCentral.add(spinnerProtein);

        JSpinner spinnerFats = new JSpinner();
        spinnerFats.setBounds(389, 237, 44, 20);
        panelCentral.add(spinnerFats);

        JLabel carbsLabel = new JLabel("carbohidratos");
        carbsLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
        carbsLabel.setBounds(33, 240, 75, 14);
        panelCentral.add(carbsLabel);

        JLabel proteinLabel = new JLabel("proteínas");
        proteinLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
        proteinLabel.setBounds(204, 240, 58, 14);
        panelCentral.add(proteinLabel);

        JLabel greaseLabel = new JLabel("grasas");
        greaseLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
        greaseLabel.setBounds(344, 239, 37, 14);
        panelCentral.add(greaseLabel);

        JLabel labelAlmacenaje = new JLabel("almacenaje");
        labelAlmacenaje.setFont(new Font("Tahoma", Font.PLAIN, 12));
        labelAlmacenaje.setBounds(34, 325, 75, 16);
        panelCentral.add(labelAlmacenaje);

        JComboBox comboBoxTipoProducto_1 = new JComboBox();
        comboBoxTipoProducto_1.setBackground(SystemColor.text);
        comboBoxTipoProducto_1.setModel(new DefaultComboBoxModel(Storage.values()));
        comboBoxTipoProducto_1.setBounds(117, 320, 69, 27);
        panelCentral.add(comboBoxTipoProducto_1);

        JLabel lblGr = new JLabel("(gr/100)");
        lblGr.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblGr.setBounds(34, 262, 44, 14);
        panelCentral.add(lblGr);

        JLabel lblGr_1 = new JLabel("(gr/100)");
        lblGr_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblGr_1.setBounds(202, 262, 44, 14);
        panelCentral.add(lblGr_1);

        JLabel lblGr_2 = new JLabel("(gr/100)");
        lblGr_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblGr_2.setBounds(344, 261, 44, 14);
        panelCentral.add(lblGr_2);

        JCheckBox chckbxVegan = new JCheckBox("vegano");
        chckbxVegan.setFont(new Font("Tahoma", Font.PLAIN, 12));
        chckbxVegan.setBounds(21, 397, 97, 23);
        panelCentral.add(chckbxVegan);

        JCheckBox chckbxHalal = new JCheckBox("halal");
        chckbxHalal.setFont(new Font("Tahoma", Font.PLAIN, 12));
        chckbxHalal.setBounds(126, 397, 97, 23);
        panelCentral.add(chckbxHalal);

        JCheckBox chckbxProt = new JCheckBox("proteíco");
        chckbxProt.setFont(new Font("Tahoma", Font.PLAIN, 12));
        chckbxProt.setBounds(223, 397, 97, 23);
        panelCentral.add(chckbxProt);

        JCheckBox chckbxCarb = new JCheckBox("bajos hidratos");
        chckbxCarb.setFont(new Font("Tahoma", Font.PLAIN, 12));
        chckbxCarb.setBounds(335, 397, 118, 23);
        panelCentral.add(chckbxCarb);

        JLabel lblPesoGramos = new JLabel("peso (en gramos)");
        lblPesoGramos.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblPesoGramos.setBounds(241, 325, 97, 16);
        panelCentral.add(lblPesoGramos);

        fieldPeso = new JTextField();
        fieldPeso.setBounds(359, 325, 69, 17);
        panelCentral.add(fieldPeso);
        fieldPeso.setColumns(10);

        JButton btnCargar = new JButton("alta producto");
        btnCargar.setBounds(85, 531, 147, 23);
        panelCentral.add(btnCargar);
        

        
        btnCargar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //inicializados a false
                ArrayList<DietaryRestrictions> restrictions = new ArrayList<DietaryRestrictions>();
                boolean halal = false;
                boolean vegan = false;
                boolean lowCarb = false;
                boolean highProtein = false;
                short weight = Short.parseShort(fieldPeso.getText());
                String productName = textField.getText();
                String insert = " ";
                TypeOfCondiment c = null;
                TypeOfFish f = null;
                TypeOfFruit fr= null;
                TypeOfLegume l= null;
                TypeOfMeat m = null;
                TypeOfVegetable v= null;

                byte typeOf = (byte) comboBoxTipoProducto.getSelectedIndex();
                byte indexCategoria = (byte) comboBoxCategoriaProducto.getSelectedIndex();

                switch (typeOf) {

                    case 0:
                        insert += "CONDIMENT";
                        switch (indexCategoria) {
                            case 0:
                                c = TypeOfCondiment.OIL;
                                break;
                            case 1:
                                c = TypeOfCondiment.SWEETENER;
                                break;
                            case 2:
                                c = TypeOfCondiment.SALT;
                                break;
                            case 3:
                                c = TypeOfCondiment.SPICES;
                                break;
                            case 4:
                                c = TypeOfCondiment.OTHER;
                                break;
                        }
                        break;

                    case 1:
                        insert += "FISH";
                        switch (indexCategoria) {
                            case 0:
                                f = TypeOfFish.BLUEFISH;
                                break;
                            case 1:
                                f = TypeOfFish.WHITEFISH;
                                break;
                            case 2:
                                f = TypeOfFish.SEAFOOD;
                                break;
                        }
                        break;

                    case 2:
                        insert += "FRUIT";
                        switch (indexCategoria) {
                            case 0:
                                fr = TypeOfFruit.APPLE;
                                break;
                            case 1:
                                fr = TypeOfFruit.PEAR;
                                break;
                            case 2:
                                fr = TypeOfFruit.WATERMELON;
                                break;
                            case 3:
                                fr = TypeOfFruit.LEMON;
                                break;
                            case 4:
                                fr = TypeOfFruit.ORANGE;
                                break;
                            case 5:
                                fr = TypeOfFruit.STRAWBERRY;
                                break;
                            case 6:
                                fr = TypeOfFruit.BANANA;
                                break;
                            case 7:
                                fr = TypeOfFruit.PEACH;
                                break;
                            case 8:
                                fr = TypeOfFruit.PINNEAPPLE;
                                break;
                            case 9:
                                fr = TypeOfFruit.AVOCADO;
                                break;
                        }
                        break;

                    case 3:
                        insert += "LEGUME";
                        switch (indexCategoria) {
                            case 0:
                                l = TypeOfLegume.PEANUTS;
                                break;
                            case 1:
                                l = TypeOfLegume.LENTILLS;
                                break;
                            case 2:
                                l = TypeOfLegume.PEAS;
                                break;
                            case 3:
                                l = TypeOfLegume.LUPINS;
                                break;
                            case 4:
                                l = TypeOfLegume.ALMONDS;
                                break;
                        }

                    case 4:
                        insert += "MEAT";
                        switch (indexCategoria) {
                            case 0:
                                m = TypeOfMeat.CHICKEN;
                                break;
                            case 1:
                                m = TypeOfMeat.BEEF;
                                break;
                            case 2:
                                m = TypeOfMeat.TURKEY;
                                break;
                            case 3:
                                m = TypeOfMeat.PORK;
                                break;
                            case 4:
                                m = TypeOfMeat.LAMB;
                                break;
                        }
                        break;

                    case 5:
                        insert += "VEGETABLE";
                        switch (indexCategoria) {
                            case 0:
                                v = TypeOfVegetable.ONION;
                                break;
                            case 1:
                                v = TypeOfVegetable.CUCUMBER;
                                break;
                            case 2:
                                v = TypeOfVegetable.EGGPLANT;
                                break;
                            case 3:
                                v = TypeOfVegetable.TOMATO;
                                break;
                            case 4:
                                v = TypeOfVegetable.CARROT;
                                break;
                            case 5:
                                v = TypeOfVegetable.ASPARAGUS;
                                break;
                            case 6:
                                v = TypeOfVegetable.PEPPER;
                                break;
                            case 7:
                                v = TypeOfVegetable.ZUCHINNI;
                                break;
                            case 8:
                                v = TypeOfVegetable.GARLIC;
                                break;
                            case 9:
                                v = TypeOfVegetable.SPINACH;
                                break;
                            case 10:
                                v = TypeOfVegetable.VEGAN_MEAT;
                                break;
                        }
                        break;

                }

                short caloricDensity = (short) sliderCalories.getValue();
                int proteins = (Integer) spinnerProtein.getValue();
                int fats = (Integer) spinnerFats.getValue();
                int carbs = (Integer) spinnerCarbs.getValue();

                if (chckbxVegan.isSelected()) {
                    vegan = true;
                    restrictions.add(DietaryRestrictions.VEGAN);
                } else {
                    vegan = false;
                }

                if (chckbxCarb.isSelected()) {
                    lowCarb = true;
                    restrictions.add(DietaryRestrictions.LOWCARB);
                } else {
                    lowCarb = false;
                }

                if (chckbxHalal.isSelected()) {
                    halal = true;
                    restrictions.add(DietaryRestrictions.HALAL);

                } else {
                    halal = false;
                }

                if (chckbxProt.isSelected()) {
                    highProtein = true;
                    restrictions.add(DietaryRestrictions.HIGHPROTEIN);

                } else {
                    highProtein = false;
                }

                try {
                    switch (typeOf) {

                        case 0:
                            insert = "CONDIMENT";
                            Product newCondiment = new Condiment(productName, caloricDensity,(short) carbs,(short) proteins,(short) fats, vegan, halal, highProtein, lowCarb, (short) 0, Storage.DRY, restrictions, c);
                            break;
                        case 1:
                            insert = "FISH";
                            Product newFish = new Fish(productName, caloricDensity, (short)carbs, (short)proteins,(short) fats, vegan, halal, highProtein, lowCarb, (short) 0, Storage.COLD, restrictions, f);
                            break;
                        case 2:
                            Product newFruit = new Fruit(productName, caloricDensity,(short) carbs,(short) proteins, (short)fats, vegan, halal, highProtein, lowCarb, (short) 0, Storage.COLD, restrictions, fr);
                            insert = "FRUIT";
                            break;
                        case 3:
                            Product newLegume = new Legume(productName, caloricDensity, (short)carbs, (short)proteins, (short)fats, vegan, halal, highProtein, lowCarb, (short) 0, Storage.COLD, restrictions, l);
                            insert = "LEGUMES";
                            break;
                        case 4:
                            Product newMeat = new Meat(productName, caloricDensity, (short)carbs,(short) proteins,(short) fats, vegan, halal, highProtein, lowCarb, (short) 0, Storage.COLD, restrictions, m);
                            insert = "MEAT";
                            break;
                        case 5:
                            Product newVegetable = new Vegetable(productName, caloricDensity,(short) carbs, (short)proteins, (short)fats, vegan, halal, highProtein, lowCarb, (short) 0, Storage.COLD, restrictions, v);

                            insert = "VEGETABLE";
                            break;

                    }
                    Connection connect =  DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/esquematablasproyecto",
                            "root", "UXa19661!");
                    
                        
                        Statement smt = connect.createStatement();

                        switch (insert) {
                            case "CONDIMENT":
                                smt.executeUpdate("insert into " + insert 
                                        + " values ('" + productName + "', '" + c.toString() + "', '" + caloricDensity + "','" + carbs + "', '" + proteins + "', '" + fats + "',  '" + weight + "',  '" + Storage.DRY.toString() + "', " + vegan + ",  " + halal + ",  " + highProtein + ",  " + lowCarb + ");");
                               
                                smt.close();
                                break;
                              
                            case "FISH":
                                smt.executeUpdate("insert into " + insert 
                                        + " values ('" + productName + "', '" + f.toString() + "', '" + caloricDensity + "','" + carbs + "', '" + proteins + "', '" + fats + "',  '" + weight + "',  '" + Storage.COLD.toString() + "', " + vegan + ",  " + halal + ",  " + highProtein + ",  " + lowCarb + ");");

                                smt.close();
                                break;
                            case "FRUIT":
                                smt.executeUpdate("insert into " + insert 
                                        + " values ('" + productName + "', '" + fr.toString() + "', '" + caloricDensity + "','" + carbs + "', '" + proteins + "', '" + fats + "',  '" + weight + "',  '" + Storage.DRY.toString() + "', " + vegan + ",  " + halal + ",  " + highProtein + ",  " + lowCarb + ");");

                                smt.close();
                                break;
                            case "LEGUMES":
                                smt.executeUpdate("insert into " + insert 
                                        + " values ('" + productName + "', '" + l.toString() + "', '" + caloricDensity + "','" + carbs + "', '" + proteins + "', '" + fats + "',  '" + weight + "',  '" + Storage.DRY.toString() + "', " + vegan + ",  " + halal + ",  " + highProtein + ",  " + lowCarb + ");");

                                smt.close();
                                break;
                            case "MEAT":
                                smt.executeUpdate("insert into " + insert 
                                        + " values ('" + productName + "', '" + m.toString() + "', '" + caloricDensity + "','" + carbs + "', '" + proteins + "', '" + fats + "',  '" + weight + "',  '" + Storage.COLD.toString() + "', " + vegan + ",  " + halal + ",  " + highProtein + ",  " + lowCarb + ");");

                                smt.close();
                                break;
                            case "VEGETABLE":
                                smt.executeUpdate("insert into " + insert 
                                        + " values ('" + productName + "', '" + v.toString() + "', '" + caloricDensity + "','" + carbs + "', '" + proteins + "', '" + fats + "',  '" + weight + "',  '" + Storage.DRY.toString() + "', " + vegan + ",  " + halal + ",  " + highProtein + ",  " + lowCarb + ");");

                                smt.close();
                                break;


                           
                        }

                        JOptionPane.showMessageDialog(ventana, "Se ha dado de alta el producto satisfactoriamente", "alta producto", JOptionPane.INFORMATION_MESSAGE);

                    }catch (SQLException e1) {
                    	e1.printStackTrace();
                    JOptionPane.showMessageDialog(ventana, "Ha habido un problema completando la inserción del registro", "Problema base de datos", JOptionPane.ERROR_MESSAGE);
                }
                }

            });
        
        JButton btnVolver = new JButton("volver ");
        btnVolver.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		
					try {
						ventana.userLogged(u);
					} catch (CampoVacioException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
        		
        	}
        });
        btnVolver.setBounds(317, 531, 89, 23);
        panelCentral.add(btnVolver);
        
        
        
        
        

        }
    }


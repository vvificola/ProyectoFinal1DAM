package interfaces;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import javax.swing.UIManager;

import classes.User;
import exceptions.CampoVacioException;
import exceptions.EmailNoValidoException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JToggleButton;
import javax.swing.SpinnerNumberModel;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import java.awt.Component;
import javax.swing.Box;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PantallaRegistro extends JPanel {

    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField secondLastNameField;
    private JTextField mailField;
    private JTextField birthField;
    private Ventana ventana;
    private User user;

    public PantallaRegistro(Ventana v, User creado) {

        this.ventana = v;
        this.user = creado;
        
        this.setSize(351, 417);
        ventana.setTitle("pantalla de registro");

        setLayout(new BorderLayout(0, 0));

        JPanel panelCentral = new JPanel();
        add(panelCentral, BorderLayout.CENTER);
        panelCentral.setLayout(null);

        lastNameField = new JTextField();
        lastNameField.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
        lastNameField.setBounds(141, 51, 183, 17);
        panelCentral.add(lastNameField);
        lastNameField.setColumns(10);

        firstNameField = new JTextField();
        firstNameField.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
        firstNameField.setColumns(10);
        firstNameField.setBounds(141, 22, 183, 17);
        panelCentral.add(firstNameField);

        JLabel firstNameLabel = new JLabel("nombre");
        firstNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        firstNameLabel.setFont(new Font("Futura", Font.PLAIN, 12));
        firstNameLabel.setBounds(0, 23, 143, 16);
        panelCentral.add(firstNameLabel);

        secondLastNameField = new JTextField();
        secondLastNameField.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
        secondLastNameField.setColumns(10);
        secondLastNameField.setBounds(141, 80, 183, 17);
        panelCentral.add(secondLastNameField);

        JComboBox fieldGenre = new JComboBox();
        fieldGenre.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
        fieldGenre.setModel(new DefaultComboBoxModel(new String[]{"hombre", "mujer"}));

        fieldGenre.setBounds(141, 109, 183, 26);
        panelCentral.add(fieldGenre);

        JLabel lblFirstName = new JLabel("primer apellido");
        lblFirstName.setHorizontalAlignment(SwingConstants.CENTER);
        lblFirstName.setFont(new Font("Futura", Font.PLAIN, 12));
        lblFirstName.setBounds(0, 52, 143, 16);
        panelCentral.add(lblFirstName);

        JLabel labelSecondLastName = new JLabel("segundo apellido");
        labelSecondLastName.setHorizontalAlignment(SwingConstants.CENTER);
        labelSecondLastName.setFont(new Font("Futura", Font.PLAIN, 12));
        labelSecondLastName.setBounds(0, 80, 143, 16);
        panelCentral.add(labelSecondLastName);

        JLabel labelGenre = new JLabel("género");
        labelGenre.setHorizontalAlignment(SwingConstants.CENTER);
        labelGenre.setFont(new Font("Futura", Font.PLAIN, 12));
        labelGenre.setBounds(0, 115, 143, 16);
        panelCentral.add(labelGenre);

        JLabel labelMail = new JLabel("email");
        labelMail.setHorizontalAlignment(SwingConstants.CENTER);
        labelMail.setFont(new Font("Futura", Font.PLAIN, 12));
        labelMail.setBounds(0, 154, 143, 16);
        panelCentral.add(labelMail);

        mailField = new JTextField();
        mailField.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
        mailField.setColumns(10);
        mailField.setBounds(141, 153, 183, 17);
        panelCentral.add(mailField);

        JLabel labelWeight = new JLabel("peso (kg)");
        labelWeight.setHorizontalAlignment(SwingConstants.LEFT);
        labelWeight.setFont(new Font("Futura", Font.PLAIN, 12));
        labelWeight.setBounds(24, 234, 58, 16);
        panelCentral.add(labelWeight);

        JLabel labelHeight = new JLabel("altura (cm)");
        labelHeight.setHorizontalAlignment(SwingConstants.LEFT);
        labelHeight.setFont(new Font("Futura", Font.PLAIN, 12));
        labelHeight.setBounds(195, 234, 71, 16);
        panelCentral.add(labelHeight);

        final JSpinner spinnerWeight = new JSpinner();
        spinnerWeight.setFont(new Font("Futura", Font.PLAIN, 11));
        String genre = fieldGenre.getSelectedItem().toString();
        
        if (genre.equals("hombre")) {
            
            spinnerWeight.setModel(new SpinnerNumberModel(70, 0, 150, 1));
            
        } else if (genre.equals("mujer")) {
        
            spinnerWeight.setModel(new SpinnerNumberModel(50, 0, 120, 1));

        }

        spinnerWeight.setBounds(276, 229, 51, 26);
        panelCentral.add(spinnerWeight);

        JSpinner spinnerHeight = new JSpinner();
        spinnerHeight.setFont(new Font("Futura", Font.PLAIN, 11));
        if (genre.equals("hombre")) {
            spinnerHeight.setModel(new SpinnerNumberModel(170, 0, 220, 1));
        } else if (genre.equals("mujer")) {
            spinnerHeight.setModel(new SpinnerNumberModel(160, 0, 200, 1));

        }
        spinnerHeight.setBounds(106, 229, 51, 26);

        panelCentral.add(spinnerHeight);

        JLabel labelBirth = new JLabel("fecha nacimiento");
        labelBirth.setHorizontalAlignment(SwingConstants.CENTER);
        labelBirth.setFont(new Font("Futura", Font.PLAIN, 12));
        labelBirth.setBounds(0, 181, 143, 16);
        panelCentral.add(labelBirth);

        birthField = new JTextField();
        birthField.setToolTipText("(dd/mm/aaaa)");
        birthField.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
        birthField.setColumns(10);
        birthField.setBounds(141, 180, 183, 17);
        panelCentral.add(birthField);

        JCheckBox checkLowCarb = new JCheckBox("low carb");
        checkLowCarb.setFont(new Font("Futura", Font.PLAIN, 11));
        checkLowCarb.setBounds(113, 297, 77, 23);
        panelCentral.add(checkLowCarb);

        JCheckBox checkVegan = new JCheckBox("vegano");
        checkVegan.setFont(new Font("Futura", Font.PLAIN, 11));
        checkVegan.setBounds(270, 297, 71, 23);
        panelCentral.add(checkVegan);

        JCheckBox checkHighProtein = new JCheckBox("high protein");
        checkHighProtein.setFont(new Font("Futura", Font.PLAIN, 11));
        checkHighProtein.setBounds(6, 297, 93, 23);
        panelCentral.add(checkHighProtein);

        JCheckBox checkHalal = new JCheckBox("halal");
        checkHalal.setFont(new Font("Futura", Font.PLAIN, 11));
        checkHalal.setBounds(200, 297, 60, 23);
        panelCentral.add(checkHalal);
        
        JLabel lblNewLabel = new JLabel("opciones dietarias");
        lblNewLabel.setFont(new Font("Futura", Font.PLAIN, 12));
        lblNewLabel.setBounds(24, 276, 119, 14);
        panelCentral.add(lblNewLabel);

        JPanel panelSouth = new JPanel();
        add(panelSouth, BorderLayout.SOUTH);
        panelSouth.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        JButton registerButton = new JButton("registrame");
        registerButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                registerButton.setBackground(new Color(84, 117, 166));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                registerButton.setBackground(null);
            }
        });
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	//inicializados a false
            	boolean halal = false;
            	boolean vegan = false;
            	boolean lowCarb = false;
            	boolean highProtein =false;
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();
                String secondLastName = secondLastNameField.getText();
                boolean genre;
                if (fieldGenre.getSelectedIndex()==0) {
                	genre = true;
                } else {genre = false;}
                int height = (int) spinnerHeight.getValue();
                int weight = (int) spinnerWeight.getValue();
                String email = mailField.getText();
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
        registerButton.setForeground(new Color(0, 0, 51));
        panelSouth.add(registerButton);

        JButton loginButton = new JButton("volver a inicio sesión");
        loginButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ventana.goLogin();
        		JOptionPane.showConfirmDialog(ventana, "¿Desea descartar la creación de usuario?");
        	}
        });

        panelSouth.add(loginButton);
    }
}

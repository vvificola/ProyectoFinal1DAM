package interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Locale;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import classes.User;
import enums.IMCGradation;
import exceptions.CampoVacioException;
import javax.swing.JToolBar;
import javax.swing.JTable;
import javax.swing.border.CompoundBorder;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.Box;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.SystemColor;

public class PantallaDisplayMenu  extends JPanel{
	private Ventana ventana;
	private User usuario;
	
	
	public PantallaDisplayMenu(Ventana v, User u)  {
		setBackground(SystemColor.controlLtHighlight);
		
		this.ventana=v;
		this.usuario=u;
		this.setSize(1051, 585);
		setLayout(null);
		
		JLabel labelMonday = new JLabel("Lunes");
		labelMonday.setBounds(226, 60, 41, 17);
		labelMonday.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(labelMonday);
		
		JLabel labelTuesday = new JLabel("Martes");
		labelTuesday.setBounds(345, 60, 47, 17);
		labelTuesday.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(labelTuesday);
		
		JLabel labelWednesday = new JLabel("Miércoles");
		labelWednesday.setBounds(457, 60, 63, 17);
		labelWednesday.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(labelWednesday);
		
		JLabel labelThursday = new JLabel("Jueves");
		labelThursday.setBounds(585, 60, 47, 17);
		labelThursday.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(labelThursday);
		
		JLabel labelFriday = new JLabel("Viernes");
		labelFriday.setBounds(697, 60, 51, 17);
		labelFriday.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(labelFriday);
		
		JLabel labelSaturday = new JLabel("Sábado");
		labelSaturday.setBounds(813, 60, 52, 17);
		labelSaturday.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(labelSaturday);
		
		JLabel lblNewLabel_3_3 = new JLabel("Domingo");
		lblNewLabel_3_3.setBounds(930, 60, 62, 17);
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lblNewLabel_3_3);
		
		JLabel labelBreakfast = new JLabel("Desayuno ");
		labelBreakfast.setBounds(72, 112, 64, 15);
		labelBreakfast.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(labelBreakfast);
		
		JLabel labelLunch = new JLabel("Comida");
		labelLunch.setBounds(82, 222, 45, 15);
		labelLunch.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(labelLunch);
		
		JLabel labelDinner = new JLabel("Cena");
		labelDinner.setBounds(89, 332, 30, 15);
		labelDinner.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(labelDinner);
		
		JLabel labelInfo = new JLabel("Contador de macros/día");
		labelInfo.setBounds(30, 382, 149, 15);
		labelInfo.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(labelInfo);
		
		JLabel labelCarbs = new JLabel("Carbohidratos");
		labelCarbs.setBounds(67, 402, 74, 15);
		labelCarbs.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(labelCarbs);
		
		JLabel lblNewLabel_1 = new JLabel("Proteínas");
		lblNewLabel_1.setBounds(79, 422, 50, 15);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Grasas");
		lblNewLabel_2.setBounds(87, 442, 34, 15);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Total kcal");
		lblNewLabel_3.setBounds(78, 462, 52, 15);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBackground(SystemColor.textHighlight);
		lblNewLabel_4.setBounds(332, 98, 80, 80);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBackground(SystemColor.textHighlight);
		lblNewLabel_5.setBounds(457, 98, 80, 80);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBackground(SystemColor.textHighlight);
		lblNewLabel_6.setBounds(573, 98, 80, 80);
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBackground(SystemColor.textHighlight);
		lblNewLabel_7.setBounds(686, 98, 80, 80);
		add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBackground(SystemColor.textHighlight);
		lblNewLabel_8.setBounds(801, 98, 80, 80);
		add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBackground(SystemColor.textHighlight);
		lblNewLabel_9.setBounds(927, 98, 80, 80);
		add(lblNewLabel_9);
		
		JLabel lblNewLabel_4_1 = new JLabel("New label");
		Sting imagePath = labelBreakfast.
		lblNewLabel_4_1.setIcon(new ImageIcon("\\\\MACBOOKPRO-EF2E\\NetBeansProjects\\ProyectoFinal1DAM\\images\\desayuno_halal.jpeg"));
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setBackground(SystemColor.textHighlight);
		lblNewLabel_4_1.setBounds(194, 98, 113, 121);
		add(lblNewLabel_4_1);
	

		v.setResizable(false);
		
		LocalDate date = LocalDate.now();
		TemporalField woy = WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear(); 
		byte weekNumber = (byte) date.get(woy);
	
		
		
	}
}



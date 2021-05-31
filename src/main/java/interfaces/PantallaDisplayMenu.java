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

public class PantallaDisplayMenu  extends JPanel{
	private Ventana ventana;
	private User usuario;
	
	
	public PantallaDisplayMenu(Ventana v, User u)  {
		
		this.ventana=v;
		this.usuario=u;
		this.setSize(881, 491);
		setLayout(null);
		
		JLabel mondayLabel = new JLabel("Lunes");
		mondayLabel.setBounds(106, 35, 61, 16);
		add(mondayLabel);
		
		JLabel tuesdayLabel = new JLabel("Martes");
		tuesdayLabel.setBounds(212, 35, 61, 16);
		add(tuesdayLabel);
		
		JLabel wednesdayLabel = new JLabel("Miércoles");
		wednesdayLabel.setBounds(317, 35, 61, 16);
		add(wednesdayLabel);
		
		JLabel thursdayLabel = new JLabel("Jueves");
		thursdayLabel.setBounds(442, 35, 61, 16);
		add(thursdayLabel);
		
		JLabel lblNewLabel_4 = new JLabel("Viernes");
		lblNewLabel_4.setBounds(544, 35, 61, 16);
		add(lblNewLabel_4);
		
		JLabel saturdayLabel = new JLabel("Sábado");
		saturdayLabel.setBounds(654, 35, 61, 16);
		add(saturdayLabel);
		
		JLabel sundayLabel = new JLabel("Domingo");
		sundayLabel.setBounds(769, 35, 61, 16);
		add(sundayLabel);
		
		JLabel lblNewLabel = new JLabel("Desayuno");
		lblNewLabel.setBounds(10, 99, 71, 16);
		add(lblNewLabel);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalGlue.setBounds(0, 50, 891, 21);
		add(horizontalGlue);
		
		JLabel lblComida = new JLabel("Comida\n");
		lblComida.setBounds(10, 204, 71, 16);
		add(lblComida);
		
		JLabel lblCena = new JLabel("Cena");
		lblCena.setBounds(10, 304, 71, 16);
		add(lblCena);
		
		Component verticalGlue = Box.createVerticalGlue();
		verticalGlue.setBounds(93, 0, 24, 491);
		add(verticalGlue);
	

		v.setResizable(false);
		
		LocalDate date = LocalDate.now();
		TemporalField woy = WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear(); 
		byte weekNumber = (byte) date.get(woy);
	
		
		
	}
}



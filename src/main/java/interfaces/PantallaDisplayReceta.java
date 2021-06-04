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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import classes.Menu;
import classes.User;
import enums.DayofWeek;
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
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class PantallaDisplayReceta extends JPanel{
	private Ventana ventana;
	private User usuario;
	private String [] imagePath;

	private Menu menu;
	private JTable table;
	
	
	public PantallaDisplayReceta(Ventana v, User u, String [] ip)  {
		this.ventana=v;
		this.imagePath = ip;
		this.usuario=u;
		this.setSize(658, 601);
	

		v.setResizable(false);
		setLayout(null);
		
	
		JLabel image1 = new JLabel("0");
		image1.setIcon(new ImageIcon(""));
		image1.setHorizontalAlignment(SwingConstants.CENTER);
		image1.setBounds(31, 42, 152, 135);
		add(image1);
		
		
		
		JLabel image2 = new JLabel("0");
		image2.setIcon(new ImageIcon(""));
		image2.setHorizontalAlignment(SwingConstants.CENTER);
		image2.setBounds(228, 42, 152, 135);
		add(image2);
		
		JLabel image3 = new JLabel("0");
		image3.setIcon(new ImageIcon(""));
		image3.setHorizontalAlignment(SwingConstants.CENTER);
		image3.setBounds(437, 42, 152, 135);
		add(image3);
		
	
		JLabel image4 = new JLabel("0");
		image4.setIcon(new ImageIcon(""));
		image4.setHorizontalAlignment(SwingConstants.CENTER);
		image4.setBounds(31, 230, 152, 135);
		add(image4);
		
		JLabel image5 = new JLabel("0");
		image5.setIcon(new ImageIcon(""));
		image5.setHorizontalAlignment(SwingConstants.CENTER);
		image5.setBounds(228, 230, 152, 135);
		add(image5);
		
		JLabel image6 = new JLabel("0");
		image6.setIcon(new ImageIcon(""));
		image6.setHorizontalAlignment(SwingConstants.CENTER);
		image6.setBounds(437, 230, 152, 135);
		add(image6);
		
		JLabel image7 = new JLabel("0");
		image7.setIcon(new ImageIcon(""));
		image7.setHorizontalAlignment(SwingConstants.CENTER);
		image7.setBounds(31, 412, 152, 135);
		add(image7);
		
		JLabel image8 = new JLabel("0");
		image8.setIcon(new ImageIcon(""));
		image8.setHorizontalAlignment(SwingConstants.CENTER);
		image8.setBounds(228, 412, 152, 135);
		add(image8);
		
		JLabel image9 = new JLabel("0");
		image9.setIcon(new ImageIcon(""));
		image9.setHorizontalAlignment(SwingConstants.CENTER);
		image9.setBounds(437, 412, 152, 135);
		add(image9);
		
		JLabel recipeName7 = new JLabel("");
		recipeName7.setBounds(31, 389, 45, 13);
		add(recipeName7);
		
		JLabel recipeName = new JLabel("");
		recipeName.setBounds(225, 389, 45, 13);
		add(recipeName);
		
		JLabel recipeName9 = new JLabel("");
		recipeName9.setBounds(431, 389, 45, 13);
		add(recipeName9);
		
		JLabel recipeName4 = new JLabel("");
		recipeName4.setBounds(31, 207, 45, 13);
		add(recipeName4);
		
		JLabel recipeName5 = new JLabel("");
		recipeName5.setBounds(228, 207, 45, 13);
		add(recipeName5);
		
		JLabel recipeName6 = new JLabel("");
		recipeName6.setBounds(437, 207, 45, 13);
		add(recipeName6);
		
		JLabel recipeName1 = new JLabel("");
		recipeName1.setBounds(31, 19, 45, 13);
		add(recipeName1);
		
		JLabel recipeName2 = new JLabel("");
		recipeName2.setBounds(225, 19, 45, 13);
		add(recipeName2);
		
		JLabel recipeName3 = new JLabel("");
		recipeName3.setBounds(437, 19, 45, 13);
		add(recipeName3);
		
		
	for (int i = 0; i< ip.length; i++) {
			
		image1.setIcon(new ImageIcon(""+ip[i]));
		image2.setIcon(new ImageIcon(""+ip[i]));
		image3.setIcon(new ImageIcon(""+ip[i]));
		image4.setIcon(new ImageIcon(""+ip[i]));
		image5.setIcon(new ImageIcon(""+ip[i]));
		image6.setIcon(new ImageIcon(""+ip[i]));
		image7.setIcon(new ImageIcon(""+ip[i]));
		image8.setIcon(new ImageIcon(""+ip[i]));
		image9.setIcon(new ImageIcon(""+ip[i]));


			
		}
		
	
		
		
	}
}



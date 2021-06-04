package interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import classes.Menu;
import classes.Recipe;
import classes.User;
import exceptions.CampoVacioException;
import javax.swing.JTable;
/**
 * 
 * @author carlac
 */
public class PantallaDisplayMenu  extends JPanel{
	private Ventana ventana;
	private User usuario;
	private Recipe recipe;
	private Menu menu;
	private JTable table;
	private JLabel comidaMiercoles;
	
	/**
         * Constructor de la Interfaz PantallaDisplay menu
         * @param v variable de la clase ventana de la cual dependen todas las ventanas del proyecto
         * @param u instancia del usuario actual 
         */
	public PantallaDisplayMenu(Ventana v, User u)  {
		this.ventana=v;
		this.menu = menu;
		this.usuario=u;
		
		this.setSize(1154, 621);
	

		v.setResizable(false);
		setLayout(null);
		
		JPanel panelCentral = new JPanel();
		panelCentral.setBounds(0, 0, 0, 0);
		add(panelCentral);
		panelCentral.setLayout(null);
		
		JLabel labelLunes = new JLabel("LUNES");
		labelLunes.setFont(new Font("Tahoma", Font.BOLD, 14));
		labelLunes.setBounds(145, 48, 52, 25);
		add(labelLunes);
		
		JLabel lblMartes = new JLabel("MARTES");
		lblMartes.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMartes.setBounds(268, 48, 59, 25);
		add(lblMartes);
		
		JLabel lblMiercoles = new JLabel("MIÉRCOLES");
		lblMiercoles.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMiercoles.setBounds(409, 48, 86, 25);
		add(lblMiercoles);
		
		JLabel lblJueves = new JLabel("JUEVES");
		lblJueves.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblJueves.setBounds(577, 48, 65, 25);
		add(lblJueves);
		
		JLabel lblViernes = new JLabel("VIERNES");
		lblViernes.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblViernes.setBounds(724, 48, 65, 25);
		add(lblViernes);
		
		JLabel lblSabado = new JLabel("SÁBADO");
		lblSabado.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSabado.setBounds(871, 48, 65, 25);
		add(lblSabado);
		
		JLabel lblDomingo = new JLabel("DOMINGO");
		lblDomingo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDomingo.setBounds(1018, 48, 75, 25);
		add(lblDomingo);
		
		JLabel lblDesayuno = new JLabel("DESAYUNO");
		lblDesayuno.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDesayuno.setBounds(21, 141, 86, 25);
		add(lblDesayuno);
		
		JLabel lblComida = new JLabel("COMIDA");
		lblComida.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblComida.setBounds(21, 281, 75, 25);
		add(lblComida);
		
		JLabel lblCena = new JLabel("CENA");
		lblCena.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCena.setBounds(21, 437, 52, 25);
		add(lblCena);
		
		
	
		JLabel desayunoLunes = new JLabel();
		desayunoLunes.setIcon(new ImageIcon(""+u.generateBreakfast(u)));
		desayunoLunes.setHorizontalAlignment(SwingConstants.CENTER);
		desayunoLunes.setBackground(Color.MAGENTA);
		desayunoLunes.setBounds(134, 118, 75, 75);
		add(desayunoLunes);
		
		JLabel desayunoMartes = new JLabel("0");
		desayunoMartes.setIcon(new ImageIcon(""+u.generateBreakfast(u)));
		desayunoMartes.setHorizontalAlignment(SwingConstants.CENTER);
		desayunoMartes.setBackground(Color.MAGENTA);
		desayunoMartes.setBounds(260, 118, 75, 75);
		add(desayunoMartes);
		
		JLabel desayunoMiercoles = new JLabel("0");
		desayunoMiercoles.setIcon(new ImageIcon(""+u.generateBreakfast(u)));
		desayunoMiercoles.setHorizontalAlignment(SwingConstants.CENTER);
		desayunoMiercoles.setBackground(Color.MAGENTA);
		desayunoMiercoles.setBounds(415, 118, 75, 75);
		add(desayunoMiercoles);
		
		JLabel desayunoJueves = new JLabel("0");
		desayunoJueves.setIcon(new ImageIcon(""+u.generateBreakfast(u)));
		desayunoJueves.setHorizontalAlignment(SwingConstants.CENTER);
		desayunoJueves.setBackground(Color.MAGENTA);
		desayunoJueves.setBounds(572, 118, 75, 75);
		add(desayunoJueves);
		
		JLabel desayunoViernes = new JLabel("0");
		desayunoViernes.setIcon(new ImageIcon(""+u.generateBreakfast(u)));
		desayunoViernes.setHorizontalAlignment(SwingConstants.CENTER);
		desayunoViernes.setBackground(Color.MAGENTA);
		desayunoViernes.setBounds(719, 118, 75, 75);
		add(desayunoViernes);
		
		JLabel desayunoSabado = new JLabel("0");
		desayunoSabado.setIcon(new ImageIcon(""+u.generateBreakfast(u)));
		desayunoSabado.setHorizontalAlignment(SwingConstants.CENTER);
		desayunoSabado.setBackground(Color.MAGENTA);
		desayunoSabado.setBounds(866, 118, 75, 75);
		add(desayunoSabado);
		
		JLabel desayunoDomingo = new JLabel("0");
		desayunoDomingo.setIcon(new ImageIcon(""+u.generateBreakfast(u)));
		desayunoDomingo.setHorizontalAlignment(SwingConstants.CENTER);
		desayunoDomingo.setBackground(Color.MAGENTA);
		desayunoDomingo.setBounds(1018, 118, 75, 75);
		add(desayunoDomingo);
		
		
		JLabel comidaLunes = new JLabel("0");
		comidaLunes.setHorizontalAlignment(SwingConstants.CENTER);
		comidaLunes.setBackground(Color.MAGENTA);
		comidaLunes.setBounds(134, 258, 75, 75);
		add(comidaLunes);
		
		JLabel cenaLunes = new JLabel("0");
		cenaLunes.setHorizontalAlignment(SwingConstants.CENTER);
		cenaLunes.setBackground(Color.MAGENTA);
		cenaLunes.setBounds(134, 414, 75, 75);
		add(cenaLunes);
		
	
		
		JLabel comidaMartes = new JLabel("0");
		comidaMartes.setHorizontalAlignment(SwingConstants.CENTER);
		comidaMartes.setBackground(Color.MAGENTA);
		comidaMartes.setBounds(260, 258, 75, 75);
		add(comidaMartes);
		
		JLabel cenaMartes = new JLabel("0");
		cenaMartes.setHorizontalAlignment(SwingConstants.CENTER);
		cenaMartes.setBackground(Color.MAGENTA);
		cenaMartes.setBounds(260, 414, 75, 75);
		add(cenaMartes);
		
		
		
		comidaMiercoles = new JLabel("0");
		comidaMiercoles.setHorizontalAlignment(SwingConstants.CENTER);
		comidaMiercoles.setBackground(Color.MAGENTA);
		comidaMiercoles.setBounds(415, 258, 75, 75);
		add(comidaMiercoles);
		
		JLabel cenaMiercoles = new JLabel("0");
		cenaMiercoles.setHorizontalAlignment(SwingConstants.CENTER);
		cenaMiercoles.setBackground(Color.MAGENTA);
		cenaMiercoles.setBounds(415, 414, 75, 75);
		add(cenaMiercoles);
		
		
		
		JLabel comidaJueves = new JLabel("0");
		comidaJueves.setHorizontalAlignment(SwingConstants.CENTER);
		comidaJueves.setBackground(Color.MAGENTA);
		comidaJueves.setBounds(1018, 403, 75, 75);
		add(comidaJueves);
		
		JLabel cenaJueves = new JLabel("0");
		cenaJueves.setHorizontalAlignment(SwingConstants.CENTER);
		cenaJueves.setBackground(Color.MAGENTA);
		cenaJueves.setBounds(572, 414, 75, 75);
		add(cenaJueves);
		
	
		
		JLabel comidaViernes = new JLabel("0");
		comidaViernes.setHorizontalAlignment(SwingConstants.CENTER);
		comidaViernes.setBackground(Color.MAGENTA);
		comidaViernes.setBounds(719, 258, 75, 75);
		add(comidaViernes);
		
		JLabel cenaViernes = new JLabel("0");
		cenaViernes.setHorizontalAlignment(SwingConstants.CENTER);
		cenaViernes.setBackground(Color.MAGENTA);
		cenaViernes.setBounds(719, 414, 75, 75);
		add(cenaViernes);
		
	
		JLabel comidaSabado = new JLabel("0");
		comidaSabado.setHorizontalAlignment(SwingConstants.CENTER);
		comidaSabado.setBackground(Color.MAGENTA);
		comidaSabado.setBounds(866, 258, 75, 75);
		add(comidaSabado);
		
		JLabel cenaSabado = new JLabel("0");
		cenaSabado.setHorizontalAlignment(SwingConstants.CENTER);
		cenaSabado.setBackground(Color.MAGENTA);
		cenaSabado.setBounds(866, 414, 75, 75);
		add(cenaSabado);
		
		
		
		JLabel comidaDomingo = new JLabel("0");
		comidaDomingo.setHorizontalAlignment(SwingConstants.CENTER);
		comidaDomingo.setBackground(Color.MAGENTA);
		comidaDomingo.setBounds(1018, 258, 75, 75);
		add(comidaDomingo);
		
		JLabel cenaDomingo = new JLabel("0");
		cenaDomingo.setHorizontalAlignment(SwingConstants.CENTER);
		cenaDomingo.setBackground(Color.MAGENTA);
		cenaDomingo.setBounds(0, 0, 1154, 558);
		add(cenaDomingo);
		
		JButton btnNewButton = new JButton("volver");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ventana.userLogged(u);
				} catch (CampoVacioException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(490, 514, 85, 21);
		add(btnNewButton);
		
		
		
		
	}
}



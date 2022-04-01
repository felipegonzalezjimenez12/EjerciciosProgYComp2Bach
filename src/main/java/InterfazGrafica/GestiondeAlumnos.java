package InterfazGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class GestiondeAlumnos {

	private JFrame frame;
	private JTextField JTFID;
	private JTextField JTFNOMBRE;
	private JTextField JTFAPELLIDOS;
	private JTextField JTFNIF;
	private JPanel panel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestiondeAlumnos window = new GestiondeAlumnos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GestiondeAlumnos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("GESTION DE ALUMNOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(15, 5, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		frame.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JTFID = new JTextField();
		GridBagConstraints gbc_JTFID = new GridBagConstraints();
		gbc_JTFID.insets = new Insets(0, 0, 5, 0);
		gbc_JTFID.fill = GridBagConstraints.HORIZONTAL;
		gbc_JTFID.gridx = 1;
		gbc_JTFID.gridy = 1;
		frame.getContentPane().add(JTFID, gbc_JTFID);
		JTFID.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("NOMBRE:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		frame.getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JTFNOMBRE = new JTextField();
		GridBagConstraints gbc_JTFNOMBRE = new GridBagConstraints();
		gbc_JTFNOMBRE.insets = new Insets(0, 0, 5, 0);
		gbc_JTFNOMBRE.fill = GridBagConstraints.HORIZONTAL;
		gbc_JTFNOMBRE.gridx = 1;
		gbc_JTFNOMBRE.gridy = 2;
		frame.getContentPane().add(JTFNOMBRE, gbc_JTFNOMBRE);
		JTFNOMBRE.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("APELLIDOS:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 5, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		frame.getContentPane().add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JTFAPELLIDOS = new JTextField();
		GridBagConstraints gbc_JTFAPELLIDOS = new GridBagConstraints();
		gbc_JTFAPELLIDOS.insets = new Insets(0, 0, 5, 0);
		gbc_JTFAPELLIDOS.fill = GridBagConstraints.HORIZONTAL;
		gbc_JTFAPELLIDOS.gridx = 1;
		gbc_JTFAPELLIDOS.gridy = 3;
		frame.getContentPane().add(JTFAPELLIDOS, gbc_JTFAPELLIDOS);
		JTFAPELLIDOS.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("NIF:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		frame.getContentPane().add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JTFNIF = new JTextField();
		GridBagConstraints gbc_JTFNIF = new GridBagConstraints();
		gbc_JTFNIF.insets = new Insets(0, 0, 5, 0);
		gbc_JTFNIF.fill = GridBagConstraints.HORIZONTAL;
		gbc_JTFNIF.gridx = 1;
		gbc_JTFNIF.gridy = 4;
		frame.getContentPane().add(JTFNIF, gbc_JTFNIF);
		JTFNIF.setColumns(10);
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.gridheight = 6;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 5;
		frame.getContentPane().add(panel, gbc_panel);
		
		btnNewButton_2 = new JButton("<<");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					mostrarPrimerAlumno();
			}
		});
		panel.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("<");
		panel.add(btnNewButton_3);
		
		btnNewButton = new JButton(">");
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton(">>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarUltimoAlumno();
			}
		});
		panel.add(btnNewButton_1);
	}

	
private void mostrarUltimoAlumno(){
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
		   
			Statement s = (Statement) conexion.createStatement(); 
			
			ResultSet rs = s.executeQuery ("select * from alumnos.alumno order by id limit 3");
		   
			if (rs.next() == true) { 
				JTFID.setText(rs.getString("id"));
				JTFNOMBRE.setText(rs.getString("NOMBRE"));
				JTFAPELLIDOS.setText(rs.getString("apellidos"));
				JTFNIF.setText(rs.getString("NIF"));
				System.out.println("id: " + rs.getInt("id") + " - nombre: " +
						rs.getString("nombre") + " - apellidos: " + 
						rs.getString("apellidos") + " - nif: " + 
						rs.getString("nif"));
			}
			rs.close();
			s.close();
			conexion.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	

	private void mostrarPrimerAlumno() {
		
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
			   
				Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
			   
				Statement s = (Statement) conexion.createStatement(); 
				
				ResultSet rs = s.executeQuery ("select * from alumnos.alumno order by id limit 1");
			   
				if (rs.next() == true) { 
					JTFID.setText(rs.getString("id"));
					JTFNOMBRE.setText(rs.getString("NOMBRE"));
					JTFAPELLIDOS.setText(rs.getString("apellidos"));
					JTFNIF.setText(rs.getString("NIF"));
					System.out.println("id: " + rs.getInt("id") + " - nombre: " +
							rs.getString("nombre") + " - apellidos: " + 
							rs.getString("apellidos") + " - nif: " + 
							rs.getString("nif"));
				}
				rs.close();
				s.close();
				conexion.close();
			}
			catch (ClassNotFoundException ex) {
				System.out.println("Imposible acceder al driver Mysql");
				ex.printStackTrace();
			}
			catch (SQLException ex) {
				System.out.println("Error en la ejecución SQL: " + ex.getMessage());
				ex.printStackTrace();
			}
		}
		
		
	}


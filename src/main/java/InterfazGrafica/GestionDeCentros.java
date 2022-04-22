package InterfazGrafica;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;

public class GestionDeCentros {

	private JFrame frame;
	private JTextField jtfid;
	private JTextField jtftipo;
	private JTextField jtfdenominacion;
	private JTextField jtfpoblacion;
	private JTextField jtfprovincia;
	private JTextField jtfdireccion;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GESTIODECENTROS window = new GESTIODECENTROS();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public GestionDeCentros() {
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
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("GESTION DE CENTROS");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setToolTipText("");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(5, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("id");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		frame.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 2;
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		frame.getContentPane().add(textField_1, gbc_textField_1);
		textField_1.setColumns(40);
		
		JLabel lblNewLabel_2 = new JLabel("tipo");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		frame.getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 2;
		frame.getContentPane().add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("denominacion");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		frame.getContentPane().add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 3;
		frame.getContentPane().add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("direccion");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		frame.getContentPane().add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 0);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 4;
		frame.getContentPane().add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("poblacion");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 5;
		frame.getContentPane().add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 0);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 5;
		frame.getContentPane().add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("provincia");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 6;
		frame.getContentPane().add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		textField_6 = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 0);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 1;
		gbc_textField_6.gridy = 6;
		frame.getContentPane().add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 7;
		frame.getContentPane().add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton_3 = new JButton("<<");
		btnNewButton_3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
		//		mostrarPrimerCentro();
			}
		});
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("<");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		//		mostrarAnteriorCentro();
			}
		});
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton(">");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		//		mostrarSiguienteCentro();
			}
		});
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton(">>");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	mostrarUltimoCentro();
			}
		});
		panel.add(btnNewButton_4);
	}
	
	
	
	private void mostrarPrimerAlumno() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/centro?serverTimezone=UTC","root", "Abcdefgh.1");

			Statement s = (Statement) conexion.createStatement(); 
			
			ResultSet rs = s.executeQuery ("select * from centroeducativo.centro order by id limit 1");
		   
			
			if (rs.next() == true) { 
				jtfid.setText(rs.getString("id"));
				jtftipo.setText(rs.getString("tipo"));
				jtfdenominacion.setText(rs.getString("denominacion"));
				jtfdireccion.setText(rs.getString("direccion"));
				jtfpoblacion.setText(rs.getString("poblacion"));
				jtfprovincia.setText(rs.getString("provincia"));
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
	
	
	private void mostrarUltimoAlumno() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/centro?serverTimezone=UTC","root", "Abcdefgh.1");

			Statement s = (Statement) conexion.createStatement(); 
			
			ResultSet rs = s.executeQuery ("select * from centroeducativo.centro order by id desc limit 1");
		   
		
			if (rs.next() == true) { 
				jtfid.setText(rs.getString("id"));
				jtftipo.setText(rs.getString("tipo"));
				jtfdenominacion.setText(rs.getString("denominacion"));
				jtfdireccion.setText(rs.getString("direccion"));
				jtfpoblacion.setText(rs.getString("poblacion"));
				jtfprovincia.setText(rs.getString("provincia"));
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
	
	private void mostrarSiguiente() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");

			Statement s = (Statement) conexion.createStatement(); 
			
			ResultSet rs = s.executeQuery ("select * from alumnos.alumno where id > " + 
				jtfid.getText() + " order by id limit 1");
		   
			if (rs.next() == true) { 
				jtfid.setText(rs.getString("id"));
				jtftipo.setText(rs.getString("tipo"));
				jtfdenominacion.setText(rs.getString("denominacion"));
				jtfdireccion.setText(rs.getString("direccion"));
				jtfpoblacion.setText(rs.getString("poblacion"));
				jtfprovincia.setText(rs.getString("provincia"));
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
	
	
	private void mostrarAnterior() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/centro?serverTimezone=UTC","root", "Abcdefgh.1");

			Statement s = (Statement) conexion.createStatement(); 
			
			String comando = "select * from alumnos.alumno where id < " + 
					jtfid.getText() + " order by id desc limit 1";
			System.out.println(comando);
			ResultSet rs = s.executeQuery (comando);
		   
			if (rs.next() == true) { 
				jtfid.setText(rs.getString("id"));
				jtftipo.setText(rs.getString("tipo"));
				jtfdenominacion.setText(rs.getString("denominacion"));
				jtfdireccion.setText(rs.getString("direccion"));
				jtfpoblacion.setText(rs.getString("poblacion"));
				jtfprovincia.setText(rs.getString("provincia"));
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
	
	private int siguienteIdDisponible() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");

			Statement s = (Statement) conexion.createStatement(); 
			
			ResultSet rs = s.executeQuery ("select max(id) from alumnos.alumno");
		   
			// Navegación del objeto ResultSet
			if (rs.next() == true) { 
				return rs.getInt(1) + 1;
			}
			// Cierre de los elementos
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
		return -1;
	}
	
	
	private void guardar() {
		if (jtfId.getText().equals("0")) {
			insertar();
		}
		else {
			modificar();
		}
	}
	
	
	private void insertar() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");

			Statement s = (Statement) conexion.createStatement(); 
			
			int id = siguienteIdDisponible();
			String comando = "insert into alumnos.alumno values (" + id + ", '" +
					jtftipo.getText() + "', '" + 
					jtfdenominacion.getText() + "', '" + jtfdireccion.getText() + "', " + jtfpoblacion.getText() + "," + jtfprovincia.getText() + "', \" )";
			
			int registrosModificados = s.executeUpdate (comando);
		   
			if (registrosModificados == 1) {
				jtfid.setText("" + id);
				JOptionPane.showMessageDialog(null, "Guardado correctamente");
			}
			else {
				JOptionPane.showMessageDialog(null, "Error al guardar");
			}
			
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
	
	
	
	private void modificar () {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");

			Statement s = (Statement) conexion.createStatement(); 
			
			int registrosModificados = s.executeUpdate (
					"update centroeducativo.centro set tipo = '" + jtftipo.getText() + "', " + 
					"denominacion = '" + jtfdenominacion.getText() + "', direccion = '" + jtfdireccion.getText() + "', "+
					"poblacion = '" + jtfpoblacion.getText() + "' , " +
	                "provincia= '" + jtfprovincia.getText() + "' " + "where id = " + jtfid.getText());
		   
			if (registrosModificados == 1) {
				JOptionPane.showMessageDialog(null, "Guardado correctamente");
			}
			else {
				JOptionPane.showMessageDialog(null, "Error al guardar");
			}
			
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
	
	private void eliminar() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/centro?serverTimezone=UTC","root", "Abcdefgh.1");

			Statement s = (Statement) conexion.createStatement(); 
			
			int registrosModificados = s.executeUpdate ("delete from alumnos.alumno " +
					"where id = " + jtfid.getText());
		   
			if (registrosModificados == 1) {
				JOptionPane.showMessageDialog(null, "Eliminado correctamente");
				mostrarPrimerAlumno();
			}
			else {
				JOptionPane.showMessageDialog(null, "Error al eliminar");
			}
			
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

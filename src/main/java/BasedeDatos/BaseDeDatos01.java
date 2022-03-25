package BasedeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BaseDeDatos01 {

	private static void pruebaConsultaInsert () {
		Scanner sc = new Scanner(System.in);
		int id;
		int nif;
		String nuevoApellido;
		String nuevoNombre;
		
		
		try {
			// A través de la siguiente línea comprobamos si tenemos acceso al driver MySQL, si no fuera así
			// no podemos trabajar con esa BBDD.
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			// Necesitamos obtener un acceso a la BBDD, eso se materializa en un objeto de tipo Connection, al cual
			// le tenemos que pasar los parámetros de conexión.
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
		   
			
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) conexion.createStatement(); 
			
			System.out.println("introduce el id del resgistro afectado:");
			id = Integer.parseInt(sc.next());
			
			System.out.println("introduce el nif del resgistro afectado:");
			nif = Integer.parseInt(sc.next());
			
			System.out.println("introduce el nuevo nombre del registro:");
			nuevoNombre = sc.next();

			System.out.println("introduce el nuevo apellido del registro:");
			nuevoApellido = sc.next();
			
			int numeroRegistrosAfectados = s.executeUpdate("update ALUMNOS.alumnos set nombre='" + nuevoNombre + "', apellidos='" + nuevoApellido + "' where id=" + id +  "nif" + nif +")");
			
			System.out.println(numeroRegistrosAfectados + " registros afectados");
			
			// Cierre de los elementos
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
	
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		pruebaConsultaInsert();
	}
}
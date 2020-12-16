package ProyectoMarcos.App;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ProyectoMarcos.BBDD.BbddMarcos;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws SQLException {
		Connection c = BbddMarcos.conectar();
		try {
			// El objeto utilizado para ejecutar una declaración SQL estática y
			// devolver los resultados que produce.

			Statement stm = null;
			ResultSet rs = null;
			try {
				stm = c.createStatement();
			} catch (SQLException e1) {
				System.out.println("Error al crear el statement");
				e1.printStackTrace();
			}
			if (stm != null) {
				try {
					rs = stm.executeQuery("SELECT * FROM jardineria.cliente");
					while (rs.next()) {

						System.out.println(rs.getString("nombre_contacto"));

					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}

			
			/*
			 * Statement statement = c.createStatement(); ResultSet resultSet =
			 * statement.executeQuery("select * from empleado"); while (resultSet.next()) {
			 * String codigoEmpleado = resultSet.getString("codigo_empleado"); String nombre
			 * = resultSet.getString("nombre"); } c.close();
			 */
			 

		} catch (Exception e2) {
			e2.printStackTrace();
		}

	}
}

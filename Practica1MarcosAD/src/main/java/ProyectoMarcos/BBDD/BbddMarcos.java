package ProyectoMarcos.BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BbddMarcos {
	public static Connection conectar() throws SQLException {
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/jardineria?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
				"admin", "4DM1n4DM1n");
		System.out.println("No he dado error");
		return conn;

	}
}

package ProyectoMarcos.App;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import ProyectoMarcos.BBDD.BbddMarcos;

public class App {
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {
		Connection c = BbddMarcos.conectar();
		boolean exit = true;
		do {
			Funciones.menu();
			int op = kb.nextInt();
			switch (op) {
			case 1:
				Funciones.añadirUnCliente(c);
				break;
			case 2:
				Funciones.mostrarUnCliente(c);
				break;
			case 3:
				Funciones.mostrarTodosLosCliente(c);
				break;
			case 4:
				Funciones.buscarCliente(c);
				break;
			case 5:
				Funciones.editarUnProducto(c);
				break;
			case 6:
				exit = false;
				break;
			default:
				throw new IllegalArgumentException("Valor erroneo: " + op);
			}
		} while (exit);
		c.close();
	}
}

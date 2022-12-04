package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {
	
	public static void main(String[] args) throws SQLException {
		Connection conexao = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				 conexao = DriverManager.getConnection("jdbc:mysql://localhost/banco", "usuario", "senha");
				ResultSet rsPaciente = conexao.createStatement().executeQuery("SELECT * FROM PACIENTE");
				while(rsPaciente.next()) {
					System.out.println("Nome: " + rsPaciente.getString("nomePaciente"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Erro de conexão!");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Driver do banco de dados não localizado!");
		} finally {
			if(conexao != null) {}
			conexao.close();
		}
	}

}

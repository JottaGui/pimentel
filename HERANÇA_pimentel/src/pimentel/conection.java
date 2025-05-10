package pimentel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conection {

	public Connection Connection() {
        try {
            String url = "jdbc:mysql://localhost:3306/bancario";
            String usuario = "root";
            String senha = "";

            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar ao banco de dados!", e);
        }
    }

}

package banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class clienteDAO {
	public void cadastrarcliente(Cliente cliente) {
        String query = "INSERT INTO cliente (nome, email, senha) VALUES (?, ?, ?);";

        try (Connection conexao = new conexao().Connection();  
             PreparedStatement ps = conexao.prepareStatement(query)) {

            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getEmail());
            ps.setString(3, cliente.getSenha());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }		 
    
    
    public void loginUsuario(Cliente cliente) {
    	String query = "SELECT * FROM cliente WHERE email = ?;";
    	try (Connection conexao = new conexao().Connection();  
    	     PreparedStatement lg = conexao.prepareStatement(query)) {

    	    lg.setString(1, cliente.getEmail());
    	    ResultSet rs = lg.executeQuery(); 
    	    
    	    if (rs.next()) {
    	        String senha = rs.getString("senha"); 
    	        
    	        if (senha.equals(cliente.getSenha())) {
    	            System.out.println("Login bem-sucedido!");
    	        } else {  
    	            System.out.println("Senha incorreta!");
    	        }
    	    } else {
    	        System.out.println("Usuário não encontrado!");
    	    }
    	} catch (SQLException e) {
    	    e.printStackTrace();
    	}
    	
    }
}

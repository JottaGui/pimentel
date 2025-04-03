package banco;

public class TestaConta {
  
    public static void main(String[] args) {
      Cliente joao = new Cliente("pimentel", "pimentel@gmail", "123456", 0);
 
      clienteDAO clientenovo = new clienteDAO();
      
      clientenovo.loginUsuario(joao);
    }
    
}


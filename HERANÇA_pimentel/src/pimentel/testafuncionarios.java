package pimentel;

public class testafuncionarios {

	
	public static void main(String[] args) {
	
		
		Funcionario e = new Funcionario();
		
		
		
		
		e.setNome("gordin");
		e.setSalario(35161);
		
		String formaado = e.mostrarfuncionario();
		
		
		
		
		
		
		Gerente g = new Gerente("pimentel",12151, "nada", "novidade");
	
		System.out.println(formaado);
		
		
		
		
		
	}
}

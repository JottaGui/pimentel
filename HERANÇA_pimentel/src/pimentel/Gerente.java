package pimentel;

public class Gerente extends Funcionario{

	private String usuario;
	private String senha;
	
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}


	public Gerente(String nome, double Salario, String usuario, String senha) {
		super();
		this.setNome(nome);
		this.setSalario(Salario);
		this.usuario = usuario;
		this.senha = senha;
	}
	
	public double caucularboneficaçao() {
		return getSalario() * 0.2;
	}

}

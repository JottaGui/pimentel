package pimentel;

public class Funcionario {
	private String nome;
	private double salario;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double caucularboneficaçao() {
		return salario * 0.1;
	}
	
     String mostrarfuncionario() {
		return ("nome do funcionario: "+nome + "\n" + "salario de: " + salario + "\n" + "BONEFICAÇAO: " + caucularboneficaçao());
	}
}         
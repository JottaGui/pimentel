package banco;

public class Conta {
   double saldo;
    public Conta(double saldo, double limite, int id, int id_cliente) {
	super();
	this.saldo = saldo;
	this.limite = limite;
	this.id = id;
	this.id_cliente = id_cliente;
}
	double limite;
    int id;
    int id_cliente;


    public void setSaldo(double saldo){
        this.saldo =  saldo;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setNumero(int numero){
        this.id = numero;
    }
    public int getNumero(){
        return id;
    }
    
}

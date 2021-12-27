package bankapp.model;

public class Conta {

	// conceitos de POO, modificadores de acesso e padr�o Java Beans.
	// padr�o Java Beans diz que todos os atributos devem ser privados, assim eu
	// crio os getters and setters

	private double saldo = 200;
	private double depositar;
	private double sacar;
	private double transferir;
	private double agendar;
	
	public double getAgendar() {
		return agendar;
	}

	public void setAgendar(double agendar) {
		this.agendar = agendar;
	}

	// todo metodo � composto por tipo de retorno, nome declarativo e parametros
	public void setSaldo(double saldo) {
		this.saldo = saldo; // aponta para o set
	}

	public double getSaldo() {
		return saldo;
	}

	public double getDepositar() {
		return depositar;
	}

	public void setDepositar(double depositar) {
		this.depositar = depositar;
	}

	public double getSacar() {
		return sacar;
	}

	public void setSacar(double sacar) {
		this.sacar = sacar;
	}

	public double getTransferir() {
		return transferir;
	}

	public void setTransferir(double transferir) {
		this.transferir = transferir;
	}

}

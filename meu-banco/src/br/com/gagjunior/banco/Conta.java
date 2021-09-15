package br.com.gagjunior.banco;

public class Conta {
	
	int numero;
	String nomeTitular;
	float saldo;
	float limiteSaque;
	
	boolean sacar(float valor) {		
		if(valor > saldo || valor > limiteSaque || valor <= 0) {
			return false;			
		} else {
			saldo -= valor;
			return true;		
		}
	}
	
	boolean depositar(float valor) {
		if(valor <= 0) {
			return false;
		} else {
			saldo += valor;
			return true;
		}		
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", nomeTitular=" + nomeTitular 
				+ ", saldo=" + saldo + ", limiteSaque="
				+ limiteSaque + "]";
	}
	
	

}

package br.com.gagjunior.banco;

public class CaixaEletronico {

	public static void main(String[] args) {
		
		Conta c1 = new Conta(1001, "Gilberto", 2000.00f);
		Conta c2 = new Conta(1002, "Pamela", 2000.00f);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println();
		
		c1.transferir(c2, 1000.00f);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println();
	}

}

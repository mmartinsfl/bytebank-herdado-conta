package br.com.bytebank.banco.test;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {

//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);
		
		Object cc = new ContaCorrente(22,33);
		Object cp = new ContaPoupanca(33, 22);
		Object ce = new ContaEspecial(44, 34);
		Object cliente = new Cliente();
		System.out.println(cc.toString());
		System.out.println(cp.toString());
		println(cc);
		println(ce);
		println(cliente);
	}

	 static void println() {
		 
	 }
	 static void println(int a) {
		 
	 }
	 static void println(boolean valor) {
		 
	 }
	 static void println(Object referencia) {
		 
	 }
	 static void println(Conta conta) {
		 
	 }
}
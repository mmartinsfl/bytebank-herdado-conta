package byteb;

public class TesteContas {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);

		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);

		cc.transfere(10.0, cp);

		cc.saca(10.0);

		System.out.println("Saldo da conta Corrente " + cc.getSaldo());
		System.out.println("Saldo da conta Poupan�a " + cp.getSaldo());

	}

}

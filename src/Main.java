
public class Main {

	public static void main(String[] args) {
		Cliente ronaldo = new Cliente();
		ronaldo.setNome("Ronaldo Scortegagna");
		
		Conta cc = new ContaCorrente(ronaldo);
		Conta poupanca = new ContaPoupanca(ronaldo);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		Cliente hallana = new Cliente();
		hallana.setNome("Hallana Scortegagna");
		
		Conta cc1 = new ContaCorrente(hallana);
		Conta poupanca1 = new ContaPoupanca(hallana);

		cc1.depositar(100);
		cc1.transferir(100, poupanca1);
		
		cc1.imprimirExtrato();
		poupanca1.imprimirExtrato();
	}

}
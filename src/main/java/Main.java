
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();


		ContaCorrenteSalario csalario= new ContaCorrenteSalario(venilton);


		ClientePJ lojaInfo = new ClientePJ("LojaINfo", "12345678910");
		ContaCorrentePJ contaCorrentePJ = new ContaCorrentePJ(lojaInfo);
		contaCorrentePJ.adicionarFuncionario(csalario);
		contaCorrentePJ.getContasFuncionarios();
		contaCorrentePJ.depositar(10000.00);

		contaCorrentePJ.imprimirExtrato();

		contaCorrentePJ.pagarSalario(3000.00);

		csalario.imprimirExtrato();
		contaCorrentePJ.imprimirExtrato();








	}

}

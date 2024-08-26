
public class ContaCorrenteSalario extends Conta {

	public ContaCorrenteSalario(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente Salario ===");
		super.imprimirInfosComuns();
	}

	
}

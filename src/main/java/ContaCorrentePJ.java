import java.util.ArrayList;
import java.util.List;

public class ContaCorrentePJ extends Conta {

	private List<ContaCorrenteSalario> contasFuncionarios;
	public ContaCorrentePJ(ClientePJ cliente) {
		super(cliente);
		this.contasFuncionarios = new ArrayList<>();
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente PJ ===");
		super.imprimirInfosComuns();
	}

	public void pagarSalario(Double valorSalario) {
		contasFuncionarios.forEach(cf -> this.transferir(valorSalario, cf));
	}

	public List<ContaCorrenteSalario> getContasFuncionarios() {
		return contasFuncionarios;
	}

	public void adicionarFuncionario(ContaCorrenteSalario c) {
		this.contasFuncionarios.add(c);
	}

	
}

package encapsulamento;

public class EncapsulamentoMain {
	public static void main(String[] args) {
		Conta c = new Conta();
		
		//c.nome = "Joao";
		//c.cpf = "1239132";
		c.setSaldo(299.0);
		
		//System.out.println(c.nome);
		//System.out.println(c.cpf);
		System.out.println(c.getSaldo());
		
	}
}

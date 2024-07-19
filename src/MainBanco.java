import java.util.Scanner;

public class MainBanco {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		int op;
		do {
			System.out.println("Digite 1 para registrar a conta ou 2 para sair");
			op = tc.nextInt();
			switch(op) {
				case 1:
				try {
					System.out.println("Digite o número da conta: ");
					int numConta = tc.nextInt();
					tc.nextLine();
					System.out.println("Digite o nome: ");
					String nomeConta = tc.nextLine();
					System.out.println("Digite a agência da conta: ");
					String agenciaConta = tc.nextLine();
					System.out.println("Digite o saldo da conta: ");
					double saldoConta = tc.nextDouble();
					Conta novaConta = new Conta(numConta, nomeConta, agenciaConta, saldoConta);
					
					System.out.println("Conta criada com sucesso! Seu número de conta é: " + novaConta.getNumero() + " e a agência é: " + novaConta.getAgencia() );
				}catch(Exception e) {
					e.printStackTrace();
				}
				break;
				case 2:
					System.out.println("---Desligando Sistema---");
				break;
				
			}
		}while(op != 2);

	}

}

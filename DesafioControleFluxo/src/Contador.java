import java.util.Scanner;


public class Contador {
	public static void main(String[] args) {
		
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		
		try {
			contar(parametroUm, parametroDois);
	
		}catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parametro tem que ser maior que o primeiro.");
			
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção

		if(parametroUm>parametroDois) {
			throw new ParametrosInvalidosException();
	
		}
		
		//realizar o for para imprimir os números com base na variável contagem
		
		int contagem = parametroDois - parametroUm;
		int i;
				for (i=1;i<=contagem;i++) {
					System.out.println("Imprimindo o numero " + i);
					i++;	
					
					while(i >contagem);
					System.out.println("Imprimindo o numero " + i);
				}
	}
}
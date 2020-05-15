package ExerciciosGeneration;

public class Exercicio1 {
	public static void main(String args[]) {
		int soma = 0;
		
		for (int x = 0; x < 500; x++) {
			if (x%3 == 0 && x%2 == 0) {
				soma = soma + 1;
			}
		}
		
		System.out.println("Soma dos ímpares múltiplos de 3 é: " + soma);
		
	}
}

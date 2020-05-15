package ExerciciosGeneration;

public class Exercicio3 {
	public static void main(String args[]) {
		
		for (int x = 233; x <= 456; x = x+3) {
			if( x >= 300 && x <= 400) {
				x += 2;
			}
			
			System.out.println(x);
			
		}
	}
}

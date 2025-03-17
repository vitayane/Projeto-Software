package poo;

public class Principal {

	public static void main(String[] args) {

		Conta janeiro = new Conta();
		Conta fevereiro = new Conta();
		
		//Gastos de Janeiro
		janeiro.agua = 100;
		janeiro.alimentacao = 1200;
		janeiro.luz = 300;
		
		//Gastos de Fevereiro
		fevereiro.agua = 100;
		fevereiro.alimentacao = 1200;
		fevereiro.luz = 300;
		
		//Somar todos os gastos
		double gastoJan = janeiro.somaConta();
		double gastoFev = fevereiro.somaConta();
		
		if (gastoJan > gastoFev) {
			System.out.println("O gasto de Janeiro foi maior");
		}
		else if(gastoFev > gastoJan) {
			System.out.println("O gasto e Fevereiro foi maior");
		}
		else {
			System.out.println("Ambos os meses tiveram o mesmo gasto");
		}
	}

}

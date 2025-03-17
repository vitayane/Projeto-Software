package estruturada;

public class ContaMesEstruturada {

	public static void main(String[] args) {
		
		double janAlim, janEnergia, janAgua, fevAlim, fevEnergia, fevAgua;
		
		//Gatos em Janeiro
		janAlim = 1000;
		janEnergia = 300;
		janAgua = 300;
		
		//Gastos em Fevereiro
		fevAlim = 1500;
		fevEnergia = 500;
		fevAgua = 500;
		
		//Total de gastos em ambos os meses
		double gastoJan = janAlim + janEnergia + janAgua;
		double gastoFev = fevAlim + fevEnergia + fevAgua;
		
		if (gastoJan > gastoFev) {
			System.out.println("O gasto de Janeiro foi maior");
		}
		else if (gastoFev > gastoJan) {
			System.out.println("O gasto de Fevereiro foi maior");
		}
		else {
			System.out.println("Ambos os meses tiveram o mesmo gasto");
		}
	}

}

package Entidade;

public class Principal {

	public static void main(String[] args) {
		Carro civic = new Carro();
		
		civic.fabricante = "Honda";
		civic.modelo = "Civic";
		civic.placa = "EUB-6530";
		civic.ano = 2022;
		civic.cor = "Preta";
		civic.exibirInfo();
		
		Carro kicks = new Carro();
		kicks.fabricante = "Nissan";
		kicks.modelo = "kicks SV";
		kicks.placa = "KLF-6830";
		kicks.ano = 2023;
		kicks.cor = "Prata";
		kicks.exibirInfo();
		
		Carro saveiro = new Carro();
		saveiro.fabricante = "Volkswagen";
		saveiro.modelo = "Picape";
		saveiro.placa = "VTA-1319";
		saveiro.ano = 2024;
		saveiro.cor = "Roxa";
		saveiro.acelera();	
		saveiro.exibirInfo();
		
	}

}

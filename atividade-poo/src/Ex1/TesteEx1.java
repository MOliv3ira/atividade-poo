package Ex1;

public class TesteEx1 {

	public static void main(String[] args) {

		Veiculo v1 = new Veiculo();

		v1.setVelocidade(50);
		System.out.println("O veiculo está com a velocidade de " + v1.getVelocidade() + "Km/h");

		v1.acelerar();

		System.out.println();
		
		v1.setLitrosCombustivel(10);
		v1.abastecer(50);

		System.out.println();

		Veiculo v2 = new Veiculo();

		v2.setVelocidade(25);

		v2.frear();

		System.out.println();

		v2.setCor("Branco");
		v2.pintar("Preto");

		System.out.println();

		v2.setLigado(false);
		v2.ligar();

		System.out.println();

		v2.setLigado(true);
		v2.setVelocidade(25);
		v2.desligar();

	}

}

package Ex1;

public class Veiculo {

	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int velocidade;
	private double preco;

	public Veiculo() {

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void acelerar() {
		this.velocidade += 20;
		System.out.println("Acelerando veiculo!\n" + "Velocidade atual: " + this.velocidade + " Km/h");
	}
	
	
	public void abastecer(int combustive) {
		
		this.litrosCombustivel += combustive;
		
		if(this.litrosCombustivel > 60) {
			System.out.println("Não é possível abastecer o veiculo, esse valor ultrapassa o limite de 60 litros!");
		}else {

			System.out.println("Você colocou " + combustive + " litros de combustível, totalizando "+this.litrosCombustivel+" litros. \nBoa viagem!");
			
		}

	}

	public void frear() {

		if (this.velocidade != 0) {
			this.velocidade -= 20;
			System.out.println("Velocidade atual: "+this.velocidade+" Km/h");
		} else if (this.velocidade == 0) {
			System.out.println("Não é possível frear o veiculo, o mesmo se encontra parado.");
		}
	}
	
	public void pintar(String cor) {
		this.cor = cor;
		System.out.println("Acabei de pintar seu veiculo, agora ele é "+this.cor+".");
	}
	
	public void ligar() {
		if(this.isLigado == false) {
			this.isLigado = true;
			System.out.println("Veiculo ligado.");
		}
	}
	
	public void desligar() {
		if(this.isLigado != false && this.velocidade == 0) {
			this.isLigado = false;
			System.out.println("Veiculo desligado.");
		}else if (this.isLigado != false && this.velocidade > 0) {
			System.out.println("Veiculo está ligado e com velocidade acima de 0.");
		}
	}

}

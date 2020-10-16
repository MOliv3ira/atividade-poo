package Ex2;

public class VideoGame extends Produto implements Imposto {

	private String marca;
	private String modelo;
	private boolean isUsado;

	public VideoGame() {

	}

	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
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

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	@Override
	public double calculaImposto() {
	
		if(this.isUsado != false) {
			 double valorImposto = super.getPreco() * 0.25; //45%

			 System.out.println("Imposto PS4 Slim Usado, R$ "+valorImposto+" .");
			return valorImposto;
		}else {
			double valorImposto = super.getPreco() * 0.45; //25%

			System.out.println("Imposto PS4 Slim, R$ "+valorImposto+" .");
			return valorImposto;
		}
	}

}

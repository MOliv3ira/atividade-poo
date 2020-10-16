package Ex2;

import java.util.List;

public class Loja {

	private String nome;
	private String cnpj;
	private List<Livro> livros;
	private List<VideoGame> videoGames;

	public Loja() {

	}

	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivro(List<Livro> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(List<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}

	public void listaLivros() {
		System.out.println("Loja Americanas possui esses livros:");
		if (livros.isEmpty() != false) {
			System.out.println("A loja não tem livros no seu estoque.");

		} else {
			for (Livro i : livros) {
				System.out.println("Titulo: " + i.getNome() + ", preço: " + i.getPreco() + ", quantidade: " + i.getQtd()
						+ " em estoque.");
			}
		}

	}

	public void listaVideoGames() {
		System.out.println("Loja Americanas possui esses video-games:");
		if (videoGames.isEmpty() != false) {
			System.out.println("A loja não tem video-games no seu estoque.");

		} else {
			for (VideoGame i : videoGames) {
				System.out.println("Titulo: " + i.getNome() + ", preço: " + i.getPreco() + ", quantidade: " + i.getQtd()
						+ " em estoque.");
			}
		}

	}

	public double calculaPatrimonio() {
		double somaLivros = 0, somaVideoGames = 0, patrimonio = 0;
		
		for(Livro i: livros) {
			somaLivros += i.getPreco()*i.getQtd();
		}
		
		for(VideoGame i: videoGames) {
			somaVideoGames += i.getPreco()*i.getQtd();
		}
		
		patrimonio = somaLivros + somaVideoGames;
		
		
		System.out.println("O patrimonio da loja: Americanas é de R$ "+patrimonio);
		return patrimonio;
		
	}
	

}

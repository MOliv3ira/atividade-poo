package Ex4;

import java.util.ArrayList;
import java.util.List;

public class TesteEx4 {

	public static void main(String[] args) {

		System.out.println("-------------------------------------------------------------------");
		System.out.println("Ex: 4");

		Pessoa p1 = new Pessoa("João", 15);
		Pessoa p2 = new Pessoa("Leandro", 21);
		Pessoa p3 = new Pessoa("Paulo", 17);
		Pessoa p4 = new Pessoa("Jessica", 18);

		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);

		// IMPRIMINDO A LISTA
		for (Pessoa i : pessoas) {
			System.out.println("Lista de pessoas: " + i.getNome() + ", " + i.getIdade());
		}

		System.out.println("-------------------------------------------------------------------");

		// IMPRIMA O NOME DA PESSOA MAIS VELHA
		int idadeMaisVelho = 0;
		String nomeMaisVelho = "";

		for (Pessoa i : pessoas) {
			if (i.getIdade() > idadeMaisVelho) {
				idadeMaisVelho = i.getIdade();
				nomeMaisVelho = i.getNome();
			}
		}
		System.out.println("Nome da pessoa mais velha: " + nomeMaisVelho + ", idade: " + idadeMaisVelho);

		System.out.println("-------------------------------------------------------------------");

		// Exclua da Lista as pessoas com idade inferior a 18 anos.
		System.out.println("Ex: 5");
		System.out.println("Número de pessoas na lista: " + pessoas.size());

		List<Pessoa> recebe = new ArrayList<>();
		
		for (Pessoa i : pessoas) {
			if ((i.getIdade() >= 18)) {
				recebe.add(i);
			}
		}

		pessoas = recebe;
		System.out.println("Número de pessoas na lista: " + pessoas.size());
		System.out.println("-------------------------------------------------------------------");

		// Consulte se o objeto Jessica existe na lista e exiba a sua idade.
		System.out.println("Ex: 6");

		for (Pessoa i : pessoas) {
			if (i.getNome() == "Jessica") {
				System.out.println("Dona Jessica tem " + i.getIdade() + " anos.");
			}
		}
		System.out.println("-------------------------------------------------------------------");

	}

}

package questao1;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String modelo, marca;
		int contadorPreco=0, options, ano=0, contadorAno=0;
		double preco, mediaAno;
		ArrayList<String> carros = new ArrayList();
		Scanner ler = new Scanner(System.in);
		do {
			System.out.println("1- Cadastrar Carro \n2- Listagem Geral \n3- Mostrar Resultados \n4- Sair");
			options = ler.nextInt();
			switch (options) {
			case 1:
				System.out.println("Digite o nome da fabricante do carro: ");
				marca = ler.next();
				System.out.println("Digite o modelo do carro: ");
				modelo = ler.next();
				System.out.println("Digite o ano do carro: ");
				ano  = ler.nextInt();
				contadorAno= contadorAno+=ano;
				System.out.println("Digite o preço do carro: ");
				preco = ler.nextInt();
				if(preco>=50000) {
					contadorPreco++;
				}
				
				carros.add(marca+" - "+modelo+" - "+ano+" - "+preco);
				
				break;
			case 2:
				System.out.printf("Listando itens cadastrados\n");
		 	    int n = carros.size();
		 	    for (int i=0; i<n; i++) {
		 	      System.out.printf("Posição %d- %s\n", i, carros.get(i));
		 	    }
				break;
			case 3:
				int n1 = carros.size();
				mediaAno = contadorAno/n1;
				System.out.println("Existe "+contadorPreco+" com o valor acima de R$50.000,00");
				System.out.println("A média dos anos de todos os veículos é: "+mediaAno);
				break;
			case 4:
				break;
				
				default:
					System.out.println("Opção Invalida!");
			}
		} while (options != 4);
	}

	}



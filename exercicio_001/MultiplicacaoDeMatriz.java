package exercicio_001;

import java.util.Scanner;

public class MultiplicacaoDeMatriz {

	public static void main(String args[]) {

		int coluna;
		int linha;
		int[][] matriz1;
		int[][] matriz2;
		double[][] matriz3 = null;

		Scanner input = new Scanner(System.in);

		System.out.print("Digite a Linha da Matriz 1: ");
		linha = input.nextInt();

		System.out.print("Digite a Colunada Matriz 1: ");
		coluna = input.nextInt();

		matriz1 = new int[linha][coluna];
		
		System.out.println();
		
		System.out.print("Digite a Linhada Matriz 2: ");
		linha = input.nextInt();

		System.out.print("Digite a Colunada Matriz 2: ");
		coluna = input.nextInt();

		matriz2 = new int[linha][coluna];

		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1.length; j++) {
				System.out.println("Digite um valor para a matriz 1  e elemento "+(i + 1) + " " +(j+ 1)+ ": ");
				matriz1[i][j] = input.nextInt();

			}

		}
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[0].length; j++) {
				System.out.println("Digite um valor para a Matriz 2 e elemento  "+(i + 1)+" " +(j + 1)+": ");
				matriz2[i][j] = input.nextInt();
			}
		}

		System.out.print("\nSua Matriz1 é:\n");

		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1.length; j++) {
				System.out.print(matriz1[i][j] + " ");

			}

			System.out.println();

		}
		System.out.print("\nSua matriz2 é :\n");

		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[0].length; j++) {
				System.out.print(matriz2[i][j] + " ");

			}
			System.out.println();

		}

		if (matriz1[0].length == matriz2.length) {

			matriz3 = new double[matriz1.length][matriz2[0].length];

			for (int i = 0; i < matriz3.length; i++) {

				for (int j = 0; j < matriz3[0].length; j++) {

					for (int k = 0; k < matriz1[0].length; k++) {

						matriz3[i][j] += matriz1[i][k] * matriz2[k][j];

					}
				}
			}

			System.out.print("\nSua matriz 3 é :\n");
			for (int i = 0; i < matriz3.length; i++) {
				for (int j = 0; j < matriz3[0].length; j++) {
					System.out.print(matriz3[i][j] + " ");
				}
				System.out.println();
			}

		}else {
			System.out.println("Não é possível a multiplicação!");
		}

	}
}
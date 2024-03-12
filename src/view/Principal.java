package view;

import controller.ThreadController;

public class Principal {
	public static void main(String[] args) {
		int[][] matriz = new int[3][5];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * 100) + 1;
			}
		}
		
		System.out.println("Matriz");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		Thread t = new ThreadController(matriz);
		t.start();
	}
}

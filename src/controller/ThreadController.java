package controller;

public class ThreadController extends Thread {

	private int[][] matriz;

	public ThreadController(int[][] matriz) {
		this.matriz = matriz;
	}

	public void run() {
		for (int i = 0; i < matriz.length; i++) {
			int sum = 0;
			for (int j = 0; j < matriz[i].length; j++) {
				sum += matriz[i][j];
			}
			System.out.println((i + 1) + "ª soma = " + sum);
		}
	}

}

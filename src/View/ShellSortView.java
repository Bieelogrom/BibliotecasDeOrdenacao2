package View;

import Controller.ShellSortController;

public class ShellSortView {
	public static void main(String[] args) {
		int[] vetor = {101,102,103,125,124,123,104,105,106,122};
		ShellSortController ss = new ShellSortController();
		
		int[] vetorOrdenado = ss.ordenarVetor(vetor);
		
		for(int i : vetorOrdenado) {
			System.out.print(" "+i);
		}
	}
}

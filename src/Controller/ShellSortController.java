package Controller;

import br.edu.fateczl.gabriel.ShellSortLib;

public class ShellSortController {
	public ShellSortController() {
		// TODO Auto-generated constructor stub
	}
	
	public int[] ordenarVetor(int[] vetor) {
		ShellSortLib ssl = new ShellSortLib();
		int[] vetorOrdenado = ssl.ordenarVetor(vetor);
		return vetorOrdenado;
	}
}

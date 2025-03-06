package Controller;

import br.edu.fateczl.gabriel.SelectionSort;

public class SelectionSortController {
	public SelectionSortController() {
		// TODO Auto-generated constructor stub
	}
	
	public int[] ordenarVetor(int[] vetor) {
		SelectionSort ss = new SelectionSort();
		int[] arrayOrdenado = ss.ordenarVetor(vetor);
		return arrayOrdenado;
	}
}

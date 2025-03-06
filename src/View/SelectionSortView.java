package View;

import Controller.SelectionSortController;

public class SelectionSortView {
	public static void main(String[] args) {
		int[] array = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		SelectionSortController ssc = new SelectionSortController();
		
		int[] arrayOrdenado = ssc.ordenarVetor(array);
		
		for(int i : arrayOrdenado) {
			System.out.print(" "+i);
		}
	}
}

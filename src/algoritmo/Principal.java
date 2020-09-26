/************************************************
 * Developer: Cristina Dias						*
 * 												*	
 *												*
 * Lógica de Programação e Estrutura de dados 	*
 ************************************************/

package algoritmo;

public class Principal {

	public static void main(String[] args) {

		int[] lista = { 2, 1, 3 };

		int aux;

		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista.length - 1; j++) {

				// inversão de ordem na lógica para decrescente
				if (lista[j] < lista[j + 1]) {

					aux = lista[j];
					lista[j] = lista[j + 1];
					lista[j + 1] = aux;
				}
			}
		}

		int k = 0;
		while (k < lista.length) {
			System.out.print(lista[k] + ", ");
			k++;
		}
	}
}

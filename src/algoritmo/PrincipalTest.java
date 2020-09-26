/************************************************
 * Developer: Cristina Dias						*
 * 												*	
 *												*
 * Lógica de Programação e Estrutura de dados 	*
 ************************************************/

package algoritmo;

import static org.junit.Assert. *;

import org.junit.Test;

public class PrincipalTest {				

	@Test
	public void testAlgoritmo() {

		// Declaração em que o array {5, 5, 3} é igual

		int[] listArrary1 = { 5, 5, 3 };
		int[] listArrary2 = { 5, 5, 3 };

		// Declarações afirmativas

		assertArrayEquals(listArrary1, listArrary2);

	}
}
package contarpares;

public class ContarPares {

	public static void main(String[] args) {
		int resultado = mostrarCantidadPares(100);
		System.out.println("Hay " + resultado + " numeros pares del 0 al 100");
	}

	/**
	 * @param n TODO
	 * @return TODO
	 * 
	 */
	private static int mostrarCantidadPares(int n) {
		int contadorPares = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0)
				contadorPares++;
		}
		return contadorPares;
	}
	
}

/**
 * Clase Coordenadas: Usada para gestionar las caracteristicas de una coordenada x, y.
 * @author Maria Alejandra Aguiar Vasquez - 1455775
 * @author Danny Fernando Cruz Arango     - 1449949
 */
public class Coordenadas {
	int x;
	int y;
	
	/**
	 * Metodo constructor que inicializa en cero los valores de X ý Y 
	 */
	public Coordenadas() {
		x = y = 0;
	}

	/**
	 * Metodo que retorna el valor de x
	 * @return El valor de x
	 */
	public int getX() {
		return x;
	}

	/**
	 * Metodo que modifica x
	 * @param coordenada El valor que sera asignado a x
	 */
	public void setX(int coordenada) {
		x = coordenada;
	}

	/**
	 * Metodo que retorna el valor de y
	 * @return El valor de y
	 */
	public int getY() {
		return y;
	}

	/**
	 * Metodo que modifica y
	 * @param coordenada El valor que sera asignado a y
	 */
	public void setY(int coordenada) {
		y = coordenada;
	}
}

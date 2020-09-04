/**
 * Clase Abstracta Jugador: Usada para gestionar las caracteristicas basicas de un jugador
 * las cuales seran implementadas por cualquier tipo de jugador ya sea homano o maquina
 * @author Maria Alejandra Aguiar Vasquez - 1455775
 * @author Danny Fernando Cruz Arango     - 1449949
 */
public abstract class Jugador {
	
	int puntaje;
	int cantidadMovimientos;
	Coordenadas c;
	
	/**
	 * Metodo constructor que inicializa los valores de puntaje y cantidadMovimientos
	 */
	public Jugador() {
		puntaje = 0;
		cantidadMovimientos = 0;
	}

	/**
	 * Metodo que retorna el puntaje
	 * @return El puntaje
	 */
	public int getPuntaje() {
		return puntaje;
	}

	/**
	 * Metodo que modifica el puntaje
	 * @param p El nuevo puntaje
	 */
	public void setPuntaje(int p) {
		puntaje = p;
	}

	/**
	 * Metodo que retorna la cantidad de movimientos
	 * @return La cantidad de movimientos
	 */
	public int getCantidadMovimientos() {
		return cantidadMovimientos;
	}

	/**
	 * Metodo que modifica la cantidad de movimientos
	 * @param cant La nueva cantidad de movimientos
	 */
	public void setCantidadMovimientos(int cant) {
		cantidadMovimientos = cant;
	}
	
	/**
	 * Metodo que retorna el valor de la coordenada en x
	 * @return Valor de la coordenada en x
	 */
	public int getCoordenadaX() {
		return c.getX();
	}

	/**
	 * Metodo para modificar la coordenada de x
	 * @param cant Nuevo valor que tomara la coordenada en x
	 */
	public void setCoordenadaX(int cant) {
		c.setX(cant);
	}
	
	/**
	 * Metodo que retorna el valor de la coordenada en y
	 * @return Valor de la coordenada en y
	 */
	public int getCoordenadaY() {
		return c.getY();
	}

	/**
	 * Metodo para modificar la coordenada de y
	 * @param cant Nuevo valor que tomara la coordenada en y
	 */
	public void setCoordenadaY(int cant) {
		c.setY(cant);
	}
}

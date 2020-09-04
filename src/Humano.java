/**
 * Clase Humano: Usada para gestionar las caracteristicas del jugador Humano,
 * esta clase extiende de Jugador.
 * @author Maria Alejandra Aguiar Vasquez - 1455775
 * @author Danny Fernando Cruz Arango     - 1449949
 */
public class Humano extends Jugador {
	
	String nickname;
	
	/**
	 * Metodo constructor que inicializa vacio el nickname del jugador.
	 */
	public Humano() {
		nickname = "";
	}

	/**
	 * Metodo que retorna el nickname del jugador
	 * @return El nickname
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * Metodo usado para modificar el nickname del jugador
	 * @param nick El nuevo nickname del jugador
	 */
	public void setNickname(String nick) {
		nickname = nick;
	}
}

/**
 * Clase Arbitro: Usada para gestionar la partida de triqui, determina que jugador es el siguiente en el turno
 * quien es el ganador o si hay un mepate, esta clase usa las constantes.
 * @author Maria Alejandra Aguiar Vasquez - 1455775
 * @author Danny Fernando Cruz Arango     - 1449949
 */
public class Arbitro implements Constantes {

	/**
	 * Arreglo que sera usado para almacenar los movimentos del triqui
	 */
	int tablero[][] = new int[tamanoTablero][tamanoTablero];
	int movimientosRealizados;
	boolean partidaEnJuego = false;
	Humano jugador1 = new Humano();
	Humano jugador2 = new Humano();
	
	/**
	 * Metodo constructor que inicializa el tablero con 0
	 * y asigna el valor inicial de los movmimentos restantes
	 */
	public Arbitro() {
		movimientosRealizados = movimientosMaximos;
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				tablero[i][j] = 0;
			}
		}
	}
	
	/**
	 * Metodo usado para determinar si una casilla desocupada para realizar un movimiento
	 * @param x Posicion en X del tablero
	 * @param y Posicion en Y del tablero
	 * @return true Si la casilla se encuentra disponible
     *		   false Si la casilla se encuentra ocupada
	 */
	public boolean validarCasilla(int x, int y){
		if(tablero[x][y] == 0){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	/**
	 * Metodo que determina si una partida a terminado
	 * @return 0 Si aun se puede jugar en la partida
     *		   1 Si el jugador con identificador 1 ha ganado
     *		   2 Si el jugador con identificador 2 ha ganado
     *		   3 Si ya no se pueden realizar mas movimientos y es un empate
	 */
	public int finPartida(){
		if((tablero[0][0]==1&&tablero[0][1]==1&&tablero[0][2]==1)||
		   (tablero[1][0]==1&&tablero[1][1]==1&&tablero[1][2]==1)||
		   (tablero[2][0]==1&&tablero[2][1]==1&&tablero[2][2]==1)||
		   (tablero[0][0]==1&&tablero[1][0]==1&&tablero[2][0]==1)||
		   (tablero[0][1]==1&&tablero[1][1]==1&&tablero[2][1]==1)||
		   (tablero[0][2]==1&&tablero[1][2]==1&&tablero[2][2]==1)||
		   (tablero[0][0]==1&&tablero[1][1]==1&&tablero[2][2]==1)||
		   (tablero[0][2]==1&&tablero[1][1]==1&&tablero[2][0]==1))
		   {
				return 1;
		   }
		   else
		   {
		   	if((tablero[0][0]==2&&tablero[0][1]==2&&tablero[0][2]==2)||
			   (tablero[1][0]==2&&tablero[1][1]==2&&tablero[1][2]==2)||
			   (tablero[2][0]==2&&tablero[2][1]==2&&tablero[2][2]==2)||
			   (tablero[0][0]==2&&tablero[1][0]==2&&tablero[2][0]==2)||
			   (tablero[0][1]==2&&tablero[1][1]==2&&tablero[2][1]==2)||
			   (tablero[0][2]==2&&tablero[1][2]==2&&tablero[2][2]==2)||
			   (tablero[0][0]==2&&tablero[1][1]==2&&tablero[2][2]==2)||
			   (tablero[0][2]==2&&tablero[1][1]==2&&tablero[2][0]==2))
			   {
			   	return 2;
			   }
			   else
			   {
			   		if(tablero[0][0]!=0&&tablero[0][1]!=0&&tablero[0][2]!=0&&
					   tablero[1][0]!=0&&tablero[1][1]!=0&&tablero[1][2]!=0&&
					   tablero[2][0]!=0&&tablero[2][1]!=0&&tablero[2][2]!=0)
					   {
			   			   return 3;
					   }
					   else
					   {
						   movimientosRealizados--;
						   return 0;
					   }
			   }
		   }
	}
	
	/**
	 * Metodo que determina cual fue la linea ganadora de una partida
	 * @return 0 En caso de que ninga de la lineas concuerde con un ganador
     *		   1 En caso de que la linea ganadora se la vertical izquierda
     *		   2 En caso de que la linea ganadora se la vertical central
     *		   3 En caso de que la linea ganadora se la vertical derecha
     *		   4 En caso de que la linea ganadora se la horizontal superior
     *		   5 En caso de que la linea ganadora se la horizontal central
     *		   6 En caso de que la linea ganadora se la horizontal inferior
     *		   7 En caso de que la linea ganadora se la diagonal hacia abajo a la derecha
     *		   8 En caso de que la linea ganadora se la diagonal hacia abajo a la izquierda  
	 */
	public int lineaGanadora(){
		if(tablero[0][0]==tablero[0][1]&&tablero[0][2]==tablero[0][0])
			return 1;
			else
				if(tablero[1][0]==tablero[1][1]&&tablero[1][2]==tablero[1][0])
					return 2;
				else
					if(tablero[2][0]==tablero[2][1]&&tablero[2][2]==tablero[2][0])
						return 3;
					else
						if(tablero[0][0]==tablero[1][0]&&tablero[2][0]==tablero[0][0])
							return 4;
						else
							if(tablero[0][1]==tablero[1][1]&&tablero[2][1]==tablero[0][1])
								return 5;
							else
								if(tablero[0][2]==tablero[1][2]&&tablero[2][2]==tablero[0][2])
									return 6;
								else
									if(tablero[0][0]==tablero[1][1]&&tablero[2][2]==tablero[0][0])
										return 7;
									else
										if(tablero[0][2]==tablero[1][1]&&tablero[2][0]==tablero[0][2])
											return 8;
										else
											return 0;
	}

	/**
	 * @param tablero the tablero to set
	 */
	public void setTablero(int[][] tablero) {
		this.tablero = tablero;
	}
}

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class AreaTriki extends JPanel implements MouseListener {
	
	Coordenadas coordenadas = new Coordenadas();
	//Esto determina la linea roja de ganador
	//Inicia en 0 esta en 2 como ejemplo
	int lineaGanadora=2;
	int x, y, jugador = 0;
	boolean tiroErroneo = true;
	int tablero[][] = new int[3][3];

	public AreaTriki() {
		addMouseListener(this);
	}
	
	public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(48, 3, 4, 145);
        g.fillRect(98, 3, 4, 145);
        g.fillRect(3, 48, 145, 4);
        g.fillRect(3, 98, 145, 4);
        //Aqui se imprimen las lineas de ganador
        switch (lineaGanadora) {
		case 1:
			g.setColor(Color.RED);
			g.fillRect(24, 3, 4, 145);
			g.setColor(Color.BLACK);
			break;
		case 2:
			g.setColor(Color.RED);
			g.fillRect(74, 3, 4, 145);
			g.setColor(Color.BLACK);
			break;
		case 3:
			g.setColor(Color.RED);
			g.fillRect(124, 3, 4, 145);
			g.setColor(Color.BLACK);
			break;
		case 4:
			g.setColor(Color.RED);
			g.fillRect(3, 24, 145, 4);
			g.setColor(Color.BLACK);
			break;
		case 5:
			g.setColor(Color.RED);
			g.fillRect(3, 74, 145, 4);
			g.setColor(Color.BLACK);
			break;
		case 6:
			g.setColor(Color.RED);
			g.fillRect(3, 124, 145, 4);
			g.setColor(Color.BLACK);
			break;
		case 7:
			//Diagonal 1 de ganador
			g.setColor(Color.RED);
			//g.fillRect(3, 124, 145, 4);
			g.setColor(Color.BLACK);
			break;
		case 8:
			//Diagonal 2 de ganador
			g.setColor(Color.RED);
			//g.fillRect(3, 124, 145, 4);
			g.setColor(Color.BLACK);
			break;
		default:
			break;
		}
        
        //////////////For que imprima X si es 1 o O si es 2 en el tablero[][]
    }

	/**
	 * @return the jugador
	 */
	public int getJugador() {
		return jugador;
	}

	/**
	 * @param jugador the jugador to set
	 */
	public void setJugador(int jugador) {
		this.jugador = jugador;
	}

	/**
	 * @return the tablero
	 */
	public int[][] getTablero() {
		return tablero;
	}

	/**
	 * @param tablero the tablero to set
	 */
	public void setTablero(int[][] tablero) {
		this.tablero = tablero;
	}

	/**
	 * @return the coordenadas
	 */
	public Coordenadas getCoordenadas() {
		return coordenadas;
	}

	/**
	 * @param tiroErroneo the tiroErroneo to set
	 */
	public void setTiroErroneo(boolean tiroErroneo) {
		this.tiroErroneo = tiroErroneo;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		x=e.getX();
		y=e.getY();
		
		if(x>=6 && x <= 45 && y >= 6 && y<= 45) {
			if(tablero[0][0]!=0){
				coordenadas.setX(0);
				coordenadas.setY(0);
				tiroErroneo=!tiroErroneo;
				tablero[0][0]=jugador;
			}
		}
		if(x>=6 && x <= 45 && y >= 53 && y<= 98) {
			coordenadas.setX(1);
			coordenadas.setY(0);
			
			JOptionPane.showMessageDialog(null, "Click en el area 1,0");
		}
		
		if(x>=6 && x <= 45 && y >= 102 && y<= 148) {
			coordenadas.setX(0);
			coordenadas.setY(2);
			
			JOptionPane.showMessageDialog(null, "Click en el area 0,2");
		}
//**********************************************************************************
		if(x>=53 && x <= 98 && y >= 6 && y<= 45) {
			coordenadas.setX(1);
			coordenadas.setY(0);
			
			JOptionPane.showMessageDialog(null, "Click en el area 1,0");
		}
		if(x>=53 && x <= 98 && y >= 53 && y<= 98) {
			coordenadas.setX(1);
			coordenadas.setY(1);
			
			JOptionPane.showMessageDialog(null, "Click en el area 1,1");
		}
		
		if(x>=53 && x <= 98 && y >= 102 && y<= 148) {
			coordenadas.setX(1);
			coordenadas.setY(2);
			
			JOptionPane.showMessageDialog(null, "Click en el area 1,2");
		}
		//**********************************************************************************
				if(x>=102 && x <= 148 && y >= 6 && y<= 45) {
					coordenadas.setX(2);
					coordenadas.setY(0);
					
					JOptionPane.showMessageDialog(null, "Click en el area 2,0");
				}
				if(x>=102 && x <= 148 && y >= 53 && y<= 98) {
					coordenadas.setX(2);
					coordenadas.setY(1);
					
					JOptionPane.showMessageDialog(null, "Click en el area 2,1");
				}
				
				if(x>=102 && x <= 148 && y >= 102 && y<= 148) {
					coordenadas.setX(2);
					coordenadas.setY(2);
					
					JOptionPane.showMessageDialog(null, "Click en el area 2,2");
				}
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
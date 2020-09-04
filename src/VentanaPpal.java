import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JSeparator;

@SuppressWarnings("serial")
public class VentanaPpal extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton btnIniciarJuego;
	private JButton btnNuevaPartida;
	public Arbitro arbitro = new Arbitro();
	private JLabel lblNickname1;
	private JLabel lblMovRestantes;
	private JLabel lblTotal1;
	private JLabel lblPuntos1;
	private JLabel lblNickname2;
	private JLabel lblTotal2;
	private JLabel lblPuntos2;
	private AreaTriki panel_1;
	boolean flag = true;
	private JLabel lblTurnoactual;

	/**
	 * Create the frame.
	 */
	public VentanaPpal() {
		setTitle("Triki");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 11, 424, 249);
		contentPane.add(panel);
		panel.setLayout(null);
		
		panel_1 = new AreaTriki();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setLayout(null);
		panel_1.setBounds(148, 48, 151, 151);
		panel.add(panel_1);
		
		JLabel lblJuegoTriki = new JLabel("Juego Triki");
		lblJuegoTriki.setHorizontalAlignment(SwingConstants.CENTER);
		lblJuegoTriki.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblJuegoTriki.setBounds(10, 11, 117, 28);
		panel.add(lblJuegoTriki);
		
		btnNuevaPartida = new JButton("Nueva Partida");
		btnNuevaPartida.setEnabled(false);
		btnNuevaPartida.setBounds(10, 108, 128, 23);
		panel.add(btnNuevaPartida);
		
		JLabel lblMovimientosRestantes = new JLabel("Movimientos restantes:");
		lblMovimientosRestantes.setBounds(148, 19, 151, 14);
		panel.add(lblMovimientosRestantes);
		
		JLabel lblJugador = new JLabel("Jugador 1:");
		lblJugador.setBounds(309, 32, 105, 14);
		panel.add(lblJugador);
		
		lblNickname1 = new JLabel("nickName1");
		lblNickname1.setBounds(319, 48, 95, 14);
		panel.add(lblNickname1);
		
		btnIniciarJuego = new JButton("Iniciar Juego");
		btnIniciarJuego.setBounds(10, 74, 128, 23);
		panel.add(btnIniciarJuego);
		
		lblMovRestantes = new JLabel("");
		lblMovRestantes.setBounds(294, 19, 46, 14);
		panel.add(lblMovRestantes);
		
		JLabel lblTotalMovimientos = new JLabel("Total mov:");
		lblTotalMovimientos.setBounds(309, 66, 105, 14);
		panel.add(lblTotalMovimientos);
		
		lblTotal1 = new JLabel("total1");
		lblTotal1.setBounds(319, 82, 69, 14);
		panel.add(lblTotal1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(309, 139, 105, 2);
		panel.add(separator);
		
		JLabel lblPuntaje = new JLabel("Puntaje:");
		lblPuntaje.setBounds(309, 100, 46, 14);
		panel.add(lblPuntaje);
		
		lblPuntos1 = new JLabel("puntos1");
		lblPuntos1.setBounds(319, 117, 46, 14);
		panel.add(lblPuntos1);
		
		JLabel lblJugador_1 = new JLabel("Jugador 2:");
		lblJugador_1.setBounds(309, 149, 105, 14);
		panel.add(lblJugador_1);
		
		lblNickname2 = new JLabel("nickName2");
		lblNickname2.setBounds(319, 164, 95, 14);
		panel.add(lblNickname2);
		
		JLabel lblTotalMov = new JLabel("Total mov:");
		lblTotalMov.setBounds(309, 180, 105, 14);
		panel.add(lblTotalMov);
		
		lblTotal2 = new JLabel("total2");
		lblTotal2.setBounds(319, 198, 95, 14);
		panel.add(lblTotal2);
		
		JLabel lblPuntaje_1 = new JLabel("Puntaje:");
		lblPuntaje_1.setBounds(309, 213, 105, 14);
		panel.add(lblPuntaje_1);
		
		lblPuntos2 = new JLabel("puntos2");
		lblPuntos2.setBounds(319, 228, 95, 14);
		panel.add(lblPuntos2);
		
		JLabel lblTurno = new JLabel("TURNO:");
		lblTurno.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTurno.setBounds(119, 212, 76, 14);
		panel.add(lblTurno);
		
		lblTurnoactual = new JLabel("");
		lblTurnoactual.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTurnoactual.setBounds(174, 210, 125, 14);
		panel.add(lblTurnoactual);
		
		btnIniciarJuego.addActionListener(this);
		btnNuevaPartida.addActionListener(this);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPpal frame = new VentanaPpal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void iniciarPartida(){
		flag = Math.random() < 0.5;
		panel_1.setTablero(arbitro.tablero);
		while (arbitro.finPartida()==0) {
			if(flag){
				panel_1.setJugador(1);
				while(panel_1.tiroErroneo){
					arbitro.setTablero(panel_1.tablero);
				}
				panel_1.setTiroErroneo(true);
			}else{
				
			}
		}
	}
	
	public void updateEtiquetas(){
		lblMovRestantes.setText(""+arbitro.movimientosRealizados);
		
		lblNickname1.setText(arbitro.jugador1.nickname);
		lblTotal1.setText(""+arbitro.jugador1.cantidadMovimientos);
		lblPuntos1.setText(""+arbitro.jugador1.puntaje);
		
		lblNickname2.setText(arbitro.jugador2.nickname);
		lblTotal2.setText(""+arbitro.jugador2.cantidadMovimientos);
		lblPuntos2.setText(""+arbitro.jugador2.puntaje);
		
		if(flag)
			lblTurnoactual.setText(arbitro.jugador1.getNickname());
		else
			lblTurnoactual.setText(arbitro.jugador2.getNickname());
		iniciarPartida();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnIniciarJuego){
			arbitro.jugador1.setNickname(JOptionPane.showInputDialog("Ingrese el Nickname del Jugador 1"));
			arbitro.jugador2.setNickname(JOptionPane.showInputDialog("Ingrese el Nickname del Jugador 2"));
			updateEtiquetas();
		}
		if(e.getSource()==btnNuevaPartida){
			if(arbitro.partidaEnJuego){
				switch (JOptionPane.showConfirmDialog(this, "¿Desea perder los datos de la partida actual?")) {
				case 0:
//					arbitro.jugador1.setNickname(JOptionPane.showInputDialog("Ingrese el Nickname del Jugador 1"));
//					arbitro.jugador2.setNickname(JOptionPane.showInputDialog("Ingrese el Nickname del Jugador 2"));
					//Reiniciar Partida
					updateEtiquetas();
					break;
				case 1:
					break;
				case 2:
					break;
				case -1:
					break;
				default:
					break;
				};
			}
		}
	}
}

package Animacion;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Clase para dar el efecto de movimiento de una estrella
 * @author Gerardo Rodrigurz Rojano
 * @version 1.0
 *
 */
public class AnimarEstrella extends JPanel implements ActionListener {

	private Timer temporizador;
	private int retraso = 50; // retraso en milisecso
	private int vecesPintado = 1;
	
	// El Polígono
	private int valoresX[] = { 70, 170, 120, 70, 170, 70};
	private int valoresY[] = { 100, 170, 30, 170, 100, 100 };
	private Polygon poligono;
	
	public AnimarEstrella() {  }  // Constructor vacío
	
	public static void main(String[] args) {
		
		AnimarEstrella animacion = new AnimarEstrella();
		JFrame ventana = new JFrame("Animación de una Estrella V1");
		ventana.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		ventana.setSize( 830,400 );		
		ventana.setVisible(true);
		Container contenedor = ventana.getContentPane();
		contenedor.add( animacion );
		animacion.iniciarAnimacion();
	} // Fin de main
	
	public void iniciarAnimacion() {
		
		temporizador = new Timer(retraso,this);
		temporizador.start();
	} // Fin de iniciarAnimacion
	
	// Responder al evento del objeto Timer
	public void actionPerformed( ActionEvent evento) {
		
		this.repaint();  // pintar de nuevo
	} // Fin de actionPerformed
	
	public void paintComponent(Graphics g ) {
		
		if ( vecesPintado > 100) {  // Ir a la posicion de inicio
			vecesPintado = 1;
			valoresX[0] = 70;
			valoresX[1] = 170;
		    valoresX[2] = 120;
			valoresX[3] = 70;
		    valoresX[4] = 170;
		    valoresX[5] = 70;
		}
		super.paintComponent(g);
		//poligono = new Polygon( valoresX, valoresY, valoresX );
		//g.drawPolygon( poligono );
		g.fillPolygon(valoresX,valoresY,valoresX.length);
		vecesPintado++; 
		if ( temporizador.isRunning()) {
			for (int j = 0; j < valoresX.length; j++) {
				valoresX[j] += 5;
	        }	
		}
	} // Fin de paintComponent	
	
} // Fin de la clase AnimarEstrella

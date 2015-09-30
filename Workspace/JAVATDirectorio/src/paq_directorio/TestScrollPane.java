package paq_directorio;

import javax.swing.*; // JFrame, JList, DefaultListModel 
import java.awt.BorderLayout;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;


public class TestScrollPane extends JFrame {

                // Variables de instancia de la clase  
	private JList lista;
	private DefaultListModel dList;
	private String[] diasDeLaSemana = {"Lunes","Martes","Miercoles","Jueves","Viernes",
			                   "Sabado","Domingo"};
	private JLabel etiq1;
	private JScrollPane jsp;
	private JPanel panelIzq;
	private JPanel panelDer;
	private JTextArea texto;
	
	public static void main(String[] args) {
		
                               // Variables de  main
		TestScrollPane ventana = new TestScrollPane("=== TestScrollPane ===");	
		ventana.setVisible(true);
		//ventana.modificaNombres();
	} // Fin de main
	
	public TestScrollPane(String initTitulo) {
	
		this.setTitle(initTitulo);
		this.setSize(400,150);
		this.setLocation(200,150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false); // no es resizable by user
		
		// Inicializar la lista de elementos
		dList = new DefaultListModel();
        dList.addElement(this.diasDeLaSemana[0]);  dList.addElement(this.diasDeLaSemana[1]);
        dList.addElement(this.diasDeLaSemana[2]);  dList.addElement(this.diasDeLaSemana[3]);
        dList.addElement(this.diasDeLaSemana[4]);  dList.addElement(this.diasDeLaSemana[5]);
        dList.addElement(this.diasDeLaSemana[6]);
        lista = new JList(dList);
        lista.addListSelectionListener(new ManejadorDeJList(this));
        
        // Etiquetas
        etiq1 = new JLabel("Etiqueta ....");
        
        // JTextArea
        texto = new JTextArea(10,20);
        
        // JScrollPane
        jsp = new JScrollPane(lista);
        jsp.setSize(200,150);
        
        // Paneles
        panelIzq = new JPanel(new BorderLayout());  // list no flowLayout
        panelIzq.add(jsp);
        panelDer = new JPanel();
        panelDer.add(texto);
        //agregarla al contenedor de la ventana
        this.getContentPane().add(panelIzq,BorderLayout.CENTER);
        this.getContentPane().add(etiq1,BorderLayout.SOUTH);
        this.getContentPane().add(panelDer,BorderLayout.EAST);
        
	} // Constructor TestScrollPane
	
	private void modificaNombres() {
		
		String dia = (String)dList.get(5);
		dList.add(1, dia);
		dList.remove(6);
	}
	
	class ManejadorDeJList implements ListSelectionListener {
		
		TestScrollPane sunVent;
		
		// Pasamos la ventana donde se ubica el objeto JList
		public ManejadorDeJList(TestScrollPane v) {
			
			this.sunVent = v;
		}
		
		public void valueChanged(ListSelectionEvent e) {
			
			String texto;
			
			texto = this.sunVent.lista.getSelectedValue().toString(); 
			this.sunVent.etiq1.setText("Selecci—n de: " + texto);
			this.sunVent.texto.setText(texto);
		}
	} // Fin de la clase Manejador

} // Fin de la clase TestScrollPane

package paq_iagenda;

import javax.swing.*; // JFrame, JList, DefaultListModel 

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.text.JTextComponent;

	

public class Directorio extends JFrame   {
	
	private JPanel Izq;
	private JPanel Cen;
	private JPanel Der;
	private JList lista1;
	private JScrollPane jsp;
	private JTextField nombre = new JTextField("Nombre");
	private JTextField empresa = new JTextField("Empresa");
	private JTextField direccion = new JTextField("Dirección");
	private JTextField telefonos = new JTextField("Teléfonos");
	private JTextField mail = new JTextField ("Correo Electrónico",30);
	private JButton enter = new JButton("Enter");
	private ArrayList<JTextField> lista = new ArrayList<JTextField>();
	private JLabel text = new JLabel();
	private DefaultListModel dList;
	private JTextArea texto1 = new JTextArea();
	
	public static void main(String[] args) {
		
		Directorio miventana = new Directorio("iAgenda");	
		miventana.setVisible(true);
	}


public Directorio(String initTitulo){
	
	this.setTitle(initTitulo);
	this.setSize(600,200);
	this.setLocation(200,150);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(true);
	
	
	
	dList = new DefaultListModel();
    lista1 = new JList(dList);
	
	 jsp = new JScrollPane(lista1);
     jsp.setSize(200,150);
	
	Izq = new JPanel(new GridLayout(lista.size(),1));
    lista.add(nombre);
    lista.add(empresa);
    lista.add(direccion);
    lista.add(telefonos);
    lista.add(mail);
    for (JTextField f:lista){
    	Izq.add(f);
    }
    Izq.add(enter);
    Cen = new JPanel(new BorderLayout());
    Cen.add(jsp);
    Der = new JPanel(new BorderLayout());
    Der.add(texto1);
    this.getContentPane().add(Izq,BorderLayout.WEST);
    this.getContentPane().add(Cen,BorderLayout.CENTER);



	
	
}



}// Fin de la clase Directorio


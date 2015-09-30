/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interdependencia;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Hito {
	
	private ArrayList<Integer> nivel = new ArrayList<Integer>();
	private String nombre;
	private Boolean editable;
	private Double duracion;
	private ArrayList<String> personas = new ArrayList<String>();
	private ArrayList<String> dependencias = new ArrayList<String>();
	private GregorianCalendar fechainicio = new GregorianCalendar();
	private GregorianCalendar fechafinal = new GregorianCalendar(); 
	
	private final String[] meses={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};

        // Constructores;
	public Hito()
	{
		setNivel("0");
		nombre = "Nuevo Hito";
		editable = Boolean.parseBoolean("false");
		duracion = Double.parseDouble("0.0");
		setPersonas("Responsable&Autoriza&Supervisa&Informa");
		setDependencias("0");
		setFechainicio("1991/11/1");
		setFechafinal("1991/11/1");
		
	}
	public Hito(String initNivel, String initNombre, String initEditable, String initDuracion, String initPersonas, String initDependencias, String initFechainicio, String initFechafinal)
	{	
		setNivel(initNivel);
		nombre = initNombre;
		editable = Boolean.parseBoolean(initEditable);
		duracion = Double.parseDouble(initDuracion);
		setPersonas(initPersonas);
		setDependencias(initDependencias);
		setFechainicio(initFechainicio);
		setFechafinal(initFechafinal);
		
	}
	
	public Hito(String hitostring)
	{
		String[] temp= hitostring.split(",");
		
		setNivel(temp[0]);
		nombre = temp[1];
		editable = Boolean.parseBoolean(temp[2]);
		duracion = Double.parseDouble(temp[3]);
		setPersonas(temp[4]);
		setDependencias(temp[5]);
		setFechainicio(temp[6]);
		setFechafinal(temp[7]);
		
	}
	// Métodos Nivel;
	public void setNivel (String nivelstring)
	{
		nivel.clear();
		String[] temp = nivelstring.split("#");
		for(int i=0; i<temp.length ; i++)
			nivel.add(Integer.parseInt(temp[i]));
	}
	public ArrayList<Integer> getNivel()
	{
		return this.nivel;
	}
	public String niveltoString()
	{
		String salida="";
		
		for(int i=0 ; i < nivel.size()-1; i++)
			salida +=  nivel.get(i).toString() + "#";
		
		salida += nivel.get(nivel.size()-1).toString();
		
		return salida;
	}
	
	// Métodos Nombre;
	
	public void setNombre(String nombrestring)
	{
		nombre=nombrestring.trim();
	}
	public String getNombre()
	{
		return nombre;
	}
	public String nombretoString()
	{
		return nombre;
	}

	// Métodos Editable;
	
	public void setEditable(Boolean Editable)
	{
		editable=Editable;
	}
	public Boolean isEditable()
	{
		return editable;
	}
	public String editabletoString()
	{
		String salida="";
		
		if(isEditable())
			salida="true";
		else
			salida="false";
		
		return salida;
	}

	// Métodos Duracion;
	
	public void setDuracion(Double Duracion)
	{
		duracion=Duracion;
	}
	public double getDuracion()
	{
		return duracion;
	}
	public String duraciontoString()
	{
		return duracion.toString();
	}
	
	// Métodos Personas [ RASI ];
	
	public void setPersonas(String personasstring)
	{
		personas.clear();
		String[] temp = personasstring.split("&");
		
		for(int i=0; i<temp.length ; i++)
			personas.add(temp[i]);
		
	}
	public ArrayList<String> getPersonas()
	{
		return personas;
	}
	public void addPersona(String per)
	{
		personas.add(per);
	}
	public void removePersona(Integer index)
	{
		personas.remove(index);
	}
	public String personastoString()
	{
		String salida="";
		
		for(int i=0; i < personas.size()-1 ; i++)
			salida += personas.get(i).toString() + "&";
		
		salida += personas.get(personas.size()-1).toString();
		
		return salida;
	}
	
	// Métodos Dependencias;
	
	public void setDependencias(String dependenciasstring)
	{
		dependencias.clear();
		String []  temp = dependenciasstring.split("&");
		
		for(int i=0; i<temp.length ; i++)
			dependencias.add(temp[i]);
		
		
	}
	public ArrayList<String> getDependencias()
	{
		return dependencias;
	}
	public void addDependencia(String dep)
	{
		dependencias.add(dep);
	}
	public void removeDependencia(Integer index)
	{
		dependencias.remove(index);
	}
	public String dependenciastoString()
	{
		String salida="";
		
		for(int i=0; i< dependencias.size()-1 ; i++)
			salida += dependencias.get(i).toString() + "&";
		
		salida += dependencias.get(dependencias.size()-1).toString();
		
		return salida;
	}

	// Métodos Fechainicio;
	
	public void setFechainicio(String fechaini)
	{
		String[] temp = fechaini.split("/");
		
		fechainicio.set(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), Integer.parseInt(temp[2]));	
	
	}
	public GregorianCalendar getFechainicio()
	{
		return fechainicio;
	}
	public String fechainiciotoString()
	{
		return Integer.toString(fechainicio.get(Calendar.YEAR)) + "/" + Integer.toString(fechainicio.get(Calendar.MONTH)) + "/" + Integer.toString(fechainicio.get(Calendar.DATE));
	}
	
	// Métodos Fechafinal;
	
	public void setFechafinal(String fechafin)
	{
		String[] temp = fechafin.split("/");
		
		fechafinal.set(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), Integer.parseInt(temp[2]));
		
	}
	public GregorianCalendar getFechafinal()
	{
		return fechafinal;
		}
	public String fechafinaltoString()
	{
		return Integer.toString(fechafinal.get(Calendar.YEAR)) + "/" + Integer.toString(fechafinal.get(Calendar.MONTH)) + "/" + Integer.toString(fechafinal.get(Calendar.DATE));
		
	}

	// Métodos Hito;
	
    @Override
	public String toString()
	{
		return niveltoString()+","+nombretoString()+","+editabletoString()+","+duraciontoString()+","+ personastoString() + "," + dependenciastoString() + "," + fechainiciotoString() + "," + fechafinaltoString();
	}

}

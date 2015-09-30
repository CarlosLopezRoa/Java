
package wbs;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


public class CsvHito {
	
	public static void escribir(ArrayList<Hito> listhitos, String archivo)
	{
		CsvWriter csvW = new CsvWriter(archivo);
		try {
			csvW.write("NIVEL");
			csvW.write("NOMBRE");
			csvW.write("EDITABLE");
			csvW.write("DURACION");
			csvW.write("PERSONAS");
			csvW.write("DEPENDENCIAS");
			csvW.write("FECHAINICIO");
			csvW.write("FECHAFINAL");
			csvW.endRecord();
			for(int i=0;i<listhitos.size();i++)
			{
				csvW.write(listhitos.get(i).niveltoString());
				csvW.write(listhitos.get(i).nombretoString());
				csvW.write(listhitos.get(i).editabletoString());
				csvW.write(listhitos.get(i).duraciontoString());
				csvW.write(listhitos.get(i).personastoString());
				csvW.write(listhitos.get(i).dependenciastoString());
				csvW.write(listhitos.get(i).fechainiciotoString());
				csvW.write(listhitos.get(i).fechafinaltoString());
				csvW.endRecord();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		csvW.close();
		
	}
	public static void leer(ArrayList<Hito> listhitos ,String archivo)
	{
		try
		{
			
		
			CsvReader hitos = new CsvReader(archivo);
			hitos.readHeaders();
		
			for(;hitos.readRecord();)
			{
				listhitos.add(new Hito(hitos.get("NIVEL"),hitos.get("NOMBRE"),hitos.get("EDITABLE"),hitos.get("DURACION"),hitos.get("PERSONAS"),hitos.get("DEPENDENCIAS"),hitos.get("FECHAINICIO"),hitos.get("FECHAFINAL")));	
			}
			
			hitos.close();
		} catch(FileNotFoundException e){
		e.printStackTrace();
		} catch (IOException e){
		e.printStackTrace();
		}
	
	}
        
        public static void leerestadohitos(ArrayList<EstadodeHito> listestadohitos, String archivo)
        {
            
            try
		{
			
		
			CsvReader estadohitos = new CsvReader(archivo);
			estadohitos.readHeaders();
		
			for(;estadohitos.readRecord();)
			{
				listestadohitos.add(new EstadodeHito(estadohitos.get("TIEMPOCALCULABLE"),estadohitos.get("ESTADOESTIMABLE"),estadohitos.get("DURACION"),estadohitos.get("ENTREGABLE"),estadohitos.get("INICIOYFIN"),estadohitos.get("INDEPENDENCIA")));	
			}
			
			estadohitos.close();
		} catch(FileNotFoundException e){
		e.printStackTrace();
		} catch (IOException e){
		e.printStackTrace();
		}
            
        }
        
        public static void escribirestadohitos(ArrayList<EstadodeHito> listestadoshitos, String archivo)
        {
            CsvWriter csvW = new CsvWriter(archivo);
		try {
			csvW.write("TIEMPOCALCULABLE");
			csvW.write("ESTADOESTIMABLE");
			csvW.write("DURACION");
			csvW.write("ENTREGABLE");
			csvW.write("INICIOYFIN");
			csvW.write("INDEPENDENCIA");
			csvW.endRecord();
			for(int i=0;i<listestadoshitos.size();i++)
			{
				csvW.write(listestadoshitos.get(i).getTiempocalculable().toString());
                                csvW.write(listestadoshitos.get(i).getEstadoestimable().toString());
                                csvW.write(listestadoshitos.get(i).getDuracion().toString());
                                csvW.write(listestadoshitos.get(i).getEntregable().toString());
                                csvW.write(listestadoshitos.get(i).getInicioyfin().toString());
                                csvW.write(listestadoshitos.get(i).getIndependencia().toString());
				csvW.endRecord();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		csvW.close();
		
        }
	
}


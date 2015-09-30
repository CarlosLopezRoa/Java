/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wbs;



/**
 *
 * @author Nieto
 */
public class EstadodeHito {
    
    private Boolean tiempocalculable, estadoestimable,duracion, entregable,inicioyfin, independencia;
   
    
    // Constructores;
    public EstadodeHito(String initTiempocalculable, String initEstadoestimable, String initDuracion, String initEntregable, String initInicioyfin, String initIndependencia)
    {
        tiempocalculable=Boolean.parseBoolean(initTiempocalculable);
        estadoestimable = Boolean.parseBoolean(initEstadoestimable);
        duracion = Boolean.parseBoolean(initDuracion);
        entregable = Boolean.parseBoolean(initEntregable);
        inicioyfin = Boolean.parseBoolean(initInicioyfin);
        independencia = Boolean.parseBoolean(initIndependencia);
    }
    
    public EstadodeHito()
    {
        tiempocalculable= false;
        estadoestimable = false;
        duracion = false;
        entregable = false;
        inicioyfin = false;
        independencia = false;
        
    }
    
    // Métodos get;
    
    public Boolean getTiempocalculable()
    {
        return tiempocalculable;
    }
   
    public Boolean getEstadoestimable()
    {
        return estadoestimable;
    }
    
    public Boolean getDuracion()
    {
        return duracion;
    }
    
    public Boolean getEntregable()
    {
        return entregable;
    }
    
    public Boolean getInicioyfin()
    {
        return inicioyfin;
    }
    
    public Boolean getIndependencia()
    {
        return independencia;
    }
    
    // Métodos Set;
    
    public void setTiempocalculable(Boolean initTiempo)
    {
        tiempocalculable=initTiempo;
    }
    
    public void setEstadoestimable(Boolean initEstado)
    {
        estadoestimable = initEstado;
    }
    
    public void setDuracion(Boolean initDuracion)
    {
        duracion = initDuracion;
    }
    
    public void setEntregable(Boolean initEntregable)
    {
        entregable = initEntregable;
    }
    
    public void setInicioyfin(Boolean initInicioyfin)
    {
        inicioyfin = initInicioyfin;
    }
    
    public void setIndependencia(Boolean initIndependencia)
    {
        independencia = initIndependencia;
    }
    
    // Métodos toString;
}

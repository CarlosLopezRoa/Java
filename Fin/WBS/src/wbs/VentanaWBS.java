
package wbs;

// Librerias;
import java.util.ArrayList;

// Clase VentanaWBS;
public final class VentanaWBS extends javax.swing.JFrame {

    // Atributos de la Ventana WBS;
    ArrayList<Hito> listhitos = new ArrayList<Hito>();
    ArrayList<Hito> jlista1 = new ArrayList<Hito>();
    ArrayList<Hito> jlista2= new ArrayList<Hito>();
    ArrayList<EstadodeHito> listestadohitos = new ArrayList<EstadodeHito>();
    ArrayList<EstadodeHito> jlistaestadohitos2 = new ArrayList<EstadodeHito>();
    
    // Ruta de guardado local.
    String Archivolectura = new String("MiPrimerProyecto.csv");
    String Archivolecturaestados = new String("MiPrimerProyectoEstados.csv");
    
   // Constructor;
    public VentanaWBS() {
        
        // Inicia GUI;
        initComponents();
        
        // Se limpian las listas de hitos y del estado de hitos;
        listhitos.clear();
        listestadohitos.clear();
        
        // Se carga el proyecto;
        CsvHito.leer(listhitos,Archivolectura);
        CsvHito.leerestadohitos(listestadohitos,Archivolecturaestados);
       
        // Se revisa si no existe un archivo previo o esta vacio;
        if(listhitos.isEmpty())
        {  
            listhitos.add(new Hito());
            listestadohitos.add(new EstadodeHito());
            listhitos.get(0).setNombre(Archivolectura.replace(".csv", ""));
        }
    
        // Asignamos los hitos a las listas temporales;
        jlista1= crearlistadeNivel(listhitos,jComboBox1.getSelectedIndex());
        jlista2.clear();
       
        // Desplegamos las listas temporales en el jList;
        jList1.setListData(listatoArrayString(jlista1));
        jList2.setListData(listatoArrayString(jlista2));
       
        // Guardamos el proyecto;
        guardarproyecto();
        
    }

    // Código de Interfaz Gráfica;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WBS");
        setResizable(false);

        jCheckBox1.setText("Tiempo Calculable");

        jCheckBox2.setText("Produce Entregable");

        jCheckBox3.setText("Estado Estimable");

        jCheckBox4.setText("Inicio-Fin Delimitado");

        jCheckBox5.setText("Duración < Iteración");

        jCheckBox6.setText("Independencia");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nivel 0", "Nivel 1", "Nivel 2", "Nivel 3", "Nivel 4", "Nivel 5", "Nivel 6" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        jTextField1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextField1InputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jList1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jList1FocusGained(evt);
            }
        });
        jScrollPane3.setViewportView(jList1);

        jList2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList2ValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(jList2);

        jButton1.setText("Aceptar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("+");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Open");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Save");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("-");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(jButton3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jButton4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 127, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jComboBox1, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(47, 47, 47)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jCheckBox3)
                            .add(jCheckBox1))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jCheckBox6)
                            .add(jCheckBox4)
                            .add(jCheckBox2)))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .add(jCheckBox5)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 134, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(101, 101, 101))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(jScrollPane4)
                            .add(layout.createSequentialGroup()
                                .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 253, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButton5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(2, 2, 2)))
                .add(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(12, 12, 12)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 312, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jButton3)
                            .add(jButton4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .add(layout.createSequentialGroup()
                        .add(jScrollPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 212, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(20, 20, 20)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jButton5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jCheckBox1)
                            .add(jCheckBox2))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jCheckBox3)
                            .add(jCheckBox4))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jCheckBox5)
                            .add(jCheckBox6))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton1)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    // Cuando el nombre del hito se selecciona , todo el texto es seleccioando;
    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        jTextField1.selectAll();        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1FocusGained

    //
    private void jTextField1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField1InputMethodTextChanged
      // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1InputMethodTextChanged

    //
    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped

                   // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyTyped

    //
    private void jList1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jList1FocusGained
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jList1FocusGained

    // Cuando la lista de nivel esta seleccionada y se cambia el valor se crea la lista derivada y se despliega;
    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        // TODO add your handling code here:
        
        if(!jList1.isSelectionEmpty())
        {  
            jlista2 = crearlistadeTarea( listhitos ,jlista1.get(jList1.getSelectedIndex()).getNivel(),jlistaestadohitos2,listestadohitos);
            jList2.setListData(listatoArrayString(jlista2));
            limpiardatos();
L.
        }
        
    }//GEN-LAST:event_jList1ValueChanged

    // Cuando la lista de nivel esta seleccionada y se da clock en el boton agregar se agrega un hito en la lista derivada;
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        
        if(!jList1.isSelectionEmpty())
        {
            // Agregamos un nuevo hito;
            jlista2.add(new Hito());
            jlistaestadohitos2.add(new EstadodeHito());
        
            // Le asignamos el nivel que le corresponde al hito, basado en el nuvel del padre;
            jlista2.get(jlista2.size()-1).setNivel(jlista1.get(jList1.getSelectedIndex()).niveltoString()+"#"+Integer.toString(jlista2.size()));
            
            // Agregamos el hito a las listas de hitos.
            listhitos.add(jlista2.get(jlista2.size()-1));
            listestadohitos.add(new EstadodeHito());
        
            // Se crea una nueva lista derivada para desplegarse;
            jList2.setListData(listatoArrayString(jlista2));
            
            // Se limpian los datos y se guarda el proyecto;
            limpiardatos();
            guardarproyecto();
        
        }
    }//GEN-LAST:event_jButton2MouseClicked

    // Cuando se selecciona un hito de la lista derivada se obtienen los datos guardados del hito;
    private void jList2ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList2ValueChanged
        // TODO add your handling code here:
        if(!jList2.isSelectionEmpty())
             obtenerdatoshito();
    }//GEN-LAST:event_jList2ValueChanged

    // Cuando se da click en aceptar se  modifican los datos del hito seleccionado;
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        
        // Se verifica que las dos listas esten seleccionadas;
        if(!jList1.isSelectliionEmpty()&& !jList2.isSelectionEmpty())
        {
            // Se actualiza el hito;
            guardardatoshito();
            
            // Se crean las nuevas listas para desplegar;
            jlista2 = crearlistadeTarea(listhitos, jlista1.get(jList1.getSelectedIndex()).getNivel(),jlistaestadohitos2,listestadohitos);
            jList2.setListData(listatoArrayString(jlista2));
            
            // Se limpia el area de datos;
            limpiardatos();
            
            // Se guarda el proyecto;
            guardarproyecto();
        }
        
    }//GEN-LAST:event_jButton1MouseClicked

    // Cuando se modifica el valor de seleccion de nivel mediante el combobox;
    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        
        // Se crea una lista de nivel con la selección del combobox;
        jlista1= crearlistadeNivel(listhitos,jComboBox1.getSelectedIndex());
        jList1.setListData(listatoArrayString(jlista1));
        
        // Se limpia la lista derivada;
        jlista2.clear();
        jList2.setListData(listatoArrayString(jlista2));
        
        // Se limpia el area de datos;
        limpiardatos();
       
        
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    // Cuando se desea abrir un nuevo proyecto mediante el boton abrir;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        // Se guarda el proyecto actual;
        guardarproyecto();
        
        // Se crea un objeto JFileChooser para seleccionar la ruta y el nombre del proyecto;
        javax.swing.JFileChooser jFileChooser1 = new javax.swing.JFileChooser(); 
	jFileChooser1.setDialogType(javax.swing.JFileChooser.OPEN_DIALOG); 
        jFileChooser1.setDragEnabled(true);
	jFileChooser1.setDialogTitle("Abrir Proyecto");
        jFileChooser1.showOpenDialog(null);
        
        // Se asigna la ruta del arhcivo a la variable archivolectura que es entrada para las rutinas leer y escribir;
	Archivolectura = jFileChooser1.getSelectedFile().getAbsolutePath();
        Archivolecturaestados = Archivolectura.replace(".csv", "estados.csv");
        
        // Se limpian las listas generales;
        listhitos.clear();
        listestadohitos.clear();
        
        // Se abre el nuevo proyecto;
        abrirproyecto();
        
        // Creamos las listas temporales ;
        jlista1= crearlistadeNivel(listhitos,jComboBox1.getSelectedIndex());
        jlista2.clear();
       
        // Desplegamos las listas;
        jList1.setListData(listatoArrayString(jlista1));
        jList2.setListData(listatoArrayString(jlista2));
    }//GEN-LAST:event_jButton3ActionPerformed

    // Cuando se desea guardar un proyecto dando click en el boton guardar;
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        // Se crea un objeto JFileChooser para seleccionar la ruta y el nombre del proyecto;
        javax.swing.JFileChooser jFileChooser1 = new javax.swing.JFileChooser(); 
	jFileChooser1.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG); 
        jFileChooser1.setDragEnabled(true);
	jFileChooser1.setDialogTitle("Guardar Proyecto");
        jFileChooser1.showSaveDialog(null);
        
        // Se asigna la ruta del archivo a la variable archivolectura que es entrada para las rutinas leer y escribir;
	Archivolectura = jFileChooser1.getSelectedFile().getAbsolutePath()+".csv";
        Archivolecturaestados = Archivolectura.replace(".csv", "estados.csv");
        
        // Se modifica el nombre del hito 0 que es el nombre del proyecto;
        listhitos.get(0).setNombre(jFileChooser1.getSelectedFile().getName()); 
        
        // Se guarda el proyecto;
        guardarproyecto(); 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        if(!jList1.isSelectionEmpty()&& !jList2.isSelectionEmpty())
        {
            
            int t = jList2.getSelectedIndex();
            eliminarhitos(listhitos,jlista2.get(t).getNivel(),listestadohitos);
            
            for(int i=0; i<listhitos.size(); i++)
            {
                if(listhitos.get(i).getNombre().equals(jlista2.get(t).getNombre()))
                {
                    listhitos.remove(i);
                    listestadohitos.remove(i);
                }
            }
            
            jlista2.remove(t);
            jlistaestadohitos2.remove(t);
            
            jList2.setListData(listatoArrayString(jlista2));
            
            // Se limpian los datos y se guarda el proyecto;
            limpiardatos();
            guardarproyecto();
            
            
        }
        
    }//GEN-LAST:event_jButton5MouseClicked

    
   // Se crea la ventana;
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaWBS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaWBS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaWBS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaWBS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VentanaWBS().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
 

// Creador de ArrayList a partir de un nivel especificado;
    
    public  ArrayList<Hito> crearlistadeNivel(ArrayList<Hito> lista, Integer nivelbuscado)
    { 
          // Lista temporal;
          ArrayList<Hito> temp= new ArrayList<Hito>();
          
          // Obtenemos los hitos que tengan el nivel seleccionado;
          for(int i=0 ; i< lista.size(); i++)
              if(lista.get(i).getNivel().size()-1== nivelbuscado)
              temp.add(lista.get(i));
          
          // Regresamos la lista;
          return temp;
        
    }
    
 // Creador de Lista a partir de un ArrayList<Hito>;
    public String[] listatoArrayString(ArrayList<Hito> lista)
    {
        // Arreglo temporal;
        String[] jlist1 = new String[lista.size()];
        
        // De cada hito de la lista se obtiene el nombre y se almacena en el arreglo;
        for(int i=0; i<lista.size(); i++)
            jlist1[i]=lista.get(i).getNombre();
        
        // Se regresa el arreglo;
        return jlist1;
    }
    
    
 // Creador de ArrayList a partir de una tarea especificada;l
    public  ArrayList<Hito> crearlistadeTarea(ArrayList<Hito> lista, ArrayList<Integer> nivelbuscado,ArrayList<EstadodeHito> jlistaestadohitos,  ArrayList<EstadodeHito> listestadohitos)
    { 
          // Se crea la lista temporal y se limpia la lista de estados;
          ArrayList<Hito> temp= new ArrayList<Hito>();
          jlistaestadohitos.clear();
         
          // Para cada elemento de la lista se verifica que todos los valores de nivel inferiores e iguales al nivel buscado sean iguales;
          for(int j=0, p; j<lista.size();j++)
          {
              // El contador nos indica si se cumplio el ciclo for;
              p=0; 
              if(lista.get(j).getNivel().size()>=nivelbuscado.size())
                for(int i=0; i < nivelbuscado.size() && nivelbuscado.get(i)==lista.get(j).getNivel().get(i); i++,p++)
                {}
              
              // Si se cumplió el ciclo for se obtienen aquellos hitos que se derivan del nivel seleccionado;
              if(p==nivelbuscado.size() && lista.get(j).getNivel().size()== nivelbuscado.size()+1)
              {
                  // Se agrega el hito a la lista temporal y se agrega el estado de cada hito;
                  temp.add(lista.get(j));
                  jlistaestadohitos.add(listestadohitos.get(j));             
              }   
           }   
                    
          // Se regrea la lista temporal;
          return temp; 
    }
    
    // Esta rutina lee los datos de cada hito y los despliega en el area de datos;
    public void obtenerdatoshito()
    {
       
        jTextField1.setText(jlista2.get(jList2.getSelectedIndex()).getNombre());
        jCheckBox1.setSelected(jlistaestadohitos2.get(jList2.getSelectedIndex()).getTiempocalculable());
        jCheckBox2.setSelected(jlistaestadohitos2.get(jList2.getSelectedIndex()).getEntregable());
        jCheckBox3.setSelected(jlistaestadohitos2.get(jList2.getSelectedIndex()).getEstadoestimable());
        jCheckBox4.setSelected(jlistaestadohitos2.get(jList2.getSelectedIndex()).getInicioyfin());
        jCheckBox5.setSelected(jlistaestadohitos2.get(jList2.getSelectedIndex()).getDuracion());
        jCheckBox6.setSelected(jlistaestadohitos2.get(jList2.getSelectedIndex()).getIndependencia());
        
        
    }
   
    // Esta rutina toma los valores del area de datos y los asigna al hito correspondiente;
    public void guardardatoshito()
    {
        // Contador para saber que hito de la lista listhitos corresponde al hito seleccionado en la lista derivada;
        Integer i=0;
        for( ;!jlista2.get(jList2.getSelectedIndex()).getNombre().equals(listhitos.get(i).getNombre()); i++)
        {}
        
        // Asignación de los datos;
        listhitos.get(i).setNombre(jTextField1.getText().trim());
        listestadohitos.get(i).setTiempocalculable(jCheckBox1.isSelected());
        listestadohitos.get(i).setEntregable(jCheckBox2.isSelected());
        listestadohitos.get(i).setEstadoestimable(jCheckBox3.isSelected());
        listestadohitos.get(i).setInicioyfin(jCheckBox4.isSelected());
        listestadohitos.get(i).setDuracion(jCheckBox5.isSelected());
        listestadohitos.get(i).setIndependencia(jCheckBox6.isSelected());
    }

    // Se inicializan los datos del area de datos;
    public void limpiardatos()
    {
        jTextField1.setText("");
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        jCheckBox6.setSelected(false);
        
    }

    // Rutina para guardar el proyecto;
    public void guardarproyecto()
    {
        // Antes de escribir se verifica si el hito es completo o no;
        for(int i=0; i<listhitos.size(); i++)
            if(listestadohitos.get(i).getDuracion() && listestadohitos.get(i).getEntregable() && listestadohitos.get(i).getEstadoestimable() && listestadohitos.get(i).getIndependencia() && listestadohitos.get(i).getInicioyfin() && listestadohitos.get(i).getTiempocalculable())
                listhitos.get(i).setEditable(true);
            else
                listhitos.get(i).setEditable(false);
        
        // Se guardan los archivos del proyecto;
        CsvHito.escribir(listhitos, Archivolectura);
        CsvHito.escribirestadohitos(listestadohitos, Archivolecturaestados);
    }
    
    // Rutina para leer el proyecto;
    public void abrirproyecto()
    {
        // Se guardan los arhcivos del proyecto;
        CsvHito.leer(listhitos, Archivolectura);
        CsvHito.leerestadohitos(listestadohitos, Archivolecturaestados);
    }
    
    public void eliminarhitos(ArrayList<Hito> lista, ArrayList<Integer> nivelbuscado,ArrayList<EstadodeHito> listaestadohitos)
    {
          // Se crea la lista temporal y se limpia la lista de estados;
             
          // Para cada elemento de la lista se verifica que todos los valores de nivel inferiores e iguales al nivel buscado sean iguales;
        Integer j=0,p; 
        
        for( ; j<lista.size();j++)
          {
              p=0;
              for(int i=0;(lista.get(j).getNivel().size()>=nivelbuscado.size()) && i<nivelbuscado.size() && (nivelbuscado.get(i)==lista.get(j).getNivel().get(i));i++ ,p++)
                  ;
              
              if(p>=nivelbuscado.size())
              {
                  lista.remove(j);
                  listaestadohitos.remove(j);
              }
                  
                  
              
              
           }
            
          
                    
         
    }
}

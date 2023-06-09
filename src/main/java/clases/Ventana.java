/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clases;

import dev.fuxing.airtable.AirtableApi;
import dev.fuxing.airtable.AirtableTable;
import static dev.fuxing.airtable.formula.AirtableFormula.Object.field;
import static dev.fuxing.airtable.formula.AirtableFormula.Object.value;
import dev.fuxing.airtable.formula.LogicalOperator;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author javier
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaIds = new javax.swing.JList<>();
        txtRemoMail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaIdTarea = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTotalTasks = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        listPresentar = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        labelSemana = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jLRecuperar = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jLAsignar = new javax.swing.JList<>();
        txtMailrecuperacion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        listaIds.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaIds.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaIdsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaIds);

        jLabel1.setText("Mail de remotasks");

        txtEstado.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N

        jLabel2.setText("Estado");

        jLabel3.setText("Lista de Alumnos");

        listaIdTarea.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(listaIdTarea);

        jLabel4.setText("ID de tareas realizadas");

        jLabel5.setText("Total Tasks");

        jScrollPane3.setBackground(new java.awt.Color(153, 255, 255));
        jScrollPane3.setViewportBorder(javax.swing.BorderFactory.createTitledBorder(""));

        listPresentar.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listPresentar.setSelectionBackground(new java.awt.Color(255, 51, 51));
        jScrollPane3.setViewportView(listPresentar);
        listPresentar.getAccessibleContext().setAccessibleDescription("");

        jLabel6.setText("Lista para presentar");

        jButton1.setText("Borrar Atendido");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        labelSemana.setText("Semana 1");

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 3, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Remotasks Bootcamp Latinoamerica");

        jLabel8.setFont(new java.awt.Font("Abyssinica SIL", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 204));
        jLabel8.setText("Coach: Javier Garbalena");

        jLabel9.setBackground(new java.awt.Color(102, 255, 204));
        jLabel9.setFont(new java.awt.Font("Liberation Sans", 2, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("Proyecto:\"                                              \"");

        jLabel10.setText("Hora");

        jLRecuperar.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jLRecuperarValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(jLRecuperar);

        jLabel11.setText("Recuperar Tareas");

        jButton2.setText("Enviar al Lead");

        jScrollPane5.setViewportView(jLAsignar);

        jLabel12.setText("Mail de remotasks");

        jLabel13.setText("Asignar Tareas");

        jButton3.setText("Procesar");

        jLabel14.setText("Grafico");

        jCheckBox1.setText("Marcar como Atendida");

        jCheckBox2.setText("Marcar como pendiente");

        jButton4.setText("Largar Break");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jMenu1.setText("Configurar");

        jMenuItem1.setText("Horario Break");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Cierre Asistencia");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Nombre de Coach");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Nombre del Proyecto");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Nombre DB y KeyApi");
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel9))
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel8))))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel3)
                .addGap(119, 119, 119)
                .addComponent(jLabel1)
                .addGap(123, 123, 123)
                .addComponent(jLabel2)
                .addGap(89, 89, 89)
                .addComponent(jLabel14)
                .addGap(129, 129, 129)
                .addComponent(jLabel6))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton4)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRemoMail, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtTotalTasks, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSemana)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(180, 180, 180)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtMailrecuperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox1)))))
            .addGroup(layout.createSequentialGroup()
                .addGap(810, 810, 810)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(810, 810, 810)
                .addComponent(jLabel13))
            .addGroup(layout.createSequentialGroup()
                .addGap(810, 810, 810)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(530, 530, 530)
                .addComponent(jLabel10)
                .addGap(253, 253, 253)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel9))
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel8)))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel14)
                    .addComponent(jLabel6))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtRemoMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel4)
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel5)
                        .addGap(3, 3, 3)
                        .addComponent(txtTotalTasks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(labelSemana)
                        .addGap(3, 3, 3)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jButton1)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel11)
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jCheckBox2))
                            .addComponent(jCheckBox1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel12)))
                        .addGap(3, 3, 3)
                        .addComponent(txtMailrecuperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(jButton2)
                .addGap(7, 7, 7)
                .addComponent(jLabel13)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10))
                    .addComponent(jButton3)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaIdsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaIdsValueChanged

        //listaIds.getSelectedValues() agarra el que le marcamos
        String nombre = listaIds.getSelectedValue();
        
        for (int cont = 0; cont < list1.size(); cont++) {//pasa por todos los registros de la lista

            if (nombre.equals(list1.get(cont).getFieldString("Nombres"))) {
                txtRemoMail.setText(list1.get(cont).getFieldString("Mail de remotasks"));
                mailRemo = list1.get(cont).getFieldString("Mail de remotasks");
                txtEstado.setText(list1.get(cont).getFieldString("Estado"));
                if (txtEstado.getText().equals("Ongoing")) {
                    txtEstado.setBackground(Color.GREEN);
                    txtEstado.setForeground(Color.BLACK);
                } else {
                    txtEstado.setBackground(Color.RED);
                    txtEstado.setForeground(Color.YELLOW);
                }
            }
            
        }
        //Lista para mostrar las tareas que realizo desde la tabla RegCountAndTime
        AirtableTable.PaginationList listTarea = table2.list(querySpec -> {
            querySpec.view("GVRegistro");
            querySpec.filterByFormula(LogicalOperator.EQ, field("Mail de remotasks"), value(mailRemo));
        });
        
        listaIdTarea.setModel(modeloTareas);
        modeloTareas.clear();
        
        for (int cont = 0; cont < listTarea.size(); cont++) {//pasa por todos los registros de la lista

            modeloTareas.addElement(listTarea.get(cont).getFieldString("Id de tarea"));
            
        }
        txtTotalTasks.setText(Integer.toString(modeloTareas.size()));

    }//GEN-LAST:event_listaIdsValueChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            AirtableTable.PaginationList listTurno1 = tableTurno.list(querySpec -> {
                querySpec.view("GVTurno");
                querySpec.filterByFormula(LogicalOperator.EQ, field("Nombre"), value(listPresentar.getSelectedValue()));
            });
            tableTurno.delete(listTurno1.get(0).getId());
            AirtableTable tableTurno = api.base("approegtMPfRci1Nh").table("TurnoPresentar"); //otra tabla para usar en turnos
            listPresentar.setModel(modeloTurnos);
            for (int cont = 0; cont < listTurno.size(); cont++) {//pasa por todos los registros de la lista

                modeloTurnos.addElement(listTurno.get(cont).getFieldString("Nombre"));
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.AbrirBase();
        conf.leerPropiedades();
       
    }//GEN-LAST:event_formWindowOpened

    private void jLRecuperarValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jLRecuperarValueChanged
        //Recuperar Mail de trainee para recuperar la tarea
        String idTarea = jLRecuperar.getSelectedValue();
        System.out.println(idTarea);
        
        for (int cont = 0; cont < listRecuperar.size(); cont++) {//pasa por todos los registros de la lista

            //modeloRecuperar.addElement(listRecuperar.get(cont).getFieldString("ID de la tarea"));
            if (idTarea.equals(listRecuperar.get(cont).getFieldString("ID de la tarea"))) {
                txtMailrecuperacion.setText(listRecuperar.get(cont).getFieldString("Mail de remotasks"));
            }
            
        }

    }//GEN-LAST:event_jLRecuperarValueChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        VentBreak ventanabreak = new VentBreak();
        ventanabreak.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Ventana().setVisible(true);
        });
    }

    /**
     *
     */
    public void AbrirBase() {

        //JOptionPane.showInputDialog("Ingresa la Keyapi de Airtable");
        listaIds.setModel(modelo);
        timer.start();
        
        for (int cont = 0; cont < list1.size(); cont++) {//pasa por todos los registros de la lista

            modelo.addElement(list1.get(cont).getFieldString("Nombres"));
            
        }
        String ofset = list1.getOffset();

// siguiente paginacion
        list1 = table1.list(query -> {
            query.offset(ofset);
        });
        
    }
    String llaveApi = "Aqui va el keyApi";//Guardar la api
    AirtableApi api = new AirtableApi(llaveApi);

    /**
     *
     */
    public AirtableTable table1 = api.base("approegtMPfRci1Nh").table("Trainees"); //Abre un objeto tabla para usar en trainees

    /**
     *
     */
    public AirtableTable table2 = api.base("approegtMPfRci1Nh").table("RegCountAndTime"); //otra tabla para usar en tareas hechas

    /**
     *
     */
    public AirtableTable tableTurno = api.base("approegtMPfRci1Nh").table("TurnoPresentar"); //otra tabla para usar en recuperacion
    /**
     *
     */
    public AirtableTable tableRecuperar = api.base("approegtMPfRci1Nh").table("Recuperacion"); //otra tabla para usar en recuperacion
    /**
     *
     */
    ConfiguracionPrograma conf = new ConfiguracionPrograma();
    
    DefaultListModel<String> modelo = new DefaultListModel<>();
    DefaultListModel<String> modeloTareas = new DefaultListModel<>();
    DefaultListModel<String> modeloTurnos = new DefaultListModel<>();
    DefaultListModel<String> modeloRecuperar = new DefaultListModel<>();

    // listar los campos de la tabla trainees para tomar los datos principales
    AirtableTable.PaginationList list1 = table1.list(querySpec -> {
        querySpec.view("TablaTrainees");
        
    });
    // listar los campos de la tabla trainees para tomar los datos principales
    AirtableTable.PaginationList listTurno = tableTurno.list(querySpec -> {
        querySpec.view("GVTurno");
        
    });
    // listar los campos de la tabla trainees para tomar los datos principales
    AirtableTable.PaginationList listRecuperar = tableRecuperar.list(querySpec -> {
        querySpec.view("Recuperacion");
        
    });
    
    Timer timer = new Timer(6000, new ActionListener() {//Se dispara cada 3 minutos
        @Override
        public void actionPerformed(ActionEvent e) {
            // Codigo para abrir las solicitudes de presentacion de los trainees
            listTurno.clear(); // Limpiar la lista de turnos
            modeloTurnos.removeAllElements(); //limpiar el modelo que alimenta la lista
            AirtableTable.PaginationList listTurno = tableTurno.list(querySpec -> {
                querySpec.view("GVTurno");// Seleccionar un query para trabajar sobre la lista

            });
            listPresentar.setModel(modeloTurnos);//Asignar el modelo de la Jlist
            for (int cont = 0; cont < listTurno.size(); cont++) {//pasa por todos los registros de la lista y los agrega al modelo

                modeloTurnos.addElement(listTurno.get(cont).getFieldString("Nombre"));
                
            }
            //---------------------------------------------------------------------------------------------------------------------
            //Abrir la tabla de recuperaciones con filtro y mostrar solo los pendientes o sin recuperar
            //---------------------------------------------------------------------------------------------------------------------
            // listar los campos de la tabla Recuperar 
            listRecuperar.clear(); //limpiar la lista antes de volver a llenarla
            AirtableTable.PaginationList listRecuperar = tableRecuperar.list(querySpec -> {//Llena la lista con los pendientes
                querySpec.view("Recuperacion");
                querySpec.filterByFormula(LogicalOperator.NEQ, field("Select"), value("Atendida"));
                
            });
            
            modeloRecuperar.removeAllElements();
            jLRecuperar.setModel(modeloRecuperar);
            
            for (int cont = 0; cont < listRecuperar.size(); cont++) {//pasa por todos los registros de la lista

                modeloRecuperar.addElement(listRecuperar.get(cont).getFieldString("ID de la tarea"));
                
            }
            
        }
        
    });

    //Mis variables
    String mailRemo = "";
    //Fin de mis variables

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JList<String> jLAsignar;
    private javax.swing.JList<String> jLRecuperar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelSemana;
    private javax.swing.JList<String> listPresentar;
    private javax.swing.JList<String> listaIdTarea;
    private javax.swing.JList<String> listaIds;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtMailrecuperacion;
    private javax.swing.JTextField txtRemoMail;
    private javax.swing.JTextField txtTotalTasks;
    // End of variables declaration//GEN-END:variables
}

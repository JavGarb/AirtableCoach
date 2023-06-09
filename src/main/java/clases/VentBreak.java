/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author javier
 */
public class VentBreak extends javax.swing.JFrame {

    /**
     * Creates new form VentBreak
     */
    public VentBreak() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        timer.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLblCuenta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Break Activo");
        setBackground(new java.awt.Color(0, 153, 153));
        setIconImages(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLblCuenta.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLblCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblCuenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLblCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 820, 730, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon("/home/javier/NetBeansProjects/AirtableCoach/src/main/java/imagenes/image.png")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VentBreak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentBreak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentBreak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentBreak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentBreak().setVisible(true);
            }
        });
    }
    Timer timer = new Timer(1000, new ActionListener() {//Se dispara cada 1 minuto
        @Override
        public void actionPerformed(ActionEvent e) {
            // Codigo para abrir las solicitudes de presentacion de los trainees
            Segundos--;
            if (Segundos == 0) {
                Segundos = 60;
                Minutos--;
            }
            if (Minutos < 0) {
                JOptionPane.showMessageDialog(null, "El break Termino");
                timer.stop();
            } else {
                jLblCuenta.setText("Estamos en break,\n Finaliza en " + Minutos +"minutos" 
                        + ": y " + Segundos + "segundos");
            }
            
        }

    });
    //Declaracion de mis variables
    public int Segundos = 60;
    public int Minutos = 29;
    //Fin declaracion de mis variables

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLblCuenta;
    // End of variables declaration//GEN-END:variables
}

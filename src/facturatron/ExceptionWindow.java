/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ExceptionWindow.java
 *
 * Created on 6/12/2010, 07:45:29 AM
 */

package facturatron;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author mora
 */
public class ExceptionWindow extends javax.swing.JDialog {

    public ExceptionWindow(JFrame owner) {
        super(owner); 
        initComponents();
    }
    
    /** Creates new form ExceptionWindow */
    public ExceptionWindow() {
        initComponents();

    }

      
    public static void show(Throwable e) {
        ExceptionWindow ew = new ExceptionWindow();
        ew.getTxtExcepcion().setText(Misc.getStackTraceString(e));
        ew.setVisible(true);
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCerrar = new javax.swing.JButton();
        webTabbedPane1 = new com.alee.laf.tabbedpane.WebTabbedPane();
        webPanel1 = new com.alee.laf.panel.WebPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblTituloError = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        webPanel2 = new com.alee.laf.panel.WebPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtExcepcion = new javax.swing.JTextArea();
        webButton1 = new com.alee.laf.button.WebButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mensaje");
        setLocationByPlatform(true);

        btnCerrar.setText("Cerrar");
        btnCerrar.setFocusCycleRoot(true);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        webTabbedPane1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                webTabbedPane1PropertyChange(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("  i  ");
        webPanel1.add(jLabel1, java.awt.BorderLayout.LINE_START);

        jPanel1.setLayout(new java.awt.GridLayout(2, 0));

        lblTituloError.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTituloError.setText("Error Desconocido");
        lblTituloError.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(lblTituloError);

        lblDescripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDescripcion.setText("Sin detalles");
        lblDescripcion.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(lblDescripcion);

        webPanel1.add(jPanel1, java.awt.BorderLayout.CENTER);

        webTabbedPane1.addTab("Mensaje", webPanel1);

        txtExcepcion.setColumns(20);
        txtExcepcion.setRows(5);
        txtExcepcion.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtExcepcionPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(txtExcepcion);

        webPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        webTabbedPane1.addTab("Detalles", webPanel2);

        webButton1.setText("Copiar");
        webButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                webButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(webTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(webButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(webTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrar)
                    .addComponent(webButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void webTabbedPane1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_webTabbedPane1PropertyChange

    }//GEN-LAST:event_webTabbedPane1PropertyChange

    private void txtExcepcionPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtExcepcionPropertyChange
        
    }//GEN-LAST:event_txtExcepcionPropertyChange

    private void webButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_webButton1ActionPerformed
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        clip.setContents(new Transferable() {

            @Override
            public DataFlavor[] getTransferDataFlavors() {
                return new DataFlavor[] { DataFlavor.stringFlavor };
            }

            @Override
            public boolean isDataFlavorSupported(DataFlavor flavor) {
                return flavor.match(DataFlavor.stringFlavor);
            }

            @Override
            public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {
                return txtExcepcion.getText();
            }
        }, null);
    }//GEN-LAST:event_webButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExceptionWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblTituloError;
    private javax.swing.JTextArea txtExcepcion;
    private com.alee.laf.button.WebButton webButton1;
    private com.alee.laf.panel.WebPanel webPanel1;
    private com.alee.laf.panel.WebPanel webPanel2;
    private com.alee.laf.tabbedpane.WebTabbedPane webTabbedPane1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the btnCerrar
     */
    public javax.swing.JButton getBtnCerrar() {
        return btnCerrar;
    }

    /**
     * @param btnCerrar the btnCerrar to set
     */
    public void setBtnCerrar(javax.swing.JButton btnCerrar) {
        this.btnCerrar = btnCerrar;
    }

    /**
     * @return the txtExcepcion
     */
    public javax.swing.JTextArea getTxtExcepcion() {
        return txtExcepcion;
    }

    /**
     * @param txtExcepcion the txtExcepcion to set
     */
    public void setTxtExcepcion(javax.swing.JTextArea txtExcepcion) {
        this.txtExcepcion = txtExcepcion;
    }

    /**
     * @return the lblTituloError
     */
    public javax.swing.JLabel getLblTituloError() {
        return lblTituloError;
    }
    
    public void setLblDescripcion(String txt) {
        this.lblDescripcion.setText(txt);
    }

}

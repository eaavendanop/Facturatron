/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FacturaForm.java
 *
 * Created on 27/07/2010, 12:23:19 PM
 */

package facturatron.facturacion;

import java.util.Observable;
import java.util.Observer;
import org.jdesktop.swingx.JXTable;

/**
 *
 * @author saul
 */
public class FacturaForm extends javax.swing.JPanel implements Observer {

    private FacturaDao modelo;

    @Override
    public void update(Observable o, Object arg) {
        this.getTxtSerie().setText(getModelo().getSerie());
        this.getTxtFolio().setText(String.format("%d", getModelo().getFolio()));
        this.getTxtFormaDePago().setText(getModelo().getFormaDePago());
        
        this.getTxtNombre().setText(String.valueOf(getModelo().getReceptor().getNombre()));
        this.getTxtRfc().setText(String.valueOf(getModelo().getReceptor().getRfc()));
        this.getTxtDireccion().setText(getModelo().getReceptor().getCalle() +
                " # " + getModelo().getReceptor().getNoExterior() +
                "\r\n" + getModelo().getReceptor().getColonia() +
                "\r\n" + getModelo().getReceptor().getMunicipio() +
                ", " + getModelo().getReceptor().getEstado() +
                "\r\nCP " + getModelo().getReceptor().getCodigoPostal());

        String subtotal = String.format("%,.2f", getModelo().getSubtotal());
        this.getTxtSubtotal().setText(subtotal);
        String iva = String.format("%,.2f", getModelo().getIvaTrasladado());
        this.getTxtIva().setText(iva);
        String total = String.format("%,.2f", getModelo().getTotal());
        this.getTxtTotal().setText(total);
    }

    /** Creates new form FacturaForm */
    public FacturaForm() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXTitledPanel3 = new org.jdesktop.swingx.JXTitledPanel();
        btnGuardar = new javax.swing.JButton();
        btnObservaciones = new org.jdesktop.swingx.JXButton();
        btnTicket = new javax.swing.JButton();
        jXTitledPanel2 = new org.jdesktop.swingx.JXTitledPanel();
        jLabel9 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JFormattedTextField();
        btnBuscarCliente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtRfc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtFolio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSerie = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtFormaDePago = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        txtMetodoPago = new javax.swing.JTextField();
        jXTitledPanel1 = new org.jdesktop.swingx.JXTitledPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtIva = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDescuentoTasa0 = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        txtMotivoDescuento = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabConceptos = new org.jdesktop.swingx.JXTable();
        jLabel12 = new javax.swing.JLabel();
        txtDescuentoTasa16 = new javax.swing.JFormattedTextField();

        setPreferredSize(new java.awt.Dimension(640, 480));

        jXTitledPanel3.setTitle("Acciones");

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 14));
        btnGuardar.setText("Guardar factura");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnObservaciones.setText("Ver/Editar Observaciones");
        btnObservaciones.setFont(new java.awt.Font("Tahoma", 0, 14));

        btnTicket.setText("Añadir ticket");

        javax.swing.GroupLayout jXTitledPanel3Layout = new javax.swing.GroupLayout(jXTitledPanel3.getContentContainer());
        jXTitledPanel3.getContentContainer().setLayout(jXTitledPanel3Layout);
        jXTitledPanel3Layout.setHorizontalGroup(
            jXTitledPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXTitledPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTicket)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jXTitledPanel3Layout.setVerticalGroup(
            jXTitledPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXTitledPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXTitledPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTicket))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jXTitledPanel2.setTitle("Datos Fiscales");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel9.setText("Id Cliente:");

        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel3.setText("RFC:");
        jLabel3.setPreferredSize(new java.awt.Dimension(64, 14));

        txtRfc.setEditable(false);
        txtRfc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRfcActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel2.setText("Dirección:");
        jLabel2.setMaximumSize(new java.awt.Dimension(64, 14));
        jLabel2.setMinimumSize(new java.awt.Dimension(64, 14));
        jLabel2.setPreferredSize(new java.awt.Dimension(64, 14));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel1.setText("Razón Social:");

        txtNombre.setEditable(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel10.setText("Folio:");

        txtFolio.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel4.setText("Serie:");

        txtSerie.setEditable(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel11.setText("Tipo:");

        txtFormaDePago.setEditable(false);

        txtDireccion.setColumns(20);
        txtDireccion.setRows(5);
        jScrollPane2.setViewportView(txtDireccion);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Factura" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel14.setText("Método de pago:");

        txtMetodoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMetodoPagoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jXTitledPanel2Layout = new javax.swing.GroupLayout(jXTitledPanel2.getContentContainer());
        jXTitledPanel2.getContentContainer().setLayout(jXTitledPanel2Layout);
        jXTitledPanel2Layout.setHorizontalGroup(
            jXTitledPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXTitledPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXTitledPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jXTitledPanel2Layout.createSequentialGroup()
                        .addGroup(jXTitledPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jXTitledPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                            .addGroup(jXTitledPanel2Layout.createSequentialGroup()
                                .addGroup(jXTitledPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jXTitledPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRfc, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))))
                        .addGap(10, 10, 10)
                        .addGroup(jXTitledPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFormaDePago, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addGroup(jXTitledPanel2Layout.createSequentialGroup()
                                .addGroup(jXTitledPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jXTitledPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXTitledPanel2Layout.createSequentialGroup()
                                        .addComponent(txtIdCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscarCliente))
                                    .addComponent(txtSerie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, 0, 109, Short.MAX_VALUE)
                                    .addComponent(txtFolio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)))))
                    .addGroup(jXTitledPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMetodoPago, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jXTitledPanel2Layout.setVerticalGroup(
            jXTitledPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXTitledPanel2Layout.createSequentialGroup()
                .addGroup(jXTitledPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jXTitledPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtRfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscarCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jXTitledPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, 0, 0, Short.MAX_VALUE)
                    .addGroup(jXTitledPanel2Layout.createSequentialGroup()
                        .addGroup(jXTitledPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFolio, 0, 0, Short.MAX_VALUE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jXTitledPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jXTitledPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jXTitledPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFormaDePago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jXTitledPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtMetodoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jXTitledPanel1.setTitle("Conceptos");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel5.setText("Motivo Descuento:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Total:");

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Tahoma", 0, 18));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("IVA (16%):");

        txtIva.setEditable(false);
        txtIva.setFont(new java.awt.Font("Tahoma", 0, 18));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Descuento Tasa 0:");

        txtDescuentoTasa0.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtDescuentoTasa0.setFont(new java.awt.Font("Tahoma", 0, 18));
        txtDescuentoTasa0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescuentoTasa0ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Subtotal:");

        txtSubtotal.setEditable(false);
        txtSubtotal.setFont(new java.awt.Font("Tahoma", 0, 18));

        tabConceptos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabConceptos);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Descuento Tasa 16:");

        txtDescuentoTasa16.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtDescuentoTasa16.setFont(new java.awt.Font("Tahoma", 0, 18));
        txtDescuentoTasa16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescuentoTasa16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jXTitledPanel1Layout = new javax.swing.GroupLayout(jXTitledPanel1.getContentContainer());
        jXTitledPanel1.getContentContainer().setLayout(jXTitledPanel1Layout);
        jXTitledPanel1Layout.setHorizontalGroup(
            jXTitledPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXTitledPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jXTitledPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                    .addGroup(jXTitledPanel1Layout.createSequentialGroup()
                        .addGroup(jXTitledPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jXTitledPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescuentoTasa0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(txtDescuentoTasa16, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(txtMotivoDescuento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                        .addGroup(jXTitledPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jXTitledPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(txtIva, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(txtSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jXTitledPanel1Layout.setVerticalGroup(
            jXTitledPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXTitledPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jXTitledPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMotivoDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jXTitledPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtDescuentoTasa0, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jXTitledPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jXTitledPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jXTitledPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addGroup(jXTitledPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jXTitledPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtDescuentoTasa16, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jXTitledPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jXTitledPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jXTitledPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jXTitledPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXTitledPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXTitledPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtRfcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRfcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRfcActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void txtDescuentoTasa0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescuentoTasa0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescuentoTasa0ActionPerformed

    private void txtDescuentoTasa16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescuentoTasa16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescuentoTasa16ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void txtMetodoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMetodoPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMetodoPagoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnGuardar;
    private org.jdesktop.swingx.JXButton btnObservaciones;
    private javax.swing.JButton btnTicket;
    private javax.swing.JComboBox jComboBox1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private org.jdesktop.swingx.JXTitledPanel jXTitledPanel1;
    private org.jdesktop.swingx.JXTitledPanel jXTitledPanel2;
    private org.jdesktop.swingx.JXTitledPanel jXTitledPanel3;
    private org.jdesktop.swingx.JXTable tabConceptos;
    private javax.swing.JFormattedTextField txtDescuentoTasa0;
    private javax.swing.JFormattedTextField txtDescuentoTasa16;
    private javax.swing.JTextArea txtDireccion;
    private javax.swing.JTextField txtFolio;
    private javax.swing.JTextField txtFormaDePago;
    private javax.swing.JFormattedTextField txtIdCliente;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtMetodoPago;
    private javax.swing.JFormattedTextField txtMotivoDescuento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRfc;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables




    /**
     * @return the guarda
     */
    public javax.swing.JButton getBtnGuardar() {
        return btnGuardar;
    }

    /**
     * @param guarda the guarda to set
     */
    public void setBtnGuardar(javax.swing.JButton btnGuardar) {
        this.btnGuardar = btnGuardar;
    }

    /**
     * @return the tabConceptos
     */
    public javax.swing.JTable getTabConceptos() {
        return tabConceptos;
    }

    /**
     * @param tabConceptos the tabConceptos to set
     */
    public void setTabConceptos(javax.swing.JTable tabConceptos) {
        this.tabConceptos = (JXTable) tabConceptos;
    }

    /**
     * @return the txtDescuento
     */
    public javax.swing.JFormattedTextField getTxtDescuentoTasa0() {
        return txtDescuentoTasa0;
    }

    /**
     * @param txtDescuento the txtDescuento to set
     */
    public void setTxtDescuentoTasa0(javax.swing.JFormattedTextField txtDescuentoTasa0) {
        this.txtDescuentoTasa0 = txtDescuentoTasa0;
    }
    /**
     * @return the txtDescuento
     */
    public javax.swing.JFormattedTextField getTxtDescuentoTasa16() {
        return txtDescuentoTasa16;
    }

    /**
     * @param txtDescuento the txtDescuento to set
     */
    public void setTxtDescuentoTasa16(javax.swing.JFormattedTextField txtDescuentoTasa16) {
        this.txtDescuentoTasa16 = txtDescuentoTasa16;
    }

    /**
     * @return the txtDireccion
     */
    public javax.swing.JTextArea getTxtDireccion() {
        return txtDireccion;
    }

    /**
     * @param txtDireccion the txtDireccion to set
     */
    public void setTxtDireccion(javax.swing.JTextArea txtDireccion) {
        this.txtDireccion = txtDireccion;
    }

    /**
     * @return the txtFolio
     */
    public javax.swing.JTextField getTxtFolio() {
        return txtFolio;
    }

    /**
     * @param txtFolio the txtFolio to set
     */
    public void setTxtFolio(javax.swing.JTextField txtFolio) {
        this.txtFolio = txtFolio;
    }

    /**
     * @return the txtFormaDePago
     */
    public javax.swing.JTextField getTxtFormaDePago() {
        return txtFormaDePago;
    }

    /**
     * @param txtFormaDePago the txtFormaDePago to set
     */
    public void setTxtFormaDePago(javax.swing.JTextField txtFormaDePago) {
        this.txtFormaDePago = txtFormaDePago;
    }

    /**
     * @return the txtIdCliente
     */
    public javax.swing.JTextField getTxtIdCliente() {
        return txtIdCliente;
    }

    /**
     * @param txtIdCliente the txtIdCliente to set
     */
    public void setTxtIdCliente(javax.swing.JFormattedTextField txtIdCliente) {
        this.txtIdCliente = txtIdCliente;
    }

    /**
     * @return the txtIva
     */
    public javax.swing.JTextField getTxtIva() {
        return txtIva;
    }

    /**
     * @param txtIva the txtIva to set
     */
    public void setTxtIva(javax.swing.JTextField txtIva) {
        this.txtIva = txtIva;
    }

    /**
     * @return the txtMotivoDescuento
     */
    public javax.swing.JTextField getTxtMotivoDescuento() {
        return txtMotivoDescuento;
    }

    /**
     * @param txtMotivoDescuento the txtMotivoDescuento to set
     */
    public void setTxtMotivoDescuento(javax.swing.JFormattedTextField txtMotivoDescuento) {
        this.txtMotivoDescuento = txtMotivoDescuento;
    }

    /**
     * @return the txtNombre
     */
    public javax.swing.JTextField getTxtNombre() {
        return txtNombre;
    }

    /**
     * @param txtNombre the txtNombre to set
     */
    public void setTxtNombre(javax.swing.JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    /**
     * @return the txtRfc
     */
    public javax.swing.JTextField getTxtRfc() {
        return txtRfc;
    }

    /**
     * @param txtRfc the txtRfc to set
     */
    public void setTxtRfc(javax.swing.JTextField txtRfc) {
        this.txtRfc = txtRfc;
    }

    /**
     * @return the txtSerie
     */
    public javax.swing.JTextField getTxtSerie() {
        return txtSerie;
    }

    /**
     * @param txtSerie the txtSerie to set
     */
    public void setTxtSerie(javax.swing.JTextField txtSerie) {
        this.txtSerie = txtSerie;
    }

    /**
     * @return the txtSubtotal
     */
    public javax.swing.JTextField getTxtSubtotal() {
        return txtSubtotal;
    }

    /**
     * @param txtSubtotal the txtSubtotal to set
     */
    public void setTxtSubtotal(javax.swing.JTextField txtSubtotal) {
        this.txtSubtotal = txtSubtotal;
    }

    /**
     * @return the txtTotal
     */
    public javax.swing.JTextField getTxtTotal() {
        return txtTotal;
    }

    /**
     * @param txtTotal the txtTotal to set
     */
    public void setTxtTotal(javax.swing.JTextField txtTotal) {
        this.txtTotal = txtTotal;
    }

    /**
     * @return the modelo
     */
    public FacturaDao getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(FacturaDao modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the btnBuscarCliente
     */
    public javax.swing.JButton getBtnBuscarCliente() {
        return btnBuscarCliente;
    }

    /**
     * @param btnBuscarCliente the btnBuscarCliente to set
     */
    public void setBtnBuscarCliente(javax.swing.JButton btnBuscarCliente) {
        this.btnBuscarCliente = btnBuscarCliente;
    }

    /**
     * @return the btnObservaciones
     */
    public org.jdesktop.swingx.JXButton getBtnObservaciones() {
        return btnObservaciones;
    }

    /**
     * @return the btnTicket
     */
    public javax.swing.JButton getBtnTicket() {
        return btnTicket;
    }

    /**
     * @param btnTicket the btnTicket to set
     */
    public void setBtnTicket(javax.swing.JButton btnTicket) {
        this.btnTicket = btnTicket;
    }

}

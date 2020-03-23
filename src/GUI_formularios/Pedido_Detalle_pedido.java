package GUI_formularios;

import Mensajes.ErrorAlert1;
import Mensajes.SuccessAlert;
import Mensajes.SuccessAlert1;
import Mensajes.WarningAlertCerrar;
import conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Pedido_Detalle_pedido extends javax.swing.JInternalFrame {

    menuPrincipal mp = new menuPrincipal();
    int cantidadpedido = 0;

    public Pedido_Detalle_pedido() {

        initComponents();
        subtotal_detalle.setEnabled(false);

        try {
            Conexion con = new Conexion();

            con.ConexionPostgres();

            ResultSet rs = con.consultar("SELECT * FROM categoria_familia ORDER BY id_categoria");

            id_categoria.removeAllItems();
            id_categoria.addItem("Seleccione");
            while (rs.next()) {
                id_categoria.addItem(rs.getString(1) + " - " + rs.getString(2));
            }

            ResultSet rs2 = con.consultar("SELECT * FROM empleado ORDER BY cedula_empleado");

            cedula_empleado.removeAllItems();
            cedula_empleado.addItem("Seleccione");
            while (rs2.next()) {
                cedula_empleado.addItem(rs2.getString(1) + " - " + rs2.getString(2));
            }

            ResultSet rs3 = con.consultar("SELECT * FROM pedido ORDER BY id_pedido");

            String codigopedido = "";
            int codigoanterior = 0, codepedi = 0;
            while (rs3.next()) {
                codigopedido = rs3.getString(1);
                if (Integer.parseInt(codigopedido) > codigoanterior) {
                    codepedi = Integer.parseInt(codigopedido);
                } else {
                    codepedi = codigoanterior;
                }
                codigoanterior = Integer.parseInt(codigopedido);
            }

            id_pedido.setText(codepedi + 1 + "");
            id_pedido.setEnabled(false);

        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Pedido_Detalle_pedido.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        subtotal_detalle = new javax.swing.JTextField();
        cantidad_detalle = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        agregar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        id_producto = new javax.swing.JComboBox<>();
        id_categoria = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cedula_cliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nombre_cliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        apellido_cliente = new javax.swing.JTextField();
        id_pedido = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        agregar1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        cedula_empleado = new javax.swing.JComboBox<>();
        fecha_pedido = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        agregar2 = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setIconifiable(true);
        setMaximizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestionar pedido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Subtotal:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 50, -1));

        subtotal_detalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtotal_detalleActionPerformed(evt);
            }
        });
        jPanel1.add(subtotal_detalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 110, -1));

        cantidad_detalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidad_detalleActionPerformed(evt);
            }
        });
        jPanel1.add(cantidad_detalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 70, -1));

        jLabel7.setText("Cantidad:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, -1, -1));

        agregar.setBackground(new java.awt.Color(255, 255, 255));
        agregar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        agregar.setForeground(new java.awt.Color(0, 0, 0));
        agregar.setText("Registrar pedido");
        agregar.setToolTipText("Agregar");
        agregar.setBorder(null);
        agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                agregarMouseMoved(evt);
            }
        });
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        jPanel1.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 160, 20));

        jLabel9.setText("Productos:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 60, -1));

        jLabel10.setText("Categoría:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        id_producto.setPreferredSize(new java.awt.Dimension(4, 19));
        id_producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id_productoMouseClicked(evt);
            }
        });
        id_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_productoActionPerformed(evt);
            }
        });
        jPanel1.add(id_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 320, -1));

        id_categoria.setPreferredSize(new java.awt.Dimension(4, 19));
        id_categoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id_categoriaMouseClicked(evt);
            }
        });
        id_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_categoriaActionPerformed(evt);
            }
        });
        jPanel1.add(id_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 120, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11))); // NOI18N

        jLabel2.setText("Cédula:");

        cedula_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedula_clienteActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre:");

        nombre_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_clienteActionPerformed(evt);
            }
        });

        jLabel4.setText("Apellido:");

        apellido_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellido_clienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addComponent(cedula_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(10, 10, 10)
                .addComponent(nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(apellido_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apellido_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(jLabel2)
                    .addComponent(cedula_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 620, 60));

        id_pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_pedidoActionPerformed(evt);
            }
        });
        jPanel1.add(id_pedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 100, -1));

        jLabel11.setText("Pedido N°:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 80, -1));

        agregar1.setBackground(new java.awt.Color(255, 255, 255));
        agregar1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        agregar1.setForeground(new java.awt.Color(0, 0, 0));
        agregar1.setText("Agregar al pedido");
        agregar1.setToolTipText("Agregar");
        agregar1.setBorder(null);
        agregar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregar1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                agregar1MouseMoved(evt);
            }
        });
        agregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar1ActionPerformed(evt);
            }
        });
        jPanel1.add(agregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 160, 20));

        jLabel12.setText("Empleado:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 60, -1));

        cedula_empleado.setPreferredSize(new java.awt.Dimension(4, 19));
        cedula_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedula_empleadoActionPerformed(evt);
            }
        });
        jPanel1.add(cedula_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 320, -1));
        jPanel1.add(fecha_pedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 160, -1));

        jLabel8.setText("Fecha del pedido:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 90, -1));

        agregar2.setBackground(new java.awt.Color(255, 255, 255));
        agregar2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        agregar2.setForeground(new java.awt.Color(0, 0, 0));
        agregar2.setText("Calcular");
        agregar2.setToolTipText("Agregar");
        agregar2.setBorder(null);
        agregar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregar2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                agregar2MouseMoved(evt);
            }
        });
        agregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar2ActionPerformed(evt);
            }
        });
        jPanel1.add(agregar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 160, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cedula_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedula_clienteActionPerformed

    }//GEN-LAST:event_cedula_clienteActionPerformed

    private void subtotal_detalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtotal_detalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subtotal_detalleActionPerformed

    private void cantidad_detalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidad_detalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidad_detalleActionPerformed

    private void agregarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMouseMoved

    }//GEN-LAST:event_agregarMouseMoved
    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed

        //agregardetallealpedido();
        try {
            Conexion con = new Conexion();
            con.ConexionPostgres();

            StringTokenizer st = new StringTokenizer(cedula_empleado.getSelectedItem().toString() + " - ");
            String cedulaempleado = st.nextToken();

            con.actualizar("INSERT INTO pedido VALUES ('" + Integer.parseInt(id_pedido.getText()) + "', '"
                    + fecha_pedido.getDate() + "', '" + cedula_cliente.getText() + "', '" + cantidadpedido + "', '" + cedulaempleado + "')");

            SuccessAlert sa = new SuccessAlert(mp, true);
            sa.titulo.setText("PEDIDO REGISTRADO!");
            sa.titulo.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
            sa.titulo.setForeground(new java.awt.Color(153, 153, 153));
            sa.setVisible(true);

            this.setVisible(false);

        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Pedido_Detalle_pedido.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_agregarActionPerformed

    private void id_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_productoActionPerformed

    }//GEN-LAST:event_id_productoActionPerformed

    private void nombre_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_clienteActionPerformed

    private void apellido_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellido_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellido_clienteActionPerformed

    private void id_pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_pedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_pedidoActionPerformed

    private void agregar1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregar1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_agregar1MouseMoved

    private void agregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar1ActionPerformed

        try {
            Conexion con = new Conexion();
            con.ConexionPostgres();

            StringTokenizer st = new StringTokenizer(id_producto.getSelectedItem().toString() + " - ");
            String codigopro = st.nextToken();

            ResultSet rs = con.consultar("SELECT * FROM producto WHERE id_producto = '" + codigopro + "'");
            String valor_producto = "";

            while (rs.next()) {
                valor_producto = rs.getString(3);
            }

            int subtotal = Integer.parseInt(cantidad_detalle.getText().trim()) * Integer.parseInt(valor_producto);
            subtotal_detalle.setText(subtotal + "");

            con.actualizar("INSERT INTO detallee VALUES ('" + id_pedido.getText() + "', '" + codigopro + "', '" + cantidad_detalle.getText() + "', '" + subtotal + "')");
            cantidadpedido += subtotal;

            ResultSet rs1 = con.consultar("SELECT existencia_producto FROM producto WHERE id_producto = '" + codigopro + "'");
            int existencia = 0;

            while (rs1.next()) {
                existencia = rs1.getInt(1);
            }

            con.actualizar("UPDATE producto SET existencia_producto = '" + (existencia - Integer.parseInt(cantidad_detalle.getText().trim())) + "' "
                    + "WHERE id_producto = '" + codigopro + "'");

            ErrorAlert1 sa = new ErrorAlert1(mp, true);
            sa.t1.setText("¡SE HA AGREGADO EL PRODUCTO");
            sa.t2.setText("AL PEDIDO!");
            sa.t1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            sa.t2.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
            sa.t1.setForeground(new java.awt.Color(153, 153, 153));
            sa.t2.setForeground(new java.awt.Color(153, 153, 153));
            sa.setVisible(true);

            fecha_pedido.setEnabled(false);

        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Pedido_Detalle_pedido.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_agregar1ActionPerformed

    private void cedula_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedula_empleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedula_empleadoActionPerformed

    private void id_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_categoriaActionPerformed

        if (id_categoria.getSelectedIndex() != 0) {
            try {
                Conexion con = new Conexion();

                con.ConexionPostgres();

                StringTokenizer st = new StringTokenizer(id_categoria.getSelectedItem().toString() + " - ");
                String codigo = st.nextToken();

                ResultSet rs = con.consultar("SELECT * FROM producto WHERE idcategoria_producto = '" + codigo + "' ORDER BY id_producto");

                id_producto.removeAllItems();
                id_producto.addItem("Seleccione");
                while (rs.next()) {
                    id_producto.addItem(rs.getString(1) + " - " + rs.getString(2));
                }
            } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(Pedido_Detalle_pedido.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_id_categoriaActionPerformed

    private void id_categoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_categoriaMouseClicked

    }//GEN-LAST:event_id_categoriaMouseClicked

    private void id_productoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_productoMouseClicked

//        if (id_categoria.getSelectedIndex() != 0) {
//            try {
//                Conexion con = new Conexion();
//
//                con.ConexionPostgres();
//
//                StringTokenizer st = new StringTokenizer(id_categoria.getSelectedItem().toString() + " - ");
//                String codigo = st.nextToken();
//
//                ResultSet rs = con.consultar("SELECT * FROM producto WHERE idcategoria_producto = '" + codigo + "' ORDER BY id_producto");
//
//                id_producto.removeAllItems();
//                id_producto.addItem("Seleccione");
//                while (rs.next()) {
//                    id_producto.addItem(rs.getString(1) + " - " + rs.getString(2));
//                }
//            } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
//                Logger.getLogger(Pedido_Detalle_pedido.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "Por favor, seleccione la categoria del producto"
//                    + "\npara poder ver los productos");
//        }

    }//GEN-LAST:event_id_productoMouseClicked

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing

    }//GEN-LAST:event_formInternalFrameClosing

    private void agregar2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregar2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_agregar2MouseMoved

    private void agregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar2ActionPerformed
        this.show(false);
    }//GEN-LAST:event_agregar2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton agregar1;
    private javax.swing.JButton agregar2;
    public javax.swing.JTextField apellido_cliente;
    public javax.swing.JTextField cantidad_detalle;
    public javax.swing.JTextField cedula_cliente;
    public javax.swing.JComboBox<String> cedula_empleado;
    private com.toedter.calendar.JDateChooser fecha_pedido;
    public javax.swing.JComboBox<String> id_categoria;
    public javax.swing.JTextField id_pedido;
    public javax.swing.JComboBox<String> id_producto;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField nombre_cliente;
    public javax.swing.JTextField subtotal_detalle;
    // End of variables declaration//GEN-END:variables
}

package GUI_formularios;

import Mensajes.ErrorAlert;
import Mensajes.ErrorAlert11;
import Mensajes.SuccessAlert;
import Mensajes.WarningAlertCerrar;
import conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Empleado extends javax.swing.JInternalFrame {

    menuPrincipal mp = new menuPrincipal();

    public Empleado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombre_empleado = new javax.swing.JTextField();
        cedula_empleado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        apellido_empleado = new javax.swing.JTextField();
        direccion_empleado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        telefono_empleado = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        listar = new javax.swing.JButton();
        buscar2 = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        email_empleado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        fechaingreso_empleado = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos - empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Cedula:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 40, 60, -1));

        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 70, 40, -1));

        nombre_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_empleadoActionPerformed(evt);
            }
        });
        jPanel1.add(nombre_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 170, -1));

        cedula_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedula_empleadoActionPerformed(evt);
            }
        });
        cedula_empleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedula_empleadoKeyTyped(evt);
            }
        });
        jPanel1.add(cedula_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 173, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon1.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 38, 100, 180));

        jLabel6.setText("Apellido:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 100, 50, -1));

        apellido_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellido_empleadoActionPerformed(evt);
            }
        });
        jPanel1.add(apellido_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 170, -1));

        direccion_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccion_empleadoActionPerformed(evt);
            }
        });
        jPanel1.add(direccion_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 170, -1));

        jLabel7.setText("Dirección:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 130, 50, -1));

        jLabel8.setText("Fecha de ingreso:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 220, 90, -1));

        telefono_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefono_empleadoActionPerformed(evt);
            }
        });
        telefono_empleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefono_empleadoKeyTyped(evt);
            }
        });
        jPanel1.add(telefono_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 170, -1));

        agregar.setBackground(new java.awt.Color(255, 255, 255));
        agregar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        agregar.setForeground(new java.awt.Color(0, 0, 0));
        agregar.setText("Registrar");
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
        jPanel1.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 80, 20));

        listar.setBackground(new java.awt.Color(255, 255, 255));
        listar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        listar.setForeground(new java.awt.Color(0, 0, 0));
        listar.setText("Listar");
        listar.setToolTipText("Listar");
        listar.setBorder(null);
        listar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarActionPerformed(evt);
            }
        });
        jPanel1.add(listar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 80, 20));

        buscar2.setBackground(new java.awt.Color(255, 255, 255));
        buscar2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        buscar2.setForeground(new java.awt.Color(0, 0, 0));
        buscar2.setText("Buscar");
        buscar2.setToolTipText("Buscar");
        buscar2.setBorder(null);
        buscar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar2ActionPerformed(evt);
            }
        });
        jPanel1.add(buscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 80, 20));

        modificar.setBackground(new java.awt.Color(255, 255, 255));
        modificar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        modificar.setForeground(new java.awt.Color(0, 0, 0));
        modificar.setText("Modificar");
        modificar.setToolTipText("Modificar");
        modificar.setBorder(null);
        modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        jPanel1.add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 90, 20));

        limpiar.setBackground(new java.awt.Color(255, 255, 255));
        limpiar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        limpiar.setForeground(new java.awt.Color(0, 0, 0));
        limpiar.setText("limpiar");
        limpiar.setToolTipText("Buscar");
        limpiar.setBorder(null);
        limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        jPanel1.add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 80, 20));

        email_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_empleadoActionPerformed(evt);
            }
        });
        jPanel1.add(email_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 170, -1));

        jLabel9.setText("Email:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 30, -1));
        jPanel1.add(fechaingreso_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 170, -1));

        jLabel10.setText("Telefono:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombre_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_empleadoActionPerformed

    }//GEN-LAST:event_nombre_empleadoActionPerformed

    private void cedula_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedula_empleadoActionPerformed

    }//GEN-LAST:event_cedula_empleadoActionPerformed

    private void cedula_empleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedula_empleadoKeyTyped

    }//GEN-LAST:event_cedula_empleadoKeyTyped

    private void apellido_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellido_empleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellido_empleadoActionPerformed

    private void direccion_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccion_empleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccion_empleadoActionPerformed

    private void telefono_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefono_empleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefono_empleadoActionPerformed

    private void telefono_empleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefono_empleadoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_telefono_empleadoKeyTyped

    private void agregarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMouseMoved

    }//GEN-LAST:event_agregarMouseMoved
    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed

        if (cedula_empleado.getText().isEmpty()) {
            ErrorAlert ea = new ErrorAlert(mp, true);
            ea.titulo1.setText("POR FAVOR, DIGITE LA CEDULA!");
            ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
            ea.setVisible(true);

            modificar.setEnabled(false);
            cedula_empleado.setEnabled(true);

        } else if (nombre_empleado.getText().isEmpty()) {
            ErrorAlert ea = new ErrorAlert(mp, true);
            ea.titulo1.setText("POR FAVOR, DIGITE EL NOMBRE!");
            ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
            ea.setVisible(true);

            modificar.setEnabled(false);
            cedula_empleado.setEnabled(true);
        } else if (apellido_empleado.getText().isEmpty()) {
            ErrorAlert ea = new ErrorAlert(mp, true);
            ea.titulo1.setText("POR FAVOR, DIGITE EL APELLIDO!");
            ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
            ea.setVisible(true);

            modificar.setEnabled(false);
            cedula_empleado.setEnabled(true);
        } else if (direccion_empleado.getText().isEmpty()) {
            ErrorAlert ea = new ErrorAlert(mp, true);
            ea.titulo1.setText("POR FAVOR, DIGITE LA DIRECCIÓN!");
            ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
            ea.setVisible(true);

            modificar.setEnabled(false);
            cedula_empleado.setEnabled(true);
        } else if (email_empleado.getText().isEmpty()) {
            ErrorAlert ea = new ErrorAlert(mp, true);
            ea.titulo1.setText("POR FAVOR, DIGITE EL EMAIL!");
            ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
            ea.setVisible(true);

            modificar.setEnabled(false);
            cedula_empleado.setEnabled(true);
        } else if (telefono_empleado.getText().isEmpty()) {
            ErrorAlert ea = new ErrorAlert(mp, true);
            ea.titulo1.setText("POR FAVOR, DIGITE EL TELÉFONO!");
            ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
            ea.setVisible(true);

            modificar.setEnabled(false);
            cedula_empleado.setEnabled(true);
        } else if (fechaingreso_empleado.getDate() == null) {
            ErrorAlert ea = new ErrorAlert(mp, true);
            ea.titulo1.setText("POR FAVOR, SELECCIONE LA FECHA DE INGRESO!");
            ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
            ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
            ea.setVisible(true);

            modificar.setEnabled(false);
            cedula_empleado.setEnabled(true);
        } else {

            //            area = new Area(Integer.parseInt(id.getText().trim()), nombre.getText().trim(), desc.getText().trim());
            //                LogIn.areas.add(area);
            try {
                Conexion con = new Conexion();
                con.ConexionPostgres();

                ResultSet rs = con.consultar("SELECT * FROM empleado WHERE cedula_empleado = '" + cedula_empleado.getText().trim() + "'");

                if (rs.next()) {
                    ErrorAlert ea = new ErrorAlert(mp, true);
                    ea.titulo1.setText("¡¡ESTE EMPLEADO YA ESTÁ REGISTRADO!!");
                    ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
                    ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
                    ea.setVisible(true);
                } else {
                    con.actualizar("INSERT INTO empleado VALUES ('" + Integer.parseInt(cedula_empleado.getText()) + "', '"
                            + nombre_empleado.getText() + "', '" + apellido_empleado.getText().trim() + "', '"
                            + direccion_empleado.getText() + "', '" + email_empleado.getText() + "', '"
                            + telefono_empleado.getText() + "', '" + fechaingreso_empleado.getDate() + "')");

                    SuccessAlert sa = new SuccessAlert(mp, true);
                    sa.titulo.setText("EMPLEADO REGISTRADO!");
                    sa.titulo.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
                    sa.titulo.setForeground(new java.awt.Color(153, 153, 153));
                    sa.setVisible(true);

                    cedula_empleado.setText("");
                    nombre_empleado.setText("");
                    apellido_empleado.setText(null);
                    direccion_empleado.setText(null);
                    email_empleado.setText(null);
                    telefono_empleado.setText(null);
                    fechaingreso_empleado.setDate(null);
                    modificar.setEnabled(false);
                    cedula_empleado.setEnabled(true);
                }

            } catch (SQLException e) {
                ErrorAlert ea = new ErrorAlert(mp, true);
                ea.titulo1.setText("¡¡EMPLEADO YA ESTÁ REGISTRADO!!");
                ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
                ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
                ea.setVisible(true);

                cedula_empleado.setText("");
                nombre_empleado.setText("");
                modificar.setEnabled(false);
                cedula_empleado.setEnabled(true);
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
            }
            //JOptionPane.showMessageDialog(null, "Area registrada!");
            //JOptionPane.showMessageDialog(null, "Area registrada!");

            //JOptionPane.showMessageDialog(null, "Area registrada!");
            //JOptionPane.showMessageDialog(null, "Area registrada!");
        }
    }//GEN-LAST:event_agregarActionPerformed

    private void listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarActionPerformed

        /*String areaa = "id area\t Nombre del area \t Descripción \n";

        for (int i = 0; i < areas.size(); i++) {

            area = (Area) areas.get(i);
            areaa += area.getId() + "\t" + area.getNombredelarea() + "\t" + area.getDescdelarea() + "\n";
        }

        Archivo.grabar("Areas.txt", areaa);

        //JOptionPane.showMessageDialog(null, "Archivo Generado");
        SuccessAlert sa = new SuccessAlert(this, true);
        sa.titulo.setText("ARCHIVO GENERADO!");
        sa.titulo.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        sa.titulo.setForeground(new java.awt.Color(153, 153, 153));
        sa.setVisible(true);

        id.setText("");
        nombre.setText("");
        desc.setText("");
        id.setEnabled(true);*/
    }//GEN-LAST:event_listarActionPerformed

    private void buscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar2ActionPerformed
        ErrorAlert11 obj = new ErrorAlert11(mp, true);
        obj.titulo.setText("Digite la cedula del empleado:");
        obj.titulo.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        obj.titulo.setForeground(new java.awt.Color(153, 153, 153));
        obj.setVisible(true);

        try {
            Conexion con = new Conexion();
            con.ConexionPostgres();
            ResultSet rs = con.consultar("SELECT * FROM empleado WHERE cedula_empleado "
                    + "= '" + obj.valorabuscar.getText() + "'");

            if (rs.next()) {
                cedula_empleado.setText(rs.getString(1));
                nombre_empleado.setText(rs.getString(2));
                apellido_empleado.setText(rs.getString(3));
                direccion_empleado.setText(rs.getString(4));
                email_empleado.setText(rs.getString(5));
                telefono_empleado.setText(rs.getString(6));
                fechaingreso_empleado.setDate(rs.getDate(7));
                modificar.setEnabled(true);
                cedula_empleado.setEnabled(false);
            } else {
                ErrorAlert ea = new ErrorAlert(mp, true);
                ea.titulo1.setText("EMPLEADO NO EXISTE :(");
                ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
                ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
                ea.setVisible(true);
            }

        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buscar2ActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        if (nombre_empleado.getText().isEmpty()) {
            ErrorAlert ea = new ErrorAlert(mp, true);

            ea.titulo1.setText("NO HAS MODIFICADO EL NOMBRE!");
            ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
            ea.setVisible(true);

            modificar.setEnabled(false);
            cedula_empleado.setEnabled(true);
        } else if (apellido_empleado.getText().isEmpty()) {
            ErrorAlert ea = new ErrorAlert(mp, true);

            ea.titulo1.setText("NO HAS MODIFICADO EL APELLIDO!");
            ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
            ea.setVisible(true);
            modificar.setEnabled(false);
            cedula_empleado.setEnabled(true);
        } else if (direccion_empleado.getText().isEmpty()) {
            ErrorAlert ea = new ErrorAlert(mp, true);

            ea.titulo1.setText("NO HAS MODIFICADO LA DIRECCIÓN!");
            ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
            ea.setVisible(true);

            modificar.setEnabled(false);
            cedula_empleado.setEnabled(true);
        } else if (email_empleado.getText().isEmpty()) {
            ErrorAlert ea = new ErrorAlert(mp, true);

            ea.titulo1.setText("NO HAS MODIFICADO EL EMAIL!");
            ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
            ea.setVisible(true);

            modificar.setEnabled(false);
            cedula_empleado.setEnabled(true);
        } else if (telefono_empleado.getText().isEmpty()) {
            ErrorAlert ea = new ErrorAlert(mp, true);

            ea.titulo1.setText("NO HAS MODIFICADO EL TELEFONO!");
            ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
            ea.setVisible(true);
            modificar.setEnabled(false);
            cedula_empleado.setEnabled(true);
        } else if (fechaingreso_empleado.getDate() == null) {
            ErrorAlert ea = new ErrorAlert(mp, true);

            ea.titulo1.setText("NO HAS MODIFICADO LA FECHA DE INGRESO!");
            ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
            ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
            ea.setVisible(true);

            modificar.setEnabled(false);
            cedula_empleado.setEnabled(true);
        } else {
            try {
                Conexion con = new Conexion();
                con.ConexionPostgres();
                con.actualizar("UPDATE empleado SET nombre_empleado = '" + nombre_empleado.getText()
                        + "', apellido_empleado = '" + apellido_empleado.getText() + "', direccion_empleado = '"
                        + direccion_empleado.getText() + "', email_empleado = '"
                        + email_empleado.getText() + "', telefono_empleado ='"
                        + telefono_empleado.getText() + "', fechaingreso_empleado = '"
                        + fechaingreso_empleado.getDate() + "' WHERE "
                        + "cedula_empleado = '" + cedula_empleado.getText() + "'");

                SuccessAlert sa = new SuccessAlert(mp, true);
                sa.titulo.setText("INFORMACIÓN MODIFICADA!");
                sa.titulo.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
                sa.titulo.setForeground(new java.awt.Color(153, 153, 153));
                sa.setVisible(true);

                cedula_empleado.setText("");
                nombre_empleado.setText("");
                apellido_empleado.setText(null);
                direccion_empleado.setText(null);
                email_empleado.setText(null);
                telefono_empleado.setText(null);
                fechaingreso_empleado.setDate(null);
                modificar.setEnabled(false);
                cedula_empleado.setEnabled(true);
                agregar.setEnabled(true);

            } catch (SQLException ex) {
                Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_modificarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed

        cedula_empleado.setText("");
        nombre_empleado.setText("");
        apellido_empleado.setText(null);
        direccion_empleado.setText(null);
        email_empleado.setText(null);
        telefono_empleado.setText(null);
        fechaingreso_empleado.setDate(null);
        modificar.setEnabled(false);
        cedula_empleado.setEnabled(true);
        agregar.setEnabled(true);
    }//GEN-LAST:event_limpiarActionPerformed

    private void email_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_empleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_empleadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JTextField apellido_empleado;
    private javax.swing.JButton buscar2;
    private javax.swing.JTextField cedula_empleado;
    private javax.swing.JTextField direccion_empleado;
    private javax.swing.JTextField email_empleado;
    private com.toedter.calendar.JDateChooser fechaingreso_empleado;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton listar;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField nombre_empleado;
    private javax.swing.JTextField telefono_empleado;
    // End of variables declaration//GEN-END:variables
}

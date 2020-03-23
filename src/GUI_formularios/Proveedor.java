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

public class Proveedor extends javax.swing.JInternalFrame {

    menuPrincipal mp = new menuPrincipal();

    public Proveedor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombre_proveedor = new javax.swing.JTextField();
        nit_proveedor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        direccion_proveedor = new javax.swing.JTextField();
        email_proveedor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        telefono_proveedor = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        listar = new javax.swing.JButton();
        buscar2 = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos - Proveedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nit:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 50, -1));

        nombre_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_proveedorActionPerformed(evt);
            }
        });
        jPanel1.add(nombre_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 170, -1));

        nit_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nit_proveedorActionPerformed(evt);
            }
        });
        nit_proveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nit_proveedorKeyTyped(evt);
            }
        });
        jPanel1.add(nit_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 173, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon1.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 38, 100, 140));

        jLabel6.setText("Dirección:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 50, -1));

        direccion_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccion_proveedorActionPerformed(evt);
            }
        });
        jPanel1.add(direccion_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 170, -1));

        email_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_proveedorActionPerformed(evt);
            }
        });
        jPanel1.add(email_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 170, -1));

        jLabel7.setText("Email:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 30, -1));

        jLabel8.setText("Telefono:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        telefono_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefono_proveedorActionPerformed(evt);
            }
        });
        telefono_proveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefono_proveedorKeyTyped(evt);
            }
        });
        jPanel1.add(telefono_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 170, -1));

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
        jPanel1.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 80, 20));

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
        jPanel1.add(listar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 80, 20));

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
        jPanel1.add(buscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 80, 20));

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
        jPanel1.add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 90, 20));

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
        jPanel1.add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 80, 20));

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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombre_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_proveedorActionPerformed

    }//GEN-LAST:event_nombre_proveedorActionPerformed

    private void nit_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nit_proveedorActionPerformed

    }//GEN-LAST:event_nit_proveedorActionPerformed

    private void nit_proveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nit_proveedorKeyTyped

    }//GEN-LAST:event_nit_proveedorKeyTyped

    private void direccion_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccion_proveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccion_proveedorActionPerformed

    private void email_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_proveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_proveedorActionPerformed

    private void telefono_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefono_proveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefono_proveedorActionPerformed

    private void telefono_proveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefono_proveedorKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_telefono_proveedorKeyTyped

    private void agregarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMouseMoved

    }//GEN-LAST:event_agregarMouseMoved
    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed

        if (nit_proveedor.getText().isEmpty()) {
            ErrorAlert ea = new ErrorAlert(mp, true);
            ea.titulo1.setText("POR FAVOR, DIGITE EL ID!");
            ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
            ea.setVisible(true);

            modificar.setEnabled(false);
            nit_proveedor.setEnabled(true);

        } else if (nombre_proveedor.getText().isEmpty()) {
            ErrorAlert ea = new ErrorAlert(mp, true);
            ea.titulo1.setText("POR FAVOR, DIGITE EL NOMBRE!");
            ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
            ea.setVisible(true);

            modificar.setEnabled(false);
            nit_proveedor.setEnabled(true);
        } else if (direccion_proveedor.getText().isEmpty()) {
            ErrorAlert ea = new ErrorAlert(mp, true);
            ea.titulo1.setText("POR FAVOR, DIGITE LA DIRECCIÓN!");
            ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
            ea.setVisible(true);

            modificar.setEnabled(false);
            nit_proveedor.setEnabled(true);
        } else if (email_proveedor.getText().isEmpty()) {
            ErrorAlert ea = new ErrorAlert(mp, true);
            ea.titulo1.setText("POR FAVOR, DIGITE EL EMAIL!");
            ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
            ea.setVisible(true);

            modificar.setEnabled(false);
            nit_proveedor.setEnabled(true);
        } else if (telefono_proveedor.getText().isEmpty()) {
            ErrorAlert ea = new ErrorAlert(mp, true);
            ea.titulo1.setText("POR FAVOR, DIGITE EL TELÉFONO!");
            ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
            ea.setVisible(true);

            modificar.setEnabled(false);
            nit_proveedor.setEnabled(true);
        } else {

            //            area = new Area(Integer.parseInt(id.getText().trim()), nombre.getText().trim(), desc.getText().trim());
            //                LogIn.areas.add(area);
            try {
                Conexion con = new Conexion();
                con.ConexionPostgres();

                ResultSet rs = con.consultar("SELECT * FROM proveedor WHERE nit_proveedor = '" + nit_proveedor.getText().trim() + "'");

                if (rs.next()) {
                    ErrorAlert ea = new ErrorAlert(mp, true);
                    ea.titulo1.setText("¡¡PROVEEDOR YA ESTÁ REGISTRADO!!");
                    ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
                    ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
                    ea.setVisible(true);

                    nit_proveedor.setText("");
                    nombre_proveedor.setText("");
                    modificar.setEnabled(false);
                    nit_proveedor.setEnabled(true);
                } else {
                    con.actualizar("INSERT INTO proveedor VALUES ('" + Integer.parseInt(nit_proveedor.getText()) + "', '"
                            + nombre_proveedor.getText() + "', '" + direccion_proveedor.getText().trim() + "', '"
                            + email_proveedor.getText() + "', '" + telefono_proveedor.getText() + "')");

                    SuccessAlert sa = new SuccessAlert(mp, true);
                    sa.titulo.setText("PROVEEDOR REGISTRADO!");
                    sa.titulo.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
                    sa.titulo.setForeground(new java.awt.Color(153, 153, 153));
                    sa.setVisible(true);

                    nit_proveedor.setText("");
                    nombre_proveedor.setText("");
                    direccion_proveedor.setText(null);
                    email_proveedor.setText(null);
                    telefono_proveedor.setText(null);
                    modificar.setEnabled(false);
                    nit_proveedor.setEnabled(true);
                }

            } catch (SQLException e) {
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
        obj.titulo.setText("Digite el id del proveedor:");
        obj.titulo.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        obj.titulo.setForeground(new java.awt.Color(153, 153, 153));
        obj.setVisible(true);

        try {
            Conexion con = new Conexion();
            con.ConexionPostgres();
            ResultSet rs = con.consultar("SELECT * FROM proveedor WHERE nit_proveedor "
                    + "= '" + obj.valorabuscar.getText() + "'");

            if (rs.next()) {
                nit_proveedor.setText(rs.getString(1));
                nombre_proveedor.setText(rs.getString(2));
                direccion_proveedor.setText(rs.getString(3));
                email_proveedor.setText(rs.getString(4));
                telefono_proveedor.setText(rs.getString(5));
                
                nit_proveedor.setEnabled(false);
                modificar.setEnabled(true);
            } else {
                ErrorAlert ea = new ErrorAlert(mp, true);
                ea.titulo1.setText("¡¡PROVEEDOR NO ESTÁ REGISTRADO!!");
                ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
                ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
                ea.setVisible(true);
            }

        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buscar2ActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        if (nombre_proveedor.getText().isEmpty()) {

            ErrorAlert ea = new ErrorAlert(mp, true);

            ea.titulo1.setText("NO HAS MODIFICADO EL NOMBRE!");
            ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
            ea.setVisible(true);

            modificar.setEnabled(false);
            nit_proveedor.setEnabled(true);
        } else if (direccion_proveedor.getText().isEmpty()) {

            ErrorAlert ea = new ErrorAlert(mp, true);

            ea.titulo1.setText("NO HAS MODIFICADO LA DIRECCIÓN!");
            ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
            ea.setVisible(true);

            modificar.setEnabled(false);
            nit_proveedor.setEnabled(true);
        } else if (email_proveedor.getText().isEmpty()) {

            ErrorAlert ea = new ErrorAlert(mp, true);

            ea.titulo1.setText("NO HAS MODIFICADO EL EMAIL!");
            ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
            ea.setVisible(true);

            modificar.setEnabled(false);
            nit_proveedor.setEnabled(true);
        } else if (telefono_proveedor.getText().isEmpty()) {

            ErrorAlert ea = new ErrorAlert(mp, true);

            ea.titulo1.setText("NO HAS MODIFICADO EL TELEFONO!");
            ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
            ea.setVisible(true);

            modificar.setEnabled(false);
            nit_proveedor.setEnabled(true);
        } else {
            try {
                Conexion con = new Conexion();
                con.ConexionPostgres();
                con.actualizar("UPDATE proveedor SET nombre_proveedor = '" + nombre_proveedor.getText() + "', direccion_proveedor = '"
                        + direccion_proveedor.getText() + "', email_proveedor = '" + email_proveedor.getText() + "', telefono_proveedor ='"
                        + telefono_proveedor.getText() + "' WHERE "
                        + "nit_proveedor = '" + nit_proveedor.getText() + "'");

                SuccessAlert sa = new SuccessAlert(mp, true);
                sa.titulo.setText("INFORMACIÓN MODIFICADA!");
                sa.titulo.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
                sa.titulo.setForeground(new java.awt.Color(153, 153, 153));
                sa.setVisible(true);

                nit_proveedor.setText("");
                nombre_proveedor.setText("");
                direccion_proveedor.setText(null);
                email_proveedor.setText(null);
                telefono_proveedor.setText(null);
                modificar.setEnabled(false);
                nit_proveedor.setEnabled(true);
                agregar.setEnabled(true);

            } catch (SQLException ex) {
                Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_modificarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed

        nit_proveedor.setText("");
        nombre_proveedor.setText("");
        direccion_proveedor.setText(null);
        email_proveedor.setText(null);
        telefono_proveedor.setText(null);
        modificar.setEnabled(false);
        nit_proveedor.setEnabled(true);
        agregar.setEnabled(true);
    }//GEN-LAST:event_limpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton buscar2;
    private javax.swing.JTextField direccion_proveedor;
    private javax.swing.JTextField email_proveedor;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton listar;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField nit_proveedor;
    private javax.swing.JTextField nombre_proveedor;
    private javax.swing.JTextField telefono_proveedor;
    // End of variables declaration//GEN-END:variables
}

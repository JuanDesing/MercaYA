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

public class Categoria extends javax.swing.JInternalFrame {

    public Categoria() {
        initComponents();
    }
    menuPrincipal mp = new menuPrincipal();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        id_categoria = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nombre_categoria = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        listar = new javax.swing.JButton();
        buscar2 = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Categoría  - Familia del producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel1.setText("Id de la categoría:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 53, 120, -1));
        jPanel1.add(id_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 51, 164, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel2.setText("Nombre de la categoría:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 84, 150, -1));
        jPanel1.add(nombre_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 82, 164, -1));

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
        jPanel1.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 80, 20));

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
        jPanel1.add(listar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 80, 20));

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
        jPanel1.add(buscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 80, 20));

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
        jPanel1.add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 90, 20));

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
        jPanel1.add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 80, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMouseMoved

    }//GEN-LAST:event_agregarMouseMoved

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed

        if (id_categoria.getText().isEmpty()) {
            ErrorAlert ea = new ErrorAlert(mp, true);

            ea.titulo1.setText("POR FAVOR, DIGITE EL ID");
            ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
            ea.setVisible(true);

            modificar.setEnabled(false);
            id_categoria.setEnabled(true);

        } else if (nombre_categoria.getText().isEmpty()) {
            ErrorAlert ea = new ErrorAlert(mp, true);
            ea.titulo1.setText("POR FAVOR, DIGITE EL NOMBRE!");
            ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
            ea.setVisible(true);

            modificar.setEnabled(false);
            id_categoria.setEnabled(true);
        } else {
            try {
                Conexion con = new Conexion();
                con.ConexionPostgres();

                ResultSet rs = con.consultar("SELECT * FROM categoria_familia WHERE id_categoria = '" + id_categoria.getText().trim() + "'");

                if (rs.next()) {
                    ErrorAlert ea = new ErrorAlert(mp, true);
                    ea.titulo1.setText("¡¡CATEGORÍA YÁ EXISTE !!");
                    ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
                    ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
                    ea.setVisible(true);
                } else {
                    con.actualizar("INSERT INTO categoria_familia VALUES ('" + Integer.parseInt(id_categoria.getText()) + "', '"
                            + nombre_categoria.getText() + "' )");

                    SuccessAlert sa = new SuccessAlert(mp, true);
                    sa.titulo.setText("CATEGORÍA REGISTRADA!");
                    sa.titulo.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
                    sa.titulo.setForeground(new java.awt.Color(153, 153, 153));
                    sa.setVisible(true);

                    id_categoria.setText(null);
                    nombre_categoria.setText(null);
                    modificar.setEnabled(false);
                    id_categoria.setEnabled(true);
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
        obj.titulo.setText("Digite el código de la categoría: ");
        obj.titulo.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        obj.titulo.setForeground(new java.awt.Color(153, 153, 153));
        obj.setVisible(true);

        try {
            Conexion con = new Conexion();
            con.ConexionPostgres();
            ResultSet rs = con.consultar("SELECT * FROM categoria_familia WHERE id_categoria "
                    + "= '" + obj.valorabuscar.getText() + "'");

            if (rs.next()) {
                id_categoria.setText(rs.getString(1));
                nombre_categoria.setText(String.valueOf(rs.getString(2)));
                id_categoria.setEnabled(false);
            } else {
                ErrorAlert ea = new ErrorAlert(mp, true);
                ea.titulo1.setText("CATEGORÍA NO EXISTE :(");
                ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
                ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
                ea.setVisible(true);

                id_categoria.setText("");
                nombre_categoria.setText("");
                modificar.setEnabled(false);
                id_categoria.setEnabled(true);
            }

            modificar.setEnabled(true);

        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buscar2ActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        if (nombre_categoria.getText().isEmpty()) {

            ErrorAlert ea = new ErrorAlert(mp, true);

            ea.titulo1.setText("NO HAS MODIFICADO EL NOMBRE!");
            ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
            ea.setVisible(true);

            modificar.setEnabled(false);
            id_categoria.setEnabled(true);
        } else {
            try {
                Conexion con = new Conexion();
                con.ConexionPostgres();
                con.actualizar("UPDATE categoria_familia SET nombre_categoria = '" + nombre_categoria.getText() + "' WHERE "
                        + "id_categoria = '" + id_categoria.getText() + "'");

                SuccessAlert sa = new SuccessAlert(mp, true);
                sa.titulo.setText("INFORMACIÓN MODIFICADA!");
                sa.titulo.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
                sa.titulo.setForeground(new java.awt.Color(153, 153, 153));
                sa.setVisible(true);

                id_categoria.setText("");
                nombre_categoria.setText("");
                modificar.setEnabled(false);
                id_categoria.setEnabled(true);
                agregar.setEnabled(true);

            } catch (SQLException ex) {
                Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_modificarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed

        id_categoria.setText("");
        nombre_categoria.setText("");
        modificar.setEnabled(false);
        id_categoria.setEnabled(true);
        agregar.setEnabled(true);
    }//GEN-LAST:event_limpiarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing

    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton buscar2;
    private javax.swing.JTextField id_categoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton listar;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField nombre_categoria;
    // End of variables declaration//GEN-END:variables
}

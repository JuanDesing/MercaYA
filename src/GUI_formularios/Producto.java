package GUI_formularios;

import Mensajes.ErrorAlert;
import Mensajes.ErrorAlert11;
import Mensajes.ErrorAlert2;
import Mensajes.SuccessAlert;
import conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producto extends javax.swing.JInternalFrame {

    menuPrincipal mp = new menuPrincipal();

    public Producto() {
        try {
            initComponents();
            Conexion con = new Conexion();
            con.ConexionPostgres();

            ResultSet rs = con.consultar("SELECT * FROM categoria_familia ORDER BY id_categoria");

            idcategoria_producto.removeAllItems();
            idcategoria_producto.addItem("Seleccione");
            while (rs.next()) {
                idcategoria_producto.addItem(rs.getString(1) + " - " + rs.getString(2));
            }

            //con.ConexionPostgres();
            ResultSet rs2 = con.consultar("SELECT * FROM proveedor ORDER BY nit_proveedor");

            idproveedor_producto.removeAllItems();
            idproveedor_producto.addItem("Seleccione");
            while (rs2.next()) {
                idproveedor_producto.addItem(rs2.getString(1) + " - " + rs2.getString(2));
            }

        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombre_producto = new javax.swing.JTextField();
        id_producto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        valor_producto = new javax.swing.JTextField();
        existencia_producto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        agregar = new javax.swing.JButton();
        listar = new javax.swing.JButton();
        buscar2 = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        stockminimo_producto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        idproveedor_producto = new javax.swing.JComboBox<String>();
        idcategoria_producto = new javax.swing.JComboBox<String>();

        jButton2.setText("jButton2");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos - cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("id:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 20, -1));

        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 40, -1));

        nombre_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_productoActionPerformed(evt);
            }
        });
        jPanel1.add(nombre_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 170, -1));

        id_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_productoActionPerformed(evt);
            }
        });
        id_producto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id_productoKeyTyped(evt);
            }
        });
        jPanel1.add(id_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 173, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon1.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 38, 120, 200));

        jLabel6.setText("Valor /u:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 50, -1));

        valor_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor_productoActionPerformed(evt);
            }
        });
        jPanel1.add(valor_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 170, -1));

        existencia_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                existencia_productoActionPerformed(evt);
            }
        });
        jPanel1.add(existencia_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 170, -1));

        jLabel7.setText("Existencia:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        agregar.setBackground(new java.awt.Color(255, 255, 255));
        agregar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
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

        jLabel9.setText("Proveedor:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 220, 60, -1));

        jLabel10.setText("Categoría:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        stockminimo_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockminimo_productoActionPerformed(evt);
            }
        });
        jPanel1.add(stockminimo_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 170, -1));

        jLabel8.setText("Stock minimo:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        idproveedor_producto.setPreferredSize(new java.awt.Dimension(4, 19));
        idproveedor_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idproveedor_productoActionPerformed(evt);
            }
        });
        jPanel1.add(idproveedor_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 170, -1));

        idcategoria_producto.setPreferredSize(new java.awt.Dimension(4, 19));
        idcategoria_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idcategoria_productoActionPerformed(evt);
            }
        });
        jPanel1.add(idcategoria_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 170, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombre_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_productoActionPerformed

    }//GEN-LAST:event_nombre_productoActionPerformed

    private void id_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_productoActionPerformed

    }//GEN-LAST:event_id_productoActionPerformed

    private void id_productoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_productoKeyTyped

    }//GEN-LAST:event_id_productoKeyTyped

    private void valor_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor_productoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor_productoActionPerformed

    private void existencia_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_existencia_productoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_existencia_productoActionPerformed

    private void agregarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMouseMoved

    }//GEN-LAST:event_agregarMouseMoved
    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed

        if (id_producto.getText().isEmpty()) {
            ErrorAlert ea = new ErrorAlert(mp, true);
            ea.titulo1.setText("POR FAVOR, DIGITE EL ID!");
            ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
            ea.setVisible(true);

            modificar.setEnabled(false);
            id_producto.setEnabled(true);

        } else if (nombre_producto.getText().isEmpty()) {
            ErrorAlert ea = new ErrorAlert(mp, true);
            ea.titulo1.setText("POR FAVOR, DIGITE EL NOMBRE!");
            ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
            ea.setVisible(true);

            modificar.setEnabled(false);
            id_producto.setEnabled(true);
        } else if (valor_producto.getText().isEmpty()) {
            ErrorAlert ea = new ErrorAlert(mp, true);
            ea.titulo1.setText("POR FAVOR, DIGITE EL VALOR DEL PRODUCTO!");
            ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
            ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
            ea.setVisible(true);

            modificar.setEnabled(false);
            id_producto.setEnabled(true);
        } else if (existencia_producto.getText().isEmpty()) {
            ErrorAlert ea = new ErrorAlert(mp, true);
            ea.titulo1.setText("POR FAVOR, DIGITE LA CANTIDAD A INGRESAR!");
            ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
            ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
            ea.setVisible(true);

            modificar.setEnabled(false);
            id_producto.setEnabled(true);
        } else if (stockminimo_producto.getText().isEmpty()) {
            ErrorAlert ea = new ErrorAlert(mp, true);
            ea.titulo1.setText("POR FAVOR, DIGITE DE CUANTO ES EL STOCK MÍNIMO!");
            ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
            ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
            ea.setVisible(true);

            modificar.setEnabled(false);
            id_producto.setEnabled(true);
        } else if (idcategoria_producto.getSelectedIndex() == 0) {
            ErrorAlert ea = new ErrorAlert(mp, true);
            ea.titulo1.setText("POR FAVOR, SELECCIONE LA CATEGORÍA!");
            ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
            ea.setVisible(true);

            modificar.setEnabled(false);
            id_producto.setEnabled(true);
        } else if (idproveedor_producto.getSelectedIndex() == 0) {
            ErrorAlert ea = new ErrorAlert(mp, true);
            ea.titulo1.setText("POR FAVOR, SELECCIONE EL PROVEEDOR!");
            ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
            ea.setVisible(true);

            modificar.setEnabled(false);
            id_producto.setEnabled(true);
        } else {
            //            area = new Area(Integer.parseInt(id.getText().trim()), nombre.getText().trim(), desc.getText().trim());
            //                LogIn.areas.add(area);
            try {
                Conexion con = new Conexion();
                con.ConexionPostgres();

                ResultSet rs = con.consultar("SELECT * FROM producto WHERE id_producto = '" + id_producto.getText().trim() + "'");

                if (rs.next()) {
                    ErrorAlert ea = new ErrorAlert(mp, true);
                    ea.titulo1.setText("¡¡PRODUCTO YA ESTÁ REGISTRADO!!");
                    ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
                    ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
                    ea.setVisible(true);
                } else {
                    StringTokenizer idcat = new StringTokenizer(idcategoria_producto.getSelectedItem().toString() + " - ");
                    String idcatt = idcat.nextToken();
                    //JOptionPane.showMessageDialog(null, "idcatt: " + idcatt);

                    StringTokenizer idprov = new StringTokenizer(idproveedor_producto.getSelectedItem().toString() + " - ");
                    String idprovv = idprov.nextToken();
                    //JOptionPane.showMessageDialog(null, "idprovv: " + idprovv);

                    con.actualizar("INSERT INTO producto VALUES ('" + Integer.parseInt(id_producto.getText()) + "', '"
                            + nombre_producto.getText() + "', '" + valor_producto.getText().trim() + "', '"
                            + existencia_producto.getText() + "', '" + stockminimo_producto.getText() + "', '"
                            + idcatt + "',  '" + idprovv + "')");

                    SuccessAlert sa = new SuccessAlert(mp, true);
                    sa.titulo.setText("PRODUCTO REGISTRADO!");
                    sa.titulo.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
                    sa.titulo.setForeground(new java.awt.Color(153, 153, 153));
                    sa.setVisible(true);

                    id_producto.setText("");
                    nombre_producto.setText("");
                    valor_producto.setText(null);
                    existencia_producto.setText(null);
                    stockminimo_producto.setText(null);
                    idcategoria_producto.setSelectedIndex(0);
                    idproveedor_producto.setSelectedIndex(0);
                    modificar.setEnabled(false);
                    id_producto.setEnabled(true);
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
        obj.titulo.setText("Digite el id del producto:");
        obj.titulo.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        obj.titulo.setForeground(new java.awt.Color(153, 153, 153));
        obj.setVisible(true);

        try {
            Conexion con = new Conexion();
            con.ConexionPostgres();

            ResultSet rs = con.consultar("SELECT * FROM producto WHERE id_producto = '" + obj.valorabuscar.getText().trim() + "'");

            if (rs.next()) {

                ResultSet rs1 = con.consultar("SELECT * FROM producto WHERE id_producto "
                        + "= '" + obj.valorabuscar.getText() + "'");

                String idcat = "", idprov = "", nomcat = "", nomprov = "";
                if (rs1.next()) {
                    idcat = rs1.getString(6);
                    idprov = rs1.getString(7);
                }

                ResultSet rs2 = con.consultar("SELECT * FROM categoria_familia WHERE id_categoria "
                        + "= '" + idcat + "'");
                while (rs2.next()) {
                    nomcat = rs2.getString(2);
                }

                ResultSet rs3 = con.consultar("SELECT * FROM proveedor WHERE nit_proveedor "
                        + "= '" + idprov + "'");
                while (rs3.next()) {
                    nomprov = rs3.getString(2);
                }

                ResultSet rsf = con.consultar("SELECT * FROM producto WHERE id_producto "
                        + "= '" + obj.valorabuscar.getText() + "'");

                if (rsf.next()) {
                    id_producto.setText(rsf.getString(1));
                    nombre_producto.setText(rsf.getString(2));
                    valor_producto.setText(rsf.getString(3));
                    existencia_producto.setText(rsf.getString(4));
                    stockminimo_producto.setText(rsf.getString(5));
                    idcategoria_producto.setSelectedItem(idcat + " - " + nomcat);
                    idproveedor_producto.setSelectedItem(idprov + " - " + nomprov);
                    modificar.setEnabled(true);
                    id_producto.setEnabled(false);
                }

            } else {
                ErrorAlert ea = new ErrorAlert(mp, true);
                ea.titulo1.setText("¡¡PRODUCTO NO ESTÁ REGISTRADO!!");
                ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 19)); // NOI18N
                ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
                ea.setVisible(true);
            }

        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buscar2ActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        if (nombre_producto.getText().isEmpty()) {

            ErrorAlert ea = new ErrorAlert(mp, true);

            ea.titulo1.setText("NO HAS MODIFICADO EL NOMBRE!");
            ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
            ea.setVisible(true);

            modificar.setEnabled(true);
            id_producto.setEnabled(true);
        } else if (valor_producto.getText().isEmpty()) {

            ErrorAlert2 ea2 = new ErrorAlert2(mp, true);

            ea2.t1.setText("¡NO HAS MODIFICADO EL VALOR");
            ea2.t2.setText("DEL PRODUCTO!");
            ea2.t1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
            ea2.t2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            ea2.t1.setForeground(new java.awt.Color(153, 153, 153));
            ea2.t2.setForeground(new java.awt.Color(153, 153, 153));
            ea2.setVisible(true);

            modificar.setEnabled(true);
            id_producto.setEnabled(true);
        } else if (existencia_producto.getText().isEmpty()) {

            ErrorAlert2 ea2 = new ErrorAlert2(mp, true);

            ea2.t1.setText("¡NO HAS MODIFICADO LA CANTIDAD");
            ea2.t2.setText("QUE HAY EN STOCK!");
            ea2.t1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
            ea2.t2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            ea2.t1.setForeground(new java.awt.Color(153, 153, 153));
            ea2.t2.setForeground(new java.awt.Color(153, 153, 153));
            ea2.setVisible(true);

            modificar.setEnabled(true);
            id_producto.setEnabled(true);
        } else if (stockminimo_producto.getText().isEmpty()) {

            ErrorAlert2 ea2 = new ErrorAlert2(mp, true);

            ea2.t1.setText("¡NO HAS MODIFICADO DE");
            ea2.t2.setText("¿CUÁNTO ES EL STOCK MÍNIMO?!");
            ea2.t1.setFont(new java.awt.Font("Century Gothic", 1, 19)); // NOI18N
            ea2.t2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
            ea2.t1.setForeground(new java.awt.Color(153, 153, 153));
            ea2.t2.setForeground(new java.awt.Color(153, 153, 153));
            ea2.setVisible(true);

            modificar.setEnabled(true);
            id_producto.setEnabled(true);
        } else if (idcategoria_producto.getSelectedIndex() == 0) {

            ErrorAlert ea = new ErrorAlert(mp, true);

            ea.titulo1.setText("NO HAS MODIFICADO LA CATEGORÍA!");
            ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
            ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
            ea.setVisible(true);

            modificar.setEnabled(true);
            id_producto.setEnabled(true);
        } else if (idproveedor_producto.getSelectedIndex() == 0) {

            ErrorAlert ea = new ErrorAlert(mp, true);

            ea.titulo1.setText("NO HAS MODIFICADO EL PROVEEDOR!");
            ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
            ea.setVisible(true);

            modificar.setEnabled(true);
            id_producto.setEnabled(true);
        } else {
            try {
                Conexion con = new Conexion();
                con.ConexionPostgres();

                StringTokenizer idcat = new StringTokenizer(idcategoria_producto.getSelectedItem().toString() + " - ");
                String idcatt = idcat.nextToken();
                //JOptionPane.showMessageDialog(null, "idcatt: " + idcatt);

                StringTokenizer idprov = new StringTokenizer(idproveedor_producto.getSelectedItem().toString() + " - ");
                String idprovv = idprov.nextToken();

                con.actualizar("UPDATE producto SET nombre_producto = '" + nombre_producto.getText()
                        + "', valor_producto = '" + valor_producto.getText() + "', existencia_producto = '"
                        + existencia_producto.getText() + "', stockminimo_producto = '"
                        + stockminimo_producto.getText() + "', idcategoria_producto ='"
                        + idcatt + "', idproveedor_producto = '"
                        + idprovv + "' WHERE "
                        + "id_producto = '" + id_producto.getText() + "'");

                SuccessAlert sa = new SuccessAlert(mp, true);
                sa.titulo.setText("INFORMACIÓN MODIFICADA!");
                sa.titulo.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
                sa.titulo.setForeground(new java.awt.Color(153, 153, 153));
                sa.setVisible(true);

                id_producto.setText("");
                nombre_producto.setText("");
                valor_producto.setText(null);
                existencia_producto.setText(null);
                stockminimo_producto.setText(null);
                idcategoria_producto.setSelectedIndex(0);
                idproveedor_producto.setSelectedIndex(0);
                modificar.setEnabled(false);
                id_producto.setEnabled(true);
                agregar.setEnabled(true);

            } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_modificarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed

        id_producto.setText("");
        nombre_producto.setText("");
        valor_producto.setText(null);
        existencia_producto.setText(null);
        stockminimo_producto.setText(null);
        idcategoria_producto.setSelectedIndex(0);
        idproveedor_producto.setSelectedIndex(0);
        modificar.setEnabled(false);
        id_producto.setEnabled(true);
        agregar.setEnabled(true);
    }//GEN-LAST:event_limpiarActionPerformed

    private void stockminimo_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockminimo_productoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockminimo_productoActionPerformed

    private void idproveedor_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idproveedor_productoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idproveedor_productoActionPerformed

    private void idcategoria_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idcategoria_productoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idcategoria_productoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton buscar2;
    private javax.swing.JTextField existencia_producto;
    private javax.swing.JTextField id_producto;
    private javax.swing.JComboBox<String> idcategoria_producto;
    private javax.swing.JComboBox<String> idproveedor_producto;
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
    private javax.swing.JTextField nombre_producto;
    private javax.swing.JTextField stockminimo_producto;
    private javax.swing.JTextField valor_producto;
    // End of variables declaration//GEN-END:variables
}

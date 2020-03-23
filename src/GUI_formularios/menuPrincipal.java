package GUI_formularios;

import Listados_Reportes.Reporte_productosagotados;
import Mensajes.ErrorAlert;
import Mensajes.ErrorAlert11;
import Mensajes.ErrorAlert2;
import Mensajes.WarningAlertCerrar;
import conexion.Conexion;
import conexion.ImagenFondo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class menuPrincipal extends javax.swing.JFrame {
    
    public menuPrincipal() {
        
        initComponents();
        panelEscritorio.setBorder(new ImagenFondo());
        this.setExtendedState(menuPrincipal.MAXIMIZED_BOTH);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        panel1 = new org.edisoncor.gui.panel.Panel();
        panelEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jToggleButton1.setText("jToggleButton1");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelEscritorio.setBackground(new java.awt.Color(204, 204, 204));
        panelEscritorio.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panelEscritorioLayout = new javax.swing.GroupLayout(panelEscritorio);
        panelEscritorio.setLayout(panelEscritorioLayout);
        panelEscritorioLayout.setHorizontalGroup(
            panelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 921, Short.MAX_VALUE)
        );
        panelEscritorioLayout.setVerticalGroup(
            panelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );

        getContentPane().add(panelEscritorio, java.awt.BorderLayout.CENTER);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ganancias.png"))); // NOI18N
        jMenu1.setText("Gestionar productos");
        jMenu1.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(170, 37));

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/añadir.png"))); // NOI18N
        jMenuItem5.setText("Registro de categorías");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GeneraRepo.png"))); // NOI18N
        jMenuItem3.setText("Listado de categorías");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/añadir.png"))); // NOI18N
        jMenuItem6.setText("Registro de inventario - stock");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GeneraRepo.png"))); // NOI18N
        jMenuItem4.setText("Listado de todos los productos ");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Gestionar Clien.png"))); // NOI18N
        jMenu2.setText(" Gestionar clientes - empleados");
        jMenu2.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(240, 37));

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/añadir.png"))); // NOI18N
        jMenuItem1.setText("Registro de clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GeneraRepo.png"))); // NOI18N
        jMenuItem9.setText("Listado de clientes");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/añadir.png"))); // NOI18N
        jMenuItem10.setText("Registro de empleados");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GeneraRepo.png"))); // NOI18N
        jMenuItem12.setText("Listado de empleados");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem12);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ObtenerT.png"))); // NOI18N
        jMenu3.setText("   Gestionar pedidos");
        jMenu3.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(170, 37));

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/añadir.png"))); // NOI18N
        jMenuItem8.setText("Registro de pedidos");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GeneraRepo.png"))); // NOI18N
        jMenuItem13.setText("Listado de pedidos");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem13);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/analitica.png"))); // NOI18N
        jMenu4.setText(" Gestionar Proveedor");
        jMenu4.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(170, 37));

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/añadir.png"))); // NOI18N
        jMenuItem7.setText("Registro de proveedores");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GeneraRepo.png"))); // NOI18N
        jMenuItem14.setText("Listado de proveedores");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem14);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/analitica.png"))); // NOI18N
        jMenu5.setText("   Opciones");
        jMenu5.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(170, 37));

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EliminarCu.png"))); // NOI18N
        jMenuItem11.setText("Salir");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GeneraRepo.png"))); // NOI18N
        jMenuItem2.setText("Productos agotádose");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem2);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void mostraralertasdeproductosagotados() {
        try {
            Conexion con = new Conexion();
            con.ConexionPostgres();
            
            ResultSet validar = con.consultar("SELECT * FROM producto");
            
            while (validar.next()) {
                if (validar.getInt(4) < validar.getInt(5)) {
                    WarningAlertCerrar alerta = new WarningAlertCerrar(mp, true);
                    alerta.titulo.setText("¡¡ESTÁ AGOTADO EL PRODUCTO ");
                    alerta.titulo2.setText(validar.getString(2).toUpperCase() + "!!");
                    alerta.titulo.setFont(new java.awt.Font("Tahoma", 1, 15));
                    alerta.titulo2.setFont(new java.awt.Font("Tahoma", 1, 20));
                    alerta.setVisible(true);
                }
            }
            
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(menuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        Cliente cliente = new Cliente();
        panelEscritorio.add(cliente);
        cliente.show(true);

    }//GEN-LAST:event_jMenuItem1ActionPerformed
    Categoria cg;

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        
        cg = new Categoria();
        panelEscritorio.add(cg);
        cg.show(true);

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Producto p = new Producto();
        panelEscritorio.add(p);
        p.show(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed
    
    menuPrincipal mp;

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        
        mp = new menuPrincipal();
        
        ErrorAlert11 obj = new ErrorAlert11(mp, true);
        obj.titulo.setText("Digite el código del cliente:");
        obj.titulo.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        obj.titulo.setForeground(new java.awt.Color(153, 153, 153));
        obj.setVisible(true);
        
        try {
            Conexion con = new Conexion();
            con.ConexionPostgres();
            
            Pedido_Detalle_pedido pd = new Pedido_Detalle_pedido();
            
            ResultSet rs = con.consultar("SELECT * FROM cliente WHERE cedula_cliente "
                    + "= '" + obj.valorabuscar.getText() + "'");
            
            boolean estaregistrado = false;
            while (rs.next()) {
                
                pd.cedula_cliente.setText(rs.getString(1));
                pd.nombre_cliente.setText(rs.getString(2));
                pd.apellido_cliente.setText(rs.getString(3));
                pd.cedula_cliente.setEnabled(false);
                pd.nombre_cliente.setEnabled(false);
                pd.apellido_cliente.setEnabled(false);
                estaregistrado = true;
                
                panelEscritorio.add(pd);
                pd.show();
            }
            
            if (estaregistrado != true) {
                //JOptionPane.showMessageDialog(null, "NO está registrado este empleado");
                ErrorAlert2 ea = new ErrorAlert2(mp, true);
                ea.t1.setText("ESTE EMPLEADO NO SE ENCUENTRA");
                ea.t2.setText("REGISTRADO!!");
                ea.t1.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
                ea.t1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
                ea.t2.setForeground(new java.awt.Color(153, 153, 153));
                ea.t2.setForeground(new java.awt.Color(153, 153, 153));
                ea.setVisible(true);
            }
            
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        
        Proveedor p = new Proveedor();
        panelEscritorio.add(p);
        p.show();

    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        Empleado e = new Empleado();
        panelEscritorio.add(e, 50);
        e.show();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        Reporte_productosagotados rpa = new Reporte_productosagotados(this, true);
        rpa.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        //dispose();
        System.exit(0);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        new Listados_Reportes.Lista_categorias(this, true).setVisible(true);
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        
        new Listados_Reportes.Lista_inventariogeneral(this, true).setVisible(true);
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        new Listados_Reportes.Lista_clientes(this, true).setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        new Listados_Reportes.Lista_empleados(this, true).setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        new Listados_Reportes.Lista_pedidos(this, true).setVisible(true);
        
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        new Listados_Reportes.Lista_proveedores(this, true).setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JToggleButton jToggleButton1;
    private org.edisoncor.gui.panel.Panel panel1;
    private javax.swing.JDesktopPane panelEscritorio;
    // End of variables declaration//GEN-END:variables

}

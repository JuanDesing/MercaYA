/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listados_Reportes;

import static Listados_Reportes.Lista_pedidos.tablapedidos;
import componentes.org1.bolivia.combo.AWTUtilities;
import conexion.Conexion;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import tabla.EstiloTablaHeader;
import tabla.EstiloTablaRenderer;

/**
 *
 * @author Rojeru San
 */
public class Lista_Detalleporpedido extends javax.swing.JDialog {

    Timer timer = null;
    TimerTask task;
    int i = 32;

    public DefaultTableModel modelotabladetalledexpedido = new DefaultTableModel();

    public Lista_Detalleporpedido(JFrame parent, boolean modal) {
        super(parent, modal);

        initComponents();
        AWTUtilities.setOpaque(this, false);
        Ubicar(0);

        String data[][] = {};
        String cabecera[] = {"Id pedido", "Producto llevado", "Cantidad llevada", "Subtotal"};

        modelotabladetalledexpedido.setDataVector(data, cabecera);

        tabladetalleporpedido.setModel(modelotabladetalledexpedido);
        //this.setLocationRelativeTo(null);
        tabladetalleporpedido.getTableHeader().setDefaultRenderer(new EstiloTablaHeader());
        tabladetalleporpedido.setDefaultRenderer(Object.class, new EstiloTablaRenderer());
        tabladetalleporpedido.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        try {
            Conexion con = new Conexion();
            con.ConexionPostgres();

            ResultSet rs = con.consultar("SELECT * FROM detallee WHERE id_pedido = '" + tablapedidos.getValueAt(tablapedidos.getSelectedRow(), 0) + "'");

            String dataa[] = new String[4];
            while (rs.next()) {
                dataa[0] = rs.getString(1);
                dataa[1] = rs.getString(2);
                dataa[2] = rs.getString(3);
                dataa[3] = rs.getString(4);

                modelotabladetalledexpedido.addRow(dataa);
            }

        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Lista_pedidos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        materialButton1 = new principal.MaterialButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladetalleporpedido = new javax.swing.JTable();
        titulo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alertas/img/fondo.png"))); // NOI18N

        materialButton1.setBackground(new java.awt.Color(0, 51, 51));
        materialButton1.setForeground(new java.awt.Color(255, 255, 255));
        materialButton1.setText("ACEPTAR");
        materialButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        materialButton1.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        materialButton1.setPreferredSize(new java.awt.Dimension(4, 17));
        materialButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButton1ActionPerformed(evt);
            }
        });
        materialButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                materialButton1KeyTyped(evt);
            }
        });

        tabladetalleporpedido.setBackground(new java.awt.Color(153, 184, 255));
        tabladetalleporpedido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabladetalleporpedido.setForeground(new java.awt.Color(255, 255, 255));
        tabladetalleporpedido = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tabladetalleporpedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "NOMBRE", "DESCRIPCIÓN", "TIPO PRODUCTO", "$PRECIO", "STOCK"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabladetalleporpedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabladetalleporpedido.setDoubleBuffered(true);
        tabladetalleporpedido.setRowHeight(20);
        tabladetalleporpedido.setSelectionBackground(new java.awt.Color(0, 153, 255));
        tabladetalleporpedido.getTableHeader().setReorderingAllowed(false);
        tabladetalleporpedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabladetalleporpedidoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabladetalleporpedido);

        titulo1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titulo1.setForeground(new java.awt.Color(0, 51, 51));
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo1.setText("Detalle por pedido");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(materialButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(materialButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 746, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void materialButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButton1ActionPerformed

        task = new TimerTask() {
            @Override
            public void run() {
                if (i == 0) {
                    Cerrar();
                } else {
                    Ubicar(i);
                    i -= 32;
                    Trasparencia((float) i / 352);
                }
            }
        };
        timer = new Timer();
        timer.schedule(task, 0, 2);


    }//GEN-LAST:event_materialButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        task = new TimerTask() {
            @Override
            public void run() {
                if (i == 352) {
                    timer.cancel();
                } else {
                    Ubicar(i);
                    i += 32;
                    Trasparencia((float) i / 352);
                }
            }
        };
        timer = new Timer();
        timer.schedule(task, 0, 2);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        setVisible(false);
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void materialButton1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_materialButton1KeyTyped
        if ((evt.getKeyChar() == KeyEvent.VK_ENTER)) {
            task = new TimerTask() {
                @Override
                public void run() {
                    if (i == 0) {
                        Cerrar();
                    } else {
                        Ubicar(i);
                        i -= 32;
                        Trasparencia((float) i / 352);
                    }
                }
            };
            timer = new Timer();
            timer.schedule(task, 0, 2);
        }
    }//GEN-LAST:event_materialButton1KeyTyped

    private void tabladetalleporpedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabladetalleporpedidoMouseClicked

    }//GEN-LAST:event_tabladetalleporpedidoMouseClicked

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
            java.util.logging.Logger.getLogger(Reporte_productosagotados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporte_productosagotados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporte_productosagotados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporte_productosagotados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Lista_Detalleporpedido dialog = new Lista_Detalleporpedido(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private principal.MaterialButton materialButton1;
    private org.edisoncor.gui.panel.Panel panel1;
    public static javax.swing.JTable tabladetalleporpedido;
    public javax.swing.JLabel titulo1;
    // End of variables declaration//GEN-END:variables

    private void Cerrar() {
        this.dispose();
        timer = null;
        task = null;
    }

    private void Trasparencia(float trasp) {
        AWTUtilities.setOpacity(this, trasp);
    }

    private void Ubicar(int y) {
        this.setLocation(300, y - 200);
    }
}

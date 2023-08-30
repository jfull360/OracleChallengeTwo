/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.oracle.api.frames;

import com.oracle.api.entities.Huespedes;
import com.oracle.api.entities.Reservas;
import com.oracle.api.services.HuespedesService;
import com.oracle.api.services.LoginService;
import com.oracle.api.services.ReservasService;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JORGE DOMINGUEZ
 */
public class FrameBusqueda extends javax.swing.JFrame {

    private final ReservasService reservas;
    private final HuespedesService huespedes;
    private final LoginService lService;

    utils convert = new utils();
    private boolean typeSearch = true;
    List<Long> listIDSelected = new ArrayList<>();

    public FrameBusqueda(ReservasService r, HuespedesService h, LoginService l) {
        initComponents();
        setLocationRelativeTo(null);
        convert.SetImage(jLabel1, "src/main/java/images/aH-150px.png");
        convert.SetImage(jLabel10, "src/main/java/images/calendario.png");
        convert.SetImage(jLabel11, "src/main/java/images/persona.png");
        convert.SetImage(jLabel16, "src/main/java/images/cerrar-sesion 32-px.png");
        convert.SetImage(jLabel17, "src/main/java/images/editar-texto.png");
        convert.SetImage(jLabel18, "src/main/java/images/lupa2.png");
        convert.SetImage(jLabel21, "src/main/java/images/deletar.png");
        
        this.reservas = r;
        this.huespedes = h;
        this.lService = l;
        ListSelectionModel cellSelectionModel = jTable1.getSelectionModel();
        cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                listIDSelected.clear();
                int[] selectedRow = jTable1.getSelectedRows();
                int[] selectedColumns = jTable1.getSelectedColumns();
                for (int i = 0; i < selectedRow.length; i++) {
                    try {
                        listIDSelected.add(Long.parseLong(jTable1.getValueAt(selectedRow[i], 0).toString()));
                    } catch (Exception ii) {
                    }
                }
            }

        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 255));
        jLabel4.setText("Sistema de Busqueda");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 60));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("Ingrese nombre o apellido");
        jTextField1.setBorder(null);
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField1MousePressed(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 180, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 170, 10));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 40, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("    Reservas");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 120, 30));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 300, 40, -1));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
        });

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 40, -1));

        jPanel2.setLayout(new java.awt.CardLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Telefono", "Nacionalidad", "Fecha Nacimiento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, "card2");

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 830, 180));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 40, -1));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText(" Huespedes");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 120, 30));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
        });

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 50, 40, 40));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel13MouseClicked(evt);
            }
        });

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 40, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MousePressed
        jTextField1.setForeground(Color.BLACK);
        if (searchText()) {//remove placeHolder
            jTextField1.setText("");
        }
    }//GEN-LAST:event_jTextField1MousePressed
    private boolean searchText() {//method to validate if textField has placeHolder (init text)
        return jTextField1.getText().compareTo("Ingrese nombre o apellido") == 0
                || jTextField1.getText().compareTo("Ingrese numero de reserva") == 0;
    }
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked

    }//GEN-LAST:event_jLabel14MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        if (typeSearch)
            searchReserva();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void searchReserva() {
        jTextField1.setText("Ingrese numero de reserva");
        jTextField1.setForeground(Color.GRAY);
        typeSearch = false;
        jTable1.setVisible(false);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);//clean data of old results
        repaintTableReservas();
    }

    private void searchHuesped() {
        jTextField1.setText("Ingrese nombre o apellido");
        jTextField1.setForeground(Color.GRAY);
        typeSearch = true;
        jTable1.setVisible(false);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);//clean data of old results
        repaintTableHuespedes();
    }
    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        //CLOSE
        FrameOptions f = new FrameOptions(reservas, huespedes, lService);
        f.setVisible(true); //open frameInput
        setVisible(false);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
//UPDATE BUTTON
        String mensaje = "";
        if (jTable1.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Favor de primero hacer una busqueda.");
            return;
        }
        stopCellEditing();
        if (typeSearch) {//user choose update "Huespedes"
            List<Huespedes> h = new ArrayList();
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                Optional<Huespedes> huespedesObject = huespedes.searchHuespedesByID(Long.parseLong(jTable1.getValueAt(i, 0).toString()));
                huespedesObject.get().setIdhuespedes(Long.parseLong(jTable1.getValueAt(i, 0).toString()));
                huespedesObject.get().setNombre(jTable1.getValueAt(i, 1).toString());
                huespedesObject.get().setApellido(jTable1.getValueAt(i, 2).toString());
                huespedesObject.get().setTelefono(jTable1.getValueAt(i, 3).toString());
                huespedesObject.get().setNacionalidad(jTable1.getValueAt(i, 4).toString());
                huespedesObject.get().setFechaNacimiento(jTable1.getValueAt(i, 5).toString());
                h.add(huespedesObject.get());
            }
            try {
                boolean result = huespedes.saveListHuespedes(h);
                mensaje = result ? ("Huespedes actualizados correctamente.") : ("Lo sentimos, no se actualizaron correctamente los huespedes.");
                searchHuesped();
            } catch (Exception e) {
                mensaje = "Lo sentimos ocurrio un error inesperado al momento de actualizar la lista de huespedes.";
            }

        } else {
            List<Reservas> r = new ArrayList();
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                Reservas reservasObject = new Reservas();
                reservasObject.setId(Long.parseLong(jTable1.getValueAt(i, 0).toString()));
                reservasObject.setValor(jTable1.getValueAt(i, 1).toString());
                reservasObject.setFechaEntrada(jTable1.getValueAt(i, 2).toString());
                reservasObject.setFechaSalida(jTable1.getValueAt(i, 3).toString());
                reservasObject.setFormaPago(jTable1.getValueAt(i, 4).toString());
                r.add(reservasObject);
            }
            try {
                boolean result = reservas.saveListReservas(r);
                mensaje = result ? ("Reservas actualizadas correctamente.") : ("Lo sentimos, no se actualizaron correctamente las reservas.");
                searchReserva();
            } catch (Exception e) {
                mensaje = "Lo sentimos ocurrio un error inesperado al momento de actualizar la lista de reservas.";
            }

        }
        JOptionPane.showMessageDialog(this, mensaje);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel9MouseClicked

    private void setDataTableHuespedes(List<Huespedes> h) {
        //set DATA to JTABLE
        stopCellEditing();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);//clean data of old results
        repaintTableHuespedes();
        for (int i = 0; i < h.size(); i++) {
            Object[] rowData = new Object[6];
            rowData[0] = h.get(i).getIdhuespedes();
            rowData[1] = h.get(i).getNombre();
            rowData[2] = h.get(i).getApellido();
            rowData[3] = h.get(i).getTelefono();
            rowData[4] = h.get(i).getNacionalidad();
            rowData[5] = h.get(i).getFechaNacimiento();
            model.addRow(rowData);
        }
        jTable1.setModel(model);
        jTable1.setVisible(true);
    }

    private void setDataTableReservas(Optional<Reservas> r) {
        //set DATA to JTABLE
        stopCellEditing();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        repaintTableReservas();
        Object[] rowData = new Object[5];
        rowData[0] = r.get().getId();
        rowData[1] = r.get().getValor();
        rowData[2] = r.get().getFechaEntrada();
        rowData[3] = r.get().getFechaSalida();
        rowData[4] = r.get().getFormaPago();
        model.addRow(rowData);
        jTable1.setModel(model);
        jTable1.setVisible(true);
    }
    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel10MouseClicked

    private void stopCellEditing() {
        if (jTable1.getCellEditor() != null) {
            try {
                jTable1.getCellEditor().stopCellEditing();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "La información mostrada puede NO SER TOTALMENTE CORRECTA esto debido que se estaba editando una celda.");
            }
        }
    }

    private void repaintTableHuespedes() {
        jTable1.getColumnModel().getColumn(0).setHeaderValue("ID");
        jTable1.getColumnModel().getColumn(1).setHeaderValue("Nombre");
        jTable1.getColumnModel().getColumn(2).setHeaderValue("Apellido");
        jTable1.getColumnModel().getColumn(3).setHeaderValue("Telefono");
        jTable1.getColumnModel().getColumn(4).setHeaderValue("Nacionalidad");
        jTable1.getColumnModel().getColumn(5).setHeaderValue("Fecha Nacimiento");
        jTable1.getTableHeader().resizeAndRepaint();
    }

    private void repaintTableReservas() {
        jTable1.getColumnModel().getColumn(0).setHeaderValue("ID");
        jTable1.getColumnModel().getColumn(1).setHeaderValue("Valor");
        jTable1.getColumnModel().getColumn(2).setHeaderValue("Fecha Entrada");
        jTable1.getColumnModel().getColumn(3).setHeaderValue("Fecha Salida");
        jTable1.getColumnModel().getColumn(4).setHeaderValue("Forma Pago");
        jTable1.getColumnModel().getColumn(5).setHeaderValue("");
        jTable1.getTableHeader().resizeAndRepaint();
    }
    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        if (!typeSearch)
            searchHuesped();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel12MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // delete button
        String mensaje = "";
        if (listIDSelected.isEmpty()) {
            mensaje = "Para eliminar favor de buscar y seleccionar un registro.";
        }

        for (int i = 0; i < listIDSelected.size(); i++) {
            if (jTable1.isRowSelected(i)) {
                try {
                    if (typeSearch) {
                        Optional<Reservas> r = huespedes.huespedHasReservas(Long.parseLong(listIDSelected.get(i).toString()));
                        if (r.isPresent()) {
                            //true meaning that we could'nt delete that huesped because he has one or more reservations in hotel
                            mensaje = "No puede eliminar este Huesped debido a que cuenta con la reservación "
                                    + r.get().getId() + ". Por favor elimine su respectiva reservación y se eliminara el Huesped automaticamente.";
                        } else {
                            huespedes.deleteHuesped(Long.parseLong(listIDSelected.get(i).toString()));
                            mensaje = "Huesped eliminado exitosamente.";
                        }
                        searchHuesped();
                    } else {
                        reservas.deleteReserva(Long.parseLong(listIDSelected.get(i).toString()));
                        mensaje = "Reserva eliminada exitosamente.";
                        searchReserva();
                    }
                } catch (Exception e) {
                    mensaje = "Lo sentimos pero pudo haber ocurrido un error y posiblemente NO SE ELIMINARON todos los registros seleccionados.";
                }
            }
        }
        JOptionPane.showMessageDialog(this, mensaje);
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jPanel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel13MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // search
        if (typeSearch) {//meaning that type "HUESPEDES" does'nt change
            if (searchText() || jTextField1.getText().isEmpty() || utils.containsNumber(jTextField1.getText())) {
                JOptionPane.showMessageDialog(this, "Favor de escribir un nombre o apellido valido.");
                return;
            }
            List<Huespedes> h = huespedes.searchHuespedesBynombre(jTextField1.getText().trim());
            if (h.isEmpty()) {
                h = huespedes.searchHuespedesByApellido(jTextField1.getText().trim());
                if (h.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Lo sentimos, No se encontraron coincidencias.");
                    return;
                } else {
                    setDataTableHuespedes(h);
                }
            } else {
                setDataTableHuespedes(h);
            }
        } else {//meaning that type change to "RESERVAS"
            Optional<Reservas> r;
            try {
                r = reservas.ReservasByID(Long.parseLong(jTextField1.getText().trim()));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Favor de escribir un numero de reserva valido.");
                return;
            }
            if (!r.isPresent()) {
                JOptionPane.showMessageDialog(this, "Lo sentimos, No se encontraron coincidencias.");
                return;
            } else {
                setDataTableReservas(r);
            }
        }
    }//GEN-LAST:event_jLabel18MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

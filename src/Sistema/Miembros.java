package Sistema;

import Control.MiembrosT;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Miembros extends JFrame {
    ResultSet rs = null;
    MiembrosT miemb = new MiembrosT();
    public static DefaultTableModel mmiembros;
    boolean borrar = false;
    private int t = 1;

    public Miembros() {
        initComponents();
        setLocationRelativeTo(null);
        ListarTablaMiembros();
        txtApellidoP.requestFocus();
        txtEdad.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbMiembros = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        dtcCumpleaños = new com.toedter.calendar.JDateChooser();
        txtEmail = new javax.swing.JTextField();
        txtApellidoP = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtApellidoM = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cboCondicion = new javax.swing.JComboBox();
        txtNombre = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cboEstadoCivil = new javax.swing.JComboBox();
        cboSexo = new javax.swing.JComboBox();
        Sexo = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        txtPertenece = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtTelefono1 = new javax.swing.JTextField();
        txtTelefono2 = new javax.swing.JTextField();
        txtTelefono3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cboGrupo = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        cboBuscar = new javax.swing.JComboBox();
        txtCodigo = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        btnTalentos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tbMiembros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Apellido P.", "Apellido M.", "Nombre", "Teléfono 1", "Condición", "Grupo", "Pertenece a"
            }
        ));
        jScrollPane1.setViewportView(tbMiembros);
        tbMiembros.getColumnModel().getColumn(0).setPreferredWidth(20);

        jLabel9.setText("Cumpleaños:");

        dtcCumpleaños.setDateFormatString("dd-MM-yyyy");

        txtApellidoP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtApellidoPMouseClicked(evt);
            }
        });

        jLabel11.setText("D.N.I.:");

        jLabel3.setText("Nombre:");

        jLabel10.setText("Edad:");

        jLabel2.setText("Apellido Materno:");

        jLabel13.setText("Condición:");

        jLabel1.setText("Apellido Paterno:");

        cboCondicion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Regular", "Irregular", "Especial" }));

        jLabel12.setText("Estado Civil:");

        cboEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Soltero", "Casado", "Viudo", "Divorciado", "Separado", "Unión Libre" }));

        cboSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));

        Sexo.setText("Sexo:");

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/6596794-nuevo-boton-3d-rojo-brillante-metalico.jpg"))); // NOI18N
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jLabel4.setText("Dirección:");

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/User_add.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Settings_32x32.png"))); // NOI18N
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel15.setText("Pertenece a:");

        jLabel5.setText("Telefono 1:");

        jLabel6.setText("Telefono 2:");

        jLabel14.setText("Grupo:");

        jLabel7.setText("Telefono 3:");

        cboGrupo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        jLabel8.setText("Email:");

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/User_delete.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_buscar.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        cboBuscar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Buscar por", "Nombre", "Apellido_paterno", "Apellido_materno", "DNI", "Condicion", "Grupo" }));

        btnTalentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Chart.png"))); // NOI18N
        btnTalentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTalentosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(Sexo)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtApellidoP)
                    .addComponent(txtTelefono3)
                    .addComponent(txtTelefono2)
                    .addComponent(txtTelefono1)
                    .addComponent(cboSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombre)
                    .addComponent(txtApellidoM)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel11)
                        .addComponent(jLabel12)
                        .addComponent(jLabel13)
                        .addComponent(jLabel14)
                        .addComponent(jLabel15))
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cboGrupo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboCondicion, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboEstadoCivil, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dtcCumpleaños, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPertenece)
                    .addComponent(txtEdad)
                    .addComponent(txtDNI))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cboBuscar, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnTalentos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dtcCumpleaños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10)
                                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Sexo)
                                            .addComponent(cboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11)
                                            .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12)
                                            .addComponent(cboEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnNuevo)
                                            .addComponent(btnEliminar))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel13)
                                            .addComponent(cboCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel14)
                                            .addComponent(cboGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btnTalentos))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTelefono3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel15)
                                    .addComponent(txtPertenece, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidoPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidoPMouseClicked
        // TODO add your handling code here:        
    }//GEN-LAST:event_txtApellidoPMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:       
        try{
            txtEdad.setEnabled(false);
            ListarDetalleMiembros();
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Seleccione un miembro.");
        }
        t = 2;
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        txtCodigo.setText(null);
        txtApellidoP.setText(null);
        txtApellidoM.setText(null);
        txtNombre.setText(null);
        cboSexo.setSelectedIndex(0);
        txtDireccion.setText(null);
        txtTelefono1.setText(null);
        txtTelefono2.setText(null);
        txtTelefono3.setText(null);
        txtEmail.setText(null);                
        dtcCumpleaños.setDate(null);                
        txtEdad.setText(null);
        txtDNI.setText(null);                                    
        cboEstadoCivil.setSelectedIndex(0);
        cboCondicion.setSelectedIndex(0);              
        cboGrupo.setSelectedIndex(0);
        txtPertenece.setText(null);                
        LimpiarTabla();
        ListarTablaMiembros();
        txtApellidoP.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String a = "", b = "";
        borrar = true;
        LimpiarTabla();
        if (cboBuscar.getSelectedIndex()==1) {          
            a = cboBuscar.getSelectedItem().toString();
            b = txtNombre.getText();
        } else if(cboBuscar.getSelectedIndex()==2) {
            a = cboBuscar.getSelectedItem().toString();
            b = txtApellidoP.getText();
        } else if(cboBuscar.getSelectedIndex()==3) {
            a = cboBuscar.getSelectedItem().toString();
            b = txtApellidoM.getText();
        } else if(cboBuscar.getSelectedIndex()==4) {
            a = cboBuscar.getSelectedItem().toString();
            b = txtDNI.getText();
        } else if(cboBuscar.getSelectedIndex()==5) {
            a = cboBuscar.getSelectedItem().toString();
            b = cboCondicion.getSelectedItem().toString();
        } else if(cboBuscar.getSelectedIndex()==6) {
            a = cboBuscar.getSelectedItem().toString();
            b = cboGrupo.getSelectedItem().toString();
        }
        rs = null;
        rs = miemb.BuscarMiembros(a,b);
        mmiembros = (DefaultTableModel)tbMiembros.getModel();
        String reg[] = new String[20];
        try {
            while(rs.next()) {
                reg[0] = rs.getString(1);
                reg[1] = rs.getString(2);
                reg[2] = rs.getString(3);
                reg[3] = rs.getString(4);
                reg[4] = rs.getString(5);
                reg[5] = rs.getString(6);
                reg[6] = rs.getString(7);
                reg[7] = rs.getString(8);
                mmiembros.addRow(reg);
            }
            tbMiembros.setModel(mmiembros);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }                
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        try {
            mmiembros = (DefaultTableModel)tbMiembros.getModel();
            int fila = tbMiembros.getSelectedRow();
            int id = Integer.parseInt(mmiembros.getValueAt(fila, 0).toString());
            int response = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el Registro?", "Confirm",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.NO_OPTION) {
                return;
            } else if (response == JOptionPane.YES_OPTION) {
                miemb.EliminarMiembros(id);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }  
        LimpiarTabla();
        ListarTablaMiembros();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:            
        try {                               
            int a = Integer.parseInt(txtCodigo.getText());
            String b = txtNombre.getText();
            String c = txtApellidoP.getText();
            String d = txtApellidoM.getText();
            String e = cboSexo.getSelectedItem().toString();
            String f = txtDireccion.getText();  
            String g = txtTelefono1.getText();
            String h = txtTelefono2.getText();
            String i = txtTelefono3.getText();
            String j = txtEmail.getText();
            Date k = dtcCumpleaños.getDate();
            SimpleDateFormat fechaPersonalizada = new SimpleDateFormat("yyyy-MM-dd");
            String fecha = fechaPersonalizada.format(k);                                    
            String l = txtDNI.getText(); 
            String m = cboEstadoCivil.getSelectedItem().toString();
            String n = cboCondicion.getSelectedItem().toString(); 
            String o = cboGrupo.getSelectedItem().toString();
            String p = txtPertenece.getText();
            if(t == 1){
                miemb.InsertarMiembros(b,c,d,e,f,g,h,i,j,fecha,l,m,n,o,p);
                LimpiarTabla();
                ListarTablaMiembros();
            } else if(t == 2){
                miemb.ModificarMiembros(a,b,c,d,e,f,g,h,i,j,l,m,n,o,p);
            }
            LimpiarTabla();
            ListarTablaMiembros();
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnTalentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTalentosActionPerformed
        // TODO add your handling code here:
        try{            
            Talentos tt = new Talentos();
            tt.setVisible(true);
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Seleccione un miembro." + ex);
        }
    }//GEN-LAST:event_btnTalentosActionPerformed

    public void ListarTablaMiembros(){
        rs = null;
        rs = miemb.ListarMiembros();
        mmiembros = (DefaultTableModel)tbMiembros.getModel();
        String reg[] = new String[20];
        try{
            while(rs.next()){
                reg[0] = rs.getString(1);
                reg[1] = rs.getString(2);
                reg[2] = rs.getString(3);
                reg[3] = rs.getString(4);
                reg[4] = rs.getString(5);
                reg[5] = rs.getString(6);
                reg[6] = rs.getString(7);
                reg[7] = rs.getString(8);               
                mmiembros.addRow(reg);
            }
            tbMiembros.setModel(mmiembros);
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void LimpiarTabla(){
        int filas = tbMiembros.getRowCount();
        if(borrar==false){
            for(int i=0;filas>i;i++){
                mmiembros.removeRow(0);
            }          
        } else if(borrar==true) {
            for(int i=0;filas>i;i++){
                mmiembros.removeRow(0);
            }
        }
    }
    
    public void ListarDetalleMiembros(){
        int filaM = tbMiembros.getSelectedRow();
        int selecM = Integer.parseInt(mmiembros.getValueAt(filaM, 0).toString());
        rs = null;
        rs = miemb.ListarDetalleMiembro(selecM);
        try{
            while(rs.next()){
                txtCodigo.setText(String.valueOf(rs.getInt(1)));
                txtApellidoP.setText(rs.getString(2));
                txtApellidoM.setText(rs.getString(3));
                txtNombre.setText(rs.getString(4));
                switch(rs.getString(5)){
                    case "Masculino":
                        cboSexo.setSelectedIndex(0);
                        break;
                    case "Femenino":
                        cboSexo.setSelectedIndex(1);
                        break;
                }
                txtDireccion.setText(rs.getString(6));
                txtTelefono1.setText(rs.getString(7));
                txtTelefono2.setText(rs.getString(8));
                txtTelefono3.setText(rs.getString(9));
                txtEmail.setText(rs.getString(10));                
                dtcCumpleaños.setDate(rs.getDate(11));                
                txtEdad.setText(String.valueOf(rs.getString(12)));
                txtDNI.setText(String.valueOf(rs.getInt(13)));
                switch(rs.getString(14)){
                    case "Soltero":
                        cboEstadoCivil.setSelectedIndex(0);
                        break;
                    case "Casado":
                        cboEstadoCivil.setSelectedIndex(1);
                        break;
                    case "Viudo":
                        cboEstadoCivil.setSelectedIndex(2);
                        break;
                    case "Divorciado":
                        cboEstadoCivil.setSelectedIndex(3);
                        break;
                    case "Separado":
                        cboEstadoCivil.setSelectedIndex(4);
                        break;
                    case "Unión Libre":
                        cboEstadoCivil.setSelectedIndex(5);
                        break;
                }
                switch(rs.getString(15)){
                    case "Regular":
                        cboCondicion.setSelectedIndex(0);
                        break;
                    case "Irregular":
                        cboEstadoCivil.setSelectedIndex(1);
                        break;
                    case "Especial":
                        cboEstadoCivil.setSelectedIndex(2);
                        break;                    
                }
                switch(rs.getInt(16)){
                    case 1:                        
                        cboGrupo.setSelectedIndex(0);
                        break;
                    case 2:
                        cboGrupo.setSelectedIndex(1);
                        break;
                    case 3:
                        cboGrupo.setSelectedIndex(2);
                        break;
                    case 4:
                        cboGrupo.setSelectedIndex(3);
                        break;
                    case 5:
                        cboGrupo.setSelectedIndex(4);
                        break;
                    case 6:
                        cboGrupo.setSelectedIndex(5);
                        break;
                    case 7:
                        cboGrupo.setSelectedIndex(6);
                        break;
                    case 8:
                        cboGrupo.setSelectedIndex(7);
                        break;
                    case 9:
                        cboGrupo.setSelectedIndex(8);
                        break;
                    case 10:
                        cboGrupo.setSelectedIndex(9);
                        break;
                    case 11:
                        cboGrupo.setSelectedIndex(10);
                        break;
                    case 12:
                        cboGrupo.setSelectedIndex(11);
                        break;
                    case 13:
                        cboGrupo.setSelectedIndex(12);
                        break;
                    case 14:
                        cboGrupo.setSelectedIndex(13);
                        break;
                    case 15:
                        cboGrupo.setSelectedIndex(14);
                        break;
                    case 16:
                        cboGrupo.setSelectedIndex(15);
                        break;
                    case 17:
                        cboGrupo.setSelectedIndex(16);
                        break;
                    case 18:
                        cboGrupo.setSelectedIndex(17);
                        break;
                    case 19:
                        cboGrupo.setSelectedIndex(18);
                        break;
                    case 20:
                        cboGrupo.setSelectedIndex(19);
                        break;
                }
                txtPertenece.setText(rs.getString(17));                
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Miembros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Miembros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Miembros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Miembros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Miembros().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Sexo;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnTalentos;
    private javax.swing.JComboBox cboBuscar;
    private javax.swing.JComboBox cboCondicion;
    private javax.swing.JComboBox cboEstadoCivil;
    private javax.swing.JComboBox cboGrupo;
    private javax.swing.JComboBox cboSexo;
    private com.toedter.calendar.JDateChooser dtcCumpleaños;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tbMiembros;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPertenece;
    private javax.swing.JTextField txtTelefono1;
    private javax.swing.JTextField txtTelefono2;
    private javax.swing.JTextField txtTelefono3;
    // End of variables declaration//GEN-END:variables
}

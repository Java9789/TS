package Sistema;

import Control.MiembrosT;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DetalleMiembros extends JFrame {
    ResultSet rs = null;
    MiembrosT mi = new MiembrosT();
    DefaultTableModel mdetalle;

    public DetalleMiembros() {
        initComponents();
        setLocationRelativeTo(null);
        ListarDetalleMiembros();
        btnGuardar.setEnabled(false);        
        dtcCumpleaños.setEnabled(false);        
        txtCodigo.setVisible(false);
    }       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtApellidoM = new javax.swing.JTextField();
        Sexo = new javax.swing.JLabel();
        cboSexo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono1 = new javax.swing.JTextField();
        txtTelefono2 = new javax.swing.JTextField();
        txtTelefono3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        dtcCumpleaños = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtEdad = new VistaIntegerTextField.JIntegerTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDNI = new VistaIntegerTextField.JIntegerTextField();
        jLabel12 = new javax.swing.JLabel();
        cboEstadoCivil = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        cboCondicion = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        cboGrupo = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        txtPertenece = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnXX = new javax.swing.JButton();
        txtApellidoP = new javax.swing.JTextField();
        btnMinimizar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Apellido Paterno:");

        txtNombre.setEditable(false);

        jLabel2.setText("Apellido Materno:");

        jLabel3.setText("Nombre:");

        txtApellidoM.setEditable(false);

        Sexo.setText("Sexo:");

        cboSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));
        cboSexo.setEnabled(false);

        jLabel4.setText("Dirección:");

        txtDireccion.setEditable(false);

        txtTelefono1.setEditable(false);

        txtTelefono2.setEditable(false);

        txtTelefono3.setEditable(false);

        jLabel5.setText("Telefono 1:");

        jLabel6.setText("Telefono 2:");

        jLabel7.setText("Telefono 3:");

        jLabel8.setText("Email:");

        txtEmail.setEditable(false);

        dtcCumpleaños.setDateFormatString("dd-MM-yyyy");

        jLabel9.setText("Cumpleaños:");

        jLabel10.setText("Edad:");

        txtEdad.setEditable(false);

        jLabel11.setText("D.N.I.:");

        txtDNI.setEditable(false);

        jLabel12.setText("Estado Civil:");

        cboEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Soltero", "Casado", "Viudo", "Divorciado", "Separado", "Unión Libre" }));
        cboEstadoCivil.setEnabled(false);

        jLabel13.setText("Condición:");

        cboCondicion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Regular", "Irregular", "Especial" }));
        cboCondicion.setEnabled(false);

        jLabel14.setText("Grupo:");

        cboGrupo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        cboGrupo.setEnabled(false);

        jLabel15.setText("Pertenece a:");

        txtPertenece.setEditable(false);

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Settings_32x32.png"))); // NOI18N
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SaveProjectButton.png"))); // NOI18N

        btnXX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_eliminar.jpg"))); // NOI18N

        txtApellidoP.setEditable(false);
        txtApellidoP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtApellidoPMouseClicked(evt);
            }
        });

        btnMinimizar.setText("-");
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });

        btnCerrar.setText("X");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
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
                    .addComponent(cboSexo, 0, 150, Short.MAX_VALUE)
                    .addComponent(txtNombre)
                    .addComponent(txtApellidoM)
                    .addComponent(txtDireccion))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail)
                            .addComponent(txtPertenece)
                            .addComponent(cboGrupo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dtcCumpleaños, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(txtEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDNI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboEstadoCivil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboCondicion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMinimizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnXX, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(20, 20, 20)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnXX)
                        .addGap(349, 349, 349)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(btnMinimizar)
                            .addComponent(btnCerrar)
                            .addComponent(jLabel8)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Sexo)
                                    .addComponent(cboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(cboEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                                    .addComponent(cboGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTelefono3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel15)
                                    .addComponent(txtPertenece, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dtcCumpleaños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidoPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidoPMouseClicked
        // TODO add your handling code here:        
    }//GEN-LAST:event_txtApellidoPMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        txtApellidoP.setEditable(true);
        txtApellidoM.setEditable(true);
        txtNombre.setEditable(true);
        cboSexo.setEnabled(true);
        txtDireccion.setEditable(true);
        txtTelefono1.setEditable(true);
        txtTelefono2.setEditable(true);
        txtTelefono3.setEditable(true);
        txtEmail.setEditable(true);
        dtcCumpleaños.setEnabled(true);                        
        txtDNI.setEditable(true);
        cboEstadoCivil.setEnabled(true);
        cboCondicion.setEnabled(true);
        cboGrupo.setEnabled(true);
        txtNombre.requestFocus();
        txtPertenece.setEditable(true);
        btnModificar.setEnabled(false);
        btnGuardar.setEnabled(true);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        // TODO add your handling code here:
        setExtendedState(JFrame.CROSSHAIR_CURSOR); 
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    public void ListarDetalleMiembros(){
     //   int filaM = Miembros.tbMiembros.getSelectedRow();
       // int selecM = Integer.parseInt(Miembros.mmiembros.getValueAt(filaM, 0).toString());
        rs = null;
       // rs = mi.ListarDetalleMiembro(selecM);
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
                }
                txtPertenece.setText(rs.getString(17));                
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
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
            java.util.logging.Logger.getLogger(DetalleMiembros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalleMiembros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalleMiembros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalleMiembros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new DetalleMiembros().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Sexo;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnXX;
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
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtCodigo;
    private VistaIntegerTextField.JIntegerTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private VistaIntegerTextField.JIntegerTextField txtEdad;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPertenece;
    private javax.swing.JTextField txtTelefono1;
    private javax.swing.JTextField txtTelefono2;
    private javax.swing.JTextField txtTelefono3;
    // End of variables declaration//GEN-END:variables
}
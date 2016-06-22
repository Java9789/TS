package Sistema;

import Control.RSemanaT;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ReporteSemana22 extends javax.swing.JFrame {
    ResultSet rs = null;
    RSemanaT rst = new RSemanaT();
    DefaultTableModel mmsabado, mmsemana;
    
    public ReporteSemana22() {
        initComponents();
        setLocationRelativeTo(null);
        dtcSabado.getCalendarButton().setEnabled(false);
        dtcMiercoles.getCalendarButton().setEnabled(false);
        dtcViernes.getCalendarButton().setEnabled(false);
        tbSabado.requestFocus();
        Inicio();
        Sabado();
        SabadoTotal();
        Miercoles();
        Viernes();
        Semanaaa();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sem = new javax.swing.JLabel();
        Tot = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSabado = new javax.swing.JTable();
        dtcSabado = new com.toedter.calendar.JDateChooser();
        txtTotalSabado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnMenores = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dtcMiercoles = new com.toedter.calendar.JDateChooser();
        dtcViernes = new com.toedter.calendar.JDateChooser();
        txtMMiercoles = new javax.swing.JTextField();
        txtMViernes = new javax.swing.JTextField();
        txtTotalSemana = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Sem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Sem.setText("Semana:");

        Tot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tot.setText("Total:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Sábado"));

        tbSabado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de Ofrenda", "Monto"
            }
        ));
        jScrollPane1.setViewportView(tbSabado);
        tbSabado.getColumnModel().getColumn(0).setPreferredWidth(130);
        tbSabado.getColumnModel().getColumn(1).setPreferredWidth(50);

        dtcSabado.setDateFormatString("dd-MM-yyyy");

        txtTotalSabado.setEditable(false);

        jLabel1.setText("Total:");

        btnMenores.setText("Ver suma de \"Menores\"");
        btnMenores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMenores)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(dtcSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dtcSabado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalSabado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnMenores))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Semana"));

        jLabel2.setText("Miércoles:");

        jLabel3.setText("Viernes:");

        dtcMiercoles.setDateFormatString("dd-MM-yyyy");

        dtcViernes.setDateFormatString("dd-MM-yyyy");

        txtMMiercoles.setEditable(false);

        txtMViernes.setEditable(false);

        txtTotalSemana.setEditable(false);

        jLabel4.setText("Total:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dtcMiercoles, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(dtcViernes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMMiercoles)
                    .addComponent(txtMViernes)
                    .addComponent(txtTotalSemana, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtcMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(dtcViernes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMViernes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalSemana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(Sem)
                .addGap(100, 100, 100)
                .addComponent(Tot)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sem)
                    .addComponent(Tot))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenoresActionPerformed
        // TODO add your handling code here:
        try {
            mmsabado = (DefaultTableModel)tbSabado.getModel();
            double a,b,c,d,e,rs;
            a = Double.parseDouble(mmsabado.getValueAt(0, 1).toString());
            b = Double.parseDouble(mmsabado.getValueAt(1, 1).toString());
            c = Double.parseDouble(mmsabado.getValueAt(2, 1).toString());
            d = Double.parseDouble(mmsabado.getValueAt(3, 1).toString());
            e = Double.parseDouble(mmsabado.getValueAt(4, 1).toString());
            rs = a + b +c+d+e;
            btnMenores.setText(String.valueOf("Menores: "+rs));
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnMenoresActionPerformed

    public void Inicio(){
        int fila = ReporteSemana1.tbSemana.getSelectedRow();
        String sem = ReporteSemana1.mmsemana.getValueAt(fila, 0).toString();
        Sem.setText("Semana: " + sem);                                
        String total = ReporteSemana1.mmsemana.getValueAt(fila, 2).toString();
        Tot.setText("Total: S/."+ total);
    }
    
    public void Sabado(){
        int fila = ReporteSemana1.tbSemana.getSelectedRow();
        rs = null;
        rs = rst.ListarSabado1(ReporteSemana1.mmsemana.getValueAt(fila, 0).toString());
        mmsabado = (DefaultTableModel)tbSabado.getModel();        
        String re[] = new String[3];
        try {
            while(rs.next()){
                re[0] = rs.getString(1);
                re[1] = rs.getString(2);                
                mmsabado.addRow(re);
            }
            tbSabado.setModel(mmsabado);
        } catch(Exception ex){
            System.out.println(ex);                    
        }
    }
    
    public void SabadoTotal(){
        int fila = ReporteSemana1.tbSemana.getSelectedRow();
        rs = null;
        rs = rst.ListarSabado2(ReporteSemana1.mmsemana.getValueAt(fila, 0).toString());                     
        try {
            while(rs.next()){
                txtTotalSabado.setText(rs.getString(1));                
                dtcSabado.setDate(rs.getDate(2));                                
            }            
        } catch(Exception ex){
            System.out.println(ex);                    
        }
    }
    
    public void Miercoles(){
        int fila = ReporteSemana1.tbSemana.getSelectedRow();
        rs = null;
        rs = rst.ListarSemanaMi(ReporteSemana1.mmsemana.getValueAt(fila, 0).toString());                     
        try {
            while(rs.next()){
                dtcMiercoles.setDate(rs.getDate(1));
                txtMMiercoles.setText(rs.getString(2));                                                                
            }            
        } catch(Exception ex){
            System.out.println(ex);                    
        }
    }
    
    public void Viernes(){
        int fila = ReporteSemana1.tbSemana.getSelectedRow();
        rs = null;
        rs = rst.ListarSemanaVi(ReporteSemana1.mmsemana.getValueAt(fila, 0).toString());                     
        try {
            while(rs.next()){
                dtcViernes.setDate(rs.getDate(1));
                txtMViernes.setText(rs.getString(2));                                                                
            }            
        } catch(Exception ex){
            System.out.println(ex);                    
        }
    }
    
    public void Semanaaa(){
        double x = Double.parseDouble(txtMMiercoles.getText()) + Double.parseDouble(txtMViernes.getText());
        txtTotalSemana.setText(String.valueOf(x));
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
            java.util.logging.Logger.getLogger(ReporteSemana22.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteSemana22.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteSemana22.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteSemana22.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ReporteSemana22().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Sem;
    private javax.swing.JLabel Tot;
    private javax.swing.JButton btnMenores;
    private com.toedter.calendar.JDateChooser dtcMiercoles;
    private com.toedter.calendar.JDateChooser dtcSabado;
    private com.toedter.calendar.JDateChooser dtcViernes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbSabado;
    private javax.swing.JTextField txtMMiercoles;
    private javax.swing.JTextField txtMViernes;
    private javax.swing.JTextField txtTotalSabado;
    private javax.swing.JTextField txtTotalSemana;
    // End of variables declaration//GEN-END:variables
}

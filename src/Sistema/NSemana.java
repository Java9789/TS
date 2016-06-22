package Sistema;

import Control.NSemanaT;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NSemana extends JFrame {
    NSemanaT nst = new NSemanaT();
    DefaultTableModel mmsabado;
    DefaultTableModel mmsemana;
    DefaultTableModel mmIDsabado;
    DefaultTableModel mmIDsemana;
    ResultSet rs = null;
    
    public NSemana() {
        initComponents();
        setLocationRelativeTo(null);
        tbSabado.requestFocus();
        txtUSemana.setVisible(false);
        tbIdsabado.setVisible(false);
        tbIdsemana.setVisible(false);
        ListarTablaTipoSabado();
        ListarTablaTipoSemana();              
        UltimaSemana1();
        IDSabado();
        IDSemana();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSabado = new javax.swing.JTable();
        btnCalcSabado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        dtcSabado = new com.toedter.calendar.JDateChooser();
        txtSumaSabado = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbIdsabado = new javax.swing.JTable();
        txtMenores = new javax.swing.JTextField();
        btnMenores = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbSemana = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dtcMiercoles = new com.toedter.calendar.JDateChooser();
        dtcViernes = new com.toedter.calendar.JDateChooser();
        btnCalcSemana = new javax.swing.JButton();
        txtSumaSemana = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbIdsemana = new javax.swing.JTable();
        txtUSemana = new javax.swing.JTextField();
        btnTotalizar = new javax.swing.JButton();
        txtTotalizacion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Sábado"));

        tbSabado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "...", "Tipo Ofrenda", "Monto"
            }
        ));
        jScrollPane1.setViewportView(tbSabado);
        tbSabado.getColumnModel().getColumn(0).setPreferredWidth(10);
        tbSabado.getColumnModel().getColumn(1).setPreferredWidth(150);

        btnCalcSabado.setText("Calcular Total");
        btnCalcSabado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcSabadoActionPerformed(evt);
            }
        });

        jLabel1.setText("Fecha:");

        dtcSabado.setDateFormatString("dd-MM-yyyy");

        txtSumaSabado.setEditable(false);

        tbIdsabado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ));
        jScrollPane3.setViewportView(tbIdsabado);

        txtMenores.setEditable(false);

        btnMenores.setText("Suma de \"Menores\"");
        btnMenores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(dtcSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                .addComponent(btnMenores))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCalcSabado)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSumaSabado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMenores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dtcSabado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMenores)
                        .addComponent(txtMenores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcSabado)
                    .addComponent(txtSumaSabado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("En la semana"));

        tbSemana.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "...", "Día", "Monto"
            }
        ));
        jScrollPane2.setViewportView(tbSemana);
        tbSemana.getColumnModel().getColumn(0).setPreferredWidth(10);

        jLabel2.setText("Miércoles:");

        jLabel3.setText("Viernes:");

        dtcMiercoles.setDateFormatString("dd-MM-yyyy");

        dtcViernes.setDateFormatString("dd-MM-yyyy");

        btnCalcSemana.setText("Calcular Total");
        btnCalcSemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcSemanaActionPerformed(evt);
            }
        });

        txtSumaSemana.setEditable(false);

        tbIdsemana.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ));
        jScrollPane4.setViewportView(tbIdsemana);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dtcMiercoles, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(dtcViernes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCalcSemana)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtSumaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dtcMiercoles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dtcViernes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCalcSemana)
                        .addComponent(txtSumaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnTotalizar.setText("Registrar");
        btnTotalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalizarActionPerformed(evt);
            }
        });

        txtTotalizacion.setEditable(false);
        txtTotalizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalizacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtUSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTotalizar)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUSemana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnTotalizar)
                                .addComponent(txtTotalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcSabadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcSabadoActionPerformed
        // TODO add your handling code here:
        try {
            mmsabado = (DefaultTableModel)tbSabado.getModel();
            double a,b,c,d,e,f,g,h,i,j,k,rs;
            a = Double.parseDouble(mmsabado.getValueAt(0, 2).toString());
            b = Double.parseDouble(mmsabado.getValueAt(1, 2).toString());
            c = Double.parseDouble(mmsabado.getValueAt(2, 2).toString());
            d = Double.parseDouble(mmsabado.getValueAt(3, 2).toString());
            e = Double.parseDouble(mmsabado.getValueAt(4, 2).toString());
            f = Double.parseDouble(mmsabado.getValueAt(5, 2).toString());
            g = Double.parseDouble(mmsabado.getValueAt(6, 2).toString());
            h = Double.parseDouble(mmsabado.getValueAt(7, 2).toString());
            i = Double.parseDouble(mmsabado.getValueAt(8, 2).toString());
            j = Double.parseDouble(mmsabado.getValueAt(9, 2).toString());
            k = Double.parseDouble(mmsabado.getValueAt(10, 2).toString());        
            rs = a + b + c + d + e + f + g + h + i + j + k;
            txtSumaSabado.setText(String.valueOf(rs));
            tbSabado.clearSelection();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "¡No deje cantidades en blanco ni escriba letras!");
            // System.out.println(e);            
        }                
    }//GEN-LAST:event_btnCalcSabadoActionPerformed

    private void btnCalcSemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcSemanaActionPerformed
        // TODO add your handling code here:
        try {
            mmsemana = (DefaultTableModel)tbSemana.getModel();
            double a,b,rs;
            a = Double.parseDouble(mmsemana.getValueAt(0, 2).toString());
            b = Double.parseDouble(mmsemana.getValueAt(1, 2).toString());       
            rs = a + b;
            txtSumaSemana.setText(String.valueOf(rs));
            tbSemana.clearSelection();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "¡No deje cantidades en blanco ni escriba letras!");
            // System.out.println(e);            
        } 
    }//GEN-LAST:event_btnCalcSemanaActionPerformed

    private void btnTotalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalizarActionPerformed
        // TODO add your handling code here:
        try {
            // Suma de sabado y semana
            double sumasabado = Double.parseDouble(txtSumaSabado.getText());
            double sumasemana = Double.parseDouble(txtSumaSemana.getText());
            double sumaaa = sumasabado + sumasemana;
            txtTotalizacion.setText(String.valueOf(sumaaa));           
            // Actualizacion de la semana final
            String semana_final = txtUSemana.getText();            
            double monto_final = Double.parseDouble(txtTotalizacion.getText());
            nst.ActualizarSemanaFinal(monto_final, semana_final);
            // Insertar sabado            
            Date c = dtcSabado.getDate();            
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            String fechasab = formato.format(c);
            nst.InsertarSabado(semana_final, sumasabado, fechasab);
            // Insertar semana            
            nst.InsertarSemana(semana_final, sumasemana);
            // Insertar detalle sabado
            nst.InsertarDetalleSabado(mmIDsabado.getRowCount()+1, mmsabado.getValueAt(0, 0).toString(), Double.parseDouble(mmsabado.getValueAt(0, 2).toString()));
            nst.InsertarDetalleSabado(mmIDsabado.getRowCount()+1, mmsabado.getValueAt(1, 0).toString(), Double.parseDouble(mmsabado.getValueAt(1, 2).toString()));
            nst.InsertarDetalleSabado(mmIDsabado.getRowCount()+1, mmsabado.getValueAt(2, 0).toString(), Double.parseDouble(mmsabado.getValueAt(2, 2).toString()));
            nst.InsertarDetalleSabado(mmIDsabado.getRowCount()+1, mmsabado.getValueAt(3, 0).toString(), Double.parseDouble(mmsabado.getValueAt(3, 2).toString()));
            nst.InsertarDetalleSabado(mmIDsabado.getRowCount()+1, mmsabado.getValueAt(4, 0).toString(), Double.parseDouble(mmsabado.getValueAt(4, 2).toString()));
            nst.InsertarDetalleSabado(mmIDsabado.getRowCount()+1, mmsabado.getValueAt(5, 0).toString(), Double.parseDouble(mmsabado.getValueAt(5, 2).toString()));
            nst.InsertarDetalleSabado(mmIDsabado.getRowCount()+1, mmsabado.getValueAt(6, 0).toString(), Double.parseDouble(mmsabado.getValueAt(6, 2).toString()));
            nst.InsertarDetalleSabado(mmIDsabado.getRowCount()+1, mmsabado.getValueAt(7, 0).toString(), Double.parseDouble(mmsabado.getValueAt(7, 2).toString()));
            nst.InsertarDetalleSabado(mmIDsabado.getRowCount()+1, mmsabado.getValueAt(8, 0).toString(), Double.parseDouble(mmsabado.getValueAt(8, 2).toString()));
            nst.InsertarDetalleSabado(mmIDsabado.getRowCount()+1, mmsabado.getValueAt(9, 0).toString(), Double.parseDouble(mmsabado.getValueAt(9, 2).toString()));
            nst.InsertarDetalleSabado(mmIDsabado.getRowCount()+1, mmsabado.getValueAt(10, 0).toString(), Double.parseDouble(mmsabado.getValueAt(10, 2).toString()));
            // Insertar detalle semana
            Date mi = dtcMiercoles.getDate();
            SimpleDateFormat mii = new SimpleDateFormat("yyyy-MM-dd");
            String miii = mii.format(mi);
            Date vi = dtcViernes.getDate();
            SimpleDateFormat vii = new SimpleDateFormat("yyyy-MM-dd");
            String viii = vii.format(vi);
            nst.InsertarDetalleSemana(mmsemana.getValueAt(0, 0).toString(), mmIDsemana.getRowCount()+1, Double.parseDouble(mmsemana.getValueAt(0, 2).toString()), miii);
            nst.InsertarDetalleSemana(mmsemana.getValueAt(1, 0).toString(), mmIDsemana.getRowCount()+1, Double.parseDouble(mmsemana.getValueAt(1, 2).toString()), viii);            
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error en: " + ex);
        }
    }//GEN-LAST:event_btnTotalizarActionPerformed

    private void txtTotalizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalizacionActionPerformed

    private void btnMenoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenoresActionPerformed
        // TODO add your handling code here:
        try {
            mmsabado = (DefaultTableModel)tbSabado.getModel();
            double a,b,c,d,e,rs;
            a = Double.parseDouble(mmsabado.getValueAt(0, 2).toString());
            b = Double.parseDouble(mmsabado.getValueAt(1, 2).toString());
            c = Double.parseDouble(mmsabado.getValueAt(2, 2).toString());
            d = Double.parseDouble(mmsabado.getValueAt(3, 2).toString());
            e = Double.parseDouble(mmsabado.getValueAt(4, 2).toString());
            rs = a + b +c + d + e;
            txtMenores.setText(String.valueOf(rs));
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "¡No deje espacios en blanco ni escriba letras en campos de \"Menores\"");
        }
    }//GEN-LAST:event_btnMenoresActionPerformed

    public void ListarTablaTipoSabado(){
        rs = null;
        rs = nst.ListarTipoSabado();
        mmsabado = (DefaultTableModel)tbSabado.getModel();
        String reg[] = new String[5];
        try {
            while(rs.next()){
                reg[0] = rs.getString(1);
                reg[1] = rs.getString(2);
                reg[2] = "";
                mmsabado.addRow(reg);
            }
            tbSabado.setModel(mmsabado);
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }
    
    public void ListarTablaTipoSemana(){
        rs = null;
        rs = nst.ListarTipoSemana();
        mmsemana = (DefaultTableModel)tbSemana.getModel();
        String reg[] = new String[5];
        try {
            while(rs.next()){
                reg[0] = rs.getString(1);
                reg[1] = rs.getString(2);
                reg[2] = "";
                mmsemana.addRow(reg);
            }
            tbSemana.setModel(mmsemana);
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }
    
    public void UltimaSemana1(){
        dtcSabado.setDate(PrevioNSemana.dtcFecha.getDate());
        rs = null;
        rs = nst.UltimaSemana1();                
        try {
            while(rs.next()){
                txtUSemana.setText(rs.getString(1));
            }            
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }
    
    public void IDSabado(){
        rs = null;
        rs = nst.ListarIDSabado();
        mmIDsabado = (DefaultTableModel)tbIdsabado.getModel();
        String reg[] = new String[5];
        try {
            while(rs.next()){
                reg[0] = rs.getString(1);                                
                mmIDsabado.addRow(reg);
            }
            tbIdsabado.setModel(mmIDsabado);
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }
    
    public void IDSemana(){
        rs = null;
        rs = nst.ListarIDSemana();
        mmIDsemana = (DefaultTableModel)tbIdsemana.getModel();
        String reg[] = new String[5];
        try {
            while(rs.next()){
                reg[0] = rs.getString(1);                                
                mmIDsemana.addRow(reg);
            }
            tbIdsemana.setModel(mmIDsemana);
        } catch(SQLException ex){
            System.out.println(ex);
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
            java.util.logging.Logger.getLogger(NSemana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NSemana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NSemana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NSemana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new NSemana().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcSabado;
    private javax.swing.JButton btnCalcSemana;
    private javax.swing.JButton btnMenores;
    private javax.swing.JButton btnTotalizar;
    private com.toedter.calendar.JDateChooser dtcMiercoles;
    private com.toedter.calendar.JDateChooser dtcSabado;
    private com.toedter.calendar.JDateChooser dtcViernes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tbIdsabado;
    private javax.swing.JTable tbIdsemana;
    private javax.swing.JTable tbSabado;
    private javax.swing.JTable tbSemana;
    private javax.swing.JTextField txtMenores;
    private javax.swing.JTextField txtSumaSabado;
    private javax.swing.JTextField txtSumaSemana;
    private javax.swing.JTextField txtTotalizacion;
    private javax.swing.JTextField txtUSemana;
    // End of variables declaration//GEN-END:variables
}

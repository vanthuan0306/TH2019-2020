/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhpm.tuan5;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VanThuan
 */
public class DBEmployee extends javax.swing.JFrame {

    /**
     * Creates new form LTV
     */
    public DBEmployee() throws SQLException {
        initComponents();
        showEmployee();
    }

    private List<Employee> getAllEmployee() throws SQLException{
        List<Employee> listAllE = new ArrayList<>();
        Connection conn = null;
        String url = "jdbc:jtds:sqlserver://localhost:1433/DBEMPLOYEE";
        String user = "sa";
        String password = "00036000";
        String sql = "SELECT * FROM Employee";
        ResultSet rsEmployee;
        Statement stmt;
        try {
            conn = DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();
            rsEmployee = stmt.executeQuery(sql);
            Employee employee = null ;
            while (rsEmployee.next()){
                employee = new Employee();
                employee.setName(rsEmployee.getString("name"));
                employee.setAddress(rsEmployee.getString("address"));
                employee.setGender(rsEmployee.getString("gender"));
                employee.setKnowledge(rsEmployee.getString("knowledge"));
                employee.setSubject(rsEmployee.getString("subject"));
                listAllE.add(employee);
            }
            conn.close();
            rsEmployee.close();
            stmt.close();
        
        } catch (SQLException ex) {
            Logger.getLogger(DBEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listAllE;
    }
       private  void showEmployee() throws SQLException{
           List<Employee> listAllE = getAllEmployee();
        DefaultTableModel model = (DefaultTableModel)tblListEmployee.getModel(); 
        Object []row = new Object[5];
        for(int i = 0 ; i < listAllE.size(); i++){
            row[0] = listAllE.get(i).getName();
            row[1] = listAllE.get(i).getAddress();
            row[2] = listAllE.get(i).getGender();
            row[3] = listAllE.get(i).getKnowledge();
            row[4] = listAllE.get(i).getSubject();
            model.addRow(row);
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

        btgGender = new javax.swing.ButtonGroup();
        pnRoot = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        rdMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        lblKnowledge = new javax.swing.JLabel();
        chkJava = new javax.swing.JCheckBox();
        chkPython = new javax.swing.JCheckBox();
        lblSubject = new javax.swing.JLabel();
        cboSubject = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListEmployee = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblName.setText("Name");
        lblName.setName("lblName"); // NOI18N

        lblAddress.setText("Address");
        lblAddress.setName("lblAddress"); // NOI18N

        lblGender.setText("Gender");
        lblGender.setName("lblGender"); // NOI18N

        txtName.setName("txtName"); // NOI18N

        txtAddress.setName("txtAddress"); // NOI18N

        btgGender.add(rdMale);
        rdMale.setText("Male");
        rdMale.setName(""); // NOI18N

        btgGender.add(rbFemale);
        rbFemale.setText("Female");

        lblKnowledge.setText("Knowledge");
        lblKnowledge.setName("lblKnowledge"); // NOI18N

        chkJava.setText("Java");

        chkPython.setText("Python");

        lblSubject.setText("Subject");
        lblSubject.setName("lblSubject"); // NOI18N

        cboSubject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer", "Education", "Management", " " }));

        btnSave.setText("Save");
        btnSave.setName("btnSave"); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.setName("btnReset"); // NOI18N
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnRootLayout = new javax.swing.GroupLayout(pnRoot);
        pnRoot.setLayout(pnRootLayout);
        pnRootLayout.setHorizontalGroup(
            pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRootLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnRootLayout.createSequentialGroup()
                        .addGroup(pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnRootLayout.createSequentialGroup()
                                .addComponent(lblSubject)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cboSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnRootLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(btnSave)
                                .addGap(39, 39, 39)
                                .addComponent(btnReset)
                                .addGap(44, 44, 44)))
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRootLayout.createSequentialGroup()
                        .addGroup(pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnRootLayout.createSequentialGroup()
                                .addGroup(pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblKnowledge)
                                    .addComponent(lblGender))
                                .addGap(50, 50, 50)
                                .addGroup(pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdMale)
                                    .addComponent(chkJava))
                                .addGap(50, 50, 50)
                                .addGroup(pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbFemale)
                                    .addComponent(chkPython)))
                            .addGroup(pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnDelete)
                                .addGroup(pnRootLayout.createSequentialGroup()
                                    .addGroup(pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRootLayout.createSequentialGroup()
                                            .addComponent(lblName)
                                            .addGap(62, 62, 62))
                                        .addGroup(pnRootLayout.createSequentialGroup()
                                            .addComponent(lblAddress)
                                            .addGap(50, 50, 50)))
                                    .addGroup(pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                        .addComponent(txtName)))))
                        .addGap(30, 30, 30))))
        );
        pnRootLayout.setVerticalGroup(
            pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRootLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdMale)
                    .addComponent(rbFemale)
                    .addComponent(lblGender))
                .addGap(15, 15, 15)
                .addGroup(pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblKnowledge)
                    .addGroup(pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkJava)
                        .addComponent(chkPython)))
                .addGap(15, 15, 15)
                .addGroup(pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSubject))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnReset)
                    .addComponent(btnDelete))
                .addGap(15, 15, 15))
        );

        tblListEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Address", "Gender", "Knowledge", "Subject"
            }
        ));
        jScrollPane1.setViewportView(tblListEmployee);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        Connection conn = null;
        String url="", user="", password="";
        String sql = "";
        String strName ="";
        String strAddress="";
        String strGender ="";
        String strKnowledge ="";
        String strSubject ="";
        url = "jdbc:jtds:sqlserver://localhost:1433/DBEMPLOYEE";
        user = "sa";
        password = "00036000";
        int row = 0;
        
        strName = txtName.getText();
        strAddress = txtAddress.getText();
        if (rdMale.isSelected()){
            strGender = "Nam";
        }else{
            strGender ="Nữ";
        }
        if (chkJava.isSelected()){
            strKnowledge ="Java";
        }else if( chkPython.isSelected()){
            strKnowledge = "Python";
        }else{
            strKnowledge = "Java + Python";
        }
        strSubject = cboSubject.getSelectedItem().toString();
        PreparedStatement preStmt;
        try {
            sql = "INSERT INTO"
                    +" Employee VALUES (?,?,?,?,?)";
            conn = DriverManager.getConnection(url, user, password);
            preStmt = conn.prepareStatement(sql);
            preStmt.setString(1,strName);
            preStmt.setString(2,strAddress);
            preStmt.setString(3,strGender);
            preStmt.setString(4,strKnowledge);
            preStmt.setString(5,strSubject);
            
            row = preStmt.executeUpdate();
            System.out.println("Số dòng " + row);
            
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtName.setText("");
        txtAddress.setText("");
        
        rdMale.setSelected(false);
        rdMale.requestFocus();
        rbFemale.setSelected(false);
        rbFemale.requestFocus();
        chkJava.setSelected(false);
        chkPython.setSelected(false);
        cboSubject.requestFocus();
        
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        //int indexDelete = tblListEmployee.getSelectedRow(), id =(int) tblListEmployee.getValueAt(indexDelete, 0);
        //preStmt
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(DBEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DBEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DBEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DBEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new DBEmployee().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(DBEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgGender;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cboSubject;
    private javax.swing.JCheckBox chkJava;
    private javax.swing.JCheckBox chkPython;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblKnowledge;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSubject;
    private javax.swing.JPanel pnRoot;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rdMale;
    private javax.swing.JTable tblListEmployee;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables


}

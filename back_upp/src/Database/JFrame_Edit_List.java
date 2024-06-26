package Database;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.*;

public class JFrame_Edit_List extends javax.swing.JFrame {

    Student_List sList = new Student_List();
    int position = 0;
    int numStudents = 0;

    public JFrame_Edit_List() {
        initComponents();
        deserializeSTUDENT_List();
        if (!sList.isEmpty()) {
            populate_TextBoxes(sList.get(position), position + 1);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Name = new javax.swing.JTextField();
        jTextField_id = new javax.swing.JTextField();
        jButton_Delete = new javax.swing.JButton();
        jButton_Update = new javax.swing.JButton();
        jButton_Add = new javax.swing.JButton();
        jButton_Next = new javax.swing.JButton();
        jButton_Prev = new javax.swing.JButton();
        jTextField_Search = new javax.swing.JTextField();
        jButton_Last = new javax.swing.JButton();
        jButton_First = new javax.swing.JButton();
        jButton_Sort = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Address = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_cgpa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Data Manipulation Form");

        jLabel1.setText("Name");

        jLabel2.setText("ID");

        jTextField_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_idActionPerformed(evt);
            }
        });

        jButton_Delete.setText("Delete");
        jButton_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteActionPerformed(evt);
            }
        });

        jButton_Update.setText("Update");
        jButton_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateActionPerformed(evt);
            }
        });

        jButton_Add.setText("Add");
        jButton_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddActionPerformed(evt);
            }
        });

        jButton_Next.setText(">>");
        jButton_Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NextActionPerformed(evt);
            }
        });

        jButton_Prev.setText("<<");
        jButton_Prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PrevActionPerformed(evt);
            }
        });

        jTextField_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SearchActionPerformed(evt);
            }
        });

        jButton_Last.setText(">|");
        jButton_Last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LastActionPerformed(evt);
            }
        });

        jButton_First.setText("|<");
        jButton_First.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_FirstActionPerformed(evt);
            }
        });

        jButton_Sort.setText("Sort");
        jButton_Sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SortActionPerformed(evt);
            }
        });

        jLabel4.setText("Address");

        jTextField_Address.setToolTipText("");

        jLabel5.setText("CGPA");

        jTextField_cgpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_cgpaActionPerformed(evt);
            }
        });

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton_First)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton_Prev)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton_Next, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton_Last))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton_Add)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton_Update)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton_Delete)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton_Sort, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_Name, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                    .addComponent(jTextField_id)
                                    .addComponent(jTextField_Address)
                                    .addComponent(jTextField_cgpa))))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_cgpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_First)
                    .addComponent(jButton_Prev)
                    .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Next)
                    .addComponent(jButton_Last))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Add)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_Delete)
                        .addComponent(jButton_Sort)
                        .addComponent(jButton_Update)
                        .addComponent(jButton1)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void deserializeSTUDENT_List() {

        try {

            FileInputStream fin = new FileInputStream("STUDENT.ser");
            ObjectInputStream ois = new ObjectInputStream(fin);

            sList = (Student_List) ois.readObject();
            numStudents = sList.num_STUDENTS();
            ois.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
    }

    public void serializeSTUDENT_List() {

        try {

            FileOutputStream fout = new FileOutputStream("STUDENT.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(sList);
            oos.close();
            JOptionPane.showMessageDialog(null, "Successfully saved");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private Student create_Student() {

        if (this.jTextField_Name.getText().isEmpty() || this.jTextField_id.getText().isEmpty()) {
            return null;
        }
        String Name = this.jTextField_Name.getText().trim();
        String id = this.jTextField_id.getText().trim();
        String Address = this.jTextField_Address.getText().trim();
        String cgpa = this.jTextField_cgpa.getText().trim();
        try {
            int idd = Integer.parseInt(id);

            double cgpa_cnt = Double.parseDouble(cgpa);
            return new Student(Name, Address, idd, cgpa_cnt);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "integer ?");
            return null;
        }
    }

    private void populate_TextBoxes(Student item, int pos) {
        this.jTextField_Name.setText(item.getName());
        this.jTextField_id.setText(Integer.toString(item.getID()));
        this.jTextField_Address.setText(item.getAddress());
        this.jTextField_cgpa.setText(Double.toString(item.getCgpa()));
        this.jTextField_Search.setText(pos + "/" + numStudents);
    }

    private void Clear_TextBoxes() {
        this.jTextField_Name.setText("");
        this.jTextField_id.setText("");
        this.jTextField_Address.setText("");
        this.jTextField_cgpa.setText("");
        this.jTextField_Search.setText("");
    }

    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed

        if (!sList.isEmpty()) {
            sList.deleteSTUDENT(position);
            serializeSTUDENT_List();
            numStudents--;
            if (position == numStudents) {
                position--;
            }
            if (sList.isEmpty()) {
                Clear_TextBoxes();
            } else {
                populate_TextBoxes(sList.get(position), position + 1);
            }
        }
    }//GEN-LAST:event_jButton_DeleteActionPerformed

    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateActionPerformed
        Student newStudent = create_Student();
        if (newStudent == null) {
            JOptionPane.showMessageDialog(null, "Student is not properly created");
        }
        if (this.sList.Contains(newStudent) && position != this.sList.getIndex(newStudent)) {
            JOptionPane.showMessageDialog(null, "Student already exists");
        }
//        if (newStudent != null && (!this.sList.Contains(newStudent)) && this.position == this.sList.getIndex(newStudent)) {
        this.sList.updateSTUDENT(this.position, newStudent);
//        JOptionPane.showMessageDialog(null, "Student updated");

//            this.serializeSTUDENT_List();
//        }
        if (!sList.isEmpty()) {
            this.serializeSTUDENT_List();

        }
    }//GEN-LAST:event_jButton_UpdateActionPerformed

    private void jButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddActionPerformed
        // TODO add your handling code here:
        Student newSTUDENT = create_Student();
        if (newSTUDENT == null) {
            JOptionPane.showMessageDialog(null, "Student is not properly created");
        }
        if (sList.Contains(newSTUDENT)) {
            JOptionPane.showMessageDialog(null, "Student already exists");
        }
        if (!(newSTUDENT == null) && (!sList.Contains(newSTUDENT))) {
            sList.addSTUDENT(newSTUDENT);
            numStudents++;
            position = numStudents - 1;
            serializeSTUDENT_List();
            populate_TextBoxes(sList.get(position), position + 1);
        }
    }//GEN-LAST:event_jButton_AddActionPerformed

    private void jButton_NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NextActionPerformed
        // TODO add your handling code here:
        if (position < (sList.num_STUDENTS() - 1)) {
            position++;
        }
        populate_TextBoxes(sList.get(position), position + 1);
    }//GEN-LAST:event_jButton_NextActionPerformed

    private void jButton_PrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PrevActionPerformed
        // TODO add your handling code here:
        if (position > 0) {
            position--;
        }
        populate_TextBoxes(sList.get(position), position + 1);
    }//GEN-LAST:event_jButton_PrevActionPerformed

    private void jTextField_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SearchActionPerformed
        try {
            int pos = Integer.parseInt(this.jTextField_Search.getText().trim());
            if (pos > 0 && pos < numStudents) {
                position = pos - 1;
                populate_TextBoxes(sList.get(position), position + 1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valid integer required");
        }

    }//GEN-LAST:event_jTextField_SearchActionPerformed

    private void jButton_LastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LastActionPerformed
        position = sList.num_STUDENTS() - 1;
        populate_TextBoxes(sList.get(position), position + 1);
    }//GEN-LAST:event_jButton_LastActionPerformed

    private void jButton_FirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_FirstActionPerformed
        position = 0;
        populate_TextBoxes(sList.get(position), position + 1);
    }//GEN-LAST:event_jButton_FirstActionPerformed

    private void jButton_SortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SortActionPerformed
        if (!sList.isEmpty()) {
            sList.Sort();
            serializeSTUDENT_List();
            position = 0;
            populate_TextBoxes(sList.get(position), position + 1);
        }
    }//GEN-LAST:event_jButton_SortActionPerformed

    private void jTextField_cgpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_cgpaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_cgpaActionPerformed

    private void jTextField_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_idActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.jTextField_Name.setText("");
        this.jTextField_id.setText("");
        this.jTextField_Address.setText("");
        this.jTextField_cgpa.setText("");
        this.jTextField_Search.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_Edit_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Edit_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Edit_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Edit_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Edit_List().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_First;
    private javax.swing.JButton jButton_Last;
    private javax.swing.JButton jButton_Next;
    private javax.swing.JButton jButton_Prev;
    private javax.swing.JButton jButton_Sort;
    private javax.swing.JButton jButton_Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField_Address;
    private javax.swing.JTextField jTextField_Name;
    private javax.swing.JTextField jTextField_Search;
    private javax.swing.JTextField jTextField_cgpa;
    private javax.swing.JTextField jTextField_id;
    // End of variables declaration//GEN-END:variables
}

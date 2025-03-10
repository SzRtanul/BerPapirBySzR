/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package hu.szamalk.graph;

import hu.szamalk.main.MainGUI;

/**
 *
 * @author Roland
 */
public class InaktivNevRekord extends javax.swing.JPanel {
    private int nevHely;
    /**
     * Creates new form InaktivNevRekord
     */
    public InaktivNevRekord(int nevHely) {
        initComponents();
        this.nevHely = nevHely;
        Chk_kijelol.setSelected(MainGUI.nevetKijelol[nevHely]);
        TF_nev.setText(MainGUI.nevEmailMunkaviszony[nevHely][0]);
        TF_email.setText(MainGUI.nevEmailMunkaviszony[nevHely][1]);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Chk_kijelol = new javax.swing.JCheckBox();
        TF_nev = new javax.swing.JTextField();
        TF_email = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Cb_csatolmanyok = new javax.swing.JComboBox<>();
        Bt_visszatesz = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(400, 80));

        TF_nev.setEditable(false);
        TF_nev.setText("Szabó Roland");
        TF_nev.setMinimumSize(new java.awt.Dimension(85, 22));

        TF_email.setEditable(false);
        TF_email.setText("rolandszb111@gmail.com");
        TF_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_emailActionPerformed(evt);
            }
        });

        jButton1.setText("Töröl");
        jButton1.setEnabled(false);

        Cb_csatolmanyok.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nagy Barbara Margit 1_202309_98_20_003_00_MunkaBerjegyzek.pdf", "Nagy Barbara Margit 1_202309_98_20_004_00_MunkaBerjegyzek.pdf" }));
        Cb_csatolmanyok.setMinimumSize(new java.awt.Dimension(0, 22));
        Cb_csatolmanyok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cb_csatolmanyokActionPerformed(evt);
            }
        });

        Bt_visszatesz.setText("Visszatesz");
        Bt_visszatesz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_visszateszActionPerformed(evt);
            }
        });

        jLabel1.setText("2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Chk_kijelol)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TF_nev, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_email, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Cb_csatolmanyok, 0, 1, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bt_visszatesz)))
                .addGap(3, 3, 3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Chk_kijelol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TF_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_nev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(Cb_csatolmanyok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bt_visszatesz)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TF_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_emailActionPerformed

    private void Cb_csatolmanyokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cb_csatolmanyokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cb_csatolmanyokActionPerformed

    private void Bt_visszateszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_visszateszActionPerformed
        MainGUI.inaktivalt[nevHely] = false;
        MainGUI.notice.doUpdate();
    }//GEN-LAST:event_Bt_visszateszActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_visszatesz;
    private javax.swing.JComboBox<String> Cb_csatolmanyok;
    private javax.swing.JCheckBox Chk_kijelol;
    private javax.swing.JTextField TF_email;
    private javax.swing.JTextField TF_nev;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

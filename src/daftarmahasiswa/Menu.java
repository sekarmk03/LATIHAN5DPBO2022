/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftarmahasiswa;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class Menu extends javax.swing.JFrame {

    private DefaultTableModel dtm;
    private Boolean isUpdate = false;
    private int selectedID = -1;
    private ArrayList<Mahasiswa> listMhs;

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        listMhs = new ArrayList<>();
        //Dummy
<<<<<<< HEAD
        listMhs.add(new Mahasiswa("1111", "Aaaa", "A", "L"));
        listMhs.add(new Mahasiswa("2222", "Bbbb", "B", "P"));
        listMhs.add(new Mahasiswa("3333", "Cccc", "C", "P"));
        // Set Table
        mhsTbl.setModel(setTable());
        // Hide Delete button
        deleteBtn.setVisible(false);
    }

    public final DefaultTableModel setTable() {
        Object[] column = {"NIM", "Nama", "Nilai", "Gender"};
        DefaultTableModel dataTabel = new DefaultTableModel(null, column);
        for (int i = 0; i < listMhs.size(); i++) {
            Object[] row = new Object[4];
            row[0] = listMhs.get(i).getNim();
            row[1] = listMhs.get(i).getNama();
            row[2] = listMhs.get(i).getNilai();
            row[3] = listMhs.get(i).getGender();
=======
        listMhs.add(new Mahasiswa("1111", "Aaaa", "A"));
        listMhs.add(new Mahasiswa("2222", "Bbbb", "B"));
        listMhs.add(new Mahasiswa("3333", "Cccc", "C"));
        // Set Table
        jTable1.setModel(setTable());
        // Hide Delete button
        jButton2.setVisible(false);
    }

    public final DefaultTableModel setTable() {
        Object[] column = {"NIM", "Nama", "Nilai"};
        DefaultTableModel dataTabel = new DefaultTableModel(null, column);
        for (int i = 0; i < listMhs.size(); i++) {
            Object[] row = new Object[3];
            row[0] = listMhs.get(i).getNim();
            row[1] = listMhs.get(i).getNama();
            row[2] = listMhs.get(i).getNilai();
>>>>>>> 1f5fa966c373fcc01bb2315642d1003d624838d1

            dataTabel.addRow(row);
        }

        return dataTabel;
    }

    public void insertData() {
        // Get Data
<<<<<<< HEAD
        String nim = nimTF.getText();
        String nama = namaTF.getText();
        String nilai = nilaiTF.getText();
        String gender = genderCB.getSelectedItem().toString();
        
        if(!nim.isEmpty() && !nama.isEmpty() && !nilai.isEmpty()) {
            listMhs.add(new Mahasiswa(nim, nama, nilai, gender));
            //Update Table
            mhsTbl.setModel(setTable());
        
            resetForm();

            System.out.println("Insert Success!");
            JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan!");
        } else {
            JOptionPane.showMessageDialog(null, "Data belum lengkap!");
        }
=======
        String nim = jTextField1.getText();
        String nama = jTextField2.getText();
        String nilai = jTextField3.getText();

        listMhs.add(new Mahasiswa(nim, nama, nilai));
        //Update Table
        jTable1.setModel(setTable());

        System.out.println("Insert Success!");
        JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan!");
>>>>>>> 1f5fa966c373fcc01bb2315642d1003d624838d1
    }

    public void updateData() {
        // Get Data
<<<<<<< HEAD
        String nim = nimTF.getText();
        String nama = namaTF.getText();
        String nilai = nilaiTF.getText();
        String gender = genderCB.getSelectedItem().toString();
=======
        String nim = jTextField1.getText();
        String nama = jTextField2.getText();
        String nilai = jTextField3.getText();
>>>>>>> 1f5fa966c373fcc01bb2315642d1003d624838d1
        //System.out.println(nim + nama + nilai);

        listMhs.get(selectedID).setNim(nim);
        listMhs.get(selectedID).setNama(nama);
        listMhs.get(selectedID).setNilai(nilai);
<<<<<<< HEAD
        listMhs.get(selectedID).setGender(gender);
        
        resetForm();
        
        mhsTbl.setModel(setTable());
=======
>>>>>>> 1f5fa966c373fcc01bb2315642d1003d624838d1

        System.out.println("Update Success!");
        JOptionPane.showMessageDialog(null, "Data berhasil diubah!");
    }

    public void deleteData() {
<<<<<<< HEAD
        listMhs.remove(selectedID);
        mhsTbl.setModel(setTable());
        
        resetForm();
        
        System.out.println("Delete Success!");
        JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
    }
    
    public void resetForm() {
        nimTF.setText("");
        namaTF.setText("");
        nilaiTF.setText("");
        genderCB.setSelectedIndex(0);
    }
=======
        System.out.println("Delete Success!");
        JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
    }
>>>>>>> 1f5fa966c373fcc01bb2315642d1003d624838d1

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

<<<<<<< HEAD
        mainPanel = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        nimTF = new javax.swing.JTextField();
        nimLbl = new javax.swing.JLabel();
        namaLbl = new javax.swing.JLabel();
        namaTF = new javax.swing.JTextField();
        nilaiLbl = new javax.swing.JLabel();
        nilaiTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        mhsTbl = new javax.swing.JTable();
        deleteBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        genderLbl = new javax.swing.JLabel();
        genderCB = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLbl.setFont(new java.awt.Font("Poppins Medium", 0, 26)); // NOI18N
        titleLbl.setText("Daftar Mahasiswa");

        addBtn.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        nimTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nimTFActionPerformed(evt);
            }
        });

        nimLbl.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        nimLbl.setText("NIM");

        namaLbl.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        namaLbl.setText("Nama");

        namaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaTFActionPerformed(evt);
            }
        });

        nilaiLbl.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        nilaiLbl.setText("Nilai");

        nilaiTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilaiTFActionPerformed(evt);
            }
        });

        mhsTbl.setAutoCreateRowSorter(true);
        mhsTbl.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        mhsTbl.setModel(new javax.swing.table.DefaultTableModel(
=======
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Daftar Mahasiswa");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("NIM");

        jLabel3.setText("Nama");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Nilai");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
>>>>>>> 1f5fa966c373fcc01bb2315642d1003d624838d1
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
<<<<<<< HEAD
        mhsTbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mhsTbl.setUpdateSelectionOnSort(false);
        mhsTbl.setVerifyInputWhenFocusTarget(false);
        mhsTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mhsTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(mhsTbl);

        deleteBtn.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        cancelBtn.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        genderLbl.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        genderLbl.setText("Gender");

        genderCB.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        genderCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "L", "P" }));
        genderCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderCBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(titleLbl)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                    .addComponent(namaLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(namaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                    .addComponent(nimLbl)
                                    .addGap(55, 55, 55)
                                    .addComponent(nimTF, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nilaiLbl)
                                        .addComponent(genderLbl))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(genderCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nilaiTF, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addBtn)
                            .addComponent(deleteBtn)
                            .addComponent(cancelBtn))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(titleLbl)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nimTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nimLbl)
                    .addComponent(addBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaLbl)
                    .addComponent(cancelBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nilaiTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nilaiLbl)
                    .addComponent(deleteBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLbl)
                    .addComponent(genderCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
=======
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setUpdateSelectionOnSort(false);
        jTable1.setVerifyInputWhenFocusTarget(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(55, 55, 55)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButton2))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
>>>>>>> 1f5fa966c373fcc01bb2315642d1003d624838d1
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
=======
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
>>>>>>> 1f5fa966c373fcc01bb2315642d1003d624838d1
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
=======
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
>>>>>>> 1f5fa966c373fcc01bb2315642d1003d624838d1
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< HEAD
    private void nimTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nimTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nimTFActionPerformed

    private void namaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaTFActionPerformed

    private void nilaiTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilaiTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nilaiTFActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
=======
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
>>>>>>> 1f5fa966c373fcc01bb2315642d1003d624838d1
        // TODO add your handling code here:
        if (isUpdate == false)
            insertData();
        else {
            updateData();
<<<<<<< HEAD
            addBtn.setText("Add");
            deleteBtn.setVisible(false);
            this.isUpdate = false;
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void mhsTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mhsTblMouseClicked
=======
            jButton1.setText("Add");
            jButton2.setVisible(false);
            this.isUpdate = false;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
>>>>>>> 1f5fa966c373fcc01bb2315642d1003d624838d1
        // TODO add your handling code here:
        this.isUpdate = true;

        //Get Selected Data
<<<<<<< HEAD
        int row = mhsTbl.getSelectedRow();
        String selectedNim = (mhsTbl.getModel().getValueAt(row, 0).toString());
        String selectedNama = (mhsTbl.getModel().getValueAt(row, 1).toString());
        String selectedNilai = (mhsTbl.getModel().getValueAt(row, 2).toString());
        Object selectedGender = (mhsTbl.getModel().getValueAt(row, 3));
        
//        System.out.println(selectedGender);
=======
        int row = jTable1.getSelectedRow();
        String selectedNim = (jTable1.getModel().getValueAt(row, 0).toString());
        String selectedNama = (jTable1.getModel().getValueAt(row, 1).toString());
        String selectedNilai = (jTable1.getModel().getValueAt(row, 2).toString());
>>>>>>> 1f5fa966c373fcc01bb2315642d1003d624838d1

        for (int i = 0; i < listMhs.size(); i++) {
            if (selectedNim.equals(listMhs.get(i).getNim())) {
                selectedID = i;
                break;
            }
        }

        //System.out.println(selectedID);
<<<<<<< HEAD
        nimTF.setText(selectedNim);
        namaTF.setText(selectedNama);
        nilaiTF.setText(selectedNilai);
        genderCB.setSelectedItem(selectedGender);

        addBtn.setText("Update");
        deleteBtn.setVisible(true);
    }//GEN-LAST:event_mhsTblMouseClicked

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        if (isUpdate == true) {
            deleteData();
            addBtn.setText("Add");
            deleteBtn.setVisible(false);
            this.isUpdate = false;
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        addBtn.setText("Add");
        deleteBtn.setVisible(false);
        this.isUpdate = false;
        resetForm();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void genderCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderCBActionPerformed
=======
        jTextField1.setText(selectedNim);
        jTextField2.setText(selectedNama);
        jTextField3.setText(selectedNilai);

        jButton1.setText("Update");
        jButton2.setVisible(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (isUpdate == true) {
            deleteData();
            jButton1.setText("Add");
            jButton2.setVisible(false);
            this.isUpdate = false;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jButton1.setText("Add");
        jButton2.setVisible(false);
        this.isUpdate = false;
    }//GEN-LAST:event_jButton3ActionPerformed
>>>>>>> 1f5fa966c373fcc01bb2315642d1003d624838d1

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
<<<<<<< HEAD
    private javax.swing.JButton addBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JComboBox<String> genderCB;
    private javax.swing.JLabel genderLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTable mhsTbl;
    private javax.swing.JLabel namaLbl;
    private javax.swing.JTextField namaTF;
    private javax.swing.JLabel nilaiLbl;
    private javax.swing.JTextField nilaiTF;
    private javax.swing.JLabel nimLbl;
    private javax.swing.JTextField nimTF;
    private javax.swing.JLabel titleLbl;
=======
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
>>>>>>> 1f5fa966c373fcc01bb2315642d1003d624838d1
    // End of variables declaration//GEN-END:variables
}

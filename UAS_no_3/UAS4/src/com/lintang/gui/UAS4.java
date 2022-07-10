package com.lintang.gui;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class UAS4 extends JFrame{
    private JPanel panelMain;
    private JTextField textFieldNama;
    private JTextField textFieldNIM;
    private JTextField textFieldIPK;
    private JButton buttonDelete;
    private JButton buttonAdd;
    private JButton buttonEdit;
    private JTable table1;
    private JLabel nama;
    private JLabel nim;
    private JLabel ipk;
    private javax.swing.JScrollPane JScrollPane;
    private JButton cariButton;
    private JTextField textCari;
    public Container Main;

    Connection con;
    PreparedStatement pst;

    public void connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/uas", "root","");
            System.out.println("sukses");
        }
        catch (ClassNotFoundException ex){
                ex.printStackTrace();
            }
        catch (SQLException ex){
                ex.printStackTrace();
        }
    }

    void table_load(){
        try {
            pst = con.prepareStatement("select * from data_mhs");
            ResultSet rs = pst.executeQuery();
            table1.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("UAS4");
        frame.setContentPane(new UAS4().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public UAS4() {
        connect();
        table_load();

        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama,nim,ipk;

                nama = textFieldNama.getText();
                nim = textFieldNIM.getText();
                ipk = textFieldIPK.getText();

                try {
                    pst = con.prepareStatement("insert into data_mhs(Nama,Nim,IPK)values(?,?,?)");
                    pst.setString(1, nama);
                    pst.setString(2, nim);
                    pst.setString(3, ipk);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Data Berhasil di Tambahkan");
                    table_load();
                    textFieldNama.setText("");
                    textFieldNIM.setText("");
                    textFieldIPK.setText("");
                    textFieldNama.requestFocus();
                }

                catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });

        cariButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String cari;

                    cari = textCari.getText();

                    pst = con.prepareStatement("select Nama, Nim, IPK from data_mhs where id = ?");
                    pst.setString(1, cari);
                    ResultSet rs = pst.executeQuery();

                    if(rs.next()==true) {
                        String nama = rs.getString(1);
                        String nim = rs.getString(2);
                        String ipk = rs.getString(3);

                        textFieldNama.setText(nama);
                        textFieldNIM.setText(nim);
                        textFieldIPK.setText(ipk);

                    }
                    else {
                        textFieldNama.setText("");
                        textFieldNIM.setText("");
                        textFieldIPK.setText("");
                        JOptionPane.showMessageDialog(null,"Mahasiswa Tidak Ditemukan");
                    }
                }
                catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        buttonEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cari, nama,nim,ipk;

                nama = textFieldNama.getText();
                nim = textFieldNIM.getText();
                ipk = textFieldIPK.getText();
                cari = textCari.getText();

                try {
                    pst = con.prepareStatement("update data_mhs set Nama = ?,Nim = ?,IPK = ? where id = ?");
                    pst.setString(1, nama);
                    pst.setString(2, nim);
                    pst.setString(3, ipk);
                    pst.setString(4, cari);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Data Berhasil di Edit");
                    table_load();
                    textFieldNama.setText("");
                    textFieldNIM.setText("");
                    textFieldIPK.setText("");
                    textFieldNama.requestFocus();
                }

                catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });

        buttonDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cari;

                cari = textCari.getText();

                try {
                    pst = con.prepareStatement("delete from data_mhs  where id = ?");

                    pst.setString(1, cari);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Data Telah di Hapus");
                    table_load();
                    textFieldNama.setText("");
                    textFieldNIM.setText("");
                    textFieldIPK.setText("");
                    textFieldNama.requestFocus();
                }
                catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
    }
}

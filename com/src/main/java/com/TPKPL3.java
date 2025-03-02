package com;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TPKPL3 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JLabel outputLabel;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TPKPL3 frame = new TPKPL3();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public TPKPL3() {
        setTitle("TP Mod 3 KPL");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 479, 242);
        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);

        textField = new JTextField();
        textField.setBounds(50, 50, 200, 30);
        contentPane.add(textField);
        
        JButton btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(270, 50, 100, 30);
        contentPane.add(btnSubmit);
        
        outputLabel = new JLabel("");
        outputLabel.setBounds(50, 100, 300, 30);
        contentPane.add(outputLabel);
        
        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nama = textField.getText().trim();
                if (!nama.isEmpty()) {
                    outputLabel.setText("Halo " + nama);
                } else {
                    outputLabel.setText("Masukkan nama!");
                }
            }
        });
    }
}

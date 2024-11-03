package org.example;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejemploboton {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Ejemplo de Java Swing");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton boton = new JButton("Haz clic aquí");
        boton.setBounds(130, 100, 150, 40);

        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "¡Botón Presionado!");
            }
        });

        frame.add(boton);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

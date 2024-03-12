package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        JFrame mainWindow = new JFrame("Janela Principal");
        mainWindow.setSize(400, 400);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Clique nesta janela para abrir outra janela.");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        mainWindow.add(label);

        mainWindow.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                openNewWindow();
            }
        });

        mainWindow.setLocationRelativeTo(null); // Centraliza a janela na tela
        mainWindow.setVisible(true);
    }

    private static void openNewWindow() {
        JFrame newWindow = new JFrame("Nova Janela");
        JLabel label = new JLabel("Esta é a nova janela!");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        newWindow.add(label);
        newWindow.setSize(300, 200);
        newWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Fecha apenas a nova janela ao clicar em fechar
        newWindow.setLocationRelativeTo(null); // Centraliza a nova janela na tela
        newWindow.setVisible(true);
    }
}

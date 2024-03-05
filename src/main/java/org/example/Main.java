package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Iniciando criacao da interface grafica
        //Criando a janela
        JFrame frame = new JFrame("Conversor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Setando tamanho da janela
        frame.setSize(500, 400);

        //Criando o painel
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);

        //Adicionando label
        JLabel label = new JLabel("Valor:");
        label.setBounds(10, 20, 80, 25);
        panel.add(label);

        //Adicionando textfield
        JTextField textField = new JTextField(10);
        textField.setBounds(100, 20, 165, 25);
        panel.add(textField);

        //Adicionando Radio button Celsius
        JRadioButton celsiusButton = new JRadioButton("Celsius");
        celsiusButton.setBounds(10,50,80,25);
        panel.add(celsiusButton);

        //Adicionando Radio button Fahrenheit
        JRadioButton fahrenheitButton = new JRadioButton("Fahrenheit");
        fahrenheitButton.setBounds(100,50,200,25);
        panel.add(fahrenheitButton);

        ButtonGroup group = new ButtonGroup();
        group.add(celsiusButton);
        group.add(fahrenheitButton);

        //Adicionando botao Converter
        JButton convertButton = new JButton("Converter");
        convertButton.setBounds(10,80,150,25);
        panel.add(convertButton);

        //Adicionando botao Visualizar
        JButton visualizeButton = new JButton("Visualizar");
        visualizeButton.setBounds(170,80,150,25);
        panel.add(visualizeButton);

        //Criando label de resposta
        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(10,120,300,25);
        panel.add(resultLabel);

        //Criar Jtext para visualizar todos os dados
        JTextArea visualizeTextArea = new JTextArea();
        visualizeTextArea.setEditable(false);
        //Cria elemento de scroll
        JScrollPane scrollPane = new JScrollPane(visualizeTextArea);
        scrollPane.setBounds(10,120,380,120);
        panel.add(scrollPane);

        //Criar botao de Deletar tudo
        JButton deleteButton = new JButton("Excluir Tudo");
        deleteButton.setBounds(250,240,150,25);
        panel.add(deleteButton);

        //inicio dos eventos do botao converter: CREATE
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //Iniciando conversao de dados
                //Obter dados
                double valor_entrada = Double.parseDouble(textField.getText());
                Boolean celsiusOption = celsiusButton.isSelected();
                Boolean fahrenheitOption = fahrenheitButton.isSelected();
                double result = 0;
                String opcao = "";
                //Celsius selecionado converter para Fahrenheit
                if(celsiusOption){
                    result = (valor_entrada * 9/5) +32;
                    opcao = "Fahrenheit";
                }
                //Fahrenheit selecionado converter para Celsius
                if(fahrenheitOption){
                    result = (valor_entrada - 32) * 5 / 9;
                    opcao = "Celsius";
                }
                //Exibir os dados na tela
                resultLabel.setText("Resultado: " + result + " " + opcao);
                //Finalizando conversao de dados


            }
        });//Fim dos eventos do botao converter

        //tornar o frame visivel
        frame.setVisible(true);
        //finalizando a criacao da interface grafica

    }
}
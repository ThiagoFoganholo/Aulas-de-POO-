package Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Operacoes.Somar;
import Operacoes.Subtrair;
import Operacoes.Multiplicar;
import Operacoes.Dividir;

public class CalculatorUI extends JFrame {
    private JTextField number1Field;
    private JTextField number2Field;
    private JLabel resultLabel;

    public CalculatorUI() {
        setTitle("Calculadora");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        // Inputs
        JLabel label1 = new JLabel("Número 1:");
        number1Field = new JTextField();
        JLabel label2 = new JLabel("Número 2:");
        number2Field = new JTextField();
        resultLabel = new JLabel("Resultado: ");

        // Botões de operações
        JButton addButton = new JButton("Somar");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(number1Field.getText());
                double num2 = Double.parseDouble(number2Field.getText());
                double result = Somar.somar(num1, num2);
                resultLabel.setText("Resultado: " + result);
            }
        });

        JButton subtractButton = new JButton("Subtrair");
        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(number1Field.getText());
                double num2 = Double.parseDouble(number2Field.getText());
                double result = Subtrair.subtrai(num1, num2);
                resultLabel.setText("Resultado: " + result);
            }
        });

        JButton multiplyButton = new JButton("Multiplicar");
        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(number1Field.getText());
                double num2 = Double.parseDouble(number2Field.getText());
                double result = Multiplicar.Multiplica(num1, num2);
                resultLabel.setText("Resultado: " + result);
            }
        });

        JButton divideButton = new JButton("Dividir");
        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(number1Field.getText());
                double num2 = Double.parseDouble(number2Field.getText());
                double result = Dividir.dividir(num1, num2);
                resultLabel.setText("Resultado: " + result);
            }
        });

        // Adicionando componentes na tela
        add(label1);
        add(number1Field);
        add(label2);
        add(number2Field);
        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);
        add(resultLabel);
    }

    public static void main(String[] args) {
        new CalculatorUI().setVisible(true);
    }
}

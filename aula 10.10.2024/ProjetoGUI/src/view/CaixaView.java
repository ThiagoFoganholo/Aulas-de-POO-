package view;

import model.Caixa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CaixaView extends JFrame implements WindowListener{
    private Caixa caixa;
    private Dimension dFrame, dLabel, dTextField, dTextArea, dButton;
    private Label lblValor, lblSaldo;
    private TextField txtValor, txtSaldo;
    private Button cmdEntrada, cmsRetirada, cmdConsulta, cmdSair;
    private TextArea txtMsg;

    //Metodo Construtor - construir a janela
    public CaixaView() {
        //Instanciando o objeto caixa
        caixa = new Caixa();
        //Definir a aparencia da janela
        dFrame = new Dimension(350,400);
        dLabel = new Dimension(40,20);
        dTextField = new Dimension(150,20);
        dButton = new Dimension(95,20);
        dTextArea = new Dimension(300,140);

        //definicao da janela
        setSize(dFrame);
        setTitle("Controle de Caixa");
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null); //Centro da tela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //adicionar Componentes na tela
        lblValor = new Label("Valor:");
        lblValor.setSize(dLabel);
        lblValor.setLocation(25,50);
        add(lblValor);

        lblSaldo = new Label("Saldo:");
        lblSaldo.setSize(dLabel);
        lblSaldo.setLocation(25,80);
        add(lblSaldo);

        txtValor = new TextField(null);
        txtValor.setSize(dTextField);
        txtValor.setLocation(75,50);
        add(txtValor);

        txtSaldo = new TextField(null);
        txtSaldo.setSize(dTextField);
        txtSaldo.setLocation(75,80);
        add(txtSaldo);

        cmdEntrada = new Button("Entrar");
        cmdEntrada.setSize(dButton);
        cmdEntrada.setLocation(25,150);
        add(cmdEntrada);

        cmdConsulta = new Button("Consulta");
        cmdConsulta.setSize(dButton);
        cmdConsulta.setLocation(25,185);
        add(cmdConsulta);

        cmsRetirada = new Button("Retirada");
        cmsRetirada.setSize(dButton);
        cmsRetirada.setLocation(225,150);
        add(cmsRetirada);

        cmdSair = new Button("Sair");
        cmdSair.setSize(dButton);
        cmdSair.setLocation(225,185);
        add(cmdSair);

        txtMsg = new TextArea();
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25,220);
        add(txtMsg);

        //Adicionar comprotamento de listeners
        addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        JOptionPane.showMessageDialog(
                null,
                "Fechando com cuidado !"
        );
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}

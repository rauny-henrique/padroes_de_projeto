package PadroesGoF.MVC;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CalculadoraView extends JFrame {

    private JTextField campo1 = new JTextField(10);
    private JLabel labelMais = new JLabel("+");
    private JTextField campo2 = new JTextField(10);
    private JLabel labelIgual = new JLabel("=");
    private JTextField resultado = new JTextField(10);
    private JButton calcular = new JButton("Calcular");

    public CalculadoraView() {

        JPanel painel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(200, 180);

        resultado.setEditable(false);

        painel.add(campo1);
        painel.add(labelMais);
        painel.add(campo2);
        painel.add(labelIgual);
        painel.add(resultado);
        painel.add(calcular);

        this.add(painel);

        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    public int getPrimeiroNumero() {
        return Integer.parseInt(campo1.getText());
    }

    public int getSegundoNumero() {
        return Integer.parseInt(campo2.getText());
    }

    public void setResultado(int resultado) {
        this.resultado.setText(Integer.toString(resultado));
    }

    public void addCalculadoraListener(ActionListener listener) {
        calcular.addActionListener(listener);
    }

    public void errorDisplay(String error) {
        JOptionPane.showMessageDialog(this, error);
    }

}

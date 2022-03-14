package View;

import Controller.Controler;

import javax.swing.*;

public class PoliGUI {

    private JButton button1;
    private JPanel CalculatorPolinoame;
    private JButton inmultireButton;
    private JButton derivareButton;
    private JButton integrareButton;
    private JButton adunareButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    public JButton getButton1() {
        return button1;
    }


    public void setButton1(JButton button1) {
        this.button1 = button1;
    }

    public JPanel getCalculatorPolinoame() {
        return CalculatorPolinoame;
    }

    public void setCalculatorPolinoame(JPanel calculatorPolinoame) {
        CalculatorPolinoame = calculatorPolinoame;
    }

    public JButton getInmultireButton() {
        return inmultireButton;
    }

    public void setInmultireButton(JButton inmultireButton) {
        this.inmultireButton = inmultireButton;
    }

    public JButton getDerivareButton() {
        return derivareButton;
    }

    public void setDerivareButton(JButton derivareButton) {
        this.derivareButton = derivareButton;
    }

    public JButton getIntegrareButton() {
        return integrareButton;
    }

    public void setIntegrareButton(JButton integrareButton) {
        this.integrareButton = integrareButton;
    }

    public JButton getAdunareButton() {
        return adunareButton;
    }

    public void setAdunareButton(JButton adunareButton) {
        this.adunareButton = adunareButton;
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public void setTextField1(JTextField textField1) {
        this.textField1 = textField1;
    }

    public JTextField getTextField2() {
        return textField2;
    }

    public void setTextField2(JTextField textField2) {
        this.textField2 = textField2;
    }

    public JTextField getTextField3() {
        return textField3;
    }

    public void setTextField3(JTextField textField3) {
        this.textField3 = textField3;
    }

    public PoliGUI(){
        Controler controllerGUI = new Controler(this);
        controllerGUI.addAction();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator Polinoame");
        frame.setContentPane(new PoliGUI().CalculatorPolinoame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}

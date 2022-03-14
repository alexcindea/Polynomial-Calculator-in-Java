package Controller;

import Tema1.Model.Operatie;
import Tema1.Model.Polinom;
import View.PoliGUI;

public class Controler{

    PoliGUI gui;

    public Controler(PoliGUI gui) {
        this.gui = gui;
    }

    public void addAction(){

        Operatie op = new Operatie();

        gui.getAdunareButton().addActionListener(e -> {


            Polinom p1 = op.rez(gui.getTextField1().getText());
            Polinom p2 = op.rez(gui.getTextField2().getText());
            Polinom p3 = op.sum(p1, p2);
            gui.getTextField3().setText(p3.toString());
        });

        gui.getDerivareButton().addActionListener(e -> {


            Polinom p1 = op.rez(gui.getTextField1().getText());
            Polinom p3 = op.drv(p1);
            gui.getTextField3().setText(p3.toString());
        });

        gui.getButton1().addActionListener(e -> {
            Polinom p1 = op.rez(gui.getTextField1().getText());
            Polinom p2 = op.rez(gui.getTextField2().getText());
            Polinom p3 = op.sub(p1, p2);
            gui.getTextField3().setText(p3.toString());
        });

        gui.getInmultireButton().addActionListener(e -> {
            Polinom p1 = op.rez(gui.getTextField1().getText());
            Polinom p2 = op.rez(gui.getTextField2().getText());
            Polinom p3 = op.mul(p1, p2);
            gui.getTextField3().setText(p3.toString());
        });

        gui.getIntegrareButton().addActionListener(e -> {
            Polinom p1 = op.rez(gui.getTextField1().getText());
            Polinom p3 = op.intgr(p1);
            gui.getTextField3().setText(p3.toString());
        });



    }
}

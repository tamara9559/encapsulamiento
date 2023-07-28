package encasulamiento;

import javax.swing.*;
import javax.swing.text.html.parser.Parser;

public class mainAgency {
    public static void main(String[] args) {
        Agency agency = new Agency();
        agency.setAdress(JOptionPane.showInputDialog("ingrese la direccion"));
        agency.setAgentname(JOptionPane.showInputDialog("ingrese agencia"));
        agency.setPrice(Integer.parseInt(JOptionPane.showInputDialog("precio")));
        JOptionPane.showMessageDialog(null, "nombre de la agencia "+agency.getAgentname());


    }
}

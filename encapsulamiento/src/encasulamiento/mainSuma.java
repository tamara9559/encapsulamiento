package encasulamiento;

import javax.swing.*;

public class mainSuma {
    public static void main(String[] args) {
        Suma suma = new Suma();
        suma.setNum1(Integer.parseInt(JOptionPane.showInputDialog("numero 1")));
        suma.setNum2(Integer.parseInt(JOptionPane.showInputDialog("numero 2")));
        JOptionPane.showMessageDialog(null, "la suma es "+suma.suma());
    }
}

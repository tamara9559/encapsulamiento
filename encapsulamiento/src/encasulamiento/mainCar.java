package encasulamiento;

import javax.swing.*;

public class mainCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.setPlate(JOptionPane.showInputDialog("ingrese la placa"));
        car.setColor(JOptionPane.showInputDialog("ingrese el color"));
        car.setModel(Integer.parseInt(JOptionPane.showInputDialog("ingrese el modelo")));
        JOptionPane.showMessageDialog(null, car.getPlate());
    }
}

package encasulamiento;

import javax.swing.*;

public class mainPersona {
    public static void main(String[] args) {
        person person = new person();

        person.setName(JOptionPane.showInputDialog("ingrese el nombre"));
        //persona.name="juan"; //solucion en caso de que este en private son lo get o set, los puede hacer automaticamente el intellij
        System.out.println(person.getName());

        person person2 = new person();
        person.setName("pepe");
        System.out.println(person.getName());

        person age = new person();
        person.setAge(Integer.parseInt(JOptionPane.showInputDialog("que edad tienes")));
        System.out.println(person.getAge());
    }
}

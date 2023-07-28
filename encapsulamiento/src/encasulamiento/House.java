package encasulamiento;

public class House {
    private String direccion;
    private String propietarios;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(String propietarios) {
        this.propietarios = propietarios;
    }

    public int getNumero_de_alcoba() {
        return numero_de_alcoba;
    }

    public void setNumero_de_alcoba(int numero_de_alcoba) {
        this.numero_de_alcoba = numero_de_alcoba;
    }

    private int numero_de_alcoba;

}

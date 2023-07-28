package encasulamiento;

public class SoccerPlayer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumcamiseta() {
        return Numcamiseta;
    }

    public void setNumcamiseta(int numcamiseta) {
        Numcamiseta = numcamiseta;
    }

    public int getGolesAnotados() {
        return golesAnotados;
    }

    public void setGolesAnotados(int golesAnotados) {
        this.golesAnotados = golesAnotados;
    }

    private int Numcamiseta;
    private int golesAnotados;

}

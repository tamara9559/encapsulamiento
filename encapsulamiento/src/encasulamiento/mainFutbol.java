package encasulamiento;

public class mainFutbol {
    public static void main(String[] args) {
        SoccerPlayer soccerPlayer = new SoccerPlayer();
        soccerPlayer.setName("pedro");
        soccerPlayer.setGolesAnotados(6);
        soccerPlayer.setNumcamiseta(10);
        System.out.println(soccerPlayer.getName());
    }
}

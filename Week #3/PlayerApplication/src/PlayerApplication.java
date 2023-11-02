public class PlayerApplication {

    public static void main(String[] args) {
        String _footballerName = "Joshua Kimmich";
        int _footballerAge = 28;
        String _footballerNationalTeam = "Germany";
        String _footballerCurrentTeam = "Bayern Munchen";
        String _footballerPosition = "Defensive Midfield";

        String _footballCoachName = "Thomas Tuchel";
        int _footballCoachAge = 50;
        String _footballCoachNationalTeam = "Germany";
        String _footballCoachCurrentTeam = "Bayern Munchen";

        Footballer footballer = new Footballer(_footballerName,
                _footballerAge, _footballerNationalTeam,
                _footballerCurrentTeam, _footballerPosition);
        FootballCoach footballCoach = new FootballCoach(_footballCoachName, _footballCoachAge,
                _footballCoachNationalTeam, _footballCoachCurrentTeam);

        footballer.playerInformation();
        footballer.setPosition();

        footballCoach.playerInformation();
    }
}
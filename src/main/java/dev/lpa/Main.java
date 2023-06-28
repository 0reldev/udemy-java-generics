package dev.lpa;

public class Main {

    public static void main(String[] args) {

        BaseballTeam phillies = new BaseballTeam("Philadelphia Phillies");
        BaseballTeam astros =  new BaseballTeam("Houston Astros");

        scoreResult(phillies, 3, astros, 5);
//        Philadelphia Phillies (Ranked 3) lost to Houston Astros (Ranked 1)

        var harper = new BaseballPlayer("B. Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B. Marsh", "Right Fielder");
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        phillies.listTeamMembers();
//          Philadelphia Phillies Roster:
//          [BaseballPlayer[name=B. Harper, position=Right Fielder], BaseballPlayer[name=B. Marsh, position=Right Fielder]]
    }

    public static void scoreResult(BaseballTeam team1, int t1_score, BaseballTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}

package dev.lpa;

public class Main {

    public static void main(String[] args) {

        BaseballTeam phillies1 = new BaseballTeam("Philadelphia Phillies");
        BaseballTeam astros1 =  new BaseballTeam("Houston Astros");
        scoreResult(phillies1, 3, astros1, 5);
//        Philadelphia Phillies (Ranked 3) lost to Houston Astros (Ranked 1)

        SportsTeam phillies2 = new SportsTeam("Philadelphia Phillies");
        SportsTeam astros2 =  new SportsTeam("Houston Astros");
        scoreResult(phillies2, 3, astros2, 5);
//        Philadelphia Phillies (Ranked 3) lost to Houston Astros (Ranked 1)

        Team<BaseballPlayer> phillies = new Team<>("Philadelphia Phillies");
        Team<BaseballPlayer> astros =  new Team("Houston Astros");
        scoreResult(phillies, 3, astros, 5);
//        Philadelphia Phillies (Ranked 3) lost to Houston Astros (Ranked 1)

        var harper = new BaseballPlayer("B. Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B. Marsh", "Right Fielder");
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        var guthrie = new BaseballPlayer("D. Guthrie", "Center Fielder");
        phillies.addTeamMember(guthrie);
        phillies.listTeamMembers();
//          Philadelphia Phillies Roster:
//          [BaseballPlayer[name=B. Harper, position=Right Fielder], BaseballPlayer[name=B. Marsh, position=Right Fielder]]

        SportsTeam afc1 = new SportsTeam("Adelaide Crows");
        Team<FootballPlayer> afc = new Team<>("Adelaide Crows");
        var tex = new FootballPlayer("Tex Walker", "Centre half forward");
        afc.addTeamMember(tex);
        var rory = new FootballPlayer("Rory Laird", "Midfield");
        afc.addTeamMember(rory);
        afc.listTeamMembers();
//        Adelaide Crows Roster:
//        [FootballPlayer[name=Tex Walker, position=Centre half forward], FootballPlayer[name=Rory Laird, position=Midfield]]
    }

    public static void scoreResult(BaseballTeam team1, int t1_score, BaseballTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(SportsTeam team1, int t1_score, SportsTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(Team team1, int t1_score, Team team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}

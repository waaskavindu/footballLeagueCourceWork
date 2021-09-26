public class FootballClub extends SportsClub{
    private String clubType;
    private Integer wins;
    private Integer defeats;
    private Integer draws;
    private Integer goals;
    private Integer points;
    private Integer matches;


    public FootballClub(String clubName, String clubLocation) {
        super(clubName, clubLocation);
    }

    public FootballClub(String clubName, String clubLocation, Integer wins, Integer defeats, Integer draws, Integer goals, Integer points, Integer matches) {
        super(clubName, clubLocation);
        this.wins = wins;
        this.defeats = defeats;
        this.draws = draws;
        this.goals = goals;
        this.points = points;
        this.matches = matches;
    }

    public String getClubType() {
        return clubType;
    }

    public void setClubType(String clubType) {
        this.clubType = clubType;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public Integer getDefeats() {
        return defeats;
    }

    public void setDefeats(Integer defeats) {
        this.defeats = defeats;
    }

    public Integer getDraws() {
        return draws;
    }

    public void setDraws(Integer draws) {
        this.draws = draws;
    }

    public Integer getGoals() {
        return goals;
    }

    public void setGoals(Integer goals) {
        this.goals = goals;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getMatches() {
        return matches;
    }

    public void setMatches(Integer matches) {
        this.matches = matches;
    }

    public String toString() {
        return getClubName()+","+getClubLocation()+","+wins + "," + defeats + "," + draws + "," + goals + "," + points + "," + matches+","+clubType;
    }
}

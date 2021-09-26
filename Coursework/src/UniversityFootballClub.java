public class UniversityFootballClub extends FootballClub {
    private String universityName;

    public UniversityFootballClub(String clubName, String clubLocation) {
        super(clubName, clubLocation);
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String toString() {
        return getClubName()+","+getClubLocation()+","+getWins() + "," + getDefeats() + "," + getDraws() + "," + getGoals() + "," + getPoints() + "," + getMatches() +","+"University";
    }
}

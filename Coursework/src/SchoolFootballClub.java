public class SchoolFootballClub extends FootballClub {
    private String schoolName;

    public SchoolFootballClub(String clubName, String clubLocation) {
        super(clubName, clubLocation);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String toString() {
        return getClubName() + "," + getClubLocation() + "," + getWins() + "," + getDefeats() + "," + getDraws() + "," + getGoals() + "," + getPoints() + "," + getMatches() + "," + "School";
    }
}

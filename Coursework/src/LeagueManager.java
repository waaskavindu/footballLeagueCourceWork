import java.io.IOException;

public interface LeagueManager {
    void createClub(FootballClub footballClub) throws IOException;
    void deleteClub(FootballClub footballClub) throws IOException;
    void displayStatistics() throws IOException;
    void displayPremierLeagueTable() throws IOException;
    void addMatch();
    void saveFile() throws IOException;

}

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PremierLeagueManager implements LeagueManager {

    ArrayList<FootballClub> clubList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public PremierLeagueManager() throws FileNotFoundException {
    }

    public void createClub(FootballClub footballClub) throws IOException {
        while (true) {
            System.out.println("Enter type of the football club you want to add");

            System.out.println("   • Press 1 for Default Football Club\n" +
                    "   • Press 2 for University Football Club\n" +
                    "   • Press 3 for School Football Club");
            int typeSelection = sc.nextInt();
            //getting user inputs
            System.out.print("Enter CLub Name: ");
            String clubName = sc.next();
            footballClub.setClubName(clubName);
            System.out.print("Enter Club Location: ");
            String clubLocation = sc.next();
            footballClub.setClubLocation(clubLocation);
            System.out.print("Enter number of wins: ");
            int wins = sc.nextInt();
            footballClub.setWins(wins);
            System.out.print("Enter number of draws: ");
            int draws = sc.nextInt();
            footballClub.setDraws(draws);
            System.out.print("Enter number of defeats: ");
            int defeats = sc.nextInt();
            footballClub.setDefeats(defeats);
            System.out.print("Enter number of goals: ");
            int goals = sc.nextInt();
            footballClub.setGoals(goals);
            System.out.print("Enter number of points: ");
            int points = sc.nextInt();
            footballClub.setPoints(points);
            System.out.print("Enter number of matches: ");
            int matches = sc.nextInt();
            footballClub.setMatches(matches);

            BufferedWriter buffWriter = new BufferedWriter(new FileWriter("club-details.txt", true));
            if (typeSelection==1) {
                footballClub.setClubType("Default");
            }else if (typeSelection==2){
                footballClub.setClubType("University");
            }else if (typeSelection==3){
                footballClub.setClubType("School");
            }
            clubList.add(new FootballClub(clubName, clubLocation, wins, defeats, draws, goals, points, matches));
            buffWriter.write(footballClub.toString());
            buffWriter.flush();
            buffWriter.newLine();
            buffWriter.close();
        }
    }
    String record;

    public void deleteClub(FootballClub footballClub) throws IOException{
        String clubName ;
        File tempDB = new File("club-details-temp.txt");
        File clubDB = new File("club-details.txt");

        BufferedReader br = new BufferedReader( new FileReader( clubDB ) );
        BufferedWriter bw = new BufferedWriter( new FileWriter( tempDB ) );

        System.out.println("Delete Employee Record\n");

        System.out.println("Enter the Club Name: ");
        clubName =  sc.nextLine();

        while( ( record = br.readLine() ) != null ) {

            if( record.contains(clubName) )
                continue;

            bw.write(record);
            bw.flush();
            bw.newLine();
        }

        br.close();
        bw.close();

        clubDB.delete();

        tempDB.renameTo(clubDB);
    }

    BufferedReader buffReader = new BufferedReader( new FileReader("club-details.txt") );

    public void displayStatistics() throws IOException {

        System.out.println("Enter Club Name to display statistics: ");
        String showClubStat = sc.next();

        while( ( record = buffReader.readLine() ) != null ) {

            StringTokenizer st = new StringTokenizer(record,",");
            if( record.contains(showClubStat) ) {
                System.out.println("Club Name: "+st.nextToken()+"\nClub Location: "+st.nextToken()+"\nWins: "+st.nextToken()+"\nDraws: "+st.nextToken()+"\nDefeats"+st.nextToken()+"\nGoals: "+st.nextToken()+"\nPoints: "+st.nextToken()+"\nMatches: "+st.nextToken()+"\nClub Type: "+st.nextToken());
            }

        }

        buffReader.close();

    }

    public void displayPremierLeagueTable() throws IOException{

        System.out.println(" ---------------------------------------------------------------------------------------------------");
        System.out.println("|	Name        Location        Wins    Draws   Defeats   Goals   Points   Matches   Club Type      |");
        System.out.println(" ---------------------------------------------------------------------------------------------------");

        while( ( record = buffReader.readLine() ) != null ) {

            StringTokenizer tokenizer = new StringTokenizer(record,",");

            System.out.println("|	"+tokenizer.nextToken()+"          "+tokenizer.nextToken()+"             "+tokenizer.nextToken()+"        "+tokenizer.nextToken()+"       "+tokenizer.nextToken()+"       "+tokenizer.nextToken()+"       "+tokenizer.nextToken()+"       "+tokenizer.nextToken()+"       "+tokenizer.nextToken()+"   |");

        }

        System.out.println("|	                                            	                                                 |");
        System.out.println(" ---------------------------------------------------------------------------------------------------- ");
        buffReader.close();

    }

    public void addMatch() {

    }

    public void saveFile() throws IOException {
        BufferedWriter buffWriter = new BufferedWriter(new FileWriter("club-list.txt", true));

        while( ( record = buffReader.readLine() ) != null ) {

            StringTokenizer tokenizer = new StringTokenizer(record,",");

            buffWriter.write("Club Name: "+tokenizer.nextToken()+"\nClub Location: "+tokenizer.nextToken()+"\nWins: "+tokenizer.nextToken()+"\nDraws: "+tokenizer.nextToken()+"\nDefeats"+tokenizer.nextToken()+"\nGoals: "+tokenizer.nextToken()+"\nPoints: "+tokenizer.nextToken()+"\nMatches: "+tokenizer.nextToken()+"\nClub Type: "+tokenizer.nextToken());
            buffWriter.write("_______________________________________________________");
            buffWriter.flush();
            buffWriter.newLine();
            buffWriter.close();
        }
        buffReader.close();
    }
}

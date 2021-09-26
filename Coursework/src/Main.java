import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException { ;
        while (true){
            //prompt for menu option
            System.out.println(""+"\n"+"***Premier League Manager***"+"\n"+"");
            System.out.println("____________Menu____________"+"\n"+"");

            System.out.println("    • Press 1 to Add Football Club");
            System.out.println("    • Press 2 to Delete Football CLub");
            System.out.println("    • Press 3 to Display Statistics");
            System.out.println("    • Press 4 to Display Premier League Table ");
            System.out.println("    • Press 5 to Add Match between 2 teams ");
            System.out.println("    • Press 6 to Save club details to a file ");

            Scanner sc = new Scanner(System.in);

            PremierLeagueManager manager = new PremierLeagueManager();
            FootballClub footballClub = new FootballClub(null,null);

            try {
                while (true){
                    int userChoice = sc.nextInt();

                    if (userChoice == 1){
                        manager.createClub(footballClub);
                    }else if (userChoice == 2){
                        manager.deleteClub(footballClub);
                    }else if (userChoice == 3){
                        manager.displayStatistics();
                    }else if (userChoice == 4){
                        manager.displayPremierLeagueTable();
                    }else if (userChoice == 5){
                        manager.addMatch();
                    }else if (userChoice == 6){
                        manager.saveFile();
                    }
                }
            }catch (Exception e){
                System.out.println("An error occurred. Please enter a numeric value.");
            }


        }

    }
}

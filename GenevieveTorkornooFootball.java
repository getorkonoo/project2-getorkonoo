import java.util.Random;
import java.lang.String;

public class GenevieveTorkornooFootball {
    private String teamOne;
    private String teamTwo;
    private int currentScoreOne;
    private int currentScoreTwo;
    private int numDown;
    private boolean hasBall;
    private int firstTurn = 0;
    private int yardLine;
    private int fieldGoal;


    // constructor setting team names equal to each other
    public GenevieveTorkornooFootball(String teamOne, String teamTwo) {
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
        System.out.println("Team one is " + teamOne + "and team two is" + teamTwo);
        // random 0-1 (picking which team goes first)

        Random ran = new Random();
        int upperbound = 2;
        int random = ran.nextInt(upperbound);


        if (random == 0) {
            firstTurn = 1;
            hasBall = true;
            // team one
            System.out.println("Team " + teamOne + " goes first");

        } else {
            firstTurn = 2;
            hasBall = true;
            // team two
            System.out.println("Team " + teamTwo + " goes first");
        }
    }

    // initializing yardline and down
    public void Reset() {
        yardLine = 20;
        int down = 1;
    }


    public void play(int userPlay) {
        if (userPlay == 0) {
            run();
        } else if (userPlay == 1) {
            pass();
        } else if (userPlay == 2) {
            kick();
        }
    }

    public void run() {

        yardLine = yardLine + 3;

        if ( yardLine >= 100)
        {
            gameScores(7);
        }

    }

    public int pass() {
        // random to choose if the pass was completed or not
        Random ran = new Random();
        int upperbound = 2;
        int random = ran.nextInt(upperbound);


        if (random > 0) {

            // check how many yard they made it to
            Random ran1 = new Random();
            int upperbound1 = 20;
            int yard = ran1.nextInt(upperbound1);
            System.out.println("The ball went" + yard + " many yards");

        } else
            System.out.println("The ball failed its pass");
        // if was completed then do a another random between 0-19 that will be how many yard the ball goes
        return 0;
    }


    public void kick() {
        if (fieldGoal <= 30) {
            gameScores(3);

        } else if ((fieldGoal > 31) && (fieldGoal <= 40)) {

            Random ran = new Random();
            int upperbound = 4;
            int num = ran.nextInt(upperbound);

            if ( num <= 2) {
                gameScores(3);
            }
            else
            {
                System.out.println("This was a bad kick");
            }
        } else if ((fieldGoal > 41) && (fieldGoal <= 50)) {

            Random ran = new Random();
            int upperbound = 2;
            int num = ran.nextInt(upperbound);

            if ( num == 0) {
                gameScores(3);
            }
            else
            {
                System.out.println("This was a bad kick");
            }
        } else if (fieldGoal > 50) {

            Random ran = new Random();
            int upperbound = 10;
            int num = ran.nextInt(upperbound);

            if ( num == 0) {
                gameScores(3);
            }
            else
            {
                System.out.println("This was a bad kick");
            }
        }
    }

    public void gameScores(int numPoints) {
            if(hasBall == true)
            {
                currentScoreOne += numPoints;
            }
            else
            {
                currentScoreTwo += numPoints;
            }
    }


    public int isGameOver() {
        if ((currentScoreOne < 13) && (currentScoreTwo < 13)) {
            return 0;
        } else if (currentScoreOne >= 13) {
            return 1;
        } else if (currentScoreTwo >= 13) {
            return 2;
        }
        return 3;


    }
    public String toString()
    {
        if(isGameOver() == 0) {


            return teamOne + currentScoreOne + ";" + teamTwo + currentScoreTwo + "Down #" + numDown + teamOne + " have the ball on their" + yardLine + "yardline";
        }
        else
        {
            return teamOne + currentScoreOne +";" + teamTwo + currentScoreTwo + "Down #" + numDown + teamOne + " have the ball on their" + yardLine + "yardline" + "this team won";
        }

    }
}

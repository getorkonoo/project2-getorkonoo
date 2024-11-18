import java.util.Scanner;
public class GenevieveTorkornooPlayFootball {

    public static void main ( String [] args ){

        // get team names
        GenevieveTorkornooFootball game;
        game = new GenevieveTorkornooFootball( "Tigers ", " Ravens");
        // user inputs 0 = run, 1 = pass, 2 = kick explain to user
        // scan

        Scanner input = new Scanner(System.in);

        while ( game.isGameOver() == 0 ) {
            System.out.println("Please enter a number: 0 meaning run, 1 meaning pass or 2 meaning kick");
            int userPlay = input.nextInt();
            System.out.print(userPlay);
            game.play(userPlay);
            System.out.println(game.toString());


        }
        if (game.isGameOver() == 1 )
        {
            System.out.println(game.toString());
        }
        else if ( game.isGameOver() == 2)
        {
            System.out.println(game.toString());
        }
        // call rest function
    }

}

import java.io.*;
import java.util.*;

public class DieGame implements Game{

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private HashSet<Integer> numbersRolled=new HashSet<Integer>();

    @Override
    public void game() throws Exception{
        playGame();
        declareGameWinner();
    }

    private void playGame() throws Exception {
        DieGame dg = new DieGame();

        for (int i=0; i<2; i++) {
            System.out.println("Hit <RETURN> to roll the die");
            dg.br.readLine();
            int dieRoll=(int)(r.next() * 6) + 1;

            System.out.println("You rolled " + dieRoll);
            numbersRolled.add(new Integer(dieRoll));
        }

        // Display the numbers rolled
        System.out.println("Numbers rolled: " + numbersRolled);

    }

    private void declareGameWinner() throws Exception {
        // Declare the winner:

        // User wins if at least one of the die rolls is a 1
        if (numbersRolled.contains(new Integer(1))) {
            System.out.println("You won!");
        }
        else System.out.println("You lost!");

    }



}

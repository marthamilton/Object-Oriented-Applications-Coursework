import java.io.*;
public class GameRunner {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {

    	GameRunner gr = new GameRunner();

        System.out.print("Card (c) or Die (d) game?");
        String ans = gr.br.readLine();

        Game gc = GameFactory.getGame(ans);
        gc.game();
    }
}



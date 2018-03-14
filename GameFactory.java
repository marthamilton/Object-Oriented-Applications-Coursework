public class GameFactory {

    public static Game getGame(String ans) {
        if (ans.equals("c")){
            return new CardGame();

        }
        else if (ans.equals("d")){
            return new DieGame();
        }

        else{
            return null;
        }
  }

}

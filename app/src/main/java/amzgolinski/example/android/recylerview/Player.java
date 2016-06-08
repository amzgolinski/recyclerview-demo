package amzgolinski.example.android.recylerview;


import java.util.ArrayList;

public class Player {

  private String mFirstName;
  private String mLastName;
  private String mPosition;

  public Player(String firstName, String lastName, String position) {
    mFirstName = firstName;
    mLastName = lastName;
    mPosition = position;
  }

  public String getFirstName() {
    return mFirstName;
  }

  public String getLastName() {
    return mLastName;
  }

  public String getPosition() {
    return mPosition;
  }

  public static ArrayList<Player> getPlayerList() {
    ArrayList<Player> players = new ArrayList<Player>();
    players.add(new Player("Derek", "Jeter", "Shortstop"));
    players.add(new Player("Don", "Mattingly", "First Base"));
    players.add(new Player("Dave", "Righetti", "Relief Pitcher"));
    return players;
  }


}

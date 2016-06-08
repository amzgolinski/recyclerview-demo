package amzgolinski.example.android.recylerview;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

  private ArrayList<Player> players;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    RecyclerView playerRecyclerView =
      (RecyclerView) findViewById(R.id.players_recycler_view);

    players = Player.getPlayerList();

    PlayersAdapter playersAdapter = new PlayersAdapter(players);

    playerRecyclerView.setAdapter(playersAdapter);

    playerRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    playerRecyclerView.setHasFixedSize(true);

  }
}

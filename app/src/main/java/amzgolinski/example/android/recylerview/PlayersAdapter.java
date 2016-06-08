package amzgolinski.example.android.recylerview;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.textservice.TextInfo;
import android.widget.TextView;

import java.util.List;

public class PlayersAdapter extends
  RecyclerView.Adapter<PlayersAdapter.ViewHolder> {

  public static class ViewHolder extends RecyclerView.ViewHolder {

    public final TextView mFirstNameView;
    public final TextView mLastNameView;
    public final TextView mPositionView;

    // We also create a constructor that accepts the entire item row
    // and does the view lookups to find each subview
    public ViewHolder(View itemView) {
      // Stores the itemView in a public final member variable that can be used
      // to access the context from any ViewHolder instance.
      super(itemView);
      mFirstNameView = (TextView) itemView.findViewById(R.id.first_name);
      mLastNameView = (TextView) itemView.findViewById(R.id.last_name);
      mPositionView = (TextView) itemView.findViewById(R.id.position);

    }
  }

  private List<Player> mPlayers;

  public PlayersAdapter(List<Player> players) {
    mPlayers = players;
  }

  @Override
  public PlayersAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                      int viewType) {

    Context context = parent.getContext();
    LayoutInflater inflater = LayoutInflater.from(context);

    // Inflate the custom layout
    View playerView = inflater.inflate(R.layout.item_player, parent, false);

    // Return a new holder instance
    ViewHolder viewHolder = new ViewHolder(playerView);
    return viewHolder;

  }

  // Involves populating data into the item through holder
  @Override
  public void onBindViewHolder(PlayersAdapter.ViewHolder viewHolder,
                               int position) {

    Player player = mPlayers.get(position);

    // First Name
    TextView firstName = viewHolder.mFirstNameView;
    firstName.setText(player.getFirstName());

    // Last name
    TextView lastName = viewHolder.mLastNameView;
    lastName.setText(player.getLastName());

    // Position
    TextView playerPosition = viewHolder.mPositionView;
    playerPosition.setText(player.getPosition());

  }

  // Return the total count of items
  @Override
  public int getItemCount() {
    return mPlayers.size();
  }


}




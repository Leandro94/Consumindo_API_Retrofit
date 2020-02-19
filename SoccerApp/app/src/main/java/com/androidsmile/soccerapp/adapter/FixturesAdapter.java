package com.androidsmile.soccerapp.adapter;

/**
 * Created by joe on 09.09.17.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.androidsmile.soccerapp.R;
import com.androidsmile.soccerapp.model.fixtures.FixtureDatum;

import java.util.List;

/**
 * Created by joe on 09.09.17.
 */

public class FixturesAdapter extends RecyclerView.Adapter<FixturesAdapter.ViewHolder>{

    List<FixtureDatum> fixtures;

    public FixturesAdapter(List<FixtureDatum> fixtures) {
        this.fixtures = fixtures;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listitem_fixture, parent, false);
        return new ViewHolder(view);
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView localTeam;
        TextView localTeamScore;
        TextView visitorTeam;
        TextView visitorTeamScore;
        public ViewHolder(View view) {
            super(view);
            localTeam = (TextView) view.findViewById(R.id.local_team);
            localTeamScore = (TextView) view.findViewById(R.id.local_team_score);
            visitorTeam = (TextView) view.findViewById(R.id.visitor_team);
            visitorTeamScore = (TextView) view.findViewById(R.id.visitor_team_score);
        }
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        FixtureDatum fixturesDatum = fixtures.get(position);

        holder.localTeam.setText(fixturesDatum.getLocalTeam().getData().getName());
        holder.localTeamScore.setText(String.valueOf(fixturesDatum.getScores().getLocalteamScore()));
        holder.visitorTeam.setText(fixturesDatum.getVisitorTeam().getData().getName());
        holder.visitorTeamScore.setText(String.valueOf(fixturesDatum.getScores().getVisitorteamScore()));

    }

    @Override
    public int getItemCount() {
        return fixtures.size();
    }

}


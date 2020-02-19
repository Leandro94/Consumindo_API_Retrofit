package com.androidsmile.soccerapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.androidsmile.soccerapp.R;
import com.androidsmile.soccerapp.model.topscorers.GoalscorerDatum;

import java.util.List;

/**
 * Created by joe on 03.09.17.
 */

public class TopscorersAdapter extends RecyclerView.Adapter<TopscorersAdapter.ViewHolder>{

    List<GoalscorerDatum> goalscorers;

    public TopscorersAdapter(List<GoalscorerDatum> goalscorers) {
        this.goalscorers = goalscorers;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView position;
        TextView name;
        TextView goals;
        public ViewHolder(View view) {
            super(view);
            position = (TextView) view.findViewById(R.id.position);
            name = (TextView) view.findViewById(R.id.name);
            goals = (TextView) view.findViewById(R.id.goals);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listitem_topscorer, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        GoalscorerDatum goalscorerDatum = goalscorers.get(position);
        holder.position.setText(String.valueOf(goalscorerDatum.getPosition()));
        holder.name.setText(goalscorerDatum.getPlayer().getData().getCommonName());
        holder.goals.setText(String.valueOf(goalscorerDatum.getGoals()));
    }

    @Override
    public int getItemCount() {
        return goalscorers.size();
    }

}

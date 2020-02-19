package com.androidsmile.soccerapp.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidsmile.soccerapp.R;
import com.androidsmile.soccerapp.adapter.TopscorersAdapter;
import com.androidsmile.soccerapp.app.Api;
import com.androidsmile.soccerapp.app.App;
import com.androidsmile.soccerapp.model.topscorers.GoalscorerDatum;
import com.androidsmile.soccerapp.model.topscorers.TopscorersResult;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TopscorersFragment extends Fragment {

    final int SEASON_ID = 7953;
    final String INCLUDE = "goalscorers.player";

    Api api;
    RecyclerView recycler;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public TopscorersFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TopscorersFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TopscorersFragment newInstance(String param1, String param2) {
        TopscorersFragment fragment = new TopscorersFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_topscorers, container, false);

        recycler = (RecyclerView) view.findViewById(R.id.recycler);
        api = App.getApi();

        getTopscorers();

        return view;
    }

    private void getTopscorers() {

        api.getTopscorers(SEASON_ID, INCLUDE).enqueue(new Callback<TopscorersResult>() {
            @Override
            public void onResponse(Call<TopscorersResult> call, Response<TopscorersResult> response) {
                TopscorersResult topscorersResult = response.body();
                List<GoalscorerDatum> goalscorers = topscorersResult.getData().getGoalscorers().getData();
                Collections.sort(goalscorers, new Comparator<GoalscorerDatum>() {
                    @Override
                    public int compare(GoalscorerDatum g1, GoalscorerDatum g2) {
                        return g1.getPosition()-g2.getPosition();
                    }
                });
                showTopscorers(goalscorers);
            }

            @Override
            public void onFailure(Call<TopscorersResult> call, Throwable t) {

            }
        });

    }

    private void showTopscorers(List<GoalscorerDatum> goalscorers) {
        recycler.setLayoutManager(new LinearLayoutManager(getContext()));
        recycler.setAdapter(new TopscorersAdapter(goalscorers));
    }

}

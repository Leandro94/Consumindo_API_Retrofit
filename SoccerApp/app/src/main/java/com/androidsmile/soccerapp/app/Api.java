package com.androidsmile.soccerapp.app;

import com.androidsmile.soccerapp.model.fixtures.FixturesResult;
import com.androidsmile.soccerapp.model.standings.StandingsResult;
import com.androidsmile.soccerapp.model.topscorers.TopscorersResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by joe on 06.09.17.
 */

public interface Api {

    @GET("standings/season/{seasonId}")
    Call<StandingsResult> getStandings(@Path("seasonId") int seasonId);

    @GET("rounds/{roundId}")
    Call<FixturesResult> getRoundWithFixtures(@Path("roundId") int roundId, @Query("include") String include);

    @GET("topscorers/season/{seasonId}")
    Call<TopscorersResult> getTopscorers(@Path("seasonId") int seasonId, @Query("include") String include);

}

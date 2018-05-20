package com.siqute.android.popularmovies.utilities;

import android.net.Uri;
import android.util.Log;

import com.siqute.android.popularmovies.models.Movie;
import com.siqute.android.popularmovies.models.MovieJson;
import com.siqute.android.popularmovies.models.TMDBJson;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NetworkUtils {

    private static final Uri TMDB_IMAGE_URI_BASE = Uri.parse("http://image.tmdb.org/t/p/");

    public static ArrayList<Movie> getPopularMovies(){

        ArrayList<Movie> movies = new ArrayList<>();
        TMDBService tmdbService = RetrofitUtils.getRetrofitClient()
                .create(TMDBService.class);
        Call<List<TMDBJson>> call = tmdbService.getPopularMovies(TMDBApiKey.getApiKey(), "1");
        //make an asynchronous call on a background thread
        call.enqueue(new Callback<List<TMDBJson>>() {
            @Override
            public void onResponse(Call<List<TMDBJson>> call, Response<List<TMDBJson>> response) {
                //get the TMDB page JSON
                for (TMDBJson tmdbJson: response.body())
                {
                    for (MovieJson mj:tmdbJson.getResults()) {
                        Log.i("Movie Title", mj.getOriginalTitle());
                    }
                }
            }

            @Override
            public void onFailure(Call<List<TMDBJson>> call, Throwable t) {
                call.cancel();
                Log.i("NetworkUtils error", t.getMessage());
            }
        });
        return null;
    }

}

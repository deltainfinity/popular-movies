package com.siqute.android.popularmovies.utilities;

import com.siqute.android.popularmovies.models.TMDBJson;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface TMDBService {

    @GET("popular")
    Call<List<TMDBJson>> getPopularMovies(
            @Query("api_key") String api_key,
            @Query("results_page") String results_page);

    @GET("top_rated")
    Call<List<TMDBJson>> getTopRatedMovies(
            @Query("api_key") String api_key,
            @Query("results_page") String results_page);
}

package com.siqute.android.popularmovies.utilities;

import com.siqute.android.popularmovies.models.TMBDJson;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface TMDBService {

    @GET("popular")
    Call<List<TMBDJson>> getPopularMovies(
            @Query("api_key") String api_key,
            @Query("results_page") String results_page);

    @GET("top_rated")
    Call<List<TMBDJson>> getTopRatedMovies(
            @Query("api_key") String api_key,
            @Query("results_page") String results_page);
}

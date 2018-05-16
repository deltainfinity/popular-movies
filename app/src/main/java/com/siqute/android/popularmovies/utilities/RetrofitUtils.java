package com.siqute.android.popularmovies.utilities;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUtils {

    private static Retrofit retrofit = null;

    static Retrofit getRetrofitClient()
    {
        retrofit = new Retrofit.Builder()
                .baseUrl("http://api.themoviedb.org/3/movie")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;

    }
}

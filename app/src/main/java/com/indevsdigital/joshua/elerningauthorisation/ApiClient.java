package com.indevsdigital.joshua.elerningauthorisation;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by joshua on 16/12/17.
 * This is a singleton that provides the retrofit instance to be used for all the connections
 * since creating it is kind of expensive.
 */

public class ApiClient {
    public static final String BASE_URL = "https://indevs-elearn.herokuapp.com/api/";
    private static Retrofit retrofit = null;


    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}

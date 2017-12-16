package com.indevsdigital.joshua.elerningauthorisation;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by joshua on 16/12/17.
 * This interface goes for the auth token and returns a call of type <a pojo you define> in this
 * case a Token object created to demonstrate the functionality of GsonConverterFactory
 */

public interface Auth {
    @POST("auth/api-token-auth/")
    Call<Token> getAuthTocken(@Body Credentials credentials);
}
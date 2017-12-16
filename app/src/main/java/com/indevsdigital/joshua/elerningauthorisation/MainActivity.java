package com.indevsdigital.joshua.elerningauthorisation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Auth apiService = ApiClient.getClient().create(Auth.class);

        Call<Token> call = apiService.getAuthTocken(new Credentials("joshua","qwerty12345"));
        call.enqueue(new Callback<Token>() {
            @Override
            public void onResponse(Call<Token> call, Response<Token> response) {
                int statusCode = response.code();
                String tocken = response.body().getToken();
                Log.d("tocken", "onResponse: "+tocken);
                Log.d("tocken", "onResponse: "+statusCode);

            }

            @Override
            public void onFailure(Call<Token> call, Throwable t) {
                // Log error here since request failed
                Log.e("main Activity", t.toString());
            }
        });
    }


}

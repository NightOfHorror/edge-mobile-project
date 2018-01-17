package com.example.kos.edgemobile.retrofit;

import android.app.Application;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscription;
import rx.schedulers.Schedulers;

public class AppRetrofit extends Application {

    private static final String TAG = AppRetrofit.class.getSimpleName();

    private static Subscription subscription;
    private static RetrofitServices retrofitServices;

    private Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();
        retrofit = new Retrofit.Builder()
                .baseUrl(getURL())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        request = retrofit.create(ServerRequest.class);
    }

    public static void init(){
        Log.d(TAG, "init");

        RxJavaCallAdapterFactory rxAdapter = RxJavaCallAdapterFactory.createWithScheduler(Schedulers.io());

        Gson gson = new GsonBuilder().create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(rxAdapter)
                .build();

        //GetModels apiService = retrofit.create(GetModels.class);
    }


}

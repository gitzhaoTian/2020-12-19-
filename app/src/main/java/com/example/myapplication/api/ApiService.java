package com.example.myapplication.api;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiService {
    @POST
    @FormUrlEncoded
    Observable<ResponseBody> get(@Field("k") String value);
}

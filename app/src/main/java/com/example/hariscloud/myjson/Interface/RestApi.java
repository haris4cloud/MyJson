package com.example.hariscloud.myjson.Interface;

import com.example.hariscloud.myjson.model.Admin;
import com.example.hariscloud.myjson.model.Examples;
import com.example.hariscloud.myjson.model.Models;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by hariscloud on 11/13/16.
 */

public interface RestApi {
    @GET("contohjson")
    Call<Examples> getDataAdmin();
}

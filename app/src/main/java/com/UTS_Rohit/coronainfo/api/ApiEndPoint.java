package com.UTS_Rohit.coronainfo.api;

import com.UTS_Rohit.coronainfo.model.RiwayatModel;
import com.UTS_Rohit.coronainfo.model.CountryModel;
import com.UTS_Rohit.coronainfo.model.RingkasanModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface ApiEndPoint {

    @GET(Api.END_POINT_WORLD_HISTORY)
    Call<List<RiwayatModel>> getHistoryList(@Path("date") String date);

    @GET(Api.END_POINT_SUMMARY_WORLD)
    Call<RingkasanModel> getSummaryWorld();

    @GET(Api.END_POINT_IDN)
    Call<CountryModel> getSummaryIdn();

}

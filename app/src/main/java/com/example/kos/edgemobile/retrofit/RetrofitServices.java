package com.example.kos.edgemobile.retrofit;

import com.example.kos.edgemobile.domains.Test;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by roman on 17.01.2018.
 */

public interface RetrofitServices
{
    /**
     * Запрос на получение теста с количеством заданий
     * @param count Количество запрашиваемых тестов
     * @param id ID пользователя
     * @param theme Тематика теста
     * @return Сформированный тест для пользователя
     */
    @GET("/tests")
    Call<Test> getTestCount(@Query("count") String count, @Query("user") int id, @Query("theme") String theme);
    /**
     * Запрос на получение полноценного теста
     * @param id ID пользователя
     * @param theme Тематика теста
     * @return Сформированный полноценный тест
     */
    @GET("/tests")
    Call<Test> getTestFull(@Query("user") int id, @Query("theme") String theme);
}

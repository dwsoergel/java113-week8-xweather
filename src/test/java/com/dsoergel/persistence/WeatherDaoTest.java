package com.dsoergel.persistence;

import com.xweather.Weather;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeatherDaoTest {

    @Test
    void getWeather() {
        WeatherDao dao = new WeatherDao();
        Weather weather = dao.getWeather();

        // Asserting that the weather object is not null
        assertNotNull(weather);
        // Asserting that the weather api response is a success
        assertTrue(weather.isSuccess());
        // Assert that we received weather data back for the period
        assertNotNull(weather.getResponse().get(0).getPeriods());

        String condition = weather.getResponse().get(0).getPeriods().get(0).getWeather();
        System.out.println("Current condition in Edgerton: " + condition);
    }
}
package com.dsoergel.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xweather.Weather;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class WeatherDao {
    private final Logger logger = LogManager.getLogger(this.getClass());

    public Weather getWeather() {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://data.api.xweather.com/conditions/edgerton%2C%20wi?fields=periods.tempF%2Cperiods.feelslikeF%2Cperiods.windDir%2Cperiods.windSpeedMPH%2Cperiods.weather&for=now&client_id=V09CoCoN2pQXaaTrpvYlE&client_secret=RhmTkLzdW3SD3q0Z5bTFJilbPf0BIsSrs1TMftC3");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        Weather weather = null;
        try {
            weather = mapper.readValue(response, Weather.class);
        } catch (JsonProcessingException e) {
            logger.error("Error parsing Xweather JSON", e);
        }
        return weather;
    }
}

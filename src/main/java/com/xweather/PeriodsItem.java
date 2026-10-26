package com.xweather;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PeriodsItem{

	@JsonProperty("tempF")
	private Object tempF;

	@JsonProperty("weather")
	private String weather;

	@JsonProperty("feelslikeF")
	private Object feelslikeF;

	@JsonProperty("windDir")
	private String windDir;

	@JsonProperty("windSpeedMPH")
	private Object windSpeedMPH;

	public void setTempF(Object tempF){
		this.tempF = tempF;
	}

	public Object getTempF(){
		return tempF;
	}

	public void setWeather(String weather){
		this.weather = weather;
	}

	public String getWeather(){
		return weather;
	}

	public void setFeelslikeF(Object feelslikeF){
		this.feelslikeF = feelslikeF;
	}

	public Object getFeelslikeF(){
		return feelslikeF;
	}

	public void setWindDir(String windDir){
		this.windDir = windDir;
	}

	public String getWindDir(){
		return windDir;
	}

	public void setWindSpeedMPH(Object windSpeedMPH){
		this.windSpeedMPH = windSpeedMPH;
	}

	public Object getWindSpeedMPH(){
		return windSpeedMPH;
	}

	@Override
 	public String toString(){
		return 
			"PeriodsItem{" + 
			"tempF = '" + tempF + '\'' + 
			",weather = '" + weather + '\'' + 
			",feelslikeF = '" + feelslikeF + '\'' + 
			",windDir = '" + windDir + '\'' + 
			",windSpeedMPH = '" + windSpeedMPH + '\'' + 
			"}";
		}
}
package com.xweather;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseItem{

	@JsonProperty("periods")
	private List<PeriodsItem> periods;

	public void setPeriods(List<PeriodsItem> periods){
		this.periods = periods;
	}

	public List<PeriodsItem> getPeriods(){
		return periods;
	}

	@Override
 	public String toString(){
		return 
			"ResponseItem{" + 
			"periods = '" + periods + '\'' + 
			"}";
		}
}
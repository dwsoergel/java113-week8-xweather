package com.xweather;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Weather{

	@JsonProperty("success")
	private boolean success;

	@JsonProperty("response")
	private List<ResponseItem> response;

	@JsonProperty("error")
	private Object error;

	public void setSuccess(boolean success){
		this.success = success;
	}

	public boolean isSuccess(){
		return success;
	}

	public void setResponse(List<ResponseItem> response){
		this.response = response;
	}

	public List<ResponseItem> getResponse(){
		return response;
	}

	public void setError(Object error){
		this.error = error;
	}

	public Object getError(){
		return error;
	}

	@Override
 	public String toString(){
		return 
			"Weather{" + 
			"success = '" + success + '\'' + 
			",response = '" + response + '\'' + 
			",error = '" + error + '\'' + 
			"}";
		}
}
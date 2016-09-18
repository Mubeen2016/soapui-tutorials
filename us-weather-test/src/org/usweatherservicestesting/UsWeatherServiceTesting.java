package org.usweatherservicestesting;

import java.util.List;

import com.cdyne.ws.weatherws.ArrayOfForecast;
import com.cdyne.ws.weatherws.Forecast;
import com.cdyne.ws.weatherws.ForecastReturn;
import com.cdyne.ws.weatherws.Weather;
import com.cdyne.ws.weatherws.WeatherSoap;

public class UsWeatherServiceTesting {

	public static void main(String[] args) {
	Weather weather = new Weather();
	WeatherSoap weathersoap = weather.getWeatherSoap();
	ForecastReturn forecastReturn = weathersoap.getCityForecastByZIP("60016");
	//String output = forecastReturn.getResponseText();
	//System.out.println(output);
	ArrayOfForecast fc=  forecastReturn.getForecastResult();
	List<Forecast> lfc = fc.getForecast();
	
	for (Forecast f:lfc){
		System.out.println(f.getDate() + " " + f.getDesciption());
	}

	}

}

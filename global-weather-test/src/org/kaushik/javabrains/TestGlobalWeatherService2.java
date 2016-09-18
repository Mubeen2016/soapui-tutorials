package org.kaushik.javabrains;

import net.webservicex.GlobalWeather;
import net.webservicex.GlobalWeatherSoap;

//http://www.webservicex.com/globalweather.asmx?WSDL
public class TestGlobalWeatherService2 {

	public static void main(String[] args) {
		
		//System.out.println(GetCitiesByCountryHelper("United States"));
		//System.out.println(GetCitiesByCountryHelper("United Kingdom"));
		System.out.println(GetWeatherHelper("Chicago", "United States"));
	}
	
	private static String GetCitiesByCountryHelper(String countryName){
		GlobalWeather globalWeather = new GlobalWeather();
		GlobalWeatherSoap globalWeatherSoap = globalWeather.getGlobalWeatherSoap();
		String output = globalWeatherSoap.getCitiesByCountry(countryName);
		
		globalWeather = null;
		globalWeatherSoap = null;
		return output;
	}
	
	private static String GetWeatherHelper(String cityName, String countryName){
		GlobalWeather globalWeather = new GlobalWeather();
		GlobalWeatherSoap globalWeatherSoap = globalWeather.getGlobalWeatherSoap();
		String output = globalWeatherSoap.getWeather(cityName, countryName);
		
		globalWeather = null;
		globalWeatherSoap = null;
		return output;
		
	}

}

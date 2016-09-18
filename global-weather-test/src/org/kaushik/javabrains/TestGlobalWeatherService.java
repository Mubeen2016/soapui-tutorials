package org.kaushik.javabrains;

import net.webservicex.GlobalWeather;
import net.webservicex.GlobalWeatherSoap;

//http://www.webservicex.com/globalweather.asmx?WSDL
public class TestGlobalWeatherService {

	public static void main(String[] args) {
		GlobalWeather globalWeather = new GlobalWeather();
		GlobalWeatherSoap globalWeatherSoap = globalWeather.getGlobalWeatherSoap();
		String output = globalWeatherSoap.getCitiesByCountry("United States");
		System.out.println(output);
	}

}

package org.kaushik.javabrains;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

//http://www.webservicex.net/geoipservice.asmx?WSDL
public class TestGeoIPWebService2 {
	public static void main(String args[]) {

		// String ipAddress = "212.58.244.22";
		//String ipAddress = "52.2.229.194";
		System.out.println(geoIPHelper("212.58.244.22"));
		System.out.println(geoIPHelper("52.2.229.194"));
		System.out.println(geoIPHelper("163.53.78.58"));
	}
	
	private static String geoIPHelper(String ip){
		GeoIPService geoIPService = new GeoIPService();
		GeoIPServiceSoap geoIPServiceSoap = geoIPService.getGeoIPServiceSoap();
		GeoIP geoIP = geoIPServiceSoap.getGeoIP(ip);
		
		String country =  geoIP.getCountryName() ;
		
		geoIPService = null;
		geoIPServiceSoap = null;
		geoIP = null;
		
		return country;
	}

}

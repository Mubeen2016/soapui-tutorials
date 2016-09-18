package org.kaushik.javabrains;
import net.webservicex.*;

public class TestGeoIPWebService {
	
	public static void main(String args[]){
		
		//String ipAddress = "212.58.244.22";
		String ipAddress = "52.2.229.194";
		GeoIPService geoIPService = new GeoIPService();
		GeoIPServiceSoap geoIPServiceSoap = geoIPService.getGeoIPServiceSoap();
		GeoIP geoIP = geoIPServiceSoap.getGeoIP(ipAddress);
		System.out.println(geoIP.getCountryName());
	}

}

import javax.xml.ws.Endpoint;

import ws.BanqueService;

public class ServeurJaxWS {

	public static void main(String[] args) {
		String url="http://localhost:8686/";
		Endpoint.publish(url, new BanqueService());
		System.out.println("Web Service est deployer sur : " +url);
		
	}

}

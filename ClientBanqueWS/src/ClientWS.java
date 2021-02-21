import java.util.List;

import ws.BanqueService;
import ws.BanqueWS;
import ws.Compte;

public class ClientWS {
	public static void main(String[] args) {
		
		BanqueService stub= new BanqueWS().getBanqueServicePort();

		System.out.println(stub.conversionEuroToDH(34));
		System.out.println("******************");
		
		ws.Compte compte=stub.getCompte(3);
		System.out.println("Code :"+compte.getCode());
		System.out.println("Solde :"+compte.getSolde());
		
		List<Compte> comptes=stub.listComptes();
		for (Compte cp:comptes) {
			System.out.println("******************");
			System.out.println("Code :"+cp.getCode());
			System.out.println("Solde :"+cp.getSolde());
			}

	}
}

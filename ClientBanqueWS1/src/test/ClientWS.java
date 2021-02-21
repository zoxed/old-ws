package test;


import ws.BanqueServiceProxy;
import ws.Compte;
/*
 * AXIS
 */
public class ClientWS {

	public static void main(String[] args) throws Exception {

		BanqueServiceProxy stub = new BanqueServiceProxy();
		System.out.println(stub.conversionEuroToDH(800));
		System.out.println("******************");
		
		Compte compte=stub.getCompte(3);
		System.out.println("Code :"+compte.getCode());
		System.out.println("Solde :"+compte.getSolde());
		
		Compte[] comptes=stub.listComptes();
		for (Compte cp:comptes) {
			System.out.println("******************");
			System.out.println("Code :"+cp.getCode());
			System.out.println("Solde :"+cp.getSolde());
		
		}
	
		
		
	}

}

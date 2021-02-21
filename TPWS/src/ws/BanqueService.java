package ws;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.Compte;

@WebService(serviceName = "BanqueWS")
public class BanqueService 
	{
	@WebMethod(operationName = "ConversionEuroToDH")
	public double conversion (@WebParam(name = "montant")
												double mt) 
	{
		return mt*11;
	}
	@WebMethod
	public Compte getCompte(@WebParam(name = "code") int code) 
	{
		return new Compte(1,Math.random()*9000, new Date());
	}
	@WebMethod
	public List<Compte> listComptes()
	{
		
		List<Compte> comptes=new ArrayList<Compte>();
		comptes.add(new Compte(1,Math.random()*9000, new Date()));
		comptes.add(new Compte(2,Math.random()*9000, new Date()));
		comptes.add(new Compte(3,Math.random()*9000, new Date()));
		return comptes;
		
	}
	
	
}

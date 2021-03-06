package service;

import java.util.ArrayList;

import model.AirCompany;

public class AirCompanyDb {
	
	public String name;
	public static ArrayList<AirCompany> aircompanies;
	
	public AirCompanyDb(String name) {
		super();
		this.name = name;
	}
	
	public static void addAirCompanyToDb(AirCompany airCompany) {
		
		aircompanies.add(airCompany);
	}

	public static void setAircompanies(ArrayList<AirCompany> aircompanies) {
		AirCompanyDb.aircompanies = aircompanies;
	}
	
	public static void listOfAirCompanies() {
		String list = "";
		int count =1;
		for(AirCompany airCompaniesList : aircompanies) {
			
			list = list + count +". "+ airCompaniesList;
			count++;
		}
		System.out.println(list);
	} 
	
	public static AirCompany selectAirCompany(String aircompany) {

		for(AirCompany airCompaniesList : aircompanies) {
			
			if(airCompaniesList.getAirCompanyName().equals(aircompany))
					return airCompaniesList;
		}
		return null;
	} 

}

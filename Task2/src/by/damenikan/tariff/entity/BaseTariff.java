package by.damenikan.tariff.entity;

public class BaseTariff {
	
	private double subscriptionFee;
	private double payPerMinutes;
	public double payPerMegaByte;
	private String tariffName;
	
	public BaseTariff(){}
	
	public BaseTariff (String tariffName, double subscriptionFee, double payPerMInutes,  double payPerMegaByte){
		
		this.tariffName = tariffName;
		this.subscriptionFee = subscriptionFee;
		this.payPerMinutes = payPerMInutes;
		this.payPerMegaByte = payPerMegaByte;
		
	}
	
	public String GetTariffName(){
		
		return this.tariffName;
	}
	
	public void SetTariffName(String tariffName){
		
		this.tariffName = tariffName;
	}
}

package by.damenikan.tariff.entity;

public class VoiceTariff extends BaseTariff{
	private int freeMinutes;
	private int freeMegaBytes;
	
	public  VoiceTariff(){}
	
	public VoiceTariff (String name){
		super.SetTariffName(name);
		
	}

}

package by.damenikan.tariff.types;

public enum InternetPack {
	PACK1GB(1),
	PACK2GB(2),
	PACK3GB(3),;
	
	private int traffic;
	
	InternetPack(){}
	
	InternetPack (int traffic){
		this.traffic = traffic;
	}
	
	public int getTraffic(){
		return this.traffic;
	}
}

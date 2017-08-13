package by.damenikan.tariff.types;

public enum EnumInternetPack {
		PACK1GB(1),
		PACK2GB(2),
		PACK3GB(3);
		
		private int traffic;
		
		EnumInternetPack (int traffic){
			this.traffic = traffic;
		}
		
		public int getTraffic(){
			return this.traffic;
		}
	}


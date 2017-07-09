package by.damenikan.fashion.image;

import java.util.ArrayList;
import java.util.Collections;

import by.damenikan.fashion.enums.Doll;
import by.damenikan.fashion.enums.Wear;

public class DollsImage {
	private static int next_id = 10000;
	private int id;
	private String name;
	private ArrayList<DollsItem> dollsList = new ArrayList<DollsItem>();
	private ArrayList<Wear> wearList = new ArrayList<Wear>(4);
	
	public DollsImage(){
		
		this.id = ++next_id;
	}

	@Override
	public String toString(){
		
		return "Номер образа : "+this.id + "\n Кукла : " + this.dollsList.size() + "\n Название : " +  this.name;
	}
	
	private String NormalizationImageName(String name){
		
		String normalName = "";
		if (name.length() <= 4 || name.length() >= 20 || name.isEmpty()) { 
			normalName = "Кукла#" + this.id;
		}
		else
		{
			normalName = name;
		}
		
		return normalName;
	}
	
	public void SetImageName(String name){
		
		this.name = NormalizationImageName(name);
	}
	
	public String GetImageName(){
		return this.name;
	}
	 
	
	public void AddDoll(Doll doll){		
		
		AddDollItem(doll, 1);
	}
	
	public void AddDoll(Doll doll, int dollQty){
		
		AddDollItem(doll, dollQty);
		
	}

	private void AddDollItem(Doll doll, int dollQty){
		
		int freeDollQty = GetFreeDollQty(doll, dollQty);
		
		for (int i = 1; i<=freeDollQty; i++){
			int dollNumber = i;
			DollsItem dollsItem = new DollsItem(doll, dollNumber);
			this.dollsList.add(dollsItem);
		}
	}
	
	private int GetFreeDollQty(Doll doll, int dollQty){
		int cnt = Collections.frequency(this.dollsList, doll);
		int totalDollQty = doll.getDollQuantity();
		int FreeDollQty = 0;
		
		if (dollQty <= (totalDollQty - cnt)){
			FreeDollQty = dollQty;
		}

		if (dollQty > (totalDollQty - cnt)){
			FreeDollQty = totalDollQty - cnt;
		}
		
		return FreeDollQty;
	}
	
	public void NewClothing(Wear wear){
		if (this.wearList.size() <= 4) {
			if (!this.wearList.contains(wear)) {
				this.wearList.add(wear);
			}
		}
		
	}
	
	public ArrayList<Wear> GetWearList(){
		return this.wearList;
	}
	
	public String WearListString()
	{
		String wearString = "";
		for (Wear wear:this.wearList)
		{
			wearString = wearString + "\n" + wear.toString();
		}
		return wearString;
	}
}

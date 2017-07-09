package by.damenikan.fashion.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;

import by.damenikan.fashion.enums.Doll;
import by.damenikan.fashion.enums.Wear;
import by.damenikan.fashion.image.DollsImage;


public class RunTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stubprivate 
		Doll BARBIE = Doll.BARBIE;
		Doll KEN = Doll.KEN;
		Wear DRESS = Wear.DRESS;
		Wear JACKET = Wear.JACKET;
		Wear HAT = Wear.HAT;
		
		
		DollsImage imageChic = new DollsImage();
		imageChic.SetImageName("GlamourousChick");
		imageChic.AddDoll(BARBIE, 2);
		imageChic.NewClothing(DRESS);
		imageChic.NewClothing(JACKET);
		imageChic.NewClothing(HAT);
		
		System.out.println("===================");
		System.out.println(imageChic.toString());
		System.out.println("-------------------");
		System.out.println(imageChic.WearListString());
		System.out.println("-------------------");
		
		
	}

}

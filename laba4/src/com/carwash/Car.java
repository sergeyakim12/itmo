package com.carwash;

public class Car {
	private int tire = 4, oil = 3, pads = 8,	filter = 1;
	private int iztire, izoil, izpads, izfilter;
	
	public int getTire(){
		return tire;
	}
	public int getOil(){
		return oil;
	}
	public int getPads(){
		return pads;
	}
	public int getFilter(){
		return filter;
	}
	
	public int getIztire(){
		return iztire;
	}
	public void setIztire(int iztire){
		if (iztire>=0 && iztire<=100){
			this.iztire = iztire;
		}
	}
	public int getIzoil(){
		return izoil;
	}
	public void setIzoil(int izoil){
		if (izoil>=0 && izoil<=100){
			this.izoil = izoil;
		}
	}
	public int getIzpads(){
		return izpads;
	}
	public void setIzpads(int izpads){
		if (izpads>=0 && izpads<=100){
			this.izpads = izpads;
		}
	}
	public int getIzfilter(){
		return izfilter;
	}
	public void setIzfilter(int izfilter){
		if (izfilter>=0 && izfilter<=100){
			this.izfilter = izfilter;
		}
	}
	
	public String getDestription(){
		return "У автомобиля есть: "+tire+" колеса, "+oil+" литров масла, "+pads+" тормозных колодок, "+filter+" фильтр";
	}
}

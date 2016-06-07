package com.carwash;

public class Stock {
	private int tire, oil, pads, filter;
	
	public int getTire(){
		return tire;
	}
	public void setTire(int tire){
		if (tire>=0 ){
			this.tire = tire;
		}
	}
	public int getOil(){
		return oil;
	}		
	public void setOil(int oil){
		if (oil>=0 ){
			this.oil = oil;
		}
	}
	public int getPads(){
		return pads;
	}
	public void setPads(int pads){
		if (pads>=0 ){
			this.pads = pads;
		}
	}
	public int getFilter(){
		return filter;
	}
	public void setFilter(int filter){
		if (filter>=0 ){
			this.filter = filter;
		}
	}
	
}

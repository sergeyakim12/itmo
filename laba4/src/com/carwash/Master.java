package com.carwash;

public class Master {
	private int iztire=90, izoil=85, izpads=60, izfilter=80;
	
	public boolean testTire(Car car){
		return car.getIztire()>iztire;
	}
	public boolean testOil(Car car){
		return car.getIzoil()>izoil;
	}
	public boolean testPads(Car car){
		return car.getIzpads()>izpads;
	}
	public boolean testFilter(Car car){
		return car.getIzfilter()>izfilter;
	}
}

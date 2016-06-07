package com;
import com.carwash.Car;
import com.carwash.Master;
import com.carwash.Stock;

public class Testcarwash {
 public static void main(String[] args) {
	 Car ford= new Car();
	 ford.setIztire(95);
	 ford.setIzoil(40);
	 ford.setIzfilter(80);
	 ford.setIzpads(69);
	 
	 System.out.println(ford.getDestription());
	 
	 Stock garage = new Stock();
	 garage.setTire(6);
	 garage.setOil(12);
	 garage.setFilter(2);
	 garage.setPads(6);
	 
	 Master sanya = new Master();
	 if (sanya.testTire(ford)){
		 if (garage.getTire()>ford.getTire()){
			 garage.setTire(garage.getTire()- ford.getTire());
			 ford.setIztire(0);
			 System.out.println("Шины заменены");
		 } else {System.out.println("Нехватает шин");}
	 } else {System.out.println("Шины менять не надо");}
	 
	 if (sanya.testOil(ford)){
		 if (garage.getOil()>ford.getOil()){
			 garage.setOil(garage.getOil()- ford.getOil());
			 ford.setIzoil(0);
			 System.out.println("Масло поменяно");
		 } else {System.out.println("Нехватает масла");}
	 }else {System.out.println("Масло менять не надо");}
	 
	 if (sanya.testFilter(ford)){
		 if (garage.getFilter()>ford.getFilter()){
			 garage.setFilter(garage.getFilter()- ford.getFilter());
			 ford.setIzfilter(0);
			 System.out.println("Фильтр заменён");
		 } else {System.out.println("Нехватает фильтра");}
	 }else {System.out.println("Фильтр менять не надо");}
	 
	 if (sanya.testPads(ford)){
		 if (garage.getPads()>ford.getPads()){
			 garage.setPads(garage.getPads()- ford.getPads());
			 ford.setIzpads(0);
			 System.out.println("Тормозные колодки поменяны");
		 } else {System.out.println("Нехватает тормозных колодок");}
	 }else {System.out.println("Тормозные колодки менять не надо");}
 }

	 
 
}

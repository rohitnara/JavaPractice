package test;

import java.util.*;
import java.lang.*;
import java.io.*;


public class Uber{
	Map<Customer,assignDriver> hm=new HashMap<>();
	
	public double CalculateBestDriver(Driver d){
		return (double)d.rating/(d.fair*d.shortestPath);
	}
	void assignCab(Customer c,Queue<assignDriver> q){
		
		hm.put(c, q.remove());
		System.out.println(c.id+" "+c.name+" "+hm.get(c).dId+" "+hm.get(c).bestRating);
		System.out.println();
		for(assignDriver obj:q){
			System.out.println(obj.dId+" "+obj.bestRating);
		}
	}
	void putCab(Customer c,Queue<assignDriver> q){
		q.add(hm.get(c));
		hm.remove(c);
		System.out.println();
		for(assignDriver obj:q){
			System.out.println(obj.dId+" "+obj.bestRating);
		}
	}
	void assignRide(){
		for(Customer obj:hm.keySet()){
			System.out.println(obj.id+" "+obj.name+" "+hm.get(obj).dId+" "+hm.get(obj).bestRating);
		}
	}
	
	public static void main(String[] args) {
		Uber u=new Uber();
		Customer c1=new Customer("Rohit",1);
		Customer c2=new Customer("Rahul",2);
		Customer c3=new Customer("Vicky",3);
		Driver d1=new Driver(4,4,100,5);
		Driver d2=new Driver(5,3,50,4);
		Driver d3=new Driver(6,5,150,8);
		Driver d4=new Driver(7,2,75,10);
		//double x=u.CalculateBestDriver(d2);
		//System.out.println(x);
		assignDriver as1=new assignDriver(d1.id,u.CalculateBestDriver(d1));
		assignDriver as2=new assignDriver(d2.id,u.CalculateBestDriver(d2));
		assignDriver as3=new assignDriver(d3.id,u.CalculateBestDriver(d3));
		assignDriver as4=new assignDriver(d4.id,u.CalculateBestDriver(d4));
		Queue<assignDriver> q=new PriorityQueue<>();
		q.add(as1);
		q.add(as2);
		q.add(as3);
		q.add(as4);
/*		System.out.println(q.remove().bestRating);
		System.out.println(q.remove().bestRating);
		System.out.println(q.remove().bestRating);
		System.out.println(q.remove().bestRating);*/
/*		for(assignDriver obj:q){
			System.out.println(obj.dId+" "+obj.bestRating);
		}*/
/*		q.add(as2);
		q.add(as3);*/
/*		System.out.println(q.remove().bestRating);
		System.out.println(q.remove().bestRating);*/
		u.assignCab(c1,q);
		u.assignCab(c2,q);
		u.assignCab(c3,q);
		u.putCab(c1, q);
		//u.assignCab(c1,q);
		u.assignRide();

	}

}

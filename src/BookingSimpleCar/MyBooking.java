package BookingSimpleCar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class MyBooking {

	static Scanner sc=new Scanner(System.in);
	 static List<TaxiD> created = creatTaxi();
	static List<Object> customerDetails=new ArrayList<>();
	public static void main(String[] args) {
		
	//	created.get(0).avaliable=false;
		//created.get(1).avaliable=false;
	//	created.get(2).currentPossition='d';
		//created.get(1).currentPossition='e';
		BookingSlot();
	}
		public static void BookingSlot() {
	
//		 System.out.println(created.get(0).id+" "+created.get(0).earning+" "+created.get(0).freeTime+" "+created.get(0).currentPossition+" "+created.get(0).avaliable);
//		 System.out.println(created.get(1).id+" "+created.get(1).earning+" "+created.get(1).freeTime+" "+created.get(1).currentPossition+" "+created.get(1).avaliable); 
		
		while(true)
		{
			System.out.println("1 to Booking");
			System.out.println("2 to Booking Details");
			int booking=sc.nextInt();
			
			switch(booking)
			{
			case 1:
				addBooking();
				break;
			case 2:
			//	  System.out.println("BookingId    CustomerId    TaxiNo    PickupPoint    DropPoint   PickupTime    DropTime   Earnings");
		      
				for(Object custDet : customerDetails)
		        {
		        	System.out.println(custDet);
		        	System.out.println("--------------------------------------------------------------------");
		        }
			}
			
			
		}
	}
public static void addBooking()
{
	System.out.println("Enter customerID");
	int customerID=sc.nextInt();
	System.out.println("Enter pickup Point");
	char pickupP=sc.next().charAt(0);
	System.out.println("Enter droping Point");
	char dropP=sc.next().charAt(0);
	System.out.println("Enter pickup Time");
	int pickupTime=sc.nextInt();
	customerDetails.add("customer ID: "+customerID);
	if(pickupP >= 'a' && pickupP <='f' && dropP >='a' && dropP <='f')
	{
	 
	List<Object> bookedDetails	=freeTaxis(pickupP,dropP,pickupTime,created);
	
	for(Object b : bookedDetails)
	{
	//	System.out.println(b);
	}
//	System.out.println(" current position "+created.get(3).currentPossition);
	}
	else
	{
		System.out.println("Enter Between a - f ");
	}
	
}

public static List<TaxiD> creatTaxi()
{
	List<TaxiD> taxi=new ArrayList<>(); 
	for(int i=0;i<4;i++)
	{
		TaxiD t=new TaxiD(i);
		taxi.add(t);
	}
	return taxi;
}


public static List<Object> freeTaxis(char pickupP,char dropP,int pickupTime,List<TaxiD> taxil)
{
List<Object> bookedDetails=new ArrayList<>();
Map<Integer,Integer> distancesNTravel=new HashMap<>();

	for(int i=0;i<taxil.size();i++)
	{
		
		if(taxil.get(i).avaliable )
		{
			//System.out.println("pickup point=="+pickupP);
			//System.out.println("current position=="+taxil.get(i).currentPossition);
		distancesNTravel.put(i,Math.abs(pickupP-taxil.get(i).currentPossition));
			
		}
	}
	List<Entry<Integer, Integer>> totalDistanceTravl =	TraveDistanceCalculation(distancesNTravel);
	
	for(Entry<Integer, Integer> lis : totalDistanceTravl)
		{
		 //System.out.println(created.get(lis.getKey()).id+" "+created.get(lis.getKey()).earning+" "+created.get(lis.getKey()).freeTime+" "+created.get(lis.getKey()).currentPossition);
		 
		 int dropingTime=pickupTime+Math.abs(pickupP-dropP);
		 
		 customerDetails.add("droping Time  "+dropingTime);
		
		// bookedDetails.add(created.get(lis.getKey()).id-1);
		// int taxid= Math.subtractExact(created.get(lis.getKey()).id,1);
		// System.out.println(created.get(lis.getKey()).id-1);
         customerDetails.add("Taxi ID : "+created.get(lis.getKey()).id);
		 customerDetails.add("Pickup Time : "+pickupTime);
		 customerDetails.add("Drop Point : "+dropP);
		 customerDetails.add("Pickup Point : "+pickupP);
		 taxil.get(lis.getKey()).earning=100+(15*Math.abs(pickupP-dropP)-5)*10; 
		 customerDetails.add("Earing : "+taxil.get(lis.getKey()).earning);
		 taxil.get(lis.getKey()).currentPossition=dropP;
		 System.out.println("current taxi position : "+taxil.get(lis.getKey()).currentPossition);
		 System.out.println("Taxi ID : "+created.get(lis.getKey()).id);
		 break;
		}
	
	return bookedDetails;	
}
public static List<Entry<Integer, Integer>> TraveDistanceCalculation(Map<Integer,Integer> distance)
{
	List<Map.Entry<Integer, Integer>> list = new ArrayList<>(distance.entrySet());   /////////////
	list.sort(Entry.<Integer, Integer>comparingByValue());		 ////////////////
//	for(Entry<Integer, Integer> lis : list)
//	{
//		System.out.println(lis);
//	}
	return list;
}	
  }

class TaxiD
{
	int id=0;
	double earning;
	int freeTime;
	char currentPossition;
	boolean avaliable;
	
	public TaxiD(int id)
	{
		this.id=id+1;
		earning=0;
		freeTime=0;
		currentPossition='a';
		avaliable=true;
	}
	
	
}
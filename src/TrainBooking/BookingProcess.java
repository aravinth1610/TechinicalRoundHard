package TrainBooking;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class BookingProcess
{
	int id;
	int upperSeat;
	int middleSeat;
	int lowerSeat;
	String name;
	int age;
	String gender;
	String berth;
	
	int racSeat;
	
	List<BookingProcess> rac =new ArrayList<>();
	List<Integer> avaliableSt = new ArrayList<>();
	List<String> view = new ArrayList<>();
	
	
	public BookingProcess()
	{
		upperSeat=1;
		middleSeat=1;
		lowerSeat=1;
		racSeat=1;
	}
	
	public List<String> bookingProcess(String name,int age,String gender,String berth,BookingProcess p)
	{
		List<BookingProcess> autoAdj = new ArrayList<>();

		id=id+1;
		
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.berth=berth;
		
		if(!(age < 5 || age > 60))
		{
		if(berth.equals("u"))
		{
			if(upperSeat!=0)
			{
				System.out.println("-----------------Upper Seat ");
				autoAdj.add(p);
				view.add("id: "+id);
				view.add("name: "+name);
				view.add("age: "+age);
				view.add("gender: "+gender);
				view.add("berth: "+berth);
				
				upperSeat--;
				
			}
			else
			{
				System.out.println("rac is only Avaliable");
				rac.add(p);
			}
		
		}
		
		if(berth.equals("m"))
		{
			if(middleSeat!=0)
			{
				System.out.println("-----------------Middle Seat ");
				//autoAdj.add(p);
				view.add("id: "+id);
				view.add("name: "+name);
				view.add("age: "+age);
				view.add("gender: "+gender);
				view.add("berth: "+berth);
				
				middleSeat--;
			}
			else
			{
				System.out.println("rac is only Avaliable");
				rac.add(p);
			}
		}
		}
		else 
		{
			
		}
		return view;
	
		
		
	}
		
//		if(berth.equals("l"))
//		{
//			
//			if(lowerSeat!=0)
//			{
//				System.out.println("-----------------Lower Seat ");
//				//autoAdj.add(p.name);
//				view.add("id: "+id);
//				view.add("name: "+name);
//				view.add("age: "+age);
//				view.add("gender: "+gender);
//				view.add("berth: "+berth);
//				
//				lowerSeat--;
//			}
//			else
//			{
//				System.out.println("rac is only Avaliable");
//				rac.add(p);
//
//			}
//		}
//		}
//		if(!(age < 5 || age > 60))
//		{
//		for(int i=0;i<rac.size();i++)
//		{
//		System.out.println("Rac is booked");
//		
//	//	System.out.println("waititng list  -- "+rac.get(0).id+" "+rac.get(0).berth+" "+rac.get(0).name+" "+rac.get(0).gender);
//		autoAdj.add(rac.get(0).id,rac.get(0));
//		//		view.add("id: "+rac.get(0).id);
////		view.add("name: "+rac.get(0).name);
////		view.add("age: "+rac.get(0).age);
////		view.add("gender: "+rac.get(0).gender);
////		view.add("berth: "+rac.get(0).berth);
//		racSeat--;
//		}
//		}
//		
////		for(int i=0;i<autoAdj.size();i++)
////		{
////			System.out.println("-----------"+autoAdj.get(i));
////		}
//		
//	}
//	
//	public void avaiableStatus(BookingProcess p)
//	{
//		System.out.println("---------------------------");
//
//		System.out.println("UpperSeat Status: "+p.upperSeat);
//		System.out.println("middleseat Status: "+p.middleSeat);
//		System.out.println("lowerseat Status: "+p.lowerSeat);
//		System.out.println("racseat Status: "+p.racSeat);
//		
//	}
//	
//	public void cancelTickets(int id)
//	{
//	
//	  for(int i=0;i<autoAdj.size();i++)
//	  {
//		  
////		  if(autoAdj.get(i).id == id)
////		  {
////				System.out.println(autoAdj.get(0).id+" "+autoAdj.get(0).age+" "+autoAdj.get(0).name+" "+autoAdj.get(0).berth);
////			  System.out.println(view.get(i));
////		  }
//	  }
//		  
//	}
//	
//	public void BookedList()
//	{
//		System.out.println("---------------------------");
//		
//		for(int i=0;i<autoAdj.size();i++)
//		{
//			System.out.println(autoAdj.get(i));
//		}
//		
////		for(int i=0;i<autoAdj.size();i++)
////		  {
////			System.out.println(autoAdj.get(i).id+" "+autoAdj.get(i).age+" "+autoAdj.get(i).name+" "+autoAdj.get(i).berth);
////
////		}
//	}
	
}
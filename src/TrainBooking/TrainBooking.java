package TrainBooking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class TrainBooking {
	static BookingProcess pr = new BookingProcess();
	public static void main(String[] args) {
		trainBookingProcess();
		//Map<Integer,Object> m = new LinkedHashMap<>();
		
	}

	public static void trainBookingProcess()
	{
	Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("----------Ticket-----------");
		System.out.println("booking 1");
		System.out.println("Avaliable tickets 2");
		System.out.println("View booking list 3");
		System.out.println("cancel Ticket 4");
        System.out.println("Exist 5");
		int chooise=sc.nextInt();
		switch (chooise) 
		{
		case 1: 
			
		    System.out.println("name");	
			String name=sc.next();
			System.out.println("Age");
			int age=sc.nextInt();
			System.out.println("Gender");
			String gender=sc.next();
			String berth;
			if(age < 5 || age > 60 )  
			{
				System.out.println("Only Lower Breth is Allowed l");
				berth=sc.next();	
			}
			else
			{
				System.out.println("Berth u | m | l");
				berth=sc.next();	

			}
			
			List<String> l = pr.bookingProcess(name,age,gender,berth,pr);
			Map<String,String> in =new LinkedHashMap<>();
			List<String> num = new ArrayList<>();
			for(int i=0;i<l.size();i++)
			{
				System.out.println(l.get(i));
				if(l.get(i).contains("id: "))
				{
					num.add(l.get(i));
				}
				}

for(int i=0;i<l.size();i++)
	{
//for(int k=0;k<num.size();k++)
//{
		in.put("1",l.get(i));
	//}
}
			
System.out.println(Arrays.asList(in));


			break;
		     
		case 2:
			//pr.avaiableStatus(pr);
		break;
		
		case 3:
		//	pr.BookedList();
			break;
			
		case 4:
			System.out.println("cancel Ticket 4");
			int nameR=sc.nextInt();
		//	pr.cancelTickets(nameR);
			
		break;
		
		case 5:
			System.exit(2);
			break;
		}
		}
		
	}	
	

	
}

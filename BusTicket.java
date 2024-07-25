import java.util.*;
//import java.lang.String;

class ticket{
	int NumOfTick = 0, amt = 0, arr, dep;
	
	String[] stops = {"Nigdi", "Dapodi", "Bopadi", "Khadki Station", "khadki post", "Raja bunglow", "Labour chowk", "COEP", "modern college", "shivaji nagar", "swargate", "bibewadi", "katraj"};   
	
	Scanner sc = new Scanner(System.in);
	
	void DisplayStops(){
		System.out.println("-----------------------list of stops-----------------------");
		System.out.println(" ");
		for(int i = 0; i < stops.length; i++){
			System.out.println((i+1) + "." + stops[i]);
		}
		System.out.println("-----------------------End of stops-----------------------");
	}
	
	void Destination(){
		DisplayStops();
		System.out.print("Enter the number of arrival stop : ");
		arr = sc.nextInt();
		System.out.print("Enter the number of stop to depart : ");
		dep = sc.nextInt();
		amt = (dep - arr)*5;
	}
	void tickets(){
		System.out.print("Enter the number of tickets : ");
		NumOfTick = sc.nextInt();
	}
	void TicketDetail(){
		System.out.println("----------------------------Ticket details----------------------------");
		System.out.println("Number of Tickets : " + NumOfTick);
		System.out.println("From : " + stops[arr-1] + " To " + stops[dep-1]);
		System.out.println("Amount : " + NumOfTick*amt);
		System.out.println("----------------------------Ticket details----------------------------");
	}
}

class pass{
	int Id = 0000, Pamt = 40;
	Scanner sc = new Scanner(System.in);
	void Id(){
		System.out.print("Enter the last four digit of your Id : ");
		Id = sc.nextInt();
	}
	
	void PassDetail(){
		System.out.println("----------------------------Pass details----------------------------");
		System.out.println("Amount of pass : " + Pamt);
		System.out.println("Pass Id : " + Id);
		System.out.println("You can travel anywhere using this pass.");
		System.out.println("This pass has validity of today only");
		System.out.println("----------------------------Pass details----------------------------");
	}
}

class BusTicket{
	public static void main(String args[]){
		boolean flag = true;
		int choice;
		Scanner cs = new Scanner(System.in);
		while(flag){
			System.out.println("What do you want to do?");
			System.out.println("1.Get a ticket");
			System.out.println("2.Get a pass");
			System.out.println("3.Exit");
			choice = cs.nextInt();
				
			switch(choice){
				case 1:
					ticket ob = new ticket();
					ob.tickets();
					ob.Destination();
					ob.TicketDetail();
					break;
				case 2:
					pass pob = new pass();	
					pob.Id();
					pob.PassDetail();
					break;
				case 3:
					flag = false;
					break;
				default:
					System.out.println("Please enter the valid choice.");
			}
		}
	}
}
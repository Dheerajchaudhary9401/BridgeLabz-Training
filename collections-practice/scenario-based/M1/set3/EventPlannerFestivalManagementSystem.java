package set3;

import java.util.*;

public class EventPlannerFestivalManagementSystem {
	
	static abstract class Fest{
		String name;
		String location;
		String date;
		public Fest(String name,String location,String date) {
			this.name=name;
			this.location = location;
			this.date=date;
		}
		
		abstract void displayDetails();
	}
	
	static class Music extends Fest{
		String headliner;
		String musicGenre;
		String ticketPrice;
		public Music(String name,String location,String date,String headliner,String musicGenre,String ticketPrice) {
			super(name,location,date);
			this.headliner=headliner;
			this.musicGenre=musicGenre;
			this.ticketPrice=ticketPrice;
		}
		void displayDetails() {
			System.out.println("Festival Name: "+name+"\nLocation: "+location+"\nDate: "+date+"\nHeadliner: "+headliner+"\nMusic Genre: "+musicGenre+"\nTicket Price: "+ticketPrice+"\n");
		}
	}
	
	static class Food extends Fest{
		String cuisine;
		String numStalls;
		String entryFee;
		public Food(String name,String location,String date,String cuisine,String numStalls,String entryFee) {
			super(name,location,date);
			this.cuisine=cuisine;
			this.numStalls=numStalls;
			this.entryFee=entryFee;
		}
		void displayDetails() {
			System.out.println("Festival Name: "+name+"\nLocation: "+location+"\nDate: "+date+"\nCuisine: "+cuisine+"\nNumber of Stalls: "+numStalls+"\nEntry Fee: "+entryFee+"\n");
		}
	}
	
	static class Art extends Fest{
		String artType;
		String numArtists;
		String exhibitionFee;
		public Art(String name,String location,String date,String artType,String numArtists,String exhibitionFee) {
			super(name,location,date);
			this.artType=artType;
			this.numArtists=numArtists;
			this.exhibitionFee=exhibitionFee;
		}
		void displayDetails() {
			System.out.println("Festival Name: "+name+"\nLocation: "+location+"\nDate: "+date+"\nArt Type: "+artType+"\nNumber of Artists: "+numArtists+"\nExhibition Fee: "+exhibitionFee+"\n");
		}
	}
	
	static class Manager{
		ArrayList<Fest> fests = new ArrayList<>();
		void addFest(Fest fest) {
			fests.add(fest);
		}
		
		void displayFest(String name) {
			for(Fest f: fests) {
				if(f.name.equals(name)) {
					f.displayDetails();
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			String s = sc.nextLine();
			if(s.equals("EXIT")) {
				break;
			}
			String[] words = s.split(" ");
			
			if(words[0].equals("ADD_FESTIVAL")&&words[1].equals("MUSIC")) {
				manager.addFest(new Music(words[2],words[3],words[4],words[5],words[6],words[7]));
				
			}
			if(words[0].equals("ADD_FESTIVAL")&&words[1].equals("FOOD")) {
				manager.addFest(new Food(words[2],words[3],words[4],words[5],words[6],words[7]));
				
			}
			if(words[0].equals("ADD_FESTIVAL")&&words[1].equals("ART")) {
				manager.addFest(new Art(words[2],words[3],words[4],words[5],words[6],words[7]));
				
			}
			if(words[0].equals("DISPLAY_DETAILS")) {
				manager.displayFest(words[1]);
			}
		}
		sc.close();
	}

}

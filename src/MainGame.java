import java.util.*;
import java.util.Scanner;


public class MainGame {
	    
	   public MainGame(){
	    }
	   
	   public static void typeItOut(String sent) throws InterruptedException{
		   for(int k = 0; k < sent.length(); k++)
		    {
		    String sentPiece = sent.substring(k, k+1);
		    System.out.print(sentPiece);
		    //Thread.sleep(100);
		    }
	   }
	   public static void typeFirstLetUpper(String sent) throws InterruptedException{
		   for(int k = 1; k < sent.length(); k++)
			  {
			   String firstLet = sent.substring(0, 1).toUpperCase();
			   String sentPiece = sent.substring(k, k+1);
			   firstLet.toUpperCase();
			   if(k == 1)
				   System.out.print(firstLet);
			   System.out.print(sentPiece);
			   //Thread.sleep(100);
		   }
		     
	   }
	   public static void main(String args[]) throws InterruptedException {
		   ArrayList<Race> raceList = new ArrayList<Race>();
		   int correct = 0;
		   Scanner scanner = new Scanner(System.in);
		   Character playerOne = new Character(null, null, null);
		   
		   Race dwarf = new Race("Dwarf", "Bold and hardy");
		   	raceList.add(dwarf);
    	   Race elf = new Race("Elf", "a magical people");
    	   	raceList.add(elf);
           Race halfling = new Race("Halfling", "The diminutive halflings survive in a world full of larger creatures");
           	raceList.add(halfling);
    	   Race human = new Race("Human", "physically diverse");
    	   	raceList.add(human);
    	       	   
		   String question = "What is your first name?";
		   String sentenceOne = "Hello, ";
		   String sentenceTwo = "! Welcome to the world of your own imagination.";
		   String sentenceThree = "Let's begin by creating a character...";
		   String sentenceFour = "What's your race?";
		   
		   typeItOut(question);
		   System.out.println("");
		   String name = scanner.next();
		   typeItOut(sentenceOne);
		   typeFirstLetUpper(name);
		   playerOne.setName(name);
		   typeItOut(sentenceTwo);
		   System.out.println("");
		   typeItOut(sentenceThree);
		   System.out.println("");
		   typeItOut(sentenceFour);
		   System.out.println("");
		   
		   String input = scanner.next();
		   boolean good = false;
		   
		   while (!good){
			 if(input.equals("help")){
				   for(Race r : raceList){
				   System.out.println(r +": " + r.getRaceInfo());
				   }
			   }
			 else{
				 for(Race r : raceList){
					 if(input.toLowerCase().equals(r.getRace().toLowerCase())){
		    		 System.out.println("Wow! A " + input + " what a great choice!");
		    		 good = true;
		    		 break;
					 }else{
			    	   System.out.println("Not a race");
			    	   break;
					 }
				 }
			 }
			 input = scanner.next();
			 playerOne.setRace(input);
		   }

	   }
}

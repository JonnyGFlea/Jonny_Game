import java.util.*;
import java.io.*;
import java.util.Scanner;


public class MainGame {
	    
	   public MainGame(){
	    }
	   
	   public static void typeItOut(String sent) throws InterruptedException{
		   for(int k = 0; k < sent.length(); k++)
		    {
		    String sentPiece = sent.substring(k, k+1);
		    System.out.print(sentPiece);
		    Thread.sleep(100);
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
			   Thread.sleep(100);
		   }
		     
	   }
	   public static void main(String args[]) throws InterruptedException {
		   ArrayList<Race> raceList = new ArrayList<Race>();
		   int correct = 0;
		   Race dwarf = new Race("Dwarf", "Bold and hardy");
    	   Race elf = new Race("Elf", "a magical people");
           Race halfling = new Race("Halfling", "The diminutive halflings survive in a world full of larger creatures");
    	   Race human = new Race("Human", "physically diverse");
    	   raceList.add(dwarf);
    	   raceList.add(elf);
    	   raceList.add(halfling);
    	   raceList.add(human);
		   String question = "What is your first name?";
		   typeItOut(question);
		   System.out.println("");
		   Scanner scanner = new Scanner(System.in);
		   String sentenceOne = "Hello, ";
		   String name = scanner.next();
		   Character playerOne = new Character(name, null, null);
		   String sentenceTwo = "! Welcome to the world of your own imagination.";
		   String sentenceThree = "Let's begin by creating a character...";
		   String sentenceFour = "What's your race?";
		   typeItOut(sentenceOne);
		   typeFirstLetUpper(name);
		   typeItOut(sentenceTwo);
		   System.out.println("");
		   typeItOut(sentenceThree);
		   System.out.println("");
		   typeItOut(sentenceFour);
		   System.out.println("");
		   boolean good = false;
		   while (!good);
		   {
			 String input = scanner.next();
			 if(input.equals("help"))
			   {
				   for(Race r : raceList)
				   {
				   System.out.println(r +": " + r.getRaceInfo());
				   }
			   }
			 for(Race r : raceList)
			 {
		    	 if(input.equals(r))
		    	 {
		    		 System.out.println(r);
		    		 System.out.println("Wow! A " + input + " what a great choice!");
		    		 good = true;
		    	 }
			 
			     else
			     {
			       correct++;
			       if(correct == 4)
			    	   System.out.println("Not a race");
		   
			     }
			 }
		}
		   
		   
		   /*
		   
		   else
		   {
			   for(Race r : raceList)
			   {
				   if(input.equals(r.getRace()))
				   {
					   System.out.println("Wow! A " + input + " what a great choice!"); 
				   }
			   
			   }
		   }
		   */
	   }
}

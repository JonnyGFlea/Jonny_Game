import java.util.*;

public class Character {
	
   private String name;
   private String gender;
   
   private String alignment;
   private String race;
   private String classType;

   private int level;
   private int currExperience;
   private int totalExperience;
   
   private ArrayList<String> backpack;
	
   public Character(String n, String g, String a2, String r, String c, int l1, int l2, int l3, ArrayList<String> b){
      name = n;
      gender = g;
      
      alignment = a2;
      race = r;
      classType = c;
      
      level = l1;
      currExperience = l2;
      totalExperience = l3;
      
      backpack = b;     
    }
	
	public String getName()
	{
		return name;
	}
	public String getGender()
	{
		return gender;
	}
	public String getAlignment()
	{
		return alignment;
	}
	public String getRace()
	{
		return race;
	}
	public String getClassType()
	{
		return classType;
	}
   public ArrayList<String> getBackpack()
	{
		return backpack;
	}
   
	public String setName(String n)
	{
		return name = n;
	}
	public String setGender(String g)
	{
		return gender = g;
	}
	public String setAlignment(String a)
	{
		return alignment = a;
	}
	public String setRace(String r)
	{
		return race = r;
	}
	public String setClassType(String c)
	{
		return classType = c;
	}
   
   public void addBackpack(String b)
	{
      backpack.add(b);
	}	 
   public String toString(){
	      return "\n\t\t\tName: " + name + 
	    		  "\nAlignment: " + alignment + "\tRace: " + race + "\tClass: " + classType 
	    		  		+ "\n\t\t\tGender: " + gender + 
	    		  			"\nExperience: " + currExperience + "\t\tLevel: " + level + "\tNext Level: " + totalExperience +
	    		  				"\nInventory: " + backpack; 
   }
}

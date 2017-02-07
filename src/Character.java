import java.util.*;

public class Character {
	
   private int age;
   private String name;
   private String gender;
   
   private String alignment;
   private String race;
   private String classType;

   private int level;
   private int experience;
   
   private ArrayList<String> backpack;
	
   public Character(String n, String r, String c, ArrayList<String> b){
      name = n;
      race = r;
      classType = c;
      backpack = b;
    }
	
	public String getName()
	{
		return name;
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
}

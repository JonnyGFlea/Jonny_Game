
public class Character {
	
	private String name;
	private String race;
	private String classType;
	
	public Character(String n, String r, String c){
		name = n;
		race = r;
		classType = c;
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
}

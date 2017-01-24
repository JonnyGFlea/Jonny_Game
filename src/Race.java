
public class Race {
		private String race;
		private String description;
		
		public Race(String name, String desc){
			race = name;
			description = desc;
	    }
		
		public String getRaceInfo()
		{
			return description;
		}	
		
		public String toString()
		{
			return race;
		}
}

public class ClassType {
		private String classType;
		private String description;
		
		public ClassType(String name, String desc){
			classType = name;
			description = desc;
	    }
		public String getClassType()
		{
			return classType;
		}
		public String getClassInfo()
		{
			return description;
		}	
		
		public String toString()
		{
			return classType;
		}
}

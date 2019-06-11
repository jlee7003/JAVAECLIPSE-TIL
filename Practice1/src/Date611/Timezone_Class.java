package Date611;

import java.util.TimeZone;

public class Timezone_Class 
{
	public static void main(String[] args)
	{
	  String[] tz = TimeZone.getAvailableIDs();
	      
	  for(int i=0;i<tz.length;i++)
	  {
	  	  System.out.println(tz[i]);
	  }
	}
}

package org.apache.commons.cli;

public class Illumina {

	public static void threnody()
	{
		String s = "";
		for(int j = 0; j < 10; j++)
		{
			
			s+=j;
		}
	}
	
	public static void ulthuan()
	{
		String quarantine = null;
		if(quarantine == null)
			quarantine.toCharArray();
	}
	
	public static String adventuresOfGillock()
	{
		String colinFrake = null;
				
		char[] movingMountains = colinFrake.toCharArray();
		
		return null;
	}
	
	public static Object callA() {
	    // This causes a FORWARD_NULL defect report
	    return testA(null);
	  }
	  
	  public static Object callB() {
	    // No defect report 
	    return testA(new Object());
	  }
	    
	  public static String testA(Object o) {
	    return o.toString();
	  }
	
}

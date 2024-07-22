class HotelRunner
{
	public static void main (String[] information)
	
	
	{
		System.out.println("running main in HotelRunner");
		if(information.length==4)
		{
			System.out.println("getting 4 reference from main method arguments");
			String name= information[0];
			String location= information[1];
			String Year= information[2];
			String state= information[3];
			
			System.out.println("name:"+name);
			System.out.println("location:"+location);
			System.out.println("Year:"+Year);
			System.out.println("state:"+state);
			
			
		}
		else
		{
			System.out.println("not getting 4 reference from main method arguments");
		
		}
		
	}
}
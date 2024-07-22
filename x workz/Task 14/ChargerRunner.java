class ChargerRunner
{
	
	public static void main (String[] args)
	{
		System.out.println("running main in ChargerRunner");
		String country=Chocolate.country(91);
		System.out.println("country:"+country);
		String country1=Chocolate.country(1);
		System.out.println("country:"+country1);
		String country2=Chocolate.country(44);
		System.out.println("country:"+country2);
		String country3=Chocolate.country(86);
		System.out.println("country:"+country3);
		String country4=Chocolate.country(61);
		System.out.println("country:"+country1);
		String country5=Chocolate.country(96);
		System.out.println("country:"+country5);
		double price= Chocolate.price("washingMachine");
		System.out.println("price");
		double price1= Chocolate.price("kfc");
		System.out.println("price1");
		double price2= Chocolate.price("burger");
		System.out.println("price2");
		double price3= Chocolate.price("kabab");
		System.out.println("price3");
		double price4= Chocolate.price("dosa");
		System.out.println("price4");
		double price5= Chocolate.price("pizza");
		System.out.println("price5");
		String producerName =Chocolate.producerName("jollyDays");
		System.out.println("producerName:"+producerName);
	    String producerName1=Chocolate.producerName("kgf");
		System.out.println("producerName:"+producerName1);
		String producerName2=Chocolate.producerName("kantara");
		System.out.println("producerName:"+producerName2);
		String producerName3=Chocolate.producerName("sarathi");
		System.out.println("producerName:"+producerName3);
		String producerName4=Chocolate.producerName("rajakumar");
		System.out.println("producerName:"+producerName4);
		String producerName5=Chocolate.producerName("kgf2");
		System.out.println("producerName:"+producerName5);
		double price6=Charger.price("acetaminophen");
		System.out.println("price:"+price6);
		double price7=Charger.price("albuterol");
		System.out.println("price:"+price7);
		double price8=Charger.price("amlodipine");
		System.out.println("price:"+price8);
		double price9=Charger.price("dollo");
		System.out.println("price:"+price9);
		String medicineName=Charger.medicineName("fever");
        System.out.println("medicineName:"+medicineName);
		String medicineName1=Charger.medicineName("cold");
        System.out.println("medicineName:"+medicineName1);
		String medicineName2=Charger.medicineName("body pain");
        System.out.println("medicineName:"+medicineName2);
		String medicineName3=Charger.medicineName("heart pain");
        System.out.println("medicineName:"+medicineName3);
		String availability=Charger.availability("janavi");
		System.out.println("availability:"+availability);
		String availability1=Charger.availability("amulya");
		System.out.println("availability1:"+availability1);
		String availability2=Charger.availability("sindhu");
		System.out.println("availability2:"+availability2);
		String availability3=Charger.availability("xxxx");
		System.out.println("availability3:"+availability3);
		
	}
}
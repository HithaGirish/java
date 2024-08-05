class Aeroplane
{
	String company;
	int noOfSeats;
	double ticketPrice;
	String source;
	String destination;
	
	public Aeroplane()
	{
		System.out.println("created the Aeroplane ");
	}
	public  Aeroplane(String company,int noOfSeats,double ticketPrice,String source,String destination)
	{
	System.out.println("created the Aeroplane");
	this.company=company;
	this.noOfSeats=noOfSeats;
	this.ticketPrice=ticketPrice;
	this.source=source;
	this.destination=destination;
	System.out.println("company:"+company);
	System.out.println("noOfSeats:"+noOfSeats);
	System.out.println("source:"+source);
	System.out.println("ticketPrice:"+ticketPrice);
	System.out.println("destination:"+destination);
	}
	public  Aeroplane(String company,String source,String destination)
	{
	System.out.println("created the Aeroplane");
	this.company=company;
	this.source=source;
	this.destination=destination;
	System.out.println("company:"+company);
	System.out.println("source:"+source);
	System.out.println("destination:"+destination);
	}
	public  Aeroplane(String company,double ticketPrice,String source,String destination)
	{
	System.out.println("created the Aeroplane");
	this.company=company;
	this.ticketPrice=ticketPrice;
	this.source=source;
	this.destination=destination;
	System.out.println("company:"+company);
	System.out.println("source:"+source);
	System.out.println("ticketPrice:"+ticketPrice);
	System.out.println("destination:"+destination);
	}
	
}
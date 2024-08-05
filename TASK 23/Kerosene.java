class Kerosene
{
	double price;
	int quantity;
	boolean quality;
	
	public Kerosene()
	{
		System.out.println("created the Kerosene ");
	}
	public Kerosene(double price,int quantity,boolean quality)
	{
		System.out.println("created the Kerosene ");
		this.price=price;
	    this.quantity=quantity;
	    this.quality=quality;
	    System.out.println("price:"+price);
	    System.out.println("quantity:"+quantity);
	    System.out.println("quality:"+quality);
	}
	public Kerosene(boolean quality)
	{
		System.out.println("created the Kerosene ");
	    this.quality=quality;
	    System.out.println("quality:"+quality);
	
	}
	public Kerosene(double price)
	{
		System.out.println("created the Kerosene ");
	    this.price=price;
	    System.out.println("price:"+price);
	
	}
	
}
class Mask
{
	double cost;
	char size;
	String material;
	
	public Mask()
	{
		System.out.println("created the mask");
		
	}
	public Mask(double cost)
	{
		System.out.println("created the mask");
		this.cost=cost;
		System.out.println("cost:"+cost);
	}
	public Mask(char size)
	{
	System.out.println("created the mask");
	this.size=size;
	System.out.println("size:"+size);
	}
	public Mask(String material)
	{
	System.out.println("created the mask");
	this.material=material;
	System.out.println("material:"+material);
	}
	public Mask(double cost,char size,String material)
	{
	System.out.println("created the mask");
	this.cost=cost;
	this.size=size;
	this.material=material;
	System.out.println("cost:"+cost);
	System.out.println("size:"+size);
	System.out.println("material:"+material);
	}
	public Mask(double cost,char size)
	{
	System.out.println("created the mask");
	this.cost=cost;
	this.size=size;
	System.out.println("cost:"+cost);
	System.out.println("size:"+size);
	
	}
	
	
	
}
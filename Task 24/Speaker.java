class Speaker
{
 String brand;
 String size;
 double cost;
 String output="loud";
 
 
 public Speaker(String brand)
 {
	 this.brand= brand;
 }
 public void size(String size)
 {
	 this.size=size;
 }
 public void setCost(double cost)
 {
	this.cost=cost;
 }
 


public void display()
 {
	 System.out.println("brand:"+brand);
	 System.out.println("size:"+size);
	 System.out.println("cost:"+cost);
	 System.out.println("output:"+output);
 
}
}
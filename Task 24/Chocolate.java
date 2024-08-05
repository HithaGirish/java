class Chocolate
{
 String brand;
 double price;
 String flavour;
 char size='S'; 
 
 public Chocolate(String brand)
 {
	 this.brand= brand;
 }
 public void price(double price)
 {
	 this.price=price;
 }
 public void flavour(String flavour)
 {
	this.flavour=flavour;
 }
 


public void display()
 {
	 System.out.println("brand:"+brand);
	 System.out.println("price:"+price);
	 System.out.println("flavour:"+flavour);
	 System.out.println("size:"+size);
	 }
}

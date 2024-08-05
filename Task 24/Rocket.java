class Rocket
{
 String country;
 double speed;
 double fuelCapacity;
 int noOfThrusters=3;
 
 
 
 public Rocket(String country)
 {
	 this.country= country;
 }
 public void speed(double speed)
 {
	 this.speed=speed;
 }
 public void setFuelCapacity(double fuelCapacity)
 {
	this.fuelCapacity=fuelCapacity;
 }
 


public void display()
 {
	 System.out.println("country:"+country);
	 System.out.println("speed:"+speed);
	 System.out.println("fuelCapacity:"+fuelCapacity);
	 System.out.println("noOfThrusters:"+noOfThrusters);
	 }
}
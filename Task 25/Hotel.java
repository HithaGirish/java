class Hotel
{
  String name="RAMA";
  Owner owner= new Owner("Hitha",21,"Female");
  
  public Hotel(String name)
  {
	  this.name=name;
  }
  
   public void store()
 {
	 System.out.println("name:"+this.name);
	 owner.store();
 }
  
  
  
  
}
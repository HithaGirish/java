class Company 
{
  int id;
  String name;
  String location;
  
  SoftwareEngineer softwareEngineer=new SoftwareEngineer("Hitha",0.5,"SoftwareDeveloper",300000.0);
  Company(int id,String name,String location)
   {
	   this.id=id;
	   this.name=name;
	   this.location=location;
   }
   public void display()
   {
	   System.out.println("id:"+id);
	   System.out.println("name:"+name);
	   System.out.println("location:"+location);
	   softwareEngineer.display();
   }
}
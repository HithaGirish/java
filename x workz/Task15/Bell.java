class Bell
{
 public static String name(int age)
 {
  System.out.println("running name in bell");
  if(age==21)
  {
     String name="hitha";
	 System.out.println("name:"+name);
  }
  return " age not found";
 }
 public static String brand (String itemName)
 {
	System.out.println("running brand in bell"); 
	if(itemName=="Shoes")
	{
	 String brand="nike";
	 System.out.println("itemName:"+itemName);
	 System.out.println("It is valid");
	 return brand;
	}
	 else
	 {
     String brand1="puma";	 
	 System.out.println("It is valid");
	 return brand1;	
		
	}	
 }
 public static void laptop(String laptopBrand)
 {
  System.out.println("running laptop in bell");
  if(laptopBrand=="Dell")
  {
     
	 System.out.println("brandname is found");
	 System.out.println("It is valid");
	 return;
  }
  else
  {
	System.out.println("brandname is not found"); 
    return;	
  }
  
  
 }
}

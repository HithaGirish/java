class Buy
{
 public static void product(String brand,double price)
 {
  System.out.println("running product in Buy");
  System.out.println("brand:"+brand);
  System.out.println("price:"+price);
  if(price>-500.45 && price<5000.34)
  {
   System.out.println("price is valid"); 
  }
  else
  {
   System.out.println("price is invalid");
  }
 }
public static void product(String name,int quantity,double price)
 {
  System.out.println("running product in Buy");
  System.out.println("Name:"+name);
  System.out.println("Quantity:"+quantity);
  System.out.println("Price:"+price);
  if(price>-600.45 && price<600.45)
  {
   System.out.println("price is valid"); 
  }
  else
  {
   System.out.println("price is invalid");
  }
 }  
public static void bookMovieTicket(String name,String theaterName,int quantity,double price)
  {
    System.out.println("running bookMovieTicket in Buy");
    System.out.println("Name:"+name);
    System.out.println("Theater Name:"+theaterName);
    System.out.println("Quantity:"+quantity);
    System.out.println("Price:"+price);
	if(quantity>-1000 && quantity<2000)
		{
			System.out.println("quantity is valid");
		}
		else
		{
			System.out.println("quantity is valid");
		}
    if (price>45.50 && price<100.00) 
	{
        System.out.println("Price is valid"); 
    } 
	else
	{
        System.out.println("Price is invalid");
    } 
}
public static void buyEgg(int total,double pricePerEgg)
 {
  System.out.println("running buyEgg in Buy");
  System.out.println("total:"+total);
  System.out.println("pricePerEgg:"+pricePerEgg);
  if(pricePerEgg>0.0 && pricePerEgg<8.98)
  {
   System.out.println("price is valid"); 
  }
  else
  {
   System.out.println("price is invalid");
  }
}
public static void buyShampoo (int quantityInMI,double price,String brand,String manfDate)
 {
  System.out.println("running buyShampoo in Buy");
  System.out.println("QuantityInMI:"+quantityInMI);
  System.out.println("Price:"+price);
  System.out.println("Brand:"+brand);
  System.out.println("ManfDate:"+manfDate);
  if(quantityInMI>-1000 && quantityInMI<1000)
  {
   System.out.println("price is valid"); 
  }
  else
  {
   System.out.println("price is invalid");
  }
 
 if(price>90.34 && price<1000.00) 
	{
        System.out.println("Price is valid"); 
    } 
	else
	{
        System.out.println("Price is invalid");
    } 
}
public static void buyCake (char size,String type,String flavour,double cost,int quantity)
 {
  System.out.println("running buyCake in Buy");
  System.out.println("size:"+size);
  System.out.println("type:"+type);
  System.out.println("flavour:"+flavour);
  System.out.println("cost:"+cost);
  System.out.println("quantity:"+quantity);
  if(cost>250.0 && cost<10000.78)
  {
   System.out.println("cost is valid"); 
  }
  else
  {
   System.out.println("cost is invalid");
  }
 
 if(quantity>0 && quantity<5) 
	{
        System.out.println("quantity is valid"); 
    } 
	else
	{
        System.out.println("quantity is invalid");
    } 
 }
public static void buySmartWatch(String brand,double price,int color,char type,int mode)
 {
  System.out.println("running buySmartWatch in Buy");
  System.out.println("brand:"+brand);
  System.out.println("price:"+price);
  System.out.println("color:"+color);
  System.out.println("type:"+type);
  System.out.println("mode:"+mode);
  if(price>270.0 && price<10070.78)
  {
   System.out.println("price is valid"); 
  }
  else
  {
   System.out.println("price is invalid");
  }
 
 if(color>0 && color<5) 
	{
        System.out.println("color is valid"); 
    } 
	else
	{
        System.out.println("color is invalid");
    } 
}
public static void buyLaptop (String brand,int serialNo,double price,int batteryCapacity,double screenSize,String os,int harddiskSize,int ramSize)
 {
  System.out.println("running laptop in Buy");
  System.out.println("brand:"+brand);
  System.out.println("serialNo:"+serialNo);
  System.out.println("price:"+price);
  System.out.println("batteryCapacity:"+batteryCapacity);
  System.out.println("screenSize:"+screenSize);
  System.out.println("os:"+os);
  System.out.println("harddiskSize:"+harddiskSize);
  System.out.println("ramSize:"+ramSize);
  
  if(serialNo>10 && serialNo<13)
  {
   System.out.println("serialNo is valid"); 
  }
  else
  {
   System.out.println("serialNo is invalid");
  }
 
 if(price>-45550.0 && price<79050.56) 
	{
        System.out.println("price is valid"); 
    } 
	else
	{
        System.out.println("price is invalid");
    } 
if(batteryCapacity>3000 && batteryCapacity<6000)
  {
   System.out.println("batteryCapacity is valid"); 
  }
  else
  {
   System.out.println("batteryCapacity is invalid");
  }
 
 if(screenSize>15.4 && screenSize<17.6) 
	{
        System.out.println("screenSize is valid"); 
    } 
	else
	{
        System.out.println("screenSize is invalid");
    } 
 if(harddiskSize>500 && harddiskSize<2000) 
	{
        System.out.println("harddiskSize is valid"); 
    } 
	else
	{
        System.out.println("harddiskSize is invalid");
    }
 if(ramSize>8 && ramSize<32) 
	{
        System.out.println("ramSize is valid"); 
    } 
	else
	{
        System.out.println("ramSize is invalid");
    } 	
 }


}
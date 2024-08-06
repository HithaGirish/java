class ElectronicsRunner
{
 public static void main(String[] args)
 {
   String [] values={"washingMachine","TV","AC","Fan","oven","straightner","grinder","watch","tab","laptop"};

	   
	   double washingMachine_price=price(values,"washingMachine");
	   double TV_price=price(values,"TV");
	   double AC_price=price(values,"AC");
	   double Fan_price=price(values,"Fan");
	   double oven_price=price(values,"oven");
	   double straightner_price=price(values,"straightner");
	   double grinder_price=price(values,"grinder");
	   double watch_price=price(values,"watch");
	   double tab_price=price(values,"tab");
	   double laptop_price=price(values,"laptop");
	   
	   System.out.println("TV_price:"+TV_price);
       System.out.println("AC_price:"+AC_price);
       System.out.println("fan_price:"+Fan_price);
       System.out.println("oven_price:"+oven_price);
       System.out.println("straightner_price:"+straightner_price);	
       System.out.println("grinder_price:"+grinder_price);
       System.out.println("watch_price:"+watch_price);
       System.out.println("tab_price:"+tab_price);	
       System.out.println("laptop_price:"+laptop_price);
	  
   }
   public static double price(String [] values ,String name)
   {
	      for(int i=0;i<values.length;i++){
	   if(values[i]==name&&name=="washing machine")
	   {
		   return 25000;
	   }
	    else if(values[i]==name&& name=="Fan")
	   {
		   return 1000;
	   }
	   else if(values[i]==name&& name=="TV")
	   {
		   return 100000;
	   }
	   else if(values[i]==name&& name=="oven")
	   {
		   return 9000;
	   }
	   else if(values[i]==name&& name=="straightner")
	   {
		   return 4000;
	   }
	   else if(values[i]==name&& name=="grinder")
	   {
		   return 6000;
	   }
	   else if(values[i]==name&& name=="watch")
	   {
		   return 5000;
	   }
	   else if(values[i]==name&& name=="tab")
	   {
		   return 15000;
	   }
	   	   else if(values[i]==name&& name=="laptop")
	   {
		   return 50000;
	   }
	   else if(values[i]==name&& name=="AC")
	   {
		   return 5000;
	   }
		  }
		  return 0;
	   
	   
   
   
   
 }
}
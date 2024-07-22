class JuiceRunner
{
 public static void main(String[] information)
 {
  System.out.println("running main in JuiceRunner ");
  if(information.length==5)
  {
    String name=information[0];
	String brand=information[1];
	String flavour=information[2];
	String price=information[3];
	String quantity=information[4];
	double convertedPrice=Double.parseDouble(price);
	int covertedQuantity=Integer.parseInt(quantity);
	Juice.juicebuyer(name,brand,flavour,convertedPrice,covertedQuantity);
  }
  else
  {
    System.out.println("product required");
  }
 }
}
class HospitalRunner
{
 public static void main(String[] product)
 {
  System.out.println("running main in HospitalRunner ");
  if(product.length==4)
  {
    String name=product[0];
	String manufDate=product[1];
	String price=product[2];
	String quantity=product[3];
	double convertedPrice=Double.parseDouble(price);
	int covertedQuantity=Integer.parseInt(quantity);
	Hospital.medicine(name,manufDate,convertedPrice,covertedQuantity);
  }
  else
  {
    System.out.println("product required");
  }
  
 }
}
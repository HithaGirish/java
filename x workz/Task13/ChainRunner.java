class ChainRunner
{
 public static void main(String[] args)
 {
  System.out.println("running main in ChainRunner");
  int carrat=Chain.carrat();
  System.out.println("carrat returntype:"+carrat);
  double costPerGram=Chain.costPerGram();
  System.out.println(" costPerGram returntype:"+costPerGram);
  String type =Chain.type();
  System.out.println("type returntype:"+type);
  String quality =Chain.quality();
  System.out.println("quality returntype:"+quality);
  int quantity =Chain.quantity();
  System.out.println("quantity returntype:"+quantity);
  double wastage=Chain.wastage();
  System.out.println(" wastage returntype:"+wastage);
  int serviceCharge=Chain.serviceCharge();
  System.out.println("serviceCharge returntype:"+serviceCharge);
  double GST=Chain.GST();
  System.out.println("GST returntype:"+GST);
  
 }
}
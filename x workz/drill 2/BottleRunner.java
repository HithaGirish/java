class BottleRunner
{
   public static void main(String[] args)
  {
   System.out.println("running main in BottleRunner");
   int[]pincode={500001,788999,781001,800001,490001,403999,396999,127999,171001,834999};
   int total =pincode.length;   
   System.out.println("total pincode:"+total);
   for(int pincodeNum=0;pincodeNum <=9;pincodeNum++)
   {
	   System.out.println(pincode[pincodeNum]);
   } 
     System.out.println("end the execution");
  }
}
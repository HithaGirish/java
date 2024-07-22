class LipstickRunner
{
   public static void main(String[] args)
  {
   System.out.println("running main in lipstickRunner");
   int[] brand ={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
   int total=brand.length;
   System.out.println(" totalbrand:"+total);
   for(int num=0;num<=20;num++)
   {
	   if(brand[num]%3==0)
	   {
		   System.out.println(brand[num]);
	   }
   }  
  }  
}
class ChargerRunner
{
   public static void main(String[] args)
  {
   System.out.println("running main in ChargerRunner");
   String[] primeMinister ={"Jawaharlal Nehru","Gulzarilal Nanda","Indira Gandhi" ,"Morarji Desai " , "Charan Singh", "Rajiv Gandhi ","Vishwanath Pratap Singh","Chandra Shekhar","P. V. Narasimha Rao","Atal Bihari Vajpayee","H. D. Deve Gowda","I. K. Gujral","Manmohan Singh","Narendra Modi"};
   int total=primeMinister.length;
   System.out.println(" totals primeMinister:"+total);
   for(int primeMinisterName=0;primeMinisterName<=14;primeMinisterName++)
   {
	   System.out.println(primeMinister[primeMinisterName]);
   } 
   
  
  }
}
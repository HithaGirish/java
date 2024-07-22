class BuyRunner
{
 public static void main (String[] args)
 {
  System.out.println("running main in BuyRunner");
  Buy.product("puma",-650.72);
  Buy.product("puma",4000.05);
  Buy.product("Hitha",4,200.34);
  Buy.product("Janu",5,206.34);
  Buy.bookMovieTicket("Ganu","SBG",4,95.9);
  Buy.bookMovieTicket("Greeshma","Navrang",5,99.9);
  Buy.buyEgg(12,8.64);
  Buy.buyEgg(13,9.64);
  Buy.buyShampoo(979,278.98,"nike","oct");
  Buy.buyShampoo(989,289.98,"puma","oct");
  Buy.buyCake('L',"coldcake","pineapple",260.78,4);
  Buy.buyCake('S',"normalcake","chocolate",290.78,5);
  Buy.buySmartWatch("Titan",5000.87,3,'D',8);
  Buy.buySmartWatch("Sonata",5008.97,4,'A',9);
  Buy.buyLaptop("hp",12,50000.89,4000,16.5,"array",700,16);
  Buy.buyLaptop("DELL",13,50067.89,4080,17.5,"byte",708,17);
  
  
 }
}
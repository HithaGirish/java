class CountryRunner
{
   public static void main(String[] args)
  {
   System.out.println("running main in CountryRunner");
   String[] states ={"Andhra Pradesh", "Arunachal Pradesh", "Assam"," Bihar", "Chhattisgarh", "Goa","Gujarat","Haryana","Himachal Pradesh","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra", "Manipur","Meghalaya", "Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu", "Telangana","Tripura","Uttar Pradesh","Uttarakhand","WestBengal"};
   int total=states.length;
   System.out.println(" totalstates:"+total);
   for(int statesName=0;statesName<28;statesName++)
   {
	   System.out.println(states[statesName]);
   } 
   int[]pincode={500001,788999,781001,800001,490001,403999,396999,127999,171001,834999};
   int sum =pincode.length;
   System.out.println("sum pincode:"+sum);
   for(int pincodeNum=0;pincodeNum <=9;pincodeNum++)
   {
       System.out.println(pincode[pincodeNum]);
   } 
    System.out.println("end the execution");
    String[] primeMinister ={"Jawaharlal Nehru","Gulzarilal Nanda","Indira Gandhi" ,"Morarji Desai " , "Charan Singh", "Rajiv Gandhi ","Vishwanath Pratap Singh","Chandra Shekhar","P. V. Narasimha Rao","Atal Bihari Vajpayee","H. D. Deve Gowda","I. K. Gujral","Manmohan Singh","Narendra Modi"};
   int all=primeMinister.length;
   System.out.println(" all primeMinister:"+all);
   for(int primeMinisterName=0;primeMinisterName<14;primeMinisterName++)
   {
	   System.out.println(primeMinister[primeMinisterName]);
   } 
   
    String[] politicalParties ={"BJP","INC","AAP" ,"TMC" , "BSP"};
    int overall=politicalParties.length;
    System.out.println(" overall politicalParties:"+overall);
    for(int politicalPartiesName=0;politicalPartiesName<=4;politicalPartiesName++)
   {
	   System.out.println(politicalParties[politicalPartiesName]);
   } 
   String[] cabinetMinister ={"Shri H. D. Kumaraswamy","Shri Rajnath Singh","Shri Amit Shah" ,"Shri Nitin Jairam Gadkari" , "Smt. Nirmala Sitharaman","Shri Shivraj Singh Chouhan","Dr. Subrahmanyam Jaishankar	","Shri Jagat Prakash Nadda","Shri Manohar Lal","Shri Piyush Goyal","Shri Dharmendra Pradhan","Shri Rajiv Ranjan Singh","Shri Sarbananda Sonowal","Dr Virendra Kumar","Shri Kinjarapu Rammohan Naidu",	
   "Shri Kinjarapu Rammohan Naidu","Shri Pralhad Joshi","Shri Jual Oram","Shri Giriraj Singh","Shri Ashwini Vaishnaw","Shri Jyotiraditya M. Scindia","Shri Bhupender Yadav","Shri Gajendra Singh Shekhawat","Smt. Annpurna Devi","Shri Kiren Rijiju","Shri Hardeep Singh Puri","Dr. Mansukh Mandaviya","Shri G. Kishan Reddy","Shri Chirag Paswan","ShriCRPatil"};
	int cumulative=cabinetMinister.length;
    System.out.println("cumulative  cabinetMinister:"+cumulative);
    for(int cabinetMinisterName=0;cabinetMinisterName<30;cabinetMinisterName++)
   {
	   System.out.println(cabinetMinister[cabinetMinisterName]);
   } 
 }
}
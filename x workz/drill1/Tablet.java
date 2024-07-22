class Tablet
{
 public static double company(int age)
{
  double salary=15000;
  double salary1=salary+2000;
  double salary2=salary+4000;
  
  System.out.println("running company in Sky with two parameter");
  if(age>18 && age<25)
  {
    
    return salary;
	
  }
  else if(age>25 && age<30)
  {
   
   return  salary1;
   
  }
  else
  {
   
   return salary2;
  }
} 
}
class Ananya
{
  long mobileno;
  Knife knife;
  
  public Ananya(long mobileno,Knife knife)
  {
	  this.mobileno=mobileno;
	  this.knife=knife;
	  
  }
  public void store()
  {
	 System.out.println("mobileno:"+this.mobileno);
	 System.out.println("knife:"+this.knife);
	 knife.store();
  }
}
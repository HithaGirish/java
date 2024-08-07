class GanaviRunner
{
  public static void main(String[] args)
  {
	  Clip clip= new Clip("Red","Metal");
	  Ganavi ganavi= new Ganavi("ganavikumar456@gmail",clip);
	  ganavi.print();
	  
	  Clip clip1= new Clip("Green","steel");
	  Ganavi ganavi1= new Ganavi("ganavikumar420@gmail",clip1);
	  ganavi1.print();
  }
}
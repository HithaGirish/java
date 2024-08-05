class MaskRunner
{
  public static void main(String[] args)
  {
	  System.out.println("running main in MaskRunner");
	  Mask mask=new Mask();
	  Mask mask1=new Mask(10.0);
	  Mask mask2=new Mask('M');
	  Mask mask3=new Mask("SOFT");
	  Mask mask4=new Mask(15.0,'S',"CLOTH");
	  Mask mask5=new Mask(20.0,'L');
	  
	  
  }
}
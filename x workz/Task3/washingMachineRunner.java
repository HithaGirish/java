class WashingMachineRunner
{
  public static void main(String[] args)
  {
    System.out.println("Running wash in WashingMachineRunner");
	WashingMachine.wash();
	WashingMachine.rinse();
	WashingMachine.displaytime();
	WashingMachine.dry();
	WashingMachine.cleancloth();//invoke childlock
  }
}
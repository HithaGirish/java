class TrainRunner
{
 public static void main(String[] args)
 {
  System.out.println("running main in TrainRunner");
        Train.book1("india","korea");
		Train.book2("india","korea",600000);
		Train.book3("india","korea",600000,80.5d);
		Train.cancel1(800000);
		Train.cancel2("india","korea");
 }
}
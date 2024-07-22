class House
{
 public static void watch(String location)
 {
  System.out.println("running watch in house with string parameter");
  System.out.println("location:"+location);
  Dog.guarding(location);
 }
}
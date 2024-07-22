class DeliveryGuy
{
 public static void deliver(String item)
 {
  System.out.println("running deliver in DeliveryGuy with string parameter");
  DeliveryVehicle.deliver(item,"Fixed");
 }
}
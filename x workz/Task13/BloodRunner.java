class BloodRunner
{
 public static void main(String[] args)
{
 System.out.println("runinng main in BloodRunner");
 char group=Blood.group();
 System.out.println("group return type:"+group);
 String personName=Blood.personName();
 System.out.println("personName return type:"+personName);
 double price=Blood.price();
 System.out.println("price return type:"+price);
 String hospitalTested=Blood.hospitalTested();
 System.out.println("hospitalTested return type:"+hospitalTested);
 boolean sickness=Blood.sickness();
 System.out.println("sickness return type:"+sickness);
 boolean donate=Blood.donate();
 System.out.println("donate return type:"+donate);
 
} 
}
class Projector
{
  String company;
  String type;
  String color;
  double weight=150;
  
 public Projector(String company)
 {
	 this.company= company;
 }
 public void type(String type)
 {
	 this.type=type;
 }
 public void color(String color)
 {
	this.color=color;
 }
 


public void display()
 {
	 System.out.println("company:"+company);
	 System.out.println("type:"+type);
	 System.out.println("color:"+color);
	 System.out.println("weight:"+weight);
	 }
}
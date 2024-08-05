class Paper
{
double thickness;
char size='S';
boolean quality;
String color;
 
public Paper(double thickness)
 {
	 this.thickness= thickness;
 }
 public void quality( boolean quality)
 {
	 this.quality=quality;
 }
 public void color(String color)
 {
	this.color=color;
 }
 
public void display()
 {
	 System.out.println("thickness:"+thickness);
	 System.out.println("size:"+size);
	 System.out.println("quality:"+quality);
	 System.out.println("color:"+color);
	 }
	 }
class SpeakerRunner
{
  public static void main(String[] args)
  {
	  Speaker speaker=new Speaker("SONY");
	  speaker.size("Small");
	  speaker.setCost(2500.0);
	  speaker.display();
	  Speaker speaker1=new Speaker("JBL");
	  speaker1.size("MEDIUM");
	  speaker1.setCost(2509.0);
	  speaker1.display();
	  Speaker speaker2=new Speaker("BOAT");
	  speaker2.size("LARGE");
	  speaker2.setCost(2589.0);
	  speaker2.display();
	  
	  Rocket rocket=new Rocket("INTUIT");
	  rocket.speed(17800.34);
	  rocket.setFuelCapacity(500);
	  rocket.display();
	  Rocket rocket2=new Rocket("ISRO");
	  rocket2.speed(17800.34);
	  rocket2.setFuelCapacity(500);
	  rocket2.display();
	  Rocket rocket3=new Rocket("HINDUSTAN AREONAUTICS");
	  rocket3.speed(17800.34);
	  rocket3.setFuelCapacity(500);
	  rocket3.display();
	  
	  Chocolate chocolate=new Chocolate("CADBURY");
	  chocolate.price(150.0);
	  chocolate.flavour("Chocolate");
	  chocolate.display();
	  Chocolate chocolate2=new Chocolate("HERSHEYS");
	  chocolate2.price(178.0);
	  chocolate2.flavour("strawberry");
	  chocolate2.display();
	  Chocolate chocolate3=new Chocolate("FERRERO ROCHAR");
	  chocolate3.price(800);
	  chocolate3.flavour("choco");
	  chocolate3.display();
	  
	 Projector projector=new Projector("Epsons");
	 projector.type("LCD");
	 projector.color("white");
	 projector.display();
	 Projector projector2=new Projector("Hisense");
	 projector2.type("DLP");
	 projector2.color("black");
	 projector2.display();
	 Projector projector3=new Projector("BenQ");
	 projector3.type("LED");
	 projector3.color("silver");
	 projector3.display();
	 
	 Paper paper=new Paper(0.05);
	 paper.quality(true);
	 paper.color("white");
	 paper.display();
	 Paper paper2=new Paper(5.07);
	 paper2.quality(false);
	 paper2.color("grey");
	 paper2.display();
	 Paper paper3=new Paper(6.07);
	 paper3.quality(false);
	 paper3.color("green");
	 paper3.display();
	 
	 
	  
	  
  }

}
class State
{
String name;
String language;
CapitalCity capitalCity=new CapitalCity("Banglore",80000000);

public State(String name,String language)
{
	this.name=name;
	this.language=language;
}
public void print()
{
	System.out.println("name:"+name);
	System.out.println("language:"+language);
	capitalCity.print();
}
}
class Keybunch
{
	String material;
	Key key;
	
	public Keybunch(String material,Key key)
	{
		this.material=material;
		this.key=key;
	}
	public void display()
	{
		System.out.println("material:"+this.material);
		System.out.println("key:"+this.key);
		key.display();
	}
}
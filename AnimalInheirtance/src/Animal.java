
public abstract class Animal {
	protected String food;
	protected String name;
	
	protected void bearsYoung()
	{
		System.out.println();
	}
	public void eats()
	{
		System.out.println();
	}
	public void makesNoise()
	{
		System.out.println();
	}
	@Override
	public String toString() {
		return "Animal [Food=" + food + ", name=" + name + "]";
	}
}

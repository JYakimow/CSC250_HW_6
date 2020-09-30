public class Driver 
{
	public static void main(String[] args)
	{
		BibleBook b1 = new BibleBook("Genesis", "The first book of the bible", 50);
		BibleBook b2 = new BibleBook("Acts", "The gospel according to St. John", 21);
		BibleBook b3 = new BibleBook("Genesis", "The gospel according to St. Mathew", 28);
		b1.display();
		b2.display();
		b3.display();
	}
}
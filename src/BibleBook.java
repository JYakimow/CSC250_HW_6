public class BibleBook 
{
	private String name;
	private String description;
	private int chapterNum;

	public BibleBook(String name, String description, int chapterNum)
	{
		this.name = name;
		this.description = description;
		this.chapterNum = chapterNum;
	}
	
	public void display()
	{
		System.out.println("Book Title: " + this.name);
		System.out.println("Book Description: " + this.description);
		System.out.println("Total Number of Chapters: " + this.chapterNum);
		System.out.println("");
	}
}

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Biblioteca{

	public static void main(String args[])
	{
		System.out.println("\n\n Welcome to Library System - Biblioteca\n");
    		System.out.println("*           Menu          *");
 		System.out.println("*=========================*");
    		System.out.println("*  1. List Book Catalog   *");
		System.out.println("*  2. Reserve a Book      *");
    		System.out.println("*  3. Check Details       *");
    		System.out.println("Your Selection: ");

		int selectedMenu = takeInput();
		switch (selectedMenu)
		{
			case 0:
			break;

			case 1:
			viewBooks();
			break;

			case 2:
			viewBooks();
			reserveBook();
			break;

			case 3:
			System.out.println("Please talk to Librarian.\n Thank you.");
			break;

			default:
			System.out.println("Invalid Selection");
		}
	}

	private static void viewBooks()
	{
		System.out.println(" 1. Object Oriented Programming With C++ by Balagurusami");
	    	System.out.println(" 2. Practical C++ Programming by Steve Oualline");
	    	System.out.println(" 3. Test-Driven Development: An Empirical Evaluation of Agile Practice by Lech Madeyski");
	}

	private static void reserveBook()
	{
		System.out.println("\n\nPlease enter the number of the book you wish to checkout: ");
		int selectedBook = takeInput();
		switch (selectedBook)
		{
			case 0:
			break;

			case 1:
			System.out.println("\n\'Object Oriented Programming With C++ by Balagurusami\' is reserved successfully.\n Thank You! Enjoy the book");
			break;

			case 2:
			System.out.println("\n\'Practical C++ Programming by Steve Oualline\' is reserved successfully.\n Thank You! Enjoy the book");
			break;

			case 3:
			System.out.println("\n\'Test-Driven Development: An Empirical Evaluation of Agile Practice by Lech Madeyski\' is reserved successfully.\n Thank You! Enjoy the book");
			break;

			default:
			System.out.println("\nSorry we don't have that book yet.");
		}
	}
	
	private static int takeInput()
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    		try
		{
			return Integer.parseInt(reader.readLine());
		} catch (Exception e)
		{
			System.out.println("Invalid Input");
			return 0;
    		}
	}
}
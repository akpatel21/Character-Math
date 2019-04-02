
public class CharacterMath 
{

	public static void main(String[] args) 
	{
		//char letter = 'c';
		//System.out.print(letter);
		//int number = letter;
		//System.out.print(number);
		
		//System.out.print("\n\n" + letter);
		//int number2 = letter - 'a';
		//System.out.print("\n" + number2);
		//number2 += 5;
		//System.out.print((char)(number2 + 'a'));
		
		//Do not do this
		//letter += 5;
		//System.out.print(letter);
	
		char letter = 'x';
		int number = letter - 'a';
		number = (number + 5) % 26;
		System.out.print((char) (number + 'a'));
	}

}

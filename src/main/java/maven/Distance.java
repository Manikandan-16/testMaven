package hello;
import java.util.Scanner;


class Distance {

	public static void main(String[] args) throws java.lang.Exception

	{

		Scanner sc = new Scanner(System.in);

		int dist = 0;

		String s = sc.nextLine();

		String str1 = sc.nextLine();
		String str2 = sc.nextLine();

		if (s.indexOf(str1) == -1 || s.indexOf(str2) == -1)	//Check if both words are present in the sentences

			System.out.println("Invalid Word");
		else										//finding the distance between two word

		{

			dist = Math.abs(s.indexOf(str1) - s.indexOf(str2));

			System.out.println(str1);		//printing the words and the distance
			System.out.println(str2);
			System.out.println(dist - 1);		

		}
		sc.close();
	}
}

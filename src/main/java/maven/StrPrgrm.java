package hello;

import java.util.*;

import java.lang.*;

import java.io.*;



class StrPrgrm{
	
public static void main (String[] args) throws java.lang.Exception
	
{
		
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int index=0,i;
int count[]=new int[26];
	
for ( i = 0; i < s.length();  i++)

count[(int)(s.charAt(i))-'a']++;

for (i = 0; i < s.length();  i++)

{

if (count[(int)(s.charAt(i))-'a'] == 1)

{

index = (int)(s.charAt(i));

break;
}
}
if(index!=0)

System.out.println((char)index);

else

System.out.println("No Non repeating characters");
}

}

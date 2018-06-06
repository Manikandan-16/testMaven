package hello;
import java.util.*;

import java.lang.*;

import java.io.*;

class Distance{
	
public static void main (String[] args) throws java.lang.Exception
	
{

Scanner sc=new Scanner(System.in);

int dist=0;

String s=sc.nextLine();

String str1 = sc.nextLine();
String str2 = sc.nextLine();

if(s.indexOf(str1)==-1||s.indexOf(str2)==-1)

System.out.println("Invalid Word");
else

{

dist=Math.abs(s.indexOf(str1)-s.indexOf(str2));

System.out.println(str1);
System.out.println(str2);
System.out.println(dist-1);

}
}
}
